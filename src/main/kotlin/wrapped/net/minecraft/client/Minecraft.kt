package wrapped.net.minecraft.client

import me.liuli.luminous.wrapper.WrapManager

open class Minecraft(val theInstance: Any = originalClass.newInstance()) {
	var running: Boolean? @JvmName("G64_running") get() { return WrapManager.getter(theInstance, CNF_03380, "running") as Boolean? }@JvmName("S64_running") set(value) { WrapManager.setter(theInstance, CNF_03380, "running", value) }
	var debug: String? @JvmName("G1_debug") get() { return WrapManager.getter(theInstance, CNF_03380, "debug") as String? }@JvmName("S1_debug") set(value) { WrapManager.setter(theInstance, CNF_03380, "debug", value) }
	var field_175613_B: Boolean? @JvmName("G1_field_175613_B") get() { return WrapManager.getter(theInstance, CNF_03380, "field_175613_B") as Boolean? }@JvmName("S1_field_175613_B") set(value) { WrapManager.setter(theInstance, CNF_03380, "field_175613_B", value) }
	var field_175614_C: Boolean? @JvmName("G1_field_175614_C") get() { return WrapManager.getter(theInstance, CNF_03380, "field_175614_C") as Boolean? }@JvmName("S1_field_175614_C") set(value) { WrapManager.setter(theInstance, CNF_03380, "field_175614_C", value) }
	var field_175611_D: Boolean? @JvmName("G1_field_175611_D") get() { return WrapManager.getter(theInstance, CNF_03380, "field_175611_D") as Boolean? }@JvmName("S1_field_175611_D") set(value) { WrapManager.setter(theInstance, CNF_03380, "field_175611_D", value) }
	var renderChunksMany: Boolean? @JvmName("G1_renderChunksMany") get() { return WrapManager.getter(theInstance, CNF_03380, "renderChunksMany") as Boolean? }@JvmName("S1_renderChunksMany") set(value) { WrapManager.setter(theInstance, CNF_03380, "renderChunksMany", value) }
	var debugUpdateTime: Long? @JvmName("G0_debugUpdateTime") get() { return WrapManager.getter(theInstance, CNF_03380, "debugUpdateTime") as Long? }@JvmName("S0_debugUpdateTime") set(value) { WrapManager.setter(theInstance, CNF_03380, "debugUpdateTime", value) }
	var fpsCounter: Int? @JvmName("G0_fpsCounter") get() { return WrapManager.getter(theInstance, CNF_03380, "fpsCounter") as Int? }@JvmName("S0_fpsCounter") set(value) { WrapManager.setter(theInstance, CNF_03380, "fpsCounter", value) }
	var prevFrameTime: Long? @JvmName("G0_prevFrameTime") get() { return WrapManager.getter(theInstance, CNF_03380, "prevFrameTime") as Long? }@JvmName("S0_prevFrameTime") set(value) { WrapManager.setter(theInstance, CNF_03380, "prevFrameTime", value) }
	val fileResourcepacks: java.io.File? @JvmName("G18_fileResourcepacks") get() { return WrapManager.getter(theInstance, CNF_03380, "fileResourcepacks") as java.io.File? }
	var fullscreen: Boolean? @JvmName("G2_fullscreen") get() { return WrapManager.getter(theInstance, CNF_03380, "fullscreen") as Boolean? }@JvmName("S2_fullscreen") set(value) { WrapManager.setter(theInstance, CNF_03380, "fullscreen", value) }
	var enableGLErrorChecking: Boolean? @JvmName("G2_enableGLErrorChecking") get() { return WrapManager.getter(theInstance, CNF_03380, "enableGLErrorChecking") as Boolean? }@JvmName("S2_enableGLErrorChecking") set(value) { WrapManager.setter(theInstance, CNF_03380, "enableGLErrorChecking", value) }
	var hasCrashed: Boolean? @JvmName("G2_hasCrashed") get() { return WrapManager.getter(theInstance, CNF_03380, "hasCrashed") as Boolean? }@JvmName("S2_hasCrashed") set(value) { WrapManager.setter(theInstance, CNF_03380, "hasCrashed", value) }
	var connectedToRealms: Boolean? @JvmName("G2_connectedToRealms") get() { return WrapManager.getter(theInstance, CNF_03380, "connectedToRealms") as Boolean? }@JvmName("S2_connectedToRealms") set(value) { WrapManager.setter(theInstance, CNF_03380, "connectedToRealms", value) }
	val defaultResourcePacks: java.util.List<*>? @JvmName("G18_defaultResourcePacks") get() { return WrapManager.getter(theInstance, CNF_03380, "defaultResourcePacks") as java.util.List<*>? }
	val scheduledTasks: java.util.Queue<*>? @JvmName("G18_scheduledTasks") get() { return WrapManager.getter(theInstance, CNF_03380, "scheduledTasks") as java.util.Queue<*>? }
	var field_175615_aJ: Long? @JvmName("G2_field_175615_aJ") get() { return WrapManager.getter(theInstance, CNF_03380, "field_175615_aJ") as Long? }@JvmName("S2_field_175615_aJ") set(value) { WrapManager.setter(theInstance, CNF_03380, "field_175615_aJ", value) }
	val mcThread: java.lang.Thread? @JvmName("G18_mcThread") get() { return WrapManager.getter(theInstance, CNF_03380, "mcThread") as java.lang.Thread? }
	var debugProfilerName: String? @JvmName("G2_debugProfilerName") get() { return WrapManager.getter(theInstance, CNF_03380, "debugProfilerName") as String? }@JvmName("S2_debugProfilerName") set(value) { WrapManager.setter(theInstance, CNF_03380, "debugProfilerName", value) }
	var renderViewEntity: wrapped.net.minecraft.entity.Entity? @JvmName("G2_renderViewEntity") get() { return wrapped.net.minecraft.entity.Entity(WrapManager.getter(theInstance, CNF_03380, "renderViewEntity")?:return null) }@JvmName("S2_renderViewEntity") set(value) { WrapManager.setter(theInstance, CNF_03380, "renderViewEntity", value?.theInstance) }
	var isGamePaused: Boolean? @JvmName("G2_isGamePaused") get() { return WrapManager.getter(theInstance, CNF_03380, "isGamePaused") as Boolean? }@JvmName("S2_isGamePaused") set(value) { WrapManager.setter(theInstance, CNF_03380, "isGamePaused", value) }
	var leftClickCounter: Int? @JvmName("G2_leftClickCounter") get() { return WrapManager.getter(theInstance, CNF_03380, "leftClickCounter") as Int? }@JvmName("S2_leftClickCounter") set(value) { WrapManager.setter(theInstance, CNF_03380, "leftClickCounter", value) }
	var tempDisplayWidth: Int? @JvmName("G2_tempDisplayWidth") get() { return WrapManager.getter(theInstance, CNF_03380, "tempDisplayWidth") as Int? }@JvmName("S2_tempDisplayWidth") set(value) { WrapManager.setter(theInstance, CNF_03380, "tempDisplayWidth", value) }
	var tempDisplayHeight: Int? @JvmName("G2_tempDisplayHeight") get() { return WrapManager.getter(theInstance, CNF_03380, "tempDisplayHeight") as Int? }@JvmName("S2_tempDisplayHeight") set(value) { WrapManager.setter(theInstance, CNF_03380, "tempDisplayHeight", value) }
	val fileAssets: java.io.File? @JvmName("G18_fileAssets") get() { return WrapManager.getter(theInstance, CNF_03380, "fileAssets") as java.io.File? }
	val launchedVersion: String? @JvmName("G18_launchedVersion") get() { return WrapManager.getter(theInstance, CNF_03380, "launchedVersion") as String? }
	var proxy: java.net.Proxy? @JvmName("G1_proxy") get() { return WrapManager.getter(theInstance, CNF_03380, "proxy") as java.net.Proxy? }@JvmName("S1_proxy") set(value) { WrapManager.setter(theInstance, CNF_03380, "proxy", value) }
	var rightClickDelayTimer: Int? @JvmName("G1_rightClickDelayTimer") get() { return WrapManager.getter(theInstance, CNF_03380, "rightClickDelayTimer") as Int? }@JvmName("S1_rightClickDelayTimer") set(value) { WrapManager.setter(theInstance, CNF_03380, "rightClickDelayTimer", value) }
	var serverName: String? @JvmName("G2_serverName") get() { return WrapManager.getter(theInstance, CNF_03380, "serverName") as String? }@JvmName("S2_serverName") set(value) { WrapManager.setter(theInstance, CNF_03380, "serverName", value) }
	var serverPort: Int? @JvmName("G2_serverPort") get() { return WrapManager.getter(theInstance, CNF_03380, "serverPort") as Int? }@JvmName("S2_serverPort") set(value) { WrapManager.setter(theInstance, CNF_03380, "serverPort", value) }
	var joinPlayerCounter: Int? @JvmName("G2_joinPlayerCounter") get() { return WrapManager.getter(theInstance, CNF_03380, "joinPlayerCounter") as Int? }@JvmName("S2_joinPlayerCounter") set(value) { WrapManager.setter(theInstance, CNF_03380, "joinPlayerCounter", value) }
	val jvm64bit: Boolean? @JvmName("G18_jvm64bit") get() { return WrapManager.getter(theInstance, CNF_03380, "jvm64bit") as Boolean? }
	val isDemo: Boolean? @JvmName("G18_isDemo") get() { return WrapManager.getter(theInstance, CNF_03380, "isDemo") as Boolean? }
	var integratedServerIsRunning: Boolean? @JvmName("G2_integratedServerIsRunning") get() { return WrapManager.getter(theInstance, CNF_03380, "integratedServerIsRunning") as Boolean? }@JvmName("S2_integratedServerIsRunning") set(value) { WrapManager.setter(theInstance, CNF_03380, "integratedServerIsRunning", value) }
	var debugCrashKeyPressTime: Long? @JvmName("G2_debugCrashKeyPressTime") get() { return WrapManager.getter(theInstance, CNF_03380, "debugCrashKeyPressTime") as Long? }@JvmName("S2_debugCrashKeyPressTime") set(value) { WrapManager.setter(theInstance, CNF_03380, "debugCrashKeyPressTime", value) }
	var displayWidth: Int? @JvmName("G1_displayWidth") get() { return WrapManager.getter(theInstance, CNF_03380, "displayWidth") as Int? }@JvmName("S1_displayWidth") set(value) { WrapManager.setter(theInstance, CNF_03380, "displayWidth", value) }
	var displayHeight: Int? @JvmName("G1_displayHeight") get() { return WrapManager.getter(theInstance, CNF_03380, "displayHeight") as Int? }@JvmName("S1_displayHeight") set(value) { WrapManager.setter(theInstance, CNF_03380, "displayHeight", value) }
	var theWorld: wrapped.net.minecraft.client.multiplayer.WorldClient? @JvmName("G1_theWorld") get() { return wrapped.net.minecraft.client.multiplayer.WorldClient(WrapManager.getter(theInstance, CNF_03380, "theWorld")?:return null) }@JvmName("S1_theWorld") set(value) { WrapManager.setter(theInstance, CNF_03380, "theWorld", value?.theInstance) }
	var thePlayer: wrapped.net.minecraft.client.entity.EntityPlayerSP? @JvmName("G1_thePlayer") get() { return wrapped.net.minecraft.client.entity.EntityPlayerSP(WrapManager.getter(theInstance, CNF_03380, "thePlayer")?:return null) }@JvmName("S1_thePlayer") set(value) { WrapManager.setter(theInstance, CNF_03380, "thePlayer", value?.theInstance) }
	var pointedEntity: wrapped.net.minecraft.entity.Entity? @JvmName("G1_pointedEntity") get() { return wrapped.net.minecraft.entity.Entity(WrapManager.getter(theInstance, CNF_03380, "pointedEntity")?:return null) }@JvmName("S1_pointedEntity") set(value) { WrapManager.setter(theInstance, CNF_03380, "pointedEntity", value?.theInstance) }
	var skipRenderWorld: Boolean? @JvmName("G1_skipRenderWorld") get() { return WrapManager.getter(theInstance, CNF_03380, "skipRenderWorld") as Boolean? }@JvmName("S1_skipRenderWorld") set(value) { WrapManager.setter(theInstance, CNF_03380, "skipRenderWorld", value) }
	val mcDataDir: java.io.File? @JvmName("G17_mcDataDir") get() { return WrapManager.getter(theInstance, CNF_03380, "mcDataDir") as java.io.File? }
	var inGameHasFocus: Boolean? @JvmName("G1_inGameHasFocus") get() { return WrapManager.getter(theInstance, CNF_03380, "inGameHasFocus") as Boolean? }@JvmName("S1_inGameHasFocus") set(value) { WrapManager.setter(theInstance, CNF_03380, "inGameHasFocus", value) }
	var systemTime: Long? @JvmName("G0_systemTime") get() { return WrapManager.getter(theInstance, CNF_03380, "systemTime") as Long? }@JvmName("S0_systemTime") set(value) { WrapManager.setter(theInstance, CNF_03380, "systemTime", value) }
	var startNanoTime: Long? @JvmName("G0_startNanoTime") get() { return WrapManager.getter(theInstance, CNF_03380, "startNanoTime") as Long? }@JvmName("S0_startNanoTime") set(value) { WrapManager.setter(theInstance, CNF_03380, "startNanoTime", value) }
	@JvmName("M1_isIntegratedServerRunning") fun isIntegratedServerRunning(): Boolean?{ return WrapManager.call(theInstance, CNF_03380, "isIntegratedServerRunning", "()Z") as Boolean? }
	@JvmName("M1_isSingleplayer") fun isSingleplayer(): Boolean?{ return WrapManager.call(theInstance, CNF_03380, "isSingleplayer", "()Z") as Boolean? }
	@JvmName("M1_isFullScreen") fun isFullScreen(): Boolean?{ return WrapManager.call(theInstance, CNF_03380, "isFullScreen", "()Z") as Boolean? }
	@JvmName("M1_getProxy") fun getProxy(): java.net.Proxy?{ return WrapManager.call(theInstance, CNF_03380, "getProxy", "()Ljava/net/Proxy;") as java.net.Proxy? }
	@JvmName("M1_isJava64bit") fun isJava64bit(): Boolean?{ return WrapManager.call(theInstance, CNF_03380, "isJava64bit", "()Z") as Boolean? }
	@JvmName("M1_isGamePaused") fun isGamePaused(): Boolean?{ return WrapManager.call(theInstance, CNF_03380, "isGamePaused", "()Z") as Boolean? }
	@JvmName("M1_dispatchKeypresses") fun dispatchKeypresses(){  WrapManager.call(theInstance, CNF_03380, "dispatchKeypresses", "()V") }
	@JvmName("M1_run") fun run(){  WrapManager.call(theInstance, CNF_03380, "run", "()V") }
	@JvmName("M1_setDimensionAndSpawnPlayer") fun setDimensionAndSpawnPlayer(p0: Int?){  WrapManager.call(theInstance, CNF_03380, "setDimensionAndSpawnPlayer", "(I)V", p0) }
	@JvmName("M1_resize") fun resize(p0: Int?, p1: Int?){  WrapManager.call(theInstance, CNF_03380, "resize", "(II)V", p0,p1) }
	@JvmName("M1_draw") fun draw(p0: Int?, p1: Int?, p2: Int?, p3: Int?, p4: Int?, p5: Int?, p6: Int?, p7: Int?, p8: Int?, p9: Int?){  WrapManager.call(theInstance, CNF_03380, "draw", "(IIIIIIIIII)V", p0,p1,p2,p3,p4,p5,p6,p7,p8,p9) }
	@JvmName("M2_displayDebugInfo") fun displayDebugInfo(p0: Long?){  WrapManager.call(theInstance, CNF_03380, "displayDebugInfo", "(J)V", p0) }
	@JvmName("M1_displayGuiScreen") fun displayGuiScreen(p0: Any?){  WrapManager.call(theInstance, CNF_03380, "displayGuiScreen", "(Lnet/minecraft/client/gui/GuiScreen;)V", p0) }
	@JvmName("M1_crashed") fun crashed(p0: Any?){  WrapManager.call(theInstance, CNF_03380, "crashed", "(Lnet/minecraft/crash/CrashReport;)V", p0) }
	@JvmName("M1_loadWorld") fun loadWorld(p0: wrapped.net.minecraft.client.multiplayer.WorldClient?){  WrapManager.call(theInstance, CNF_03380, "loadWorld", "(Lnet/minecraft/client/multiplayer/WorldClient;)V", p0?.theInstance) }
	@JvmName("M1_loadWorld") fun loadWorld(p0: wrapped.net.minecraft.client.multiplayer.WorldClient?, p1: String?){  WrapManager.call(theInstance, CNF_03380, "loadWorld", "(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V", p0?.theInstance,p1) }
	@JvmName("M1_setServerData") fun setServerData(p0: Any?){  WrapManager.call(theInstance, CNF_03380, "setServerData", "(Lnet/minecraft/client/multiplayer/ServerData;)V", p0) }
	@JvmName("M1_drawSplashScreen") fun drawSplashScreen(p0: Any?){  WrapManager.call(theInstance, CNF_03380, "drawSplashScreen", "(Lnet/minecraft/client/renderer/texture/TextureManager;)V", p0) }
	@JvmName("M2_readImageToBuffer") fun readImageToBuffer(p0: java.io.InputStream?): java.nio.ByteBuffer?{ return WrapManager.call(theInstance, CNF_03380, "readImageToBuffer", "(Ljava/io/InputStream;)Ljava/nio/ByteBuffer;", p0) as java.nio.ByteBuffer? }
	@JvmName("M1_launchIntegratedServer") fun launchIntegratedServer(p0: String?, p1: String?, p2: Any?){  WrapManager.call(theInstance, CNF_03380, "launchIntegratedServer", "(Ljava/lang/String;Ljava/lang/String;Lnet/minecraft/world/WorldSettings;)V", p0,p1,p2) }
	@JvmName("M1_addServerStatsToSnooper") fun addServerStatsToSnooper(p0: Any?){  WrapManager.call(theInstance, CNF_03380, "addServerStatsToSnooper", "(Lnet/minecraft/profiler/PlayerUsageSnooper;)V", p0) }
	@JvmName("M1_setRenderViewEntity") fun setRenderViewEntity(p0: wrapped.net.minecraft.entity.Entity?){  WrapManager.call(theInstance, CNF_03380, "setRenderViewEntity", "(Lnet/minecraft/entity/Entity;)V", p0?.theInstance) }
	@JvmName("M1_setConnectedToRealms") fun setConnectedToRealms(p0: Boolean?){  WrapManager.call(theInstance, CNF_03380, "setConnectedToRealms", "(Z)V", p0) }
	@JvmName("M2_getCurrentAction") fun getCurrentAction(): String?{ return WrapManager.call(theInstance, CNF_03380, "getCurrentAction", "()Ljava/lang/String;") as String? }
	@JvmName("M1_isCallingFromMinecraftThread") fun isCallingFromMinecraftThread(): Boolean?{ return WrapManager.call(theInstance, CNF_03380, "isCallingFromMinecraftThread", "()Z") as Boolean? }
	@JvmName("M1_getRenderViewEntity") fun getRenderViewEntity(): wrapped.net.minecraft.entity.Entity?{ return wrapped.net.minecraft.entity.Entity(WrapManager.call(theInstance, CNF_03380, "getRenderViewEntity", "()Lnet/minecraft/entity/Entity;")?:return null) }
	@JvmName("M1_isSnooperEnabled") fun isSnooperEnabled(): Boolean?{ return WrapManager.call(theInstance, CNF_03380, "isSnooperEnabled", "()Z") as Boolean? }
	@JvmName("M1_isConnectedToRealms") fun isConnectedToRealms(): Boolean?{ return WrapManager.call(theInstance, CNF_03380, "isConnectedToRealms", "()Z") as Boolean? }
	@JvmName("M2_startGame") fun startGame(){  WrapManager.call(theInstance, CNF_03380, "startGame", "()V") }
	@JvmName("M2_registerMetadataSerializers") fun registerMetadataSerializers(){  WrapManager.call(theInstance, CNF_03380, "registerMetadataSerializers", "()V") }
	@JvmName("M2_initStream") fun initStream(){  WrapManager.call(theInstance, CNF_03380, "initStream", "()V") }
	@JvmName("M2_createDisplay") fun createDisplay(){  WrapManager.call(theInstance, CNF_03380, "createDisplay", "()V") }
	@JvmName("M2_setInitialDisplayMode") fun setInitialDisplayMode(){  WrapManager.call(theInstance, CNF_03380, "setInitialDisplayMode", "()V") }
	@JvmName("M2_setWindowIcon") fun setWindowIcon(){  WrapManager.call(theInstance, CNF_03380, "setWindowIcon", "()V") }
	@JvmName("M2_startTimerHackThread") fun startTimerHackThread(){  WrapManager.call(theInstance, CNF_03380, "startTimerHackThread", "()V") }
	@JvmName("M2_updateDisplayMode") fun updateDisplayMode(){  WrapManager.call(theInstance, CNF_03380, "updateDisplayMode", "()V") }
	@JvmName("M2_runGameLoop") fun runGameLoop(){  WrapManager.call(theInstance, CNF_03380, "runGameLoop", "()V") }
	@JvmName("M1_clickMouse") fun clickMouse(){  WrapManager.call(theInstance, CNF_03380, "clickMouse", "()V") }
	@JvmName("M1_rightClickMouse") fun rightClickMouse(){  WrapManager.call(theInstance, CNF_03380, "rightClickMouse", "()V") }
	@JvmName("M2_updateFramebufferSize") fun updateFramebufferSize(){  WrapManager.call(theInstance, CNF_03380, "updateFramebufferSize", "()V") }
	@JvmName("M2_middleClickMouse") fun middleClickMouse(){  WrapManager.call(theInstance, CNF_03380, "middleClickMouse", "()V") }
	@JvmName("M2_updateDebugProfilerName") fun updateDebugProfilerName(p0: Int?){  WrapManager.call(theInstance, CNF_03380, "updateDebugProfilerName", "(I)V", p0) }
	@JvmName("M2_checkGLError") fun checkGLError(p0: String?){  WrapManager.call(theInstance, CNF_03380, "checkGLError", "(Ljava/lang/String;)V", p0) }
	@JvmName("M1_addServerTypeToSnooper") fun addServerTypeToSnooper(p0: Any?){  WrapManager.call(theInstance, CNF_03380, "addServerTypeToSnooper", "(Lnet/minecraft/profiler/PlayerUsageSnooper;)V", p0) }
	@JvmName("M2_sendClickBlockToController") fun sendClickBlockToController(p0: Boolean?){  WrapManager.call(theInstance, CNF_03380, "sendClickBlockToController", "(Z)V", p0) }
	@JvmName("M1_getVersion") fun getVersion(): String?{ return WrapManager.call(theInstance, CNF_03380, "getVersion", "()Ljava/lang/String;") as String? }
	@JvmName("M1_displayCrashReport") fun displayCrashReport(p0: Any?){  WrapManager.call(theInstance, CNF_03380, "displayCrashReport", "(Lnet/minecraft/crash/CrashReport;)V", p0) }
	@JvmName("M1_isUnicode") fun isUnicode(): Boolean?{ return WrapManager.call(theInstance, CNF_03380, "isUnicode", "()Z") as Boolean? }
	@JvmName("M1_refreshResources") fun refreshResources(){  WrapManager.call(theInstance, CNF_03380, "refreshResources", "()V") }
	@JvmName("M1_shutdownMinecraftApplet") fun shutdownMinecraftApplet(){  WrapManager.call(theInstance, CNF_03380, "shutdownMinecraftApplet", "()V") }
	@JvmName("M1_updateDisplay") fun updateDisplay(){  WrapManager.call(theInstance, CNF_03380, "updateDisplay", "()V") }
	@JvmName("M4_checkWindowResize") fun checkWindowResize(){  WrapManager.call(theInstance, CNF_03380, "checkWindowResize", "()V") }
	@JvmName("M1_getLimitFramerate") fun getLimitFramerate(): Int?{ return WrapManager.call(theInstance, CNF_03380, "getLimitFramerate", "()I") as Int? }
	@JvmName("M1_isFramerateLimitBelowMax") fun isFramerateLimitBelowMax(): Boolean?{ return WrapManager.call(theInstance, CNF_03380, "isFramerateLimitBelowMax", "()Z") as Boolean? }
	@JvmName("M1_freeMemory") fun freeMemory(){  WrapManager.call(theInstance, CNF_03380, "freeMemory", "()V") }
	@JvmName("M1_shutdown") fun shutdown(){  WrapManager.call(theInstance, CNF_03380, "shutdown", "()V") }
	@JvmName("M1_setIngameFocus") fun setIngameFocus(){  WrapManager.call(theInstance, CNF_03380, "setIngameFocus", "()V") }
	@JvmName("M1_setIngameNotInFocus") fun setIngameNotInFocus(){  WrapManager.call(theInstance, CNF_03380, "setIngameNotInFocus", "()V") }
	@JvmName("M1_displayInGameMenu") fun displayInGameMenu(){  WrapManager.call(theInstance, CNF_03380, "displayInGameMenu", "()V") }
	@JvmName("M1_toggleFullscreen") fun toggleFullscreen(){  WrapManager.call(theInstance, CNF_03380, "toggleFullscreen", "()V") }
	@JvmName("M1_runTick") fun runTick(){  WrapManager.call(theInstance, CNF_03380, "runTick", "()V") }
	@JvmName("M17_isDemo") fun isDemo(): Boolean?{ return WrapManager.call(theInstance, CNF_03380, "isDemo", "()Z") as Boolean? }
	companion object {
		val CNF_03380 = "net.minecraft.client.Minecraft"
		val originalClass: Class<*> @JvmName("ORIGIN_58680") get() = WrapManager.origin(CNF_03380)
		val logger: org.apache.logging.log4j.Logger? @JvmName("G26_logger") get() { return WrapManager.getter(null, CNF_03380, "logger") as org.apache.logging.log4j.Logger? }
		val macDisplayModes: java.util.List<*>? @JvmName("G26_macDisplayModes") get() { return WrapManager.getter(null, CNF_03380, "macDisplayModes") as java.util.List<*>? }
		var theMinecraft: wrapped.net.minecraft.client.Minecraft? @JvmName("G10_theMinecraft") get() { return wrapped.net.minecraft.client.Minecraft(WrapManager.getter(null, CNF_03380, "theMinecraft")?:return null) }@JvmName("S10_theMinecraft") set(value) { WrapManager.setter(null, CNF_03380, "theMinecraft", value?.theInstance) }
		val isRunningOnMac: Boolean? @JvmName("G25_isRunningOnMac") get() { return WrapManager.getter(null, CNF_03380, "isRunningOnMac") as Boolean? }
		var debugFPS: Int? @JvmName("G10_debugFPS") get() { return WrapManager.getter(null, CNF_03380, "debugFPS") as Int? }@JvmName("S10_debugFPS") set(value) { WrapManager.setter(null, CNF_03380, "debugFPS", value) }
		var memoryReserve: Array<Byte>? @JvmName("G9_memoryReserve") get() { return WrapManager.getter(null, CNF_03380, "memoryReserve") as Array<Byte>? }@JvmName("S9_memoryReserve") set(value) { WrapManager.setter(null, CNF_03380, "memoryReserve", value) }
		@JvmName("M9_getMinecraft") fun getMinecraft(): wrapped.net.minecraft.client.Minecraft?{ return wrapped.net.minecraft.client.Minecraft(WrapManager.call(null, CNF_03380, "getMinecraft", "()Lnet/minecraft/client/Minecraft;")?:return null) }
		@JvmName("M9_getGLMaximumTextureSize") fun getGLMaximumTextureSize(): Int?{ return WrapManager.call(null, CNF_03380, "getGLMaximumTextureSize", "()I") as Int? }
		@JvmName("M9_stopIntegratedServer") fun stopIntegratedServer(){  WrapManager.call(null, CNF_03380, "stopIntegratedServer", "()V") }
		@JvmName("M9_getSystemTime") fun getSystemTime(): Long?{ return WrapManager.call(null, CNF_03380, "getSystemTime", "()J") as Long? }
		@JvmName("M9_getDebugFPS") fun getDebugFPS(): Int?{ return WrapManager.call(null, CNF_03380, "getDebugFPS", "()I") as Int? }
		@JvmName("M10_isJvm64bit") fun isJvm64bit(): Boolean?{ return WrapManager.call(null, CNF_03380, "isJvm64bit", "()Z") as Boolean? }
		@JvmName("M9_isGuiEnabled") fun isGuiEnabled(): Boolean?{ return WrapManager.call(null, CNF_03380, "isGuiEnabled", "()Z") as Boolean? }
		@JvmName("M9_isFancyGraphicsEnabled") fun isFancyGraphicsEnabled(): Boolean?{ return WrapManager.call(null, CNF_03380, "isFancyGraphicsEnabled", "()Z") as Boolean? }
		@JvmName("M9_isAmbientOcclusionEnabled") fun isAmbientOcclusionEnabled(): Boolean?{ return WrapManager.call(null, CNF_03380, "isAmbientOcclusionEnabled", "()Z") as Boolean? }
	}
}