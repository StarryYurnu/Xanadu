package me.liuli.luminous

import me.liuli.luminous.agent.Agent
import me.liuli.luminous.loader.Loader
import me.liuli.luminous.utils.misc.logError
import me.liuli.luminous.utils.misc.logInfo
import me.liuli.luminous.utils.misc.logWarn
import java.io.File
import java.lang.instrument.Instrumentation
import java.net.URL
import java.net.URLClassLoader

object Luminous {
    const val NAME = "Xanadu"
    const val NAME_WITH_COLOR = "§dX§aanadu"
    const val VERSION = "1.1"
    const val RESOURCE = ""
    const val TITLE = "${Luminous.NAME} v${Luminous.VERSION}"

    val cacheDir = File(System.getProperty("user.home"), ".cache/${NAME}")
    val configDir = File(System.getProperty("user.home"), ".config/${NAME}")
    val jarFileAt: File
    var isAgent = true
        private set

    var listeningConsole = false
    var consoleMessage = ""

    init {
        jarFileAt = try {
            File(this.javaClass.protectionDomain.codeSource.location.toURI())
        } catch (e: Exception) {
            e.printStackTrace()
            File("NOT_FOUND")
        }

        if(cacheDir.exists().not()) cacheDir.mkdirs()
        if(configDir.exists().not()) configDir.mkdirs()
    }

    /**
     * launch the cheat.
     */
    fun launch() {
        logInfo("Loading client...")
    }

    /**
     * shutdown the cheat.
     */
    fun shutdown() {
        logInfo("Shutting down $NAME...")
    }

    /**
     * !! CALLED BY JVM !!
     * this will start the injector to inject the agent into Minecraft JVM.
     */
    @JvmStatic
    fun main(args: Array<String>) {
        this.isAgent = false
        logInfo("The program starts normally")

        logInfo("Hello.Welcome to $NAME_WITH_COLOR§r v$VERSION")

        logInfo("Find self jar file at: $jarFileAt")

        logInfo("Code by yurnu. based by LiuLi.")



        // load tools.jar into classpath
        loadClasspath(if(System.getProperty("luminous.toolsjar") != null) {
            val toolsJar = File(System.getProperty("luminous.toolsjar"))
            if(toolsJar.exists()) {
                logWarn("Load Tools.jar from property: ${toolsJar.absolutePath}")
                toolsJar
            } else {
                logError("Tools.jar not exists: ${toolsJar.absolutePath}")
                return
            }
        } else {
            val toolsJar = getToolsJar()
            if(toolsJar == null) {
                logError("Failed to find Tools.jar, Please add an property with name \"luminous.toolsjar\" points tools.jar in jvm.")
                logWarn("You can copy a copy of your JDK \\ lib \\ tools.jar to JRE \\ lib to solve the error")
                return
            }
            logInfo("Tools.jar was found automatically: ${toolsJar.absolutePath}")
            toolsJar
        })

        Loader.main()
    }

    /**
     * !! CALLED BY JVM !!
     * called when the attach agent is injected into Minecraft JVM.
     */
    @JvmStatic
    fun agentmain(agentArgs: String?, instrumentation: Instrumentation) {
        Agent.main(agentArgs ?: "", instrumentation)
    }

    /**
     * idk why classpath option cannot load tools.jar
     * @param jar the jar file want to load
     */
    private fun loadClasspath(jar: File) {
        val classLoaderExt = this.javaClass.classLoader as URLClassLoader
        val method = URLClassLoader::class.java.getDeclaredMethod("addURL", URL::class.java)
        method.isAccessible = true
        method.invoke(classLoaderExt, jar.toURI().toURL())
    }

    /**
     * get tools jar by java.home
     */
    private fun getToolsJar(): File? {
        val javaHome = File(System.getProperty("java.home"))
        val toolsJar = File(javaHome, "lib/tools.jar")

        // if java.home is jdk
        if (toolsJar.exists()) {
            return toolsJar
        }

        // if java.home is jre
        if(javaHome.name.equals("jre", ignoreCase = true)) {
            File(javaHome.parentFile, "lib/tools.jar").also {
                if(it.exists())
                    return it
            }
        }

        return null
    }
}