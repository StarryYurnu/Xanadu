package wrapped.net.minecraft.client.multiplayer

import me.liuli.luminous.wrapper.WrapManager

open class WorldClient(theInstance: Any = originalClass.newInstance()):wrapped.net.minecraft.world.World(theInstance) {
	val mc: wrapped.net.minecraft.client.Minecraft? @JvmName("G18_mc") get() { return wrapped.net.minecraft.client.Minecraft(WrapManager.getter(theInstance, CNF_00201, "mc")?:return null) }
	val previousActiveChunkSet: java.util.Set<*>? @JvmName("G18_previousActiveChunkSet") get() { return WrapManager.getter(theInstance, CNF_00201, "previousActiveChunkSet") as java.util.Set<*>? }
	val entityList: java.util.Set<*>? @JvmName("G18_entityList") get() { return WrapManager.getter(theInstance, CNF_00201, "entityList") as java.util.Set<*>? }
	val entitySpawnQueue: java.util.Set<*>? @JvmName("G18_entitySpawnQueue") get() { return WrapManager.getter(theInstance, CNF_00201, "entitySpawnQueue") as java.util.Set<*>? }
	@JvmName("M1_removeAllEntities") fun removeAllEntities(){  WrapManager.call(theInstance, CNF_00201, "removeAllEntities", "()V") }
	@JvmName("M1_invalidateBlockReceiveRegion") fun invalidateBlockReceiveRegion(p0: Int?, p1: Int?, p2: Int?, p3: Int?, p4: Int?, p5: Int?){  WrapManager.call(theInstance, CNF_00201, "invalidateBlockReceiveRegion", "(IIIIII)V", p0,p1,p2,p3,p4,p5) }
	@JvmName("M1_addEntityToWorld") fun addEntityToWorld(p0: Int?, p1: wrapped.net.minecraft.entity.Entity?){  WrapManager.call(theInstance, CNF_00201, "addEntityToWorld", "(ILnet/minecraft/entity/Entity;)V", p0,p1?.theInstance) }
	@JvmName("M1_setWorldScoreboard") fun setWorldScoreboard(p0: Any?){  WrapManager.call(theInstance, CNF_00201, "setWorldScoreboard", "(Lnet/minecraft/scoreboard/Scoreboard;)V", p0) }
	@JvmName("M1_playSoundAtPos") fun playSoundAtPos(p0: Any?, p1: String?, p2: Float?, p3: Float?, p4: Boolean?){  WrapManager.call(theInstance, CNF_00201, "playSoundAtPos", "(Lnet/minecraft/util/BlockPos;Ljava/lang/String;FFZ)V", p0,p1,p2,p3,p4) }
	@JvmName("M1_doVoidFogParticles") fun doVoidFogParticles(p0: Int?, p1: Int?, p2: Int?){  WrapManager.call(theInstance, CNF_00201, "doVoidFogParticles", "(III)V", p0,p1,p2) }
	@JvmName("M1_doPreChunk") fun doPreChunk(p0: Int?, p1: Int?, p2: Boolean?){  WrapManager.call(theInstance, CNF_00201, "doPreChunk", "(IIZ)V", p0,p1,p2) }
	@JvmName("M1_invalidateRegionAndSetBlock") fun invalidateRegionAndSetBlock(p0: Any?, p1: Any?): Boolean?{ return WrapManager.call(theInstance, CNF_00201, "invalidateRegionAndSetBlock", "(Lnet/minecraft/util/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z", p0,p1) as Boolean? }
	@JvmName("M1_removeEntityFromWorld") fun removeEntityFromWorld(p0: Int?): wrapped.net.minecraft.entity.Entity?{ return wrapped.net.minecraft.entity.Entity(WrapManager.call(theInstance, CNF_00201, "removeEntityFromWorld", "(I)Lnet/minecraft/entity/Entity;", p0)?:return null) }
	companion object {
		val CNF_00201 = "net.minecraft.client.multiplayer.WorldClient"
		val originalClass: Class<*> @JvmName("ORIGIN_14071") get() = WrapManager.origin(CNF_00201)
	}
}