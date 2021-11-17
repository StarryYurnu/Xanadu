package wrapped.net.minecraft.entity

import me.liuli.luminous.wrapper.WrapManager

open class Entity(val theInstance: Any = originalClass.newInstance()) {
	var prevRotationYaw: Float? @JvmName("G1_prevRotationYaw") get() { return WrapManager.getter(theInstance, CNF_73706, "prevRotationYaw") as Float? }@JvmName("S1_prevRotationYaw") set(value) { WrapManager.setter(theInstance, CNF_73706, "prevRotationYaw", value) }
	var prevRotationPitch: Float? @JvmName("G1_prevRotationPitch") get() { return WrapManager.getter(theInstance, CNF_73706, "prevRotationPitch") as Float? }@JvmName("S1_prevRotationPitch") set(value) { WrapManager.setter(theInstance, CNF_73706, "prevRotationPitch", value) }
	var onGround: Boolean? @JvmName("G1_onGround") get() { return WrapManager.getter(theInstance, CNF_73706, "onGround") as Boolean? }@JvmName("S1_onGround") set(value) { WrapManager.setter(theInstance, CNF_73706, "onGround", value) }
	var isCollidedHorizontally: Boolean? @JvmName("G1_isCollidedHorizontally") get() { return WrapManager.getter(theInstance, CNF_73706, "isCollidedHorizontally") as Boolean? }@JvmName("S1_isCollidedHorizontally") set(value) { WrapManager.setter(theInstance, CNF_73706, "isCollidedHorizontally", value) }
	var isCollidedVertically: Boolean? @JvmName("G1_isCollidedVertically") get() { return WrapManager.getter(theInstance, CNF_73706, "isCollidedVertically") as Boolean? }@JvmName("S1_isCollidedVertically") set(value) { WrapManager.setter(theInstance, CNF_73706, "isCollidedVertically", value) }
	var isCollided: Boolean? @JvmName("G1_isCollided") get() { return WrapManager.getter(theInstance, CNF_73706, "isCollided") as Boolean? }@JvmName("S1_isCollided") set(value) { WrapManager.setter(theInstance, CNF_73706, "isCollided", value) }
	var velocityChanged: Boolean? @JvmName("G1_velocityChanged") get() { return WrapManager.getter(theInstance, CNF_73706, "velocityChanged") as Boolean? }@JvmName("S1_velocityChanged") set(value) { WrapManager.setter(theInstance, CNF_73706, "velocityChanged", value) }
	var isInWeb: Boolean? @JvmName("G1_isInWeb") get() { return WrapManager.getter(theInstance, CNF_73706, "isInWeb") as Boolean? }@JvmName("S1_isInWeb") set(value) { WrapManager.setter(theInstance, CNF_73706, "isInWeb", value) }
	var isDead: Boolean? @JvmName("G1_isDead") get() { return WrapManager.getter(theInstance, CNF_73706, "isDead") as Boolean? }@JvmName("S1_isDead") set(value) { WrapManager.setter(theInstance, CNF_73706, "isDead", value) }
	var width: Float? @JvmName("G1_width") get() { return WrapManager.getter(theInstance, CNF_73706, "width") as Float? }@JvmName("S1_width") set(value) { WrapManager.setter(theInstance, CNF_73706, "width", value) }
	var height: Float? @JvmName("G1_height") get() { return WrapManager.getter(theInstance, CNF_73706, "height") as Float? }@JvmName("S1_height") set(value) { WrapManager.setter(theInstance, CNF_73706, "height", value) }
	var prevDistanceWalkedModified: Float? @JvmName("G1_prevDistanceWalkedModified") get() { return WrapManager.getter(theInstance, CNF_73706, "prevDistanceWalkedModified") as Float? }@JvmName("S1_prevDistanceWalkedModified") set(value) { WrapManager.setter(theInstance, CNF_73706, "prevDistanceWalkedModified", value) }
	var distanceWalkedModified: Float? @JvmName("G1_distanceWalkedModified") get() { return WrapManager.getter(theInstance, CNF_73706, "distanceWalkedModified") as Float? }@JvmName("S1_distanceWalkedModified") set(value) { WrapManager.setter(theInstance, CNF_73706, "distanceWalkedModified", value) }
	var distanceWalkedOnStepModified: Float? @JvmName("G1_distanceWalkedOnStepModified") get() { return WrapManager.getter(theInstance, CNF_73706, "distanceWalkedOnStepModified") as Float? }@JvmName("S1_distanceWalkedOnStepModified") set(value) { WrapManager.setter(theInstance, CNF_73706, "distanceWalkedOnStepModified", value) }
	var fallDistance: Float? @JvmName("G1_fallDistance") get() { return WrapManager.getter(theInstance, CNF_73706, "fallDistance") as Float? }@JvmName("S1_fallDistance") set(value) { WrapManager.setter(theInstance, CNF_73706, "fallDistance", value) }
	var lastTickPosX: Double? @JvmName("G1_lastTickPosX") get() { return WrapManager.getter(theInstance, CNF_73706, "lastTickPosX") as Double? }@JvmName("S1_lastTickPosX") set(value) { WrapManager.setter(theInstance, CNF_73706, "lastTickPosX", value) }
	var lastTickPosY: Double? @JvmName("G1_lastTickPosY") get() { return WrapManager.getter(theInstance, CNF_73706, "lastTickPosY") as Double? }@JvmName("S1_lastTickPosY") set(value) { WrapManager.setter(theInstance, CNF_73706, "lastTickPosY", value) }
	var lastTickPosZ: Double? @JvmName("G1_lastTickPosZ") get() { return WrapManager.getter(theInstance, CNF_73706, "lastTickPosZ") as Double? }@JvmName("S1_lastTickPosZ") set(value) { WrapManager.setter(theInstance, CNF_73706, "lastTickPosZ", value) }
	var stepHeight: Float? @JvmName("G1_stepHeight") get() { return WrapManager.getter(theInstance, CNF_73706, "stepHeight") as Float? }@JvmName("S1_stepHeight") set(value) { WrapManager.setter(theInstance, CNF_73706, "stepHeight", value) }
	var noClip: Boolean? @JvmName("G1_noClip") get() { return WrapManager.getter(theInstance, CNF_73706, "noClip") as Boolean? }@JvmName("S1_noClip") set(value) { WrapManager.setter(theInstance, CNF_73706, "noClip", value) }
	var entityCollisionReduction: Float? @JvmName("G1_entityCollisionReduction") get() { return WrapManager.getter(theInstance, CNF_73706, "entityCollisionReduction") as Float? }@JvmName("S1_entityCollisionReduction") set(value) { WrapManager.setter(theInstance, CNF_73706, "entityCollisionReduction", value) }
	var rand: java.util.Random? @JvmName("G4_rand") get() { return WrapManager.getter(theInstance, CNF_73706, "rand") as java.util.Random? }@JvmName("S4_rand") set(value) { WrapManager.setter(theInstance, CNF_73706, "rand", value) }
	var ticksExisted: Int? @JvmName("G1_ticksExisted") get() { return WrapManager.getter(theInstance, CNF_73706, "ticksExisted") as Int? }@JvmName("S1_ticksExisted") set(value) { WrapManager.setter(theInstance, CNF_73706, "ticksExisted", value) }
	var fireResistance: Int? @JvmName("G1_fireResistance") get() { return WrapManager.getter(theInstance, CNF_73706, "fireResistance") as Int? }@JvmName("S1_fireResistance") set(value) { WrapManager.setter(theInstance, CNF_73706, "fireResistance", value) }
	var inWater: Boolean? @JvmName("G4_inWater") get() { return WrapManager.getter(theInstance, CNF_73706, "inWater") as Boolean? }@JvmName("S4_inWater") set(value) { WrapManager.setter(theInstance, CNF_73706, "inWater", value) }
	var hurtResistantTime: Int? @JvmName("G1_hurtResistantTime") get() { return WrapManager.getter(theInstance, CNF_73706, "hurtResistantTime") as Int? }@JvmName("S1_hurtResistantTime") set(value) { WrapManager.setter(theInstance, CNF_73706, "hurtResistantTime", value) }
	var firstUpdate: Boolean? @JvmName("G4_firstUpdate") get() { return WrapManager.getter(theInstance, CNF_73706, "firstUpdate") as Boolean? }@JvmName("S4_firstUpdate") set(value) { WrapManager.setter(theInstance, CNF_73706, "firstUpdate", value) }
	var isImmuneToFire: Boolean? @JvmName("G4_isImmuneToFire") get() { return WrapManager.getter(theInstance, CNF_73706, "isImmuneToFire") as Boolean? }@JvmName("S4_isImmuneToFire") set(value) { WrapManager.setter(theInstance, CNF_73706, "isImmuneToFire", value) }
	var addedToChunk: Boolean? @JvmName("G1_addedToChunk") get() { return WrapManager.getter(theInstance, CNF_73706, "addedToChunk") as Boolean? }@JvmName("S1_addedToChunk") set(value) { WrapManager.setter(theInstance, CNF_73706, "addedToChunk", value) }
	var chunkCoordX: Int? @JvmName("G1_chunkCoordX") get() { return WrapManager.getter(theInstance, CNF_73706, "chunkCoordX") as Int? }@JvmName("S1_chunkCoordX") set(value) { WrapManager.setter(theInstance, CNF_73706, "chunkCoordX", value) }
	var chunkCoordY: Int? @JvmName("G1_chunkCoordY") get() { return WrapManager.getter(theInstance, CNF_73706, "chunkCoordY") as Int? }@JvmName("S1_chunkCoordY") set(value) { WrapManager.setter(theInstance, CNF_73706, "chunkCoordY", value) }
	var chunkCoordZ: Int? @JvmName("G1_chunkCoordZ") get() { return WrapManager.getter(theInstance, CNF_73706, "chunkCoordZ") as Int? }@JvmName("S1_chunkCoordZ") set(value) { WrapManager.setter(theInstance, CNF_73706, "chunkCoordZ", value) }
	var ignoreFrustumCheck: Boolean? @JvmName("G1_ignoreFrustumCheck") get() { return WrapManager.getter(theInstance, CNF_73706, "ignoreFrustumCheck") as Boolean? }@JvmName("S1_ignoreFrustumCheck") set(value) { WrapManager.setter(theInstance, CNF_73706, "ignoreFrustumCheck", value) }
	var isAirBorne: Boolean? @JvmName("G1_isAirBorne") get() { return WrapManager.getter(theInstance, CNF_73706, "isAirBorne") as Boolean? }@JvmName("S1_isAirBorne") set(value) { WrapManager.setter(theInstance, CNF_73706, "isAirBorne", value) }
	var timeUntilPortal: Int? @JvmName("G1_timeUntilPortal") get() { return WrapManager.getter(theInstance, CNF_73706, "timeUntilPortal") as Int? }@JvmName("S1_timeUntilPortal") set(value) { WrapManager.setter(theInstance, CNF_73706, "timeUntilPortal", value) }
	var inPortal: Boolean? @JvmName("G4_inPortal") get() { return WrapManager.getter(theInstance, CNF_73706, "inPortal") as Boolean? }@JvmName("S4_inPortal") set(value) { WrapManager.setter(theInstance, CNF_73706, "inPortal", value) }
	var portalCounter: Int? @JvmName("G4_portalCounter") get() { return WrapManager.getter(theInstance, CNF_73706, "portalCounter") as Int? }@JvmName("S4_portalCounter") set(value) { WrapManager.setter(theInstance, CNF_73706, "portalCounter", value) }
	var dimension: Int? @JvmName("G1_dimension") get() { return WrapManager.getter(theInstance, CNF_73706, "dimension") as Int? }@JvmName("S1_dimension") set(value) { WrapManager.setter(theInstance, CNF_73706, "dimension", value) }
	var entityUniqueID: java.util.UUID? @JvmName("G4_entityUniqueID") get() { return WrapManager.getter(theInstance, CNF_73706, "entityUniqueID") as java.util.UUID? }@JvmName("S4_entityUniqueID") set(value) { WrapManager.setter(theInstance, CNF_73706, "entityUniqueID", value) }
	var entityRiderPitchDelta: Double? @JvmName("G2_entityRiderPitchDelta") get() { return WrapManager.getter(theInstance, CNF_73706, "entityRiderPitchDelta") as Double? }@JvmName("S2_entityRiderPitchDelta") set(value) { WrapManager.setter(theInstance, CNF_73706, "entityRiderPitchDelta", value) }
	var entityRiderYawDelta: Double? @JvmName("G2_entityRiderYawDelta") get() { return WrapManager.getter(theInstance, CNF_73706, "entityRiderYawDelta") as Double? }@JvmName("S2_entityRiderYawDelta") set(value) { WrapManager.setter(theInstance, CNF_73706, "entityRiderYawDelta", value) }
	var invulnerable: Boolean? @JvmName("G2_invulnerable") get() { return WrapManager.getter(theInstance, CNF_73706, "invulnerable") as Boolean? }@JvmName("S2_invulnerable") set(value) { WrapManager.setter(theInstance, CNF_73706, "invulnerable", value) }
	var serverPosX: Int? @JvmName("G1_serverPosX") get() { return WrapManager.getter(theInstance, CNF_73706, "serverPosX") as Int? }@JvmName("S1_serverPosX") set(value) { WrapManager.setter(theInstance, CNF_73706, "serverPosX", value) }
	var serverPosY: Int? @JvmName("G1_serverPosY") get() { return WrapManager.getter(theInstance, CNF_73706, "serverPosY") as Int? }@JvmName("S1_serverPosY") set(value) { WrapManager.setter(theInstance, CNF_73706, "serverPosY", value) }
	var serverPosZ: Int? @JvmName("G1_serverPosZ") get() { return WrapManager.getter(theInstance, CNF_73706, "serverPosZ") as Int? }@JvmName("S1_serverPosZ") set(value) { WrapManager.setter(theInstance, CNF_73706, "serverPosZ", value) }
	var entityId: Int? @JvmName("G2_entityId") get() { return WrapManager.getter(theInstance, CNF_73706, "entityId") as Int? }@JvmName("S2_entityId") set(value) { WrapManager.setter(theInstance, CNF_73706, "entityId", value) }
	var isOutsideBorder: Boolean? @JvmName("G2_isOutsideBorder") get() { return WrapManager.getter(theInstance, CNF_73706, "isOutsideBorder") as Boolean? }@JvmName("S2_isOutsideBorder") set(value) { WrapManager.setter(theInstance, CNF_73706, "isOutsideBorder", value) }
	var nextStepDistance: Int? @JvmName("G2_nextStepDistance") get() { return WrapManager.getter(theInstance, CNF_73706, "nextStepDistance") as Int? }@JvmName("S2_nextStepDistance") set(value) { WrapManager.setter(theInstance, CNF_73706, "nextStepDistance", value) }
	var fire: Int? @JvmName("G2_fire") get() { return WrapManager.getter(theInstance, CNF_73706, "fire") as Int? }@JvmName("S2_fire") set(value) { WrapManager.setter(theInstance, CNF_73706, "fire", value) }
	var renderDistanceWeight: Double? @JvmName("G1_renderDistanceWeight") get() { return WrapManager.getter(theInstance, CNF_73706, "renderDistanceWeight") as Double? }@JvmName("S1_renderDistanceWeight") set(value) { WrapManager.setter(theInstance, CNF_73706, "renderDistanceWeight", value) }
	var preventEntitySpawning: Boolean? @JvmName("G1_preventEntitySpawning") get() { return WrapManager.getter(theInstance, CNF_73706, "preventEntitySpawning") as Boolean? }@JvmName("S1_preventEntitySpawning") set(value) { WrapManager.setter(theInstance, CNF_73706, "preventEntitySpawning", value) }
	var riddenByEntity: wrapped.net.minecraft.entity.Entity? @JvmName("G1_riddenByEntity") get() { return wrapped.net.minecraft.entity.Entity(WrapManager.getter(theInstance, CNF_73706, "riddenByEntity")?:return null) }@JvmName("S1_riddenByEntity") set(value) { WrapManager.setter(theInstance, CNF_73706, "riddenByEntity", value?.theInstance) }
	var ridingEntity: wrapped.net.minecraft.entity.Entity? @JvmName("G1_ridingEntity") get() { return wrapped.net.minecraft.entity.Entity(WrapManager.getter(theInstance, CNF_73706, "ridingEntity")?:return null) }@JvmName("S1_ridingEntity") set(value) { WrapManager.setter(theInstance, CNF_73706, "ridingEntity", value?.theInstance) }
	var forceSpawn: Boolean? @JvmName("G1_forceSpawn") get() { return WrapManager.getter(theInstance, CNF_73706, "forceSpawn") as Boolean? }@JvmName("S1_forceSpawn") set(value) { WrapManager.setter(theInstance, CNF_73706, "forceSpawn", value) }
	var worldObj: wrapped.net.minecraft.world.World? @JvmName("G1_worldObj") get() { return wrapped.net.minecraft.world.World(WrapManager.getter(theInstance, CNF_73706, "worldObj")?:return null) }@JvmName("S1_worldObj") set(value) { WrapManager.setter(theInstance, CNF_73706, "worldObj", value?.theInstance) }
	var prevPosX: Double? @JvmName("G1_prevPosX") get() { return WrapManager.getter(theInstance, CNF_73706, "prevPosX") as Double? }@JvmName("S1_prevPosX") set(value) { WrapManager.setter(theInstance, CNF_73706, "prevPosX", value) }
	var prevPosY: Double? @JvmName("G1_prevPosY") get() { return WrapManager.getter(theInstance, CNF_73706, "prevPosY") as Double? }@JvmName("S1_prevPosY") set(value) { WrapManager.setter(theInstance, CNF_73706, "prevPosY", value) }
	var prevPosZ: Double? @JvmName("G1_prevPosZ") get() { return WrapManager.getter(theInstance, CNF_73706, "prevPosZ") as Double? }@JvmName("S1_prevPosZ") set(value) { WrapManager.setter(theInstance, CNF_73706, "prevPosZ", value) }
	var posX: Double? @JvmName("G1_posX") get() { return WrapManager.getter(theInstance, CNF_73706, "posX") as Double? }@JvmName("S1_posX") set(value) { WrapManager.setter(theInstance, CNF_73706, "posX", value) }
	var posY: Double? @JvmName("G1_posY") get() { return WrapManager.getter(theInstance, CNF_73706, "posY") as Double? }@JvmName("S1_posY") set(value) { WrapManager.setter(theInstance, CNF_73706, "posY", value) }
	var posZ: Double? @JvmName("G1_posZ") get() { return WrapManager.getter(theInstance, CNF_73706, "posZ") as Double? }@JvmName("S1_posZ") set(value) { WrapManager.setter(theInstance, CNF_73706, "posZ", value) }
	var motionX: Double? @JvmName("G1_motionX") get() { return WrapManager.getter(theInstance, CNF_73706, "motionX") as Double? }@JvmName("S1_motionX") set(value) { WrapManager.setter(theInstance, CNF_73706, "motionX", value) }
	var motionY: Double? @JvmName("G1_motionY") get() { return WrapManager.getter(theInstance, CNF_73706, "motionY") as Double? }@JvmName("S1_motionY") set(value) { WrapManager.setter(theInstance, CNF_73706, "motionY", value) }
	var motionZ: Double? @JvmName("G1_motionZ") get() { return WrapManager.getter(theInstance, CNF_73706, "motionZ") as Double? }@JvmName("S1_motionZ") set(value) { WrapManager.setter(theInstance, CNF_73706, "motionZ", value) }
	var rotationYaw: Float? @JvmName("G1_rotationYaw") get() { return WrapManager.getter(theInstance, CNF_73706, "rotationYaw") as Float? }@JvmName("S1_rotationYaw") set(value) { WrapManager.setter(theInstance, CNF_73706, "rotationYaw", value) }
	var rotationPitch: Float? @JvmName("G1_rotationPitch") get() { return WrapManager.getter(theInstance, CNF_73706, "rotationPitch") as Float? }@JvmName("S1_rotationPitch") set(value) { WrapManager.setter(theInstance, CNF_73706, "rotationPitch", value) }
	@JvmName("M1_getEntityId") fun getEntityId(): Int?{ return WrapManager.call(theInstance, CNF_73706, "getEntityId", "()I") as Int? }
	@JvmName("M1_onKillCommand") fun onKillCommand(){  WrapManager.call(theInstance, CNF_73706, "onKillCommand", "()V") }
	@JvmName("M4_preparePlayerToSpawn") fun preparePlayerToSpawn(){  WrapManager.call(theInstance, CNF_73706, "preparePlayerToSpawn", "()V") }
	@JvmName("M1_setDead") fun setDead(){  WrapManager.call(theInstance, CNF_73706, "setDead", "()V") }
	@JvmName("M1_onEntityUpdate") fun onEntityUpdate(){  WrapManager.call(theInstance, CNF_73706, "onEntityUpdate", "()V") }
	@JvmName("M1_getMaxInPortalTime") fun getMaxInPortalTime(): Int?{ return WrapManager.call(theInstance, CNF_73706, "getMaxInPortalTime", "()I") as Int? }
	@JvmName("M4_setOnFireFromLava") fun setOnFireFromLava(){  WrapManager.call(theInstance, CNF_73706, "setOnFireFromLava", "()V") }
	@JvmName("M1_extinguish") fun extinguish(){  WrapManager.call(theInstance, CNF_73706, "extinguish", "()V") }
	@JvmName("M4_kill") fun kill(){  WrapManager.call(theInstance, CNF_73706, "kill", "()V") }
	@JvmName("M4_getSwimSound") fun getSwimSound(): String?{ return WrapManager.call(theInstance, CNF_73706, "getSwimSound", "()Ljava/lang/String;") as String? }
	@JvmName("M4_doBlockCollisions") fun doBlockCollisions(){  WrapManager.call(theInstance, CNF_73706, "doBlockCollisions", "()V") }
	@JvmName("M1_isSilent") fun isSilent(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isSilent", "()Z") as Boolean? }
	@JvmName("M17_isImmuneToFire") fun isImmuneToFire(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isImmuneToFire", "()Z") as Boolean? }
	@JvmName("M1_isWet") fun isWet(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isWet", "()Z") as Boolean? }
	@JvmName("M1_isInWater") fun isInWater(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isInWater", "()Z") as Boolean? }
	@JvmName("M1_handleWaterMovement") fun handleWaterMovement(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "handleWaterMovement", "()Z") as Boolean? }
	@JvmName("M4_resetHeight") fun resetHeight(){  WrapManager.call(theInstance, CNF_73706, "resetHeight", "()V") }
	@JvmName("M1_spawnRunningParticles") fun spawnRunningParticles(){  WrapManager.call(theInstance, CNF_73706, "spawnRunningParticles", "()V") }
	@JvmName("M4_createRunningParticles") fun createRunningParticles(){  WrapManager.call(theInstance, CNF_73706, "createRunningParticles", "()V") }
	@JvmName("M1_handleStatusUpdate") fun handleStatusUpdate(p0: Byte?){  WrapManager.call(theInstance, CNF_73706, "handleStatusUpdate", "(B)V", p0) }
	@JvmName("M1_isInRangeToRenderDist") fun isInRangeToRenderDist(p0: Double?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isInRangeToRenderDist", "(D)Z", p0) as Boolean? }
	@JvmName("M1_setPositionAndUpdate") fun setPositionAndUpdate(p0: Double?, p1: Double?, p2: Double?){  WrapManager.call(theInstance, CNF_73706, "setPositionAndUpdate", "(DDD)V", p0,p1,p2) }
	@JvmName("M1_setPositionAndRotation") fun setPositionAndRotation(p0: Double?, p1: Double?, p2: Double?, p3: Float?, p4: Float?){  WrapManager.call(theInstance, CNF_73706, "setPositionAndRotation", "(DDDFF)V", p0,p1,p2,p3,p4) }
	@JvmName("M1_setPositionAndRotation2") fun setPositionAndRotation2(p0: Double?, p1: Double?, p2: Double?, p3: Float?, p4: Float?, p5: Int?, p6: Boolean?){  WrapManager.call(theInstance, CNF_73706, "setPositionAndRotation2", "(DDDFFIZ)V", p0,p1,p2,p3,p4,p5,p6) }
	@JvmName("M4_updateFallState") fun updateFallState(p0: Double?, p1: Boolean?, p2: Any?, p3: Any?){  WrapManager.call(theInstance, CNF_73706, "updateFallState", "(DZLnet/minecraft/block/Block;Lnet/minecraft/util/BlockPos;)V", p0,p1,p2,p3) }
	@JvmName("M4_setSize") fun setSize(p0: Float?, p1: Float?){  WrapManager.call(theInstance, CNF_73706, "setSize", "(FF)V", p0,p1) }
	@JvmName("M1_moveFlying") fun moveFlying(p0: Float?, p1: Float?, p2: Float?){  WrapManager.call(theInstance, CNF_73706, "moveFlying", "(FFF)V", p0,p1,p2) }
	@JvmName("M1_canCommandSenderUseCommand") fun canCommandSenderUseCommand(p0: Int?, p1: String?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "canCommandSenderUseCommand", "(ILjava/lang/String;)Z", p0,p1) as Boolean? }
	@JvmName("M1_getExplosionResistance") fun getExplosionResistance(p0: Any?, p1: wrapped.net.minecraft.world.World?, p2: Any?, p3: Any?): Float?{ return WrapManager.call(theInstance, CNF_73706, "getExplosionResistance", "(Lnet/minecraft/world/Explosion;Lnet/minecraft/world/World;Lnet/minecraft/util/BlockPos;Lnet/minecraft/block/state/IBlockState;)F", p0,p1?.theInstance,p2,p3) as Float? }
	@JvmName("M1_verifyExplosion") fun verifyExplosion(p0: Any?, p1: wrapped.net.minecraft.world.World?, p2: Any?, p3: Any?, p4: Float?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "verifyExplosion", "(Lnet/minecraft/world/Explosion;Lnet/minecraft/world/World;Lnet/minecraft/util/BlockPos;Lnet/minecraft/block/state/IBlockState;F)Z", p0,p1?.theInstance,p2,p3,p4) as Boolean? }
	@JvmName("M1_setWorld") fun setWorld(p0: wrapped.net.minecraft.world.World?){  WrapManager.call(theInstance, CNF_73706, "setWorld", "(Lnet/minecraft/world/World;)V", p0?.theInstance) }
	@JvmName("M1_isInsideOfMaterial") fun isInsideOfMaterial(p0: Any?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isInsideOfMaterial", "(Lnet/minecraft/block/material/Material;)Z", p0) as Boolean? }
	@JvmName("M1_setEntityBoundingBox") fun setEntityBoundingBox(p0: Any?){  WrapManager.call(theInstance, CNF_73706, "setEntityBoundingBox", "(Lnet/minecraft/util/AxisAlignedBB;)V", p0) }
	@JvmName("M1_addEntityCrashInfo") fun addEntityCrashInfo(p0: Any?){  WrapManager.call(theInstance, CNF_73706, "addEntityCrashInfo", "(Lnet/minecraft/crash/CrashReportCategory;)V", p0) }
	@JvmName("M1_moveToBlockPosAndAngles") fun moveToBlockPosAndAngles(p0: Any?, p1: Float?, p2: Float?){  WrapManager.call(theInstance, CNF_73706, "moveToBlockPosAndAngles", "(Lnet/minecraft/util/BlockPos;FF)V", p0,p1,p2) }
	@JvmName("M4_playStepSound") fun playStepSound(p0: Any?, p1: Any?){  WrapManager.call(theInstance, CNF_73706, "playStepSound", "(Lnet/minecraft/util/BlockPos;Lnet/minecraft/block/Block;)V", p0,p1) }
	@JvmName("M1028_readEntityFromNBT") fun readEntityFromNBT(p0: Any?){  WrapManager.call(theInstance, CNF_73706, "readEntityFromNBT", "(Lnet/minecraft/nbt/NBTTagCompound;)V", p0) }
	@JvmName("M1_addChatMessage") fun addChatMessage(p0: Any?){  WrapManager.call(theInstance, CNF_73706, "addChatMessage", "(Lnet/minecraft/util/IChatComponent;)V", p0) }
	@JvmName("M1_setCustomNameTag") fun setCustomNameTag(p0: String?){  WrapManager.call(theInstance, CNF_73706, "setCustomNameTag", "(Ljava/lang/String;)V", p0) }
	@JvmName("M1_playSound") fun playSound(p0: String?, p1: Float?, p2: Float?){  WrapManager.call(theInstance, CNF_73706, "playSound", "(Ljava/lang/String;FF)V", p0,p1,p2) }
	@JvmName("M1_isSpectatedByPlayer") fun isSpectatedByPlayer(p0: Any?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isSpectatedByPlayer", "(Lnet/minecraft/entity/player/EntityPlayerMP;)Z", p0) as Boolean? }
	@JvmName("M1_setCommandStat") fun setCommandStat(p0: Any?, p1: Int?){  WrapManager.call(theInstance, CNF_73706, "setCommandStat", "(Lnet/minecraft/command/CommandResultStats\$Type;I)V", p0,p1) }
	@JvmName("M1_attackEntityFrom") fun attackEntityFrom(p0: Any?, p1: Float?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "attackEntityFrom", "(Lnet/minecraft/util/DamageSource;F)Z", p0,p1) as Boolean? }
	@JvmName("M1_mountEntity") fun mountEntity(p0: wrapped.net.minecraft.entity.Entity?){  WrapManager.call(theInstance, CNF_73706, "mountEntity", "(Lnet/minecraft/entity/Entity;)V", p0?.theInstance) }
	@JvmName("M1_onKillEntity") fun onKillEntity(p0: wrapped.net.minecraft.entity.EntityLivingBase?){  WrapManager.call(theInstance, CNF_73706, "onKillEntity", "(Lnet/minecraft/entity/EntityLivingBase;)V", p0?.theInstance) }
	@JvmName("M4_applyEnchantments") fun applyEnchantments(p0: wrapped.net.minecraft.entity.EntityLivingBase?, p1: wrapped.net.minecraft.entity.Entity?){  WrapManager.call(theInstance, CNF_73706, "applyEnchantments", "(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/Entity;)V", p0?.theInstance,p1?.theInstance) }
	@JvmName("M1_onStruckByLightning") fun onStruckByLightning(p0: Any?){  WrapManager.call(theInstance, CNF_73706, "onStruckByLightning", "(Lnet/minecraft/entity/effect/EntityLightningBolt;)V", p0) }
	@JvmName("M1_interactAt") fun interactAt(p0: wrapped.net.minecraft.entity.player.EntityPlayer?, p1: Any?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "interactAt", "(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/Vec3;)Z", p0?.theInstance,p1) as Boolean? }
	@JvmName("M1_setInWeb") fun setInWeb(){  WrapManager.call(theInstance, CNF_73706, "setInWeb", "()V") }
	@JvmName("M1_getParts") fun getParts(): Array<wrapped.net.minecraft.entity.Entity>?{ return WrapManager.call(theInstance, CNF_73706, "getParts", "()[Lnet/minecraft/entity/Entity;") as Array<wrapped.net.minecraft.entity.Entity>? }
	@JvmName("M1_getRotationYawHead") fun getRotationYawHead(): Float?{ return WrapManager.call(theInstance, CNF_73706, "getRotationYawHead", "()F") as Float? }
	@JvmName("M1_canAttackWithItem") fun canAttackWithItem(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "canAttackWithItem", "()Z") as Boolean? }
	@JvmName("M1_getMaxFallHeight") fun getMaxFallHeight(): Int?{ return WrapManager.call(theInstance, CNF_73706, "getMaxFallHeight", "()I") as Int? }
	@JvmName("M1_doesEntityNotTriggerPressurePlate") fun doesEntityNotTriggerPressurePlate(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "doesEntityNotTriggerPressurePlate", "()Z") as Boolean? }
	@JvmName("M1_canRenderOnFire") fun canRenderOnFire(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "canRenderOnFire", "()Z") as Boolean? }
	@JvmName("M1_getUniqueID") fun getUniqueID(): java.util.UUID?{ return WrapManager.call(theInstance, CNF_73706, "getUniqueID", "()Ljava/util/UUID;") as java.util.UUID? }
	@JvmName("M1_isPushedByWater") fun isPushedByWater(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isPushedByWater", "()Z") as Boolean? }
	@JvmName("M1_getCustomNameTag") fun getCustomNameTag(): String?{ return WrapManager.call(theInstance, CNF_73706, "getCustomNameTag", "()Ljava/lang/String;") as String? }
	@JvmName("M1_getAlwaysRenderNameTag") fun getAlwaysRenderNameTag(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "getAlwaysRenderNameTag", "()Z") as Boolean? }
	@JvmName("M1_getAlwaysRenderNameTagForRender") fun getAlwaysRenderNameTagForRender(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "getAlwaysRenderNameTagForRender", "()Z") as Boolean? }
	@JvmName("M1_getEyeHeight") fun getEyeHeight(): Float?{ return WrapManager.call(theInstance, CNF_73706, "getEyeHeight", "()F") as Float? }
	@JvmName("M1_isOutsideBorder") fun isOutsideBorder(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isOutsideBorder", "()Z") as Boolean? }
	@JvmName("M1_isImmuneToExplosions") fun isImmuneToExplosions(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isImmuneToExplosions", "()Z") as Boolean? }
	@JvmName("M4_getSplashSound") fun getSplashSound(): String?{ return WrapManager.call(theInstance, CNF_73706, "getSplashSound", "()Ljava/lang/String;") as String? }
	@JvmName("M1_isInLava") fun isInLava(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isInLava", "()Z") as Boolean? }
	@JvmName("M4_setBeenAttacked") fun setBeenAttacked(){  WrapManager.call(theInstance, CNF_73706, "setBeenAttacked", "()V") }
	@JvmName("M1_canBeCollidedWith") fun canBeCollidedWith(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "canBeCollidedWith", "()Z") as Boolean? }
	@JvmName("M1_canBePushed") fun canBePushed(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "canBePushed", "()Z") as Boolean? }
	@JvmName("M4_shouldSetPosAfterLoading") fun shouldSetPosAfterLoading(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "shouldSetPosAfterLoading", "()Z") as Boolean? }
	@JvmName("M20_getEntityString") fun getEntityString(): String?{ return WrapManager.call(theInstance, CNF_73706, "getEntityString", "()Ljava/lang/String;") as String? }
	@JvmName("M1_onChunkLoad") fun onChunkLoad(){  WrapManager.call(theInstance, CNF_73706, "onChunkLoad", "()V") }
	@JvmName("M1_isEntityAlive") fun isEntityAlive(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isEntityAlive", "()Z") as Boolean? }
	@JvmName("M1_isEntityInsideOpaqueBlock") fun isEntityInsideOpaqueBlock(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isEntityInsideOpaqueBlock", "()Z") as Boolean? }
	@JvmName("M1_updateRidden") fun updateRidden(){  WrapManager.call(theInstance, CNF_73706, "updateRidden", "()V") }
	@JvmName("M1_updateRiderPosition") fun updateRiderPosition(){  WrapManager.call(theInstance, CNF_73706, "updateRiderPosition", "()V") }
	@JvmName("M1_getYOffset") fun getYOffset(): Double?{ return WrapManager.call(theInstance, CNF_73706, "getYOffset", "()D") as Double? }
	@JvmName("M1_getMountedYOffset") fun getMountedYOffset(): Double?{ return WrapManager.call(theInstance, CNF_73706, "getMountedYOffset", "()D") as Double? }
	@JvmName("M1_getCollisionBorderSize") fun getCollisionBorderSize(): Float?{ return WrapManager.call(theInstance, CNF_73706, "getCollisionBorderSize", "()F") as Float? }
	@JvmName("M1_getPortalCooldown") fun getPortalCooldown(): Int?{ return WrapManager.call(theInstance, CNF_73706, "getPortalCooldown", "()I") as Int? }
	@JvmName("M1_performHurtAnimation") fun performHurtAnimation(){  WrapManager.call(theInstance, CNF_73706, "performHurtAnimation", "()V") }
	@JvmName("M1_isBurning") fun isBurning(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isBurning", "()Z") as Boolean? }
	@JvmName("M1_isRiding") fun isRiding(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isRiding", "()Z") as Boolean? }
	@JvmName("M1_isSneaking") fun isSneaking(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isSneaking", "()Z") as Boolean? }
	@JvmName("M1_isSprinting") fun isSprinting(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isSprinting", "()Z") as Boolean? }
	@JvmName("M1_isInvisible") fun isInvisible(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isInvisible", "()Z") as Boolean? }
	@JvmName("M1_isEating") fun isEating(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isEating", "()Z") as Boolean? }
	@JvmName("M1_getAir") fun getAir(): Int?{ return WrapManager.call(theInstance, CNF_73706, "getAir", "()I") as Int? }
	@JvmName("M1_setPosition") fun setPosition(p0: Double?, p1: Double?, p2: Double?){  WrapManager.call(theInstance, CNF_73706, "setPosition", "(DDD)V", p0,p1,p2) }
	@JvmName("M1_setLocationAndAngles") fun setLocationAndAngles(p0: Double?, p1: Double?, p2: Double?, p3: Float?, p4: Float?){  WrapManager.call(theInstance, CNF_73706, "setLocationAndAngles", "(DDDFF)V", p0,p1,p2,p3,p4) }
	@JvmName("M1_getBrightnessForRender") fun getBrightnessForRender(p0: Float?): Int?{ return WrapManager.call(theInstance, CNF_73706, "getBrightnessForRender", "(F)I", p0) as Int? }
	@JvmName("M4_setRotation") fun setRotation(p0: Float?, p1: Float?){  WrapManager.call(theInstance, CNF_73706, "setRotation", "(FF)V", p0,p1) }
	@JvmName("M4_setFlag") fun setFlag(p0: Int?, p1: Boolean?){  WrapManager.call(theInstance, CNF_73706, "setFlag", "(IZ)V", p0,p1) }
	@JvmName("M2_isLiquidPresentInAABB") fun isLiquidPresentInAABB(p0: Any?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isLiquidPresentInAABB", "(Lnet/minecraft/util/AxisAlignedBB;)Z", p0) as Boolean? }
	@JvmName("M1_getDistanceSq") fun getDistanceSq(p0: Any?): Double?{ return WrapManager.call(theInstance, CNF_73706, "getDistanceSq", "(Lnet/minecraft/util/BlockPos;)D", p0) as Double? }
	@JvmName("M1028_writeEntityToNBT") fun writeEntityToNBT(p0: Any?){  WrapManager.call(theInstance, CNF_73706, "writeEntityToNBT", "(Lnet/minecraft/nbt/NBTTagCompound;)V", p0) }
	@JvmName("M1_isEntityInvulnerable") fun isEntityInvulnerable(p0: Any?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isEntityInvulnerable", "(Lnet/minecraft/util/DamageSource;)Z", p0) as Boolean? }
	@JvmName("M1_addToPlayerScore") fun addToPlayerScore(p0: wrapped.net.minecraft.entity.Entity?, p1: Int?){  WrapManager.call(theInstance, CNF_73706, "addToPlayerScore", "(Lnet/minecraft/entity/Entity;I)V", p0?.theInstance,p1) }
	@JvmName("M1_setSilent") fun setSilent(p0: Boolean?){  WrapManager.call(theInstance, CNF_73706, "setSilent", "(Z)V", p0) }
	@JvmName("M1_isOffsetPositionInLiquid") fun isOffsetPositionInLiquid(p0: Double?, p1: Double?, p2: Double?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isOffsetPositionInLiquid", "(DDD)Z", p0,p1,p2) as Boolean? }
	@JvmName("M1_getBrightness") fun getBrightness(p0: Float?): Float?{ return WrapManager.call(theInstance, CNF_73706, "getBrightness", "(F)F", p0) as Float? }
	@JvmName("M1_setAngles") fun setAngles(p0: Float?, p1: Float?){  WrapManager.call(theInstance, CNF_73706, "setAngles", "(FF)V", p0,p1) }
	@JvmName("M1_travelToDimension") fun travelToDimension(p0: Int?){  WrapManager.call(theInstance, CNF_73706, "travelToDimension", "(I)V", p0) }
	@JvmName("M1_setCurrentItemOrArmor") fun setCurrentItemOrArmor(p0: Int?, p1: Any?){  WrapManager.call(theInstance, CNF_73706, "setCurrentItemOrArmor", "(ILnet/minecraft/item/ItemStack;)V", p0,p1) }
	@JvmName("M1_getDistanceSqToCenter") fun getDistanceSqToCenter(p0: Any?): Double?{ return WrapManager.call(theInstance, CNF_73706, "getDistanceSqToCenter", "(Lnet/minecraft/util/BlockPos;)D", p0) as Double? }
	@JvmName("M1_writeMountToNBT") fun writeMountToNBT(p0: Any?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "writeMountToNBT", "(Lnet/minecraft/nbt/NBTTagCompound;)Z", p0) as Boolean? }
	@JvmName("M1_setSneaking") fun setSneaking(p0: Boolean?){  WrapManager.call(theInstance, CNF_73706, "setSneaking", "(Z)V", p0) }
	@JvmName("M1_moveEntity") fun moveEntity(p0: Double?, p1: Double?, p2: Double?){  WrapManager.call(theInstance, CNF_73706, "moveEntity", "(DDD)V", p0,p1,p2) }
	@JvmName("M1_setEntityId") fun setEntityId(p0: Int?){  WrapManager.call(theInstance, CNF_73706, "setEntityId", "(I)V", p0) }
	@JvmName("M1_replaceItemInInventory") fun replaceItemInInventory(p0: Int?, p1: Any?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "replaceItemInInventory", "(ILnet/minecraft/item/ItemStack;)Z", p0,p1) as Boolean? }
	@JvmName("M1_setPortal") fun setPortal(p0: Any?){  WrapManager.call(theInstance, CNF_73706, "setPortal", "(Lnet/minecraft/util/BlockPos;)V", p0) }
	@JvmName("M1_writeToNBTOptional") fun writeToNBTOptional(p0: Any?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "writeToNBTOptional", "(Lnet/minecraft/nbt/NBTTagCompound;)Z", p0) as Boolean? }
	@JvmName("M1_onCollideWithPlayer") fun onCollideWithPlayer(p0: wrapped.net.minecraft.entity.player.EntityPlayer?){  WrapManager.call(theInstance, CNF_73706, "onCollideWithPlayer", "(Lnet/minecraft/entity/player/EntityPlayer;)V", p0?.theInstance) }
	@JvmName("M1_setSprinting") fun setSprinting(p0: Boolean?){  WrapManager.call(theInstance, CNF_73706, "setSprinting", "(Z)V", p0) }
	@JvmName("M1_getEntityWorld") fun getEntityWorld(): wrapped.net.minecraft.world.World?{ return wrapped.net.minecraft.world.World(WrapManager.call(theInstance, CNF_73706, "getEntityWorld", "()Lnet/minecraft/world/World;")?:return null) }
	@JvmName("M1_getDistanceSq") fun getDistanceSq(p0: Double?, p1: Double?, p2: Double?): Double?{ return WrapManager.call(theInstance, CNF_73706, "getDistanceSq", "(DDD)D", p0,p1,p2) as Double? }
	@JvmName("M1_fall") fun fall(p0: Float?, p1: Float?){  WrapManager.call(theInstance, CNF_73706, "fall", "(FF)V", p0,p1) }
	@JvmName("M1_setFire") fun setFire(p0: Int?){  WrapManager.call(theInstance, CNF_73706, "setFire", "(I)V", p0) }
	@JvmName("M1_writeToNBT") fun writeToNBT(p0: Any?){  WrapManager.call(theInstance, CNF_73706, "writeToNBT", "(Lnet/minecraft/nbt/NBTTagCompound;)V", p0) }
	@JvmName("M1_interactFirst") fun interactFirst(p0: wrapped.net.minecraft.entity.player.EntityPlayer?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "interactFirst", "(Lnet/minecraft/entity/player/EntityPlayer;)Z", p0?.theInstance) as Boolean? }
	@JvmName("M1_setInvisible") fun setInvisible(p0: Boolean?){  WrapManager.call(theInstance, CNF_73706, "setInvisible", "(Z)V", p0) }
	@JvmName("M1_getName") fun getName(): String?{ return WrapManager.call(theInstance, CNF_73706, "getName", "()Ljava/lang/String;") as String? }
	@JvmName("M1_equals") fun equals(p0: java.lang.Object?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "equals", "(Ljava/lang/Object;)Z", p0) as Boolean? }
	@JvmName("M1_getCommandSenderEntity") fun getCommandSenderEntity(): wrapped.net.minecraft.entity.Entity?{ return wrapped.net.minecraft.entity.Entity(WrapManager.call(theInstance, CNF_73706, "getCommandSenderEntity", "()Lnet/minecraft/entity/Entity;")?:return null) }
	@JvmName("M1_getDistance") fun getDistance(p0: Double?, p1: Double?, p2: Double?): Double?{ return WrapManager.call(theInstance, CNF_73706, "getDistance", "(DDD)D", p0,p1,p2) as Double? }
	@JvmName("M1_setRotationYawHead") fun setRotationYawHead(p0: Float?){  WrapManager.call(theInstance, CNF_73706, "setRotationYawHead", "(F)V", p0) }
	@JvmName("M4_dealFireDamage") fun dealFireDamage(p0: Int?){  WrapManager.call(theInstance, CNF_73706, "dealFireDamage", "(I)V", p0) }
	@JvmName("M1_readFromNBT") fun readFromNBT(p0: Any?){  WrapManager.call(theInstance, CNF_73706, "readFromNBT", "(Lnet/minecraft/nbt/NBTTagCompound;)V", p0) }
	@JvmName("M1_isInvisibleToPlayer") fun isInvisibleToPlayer(p0: wrapped.net.minecraft.entity.player.EntityPlayer?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isInvisibleToPlayer", "(Lnet/minecraft/entity/player/EntityPlayer;)Z", p0?.theInstance) as Boolean? }
	@JvmName("M1_setEating") fun setEating(p0: Boolean?){  WrapManager.call(theInstance, CNF_73706, "setEating", "(Z)V", p0) }
	@JvmName("M1_addVelocity") fun addVelocity(p0: Double?, p1: Double?, p2: Double?){  WrapManager.call(theInstance, CNF_73706, "addVelocity", "(DDD)V", p0,p1,p2) }
	@JvmName("M1_setRenderYawOffset") fun setRenderYawOffset(p0: Float?){  WrapManager.call(theInstance, CNF_73706, "setRenderYawOffset", "(F)V", p0) }
	@JvmName("M4_getFlag") fun getFlag(p0: Int?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "getFlag", "(I)Z", p0) as Boolean? }
	@JvmName("M1_clientUpdateEntityNBT") fun clientUpdateEntityNBT(p0: Any?){  WrapManager.call(theInstance, CNF_73706, "clientUpdateEntityNBT", "(Lnet/minecraft/nbt/NBTTagCompound;)V", p0) }
	@JvmName("M1_getDistanceToEntity") fun getDistanceToEntity(p0: wrapped.net.minecraft.entity.Entity?): Float?{ return WrapManager.call(theInstance, CNF_73706, "getDistanceToEntity", "(Lnet/minecraft/entity/Entity;)F", p0?.theInstance) as Float? }
	@JvmName("M1_setAlwaysRenderNameTag") fun setAlwaysRenderNameTag(p0: Boolean?){  WrapManager.call(theInstance, CNF_73706, "setAlwaysRenderNameTag", "(Z)V", p0) }
	@JvmName("M1028_entityInit") fun entityInit(){  WrapManager.call(theInstance, CNF_73706, "entityInit", "()V") }
	@JvmName("M1_isInRangeToRender3d") fun isInRangeToRender3d(p0: Double?, p1: Double?, p2: Double?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isInRangeToRender3d", "(DDD)Z", p0,p1,p2) as Boolean? }
	@JvmName("M1_setAir") fun setAir(p0: Int?){  WrapManager.call(theInstance, CNF_73706, "setAir", "(I)V", p0) }
	@JvmName("M1_getDistanceSqToEntity") fun getDistanceSqToEntity(p0: wrapped.net.minecraft.entity.Entity?): Double?{ return WrapManager.call(theInstance, CNF_73706, "getDistanceSqToEntity", "(Lnet/minecraft/entity/Entity;)D", p0?.theInstance) as Double? }
	@JvmName("M1_setOutsideBorder") fun setOutsideBorder(p0: Boolean?){  WrapManager.call(theInstance, CNF_73706, "setOutsideBorder", "(Z)V", p0) }
	@JvmName("M1_setVelocity") fun setVelocity(p0: Double?, p1: Double?, p2: Double?){  WrapManager.call(theInstance, CNF_73706, "setVelocity", "(DDD)V", p0,p1,p2) }
	@JvmName("M1_onDataWatcherUpdate") fun onDataWatcherUpdate(p0: Int?){  WrapManager.call(theInstance, CNF_73706, "onDataWatcherUpdate", "(I)V", p0) }
	@JvmName("M1_applyEntityCollision") fun applyEntityCollision(p0: wrapped.net.minecraft.entity.Entity?){  WrapManager.call(theInstance, CNF_73706, "applyEntityCollision", "(Lnet/minecraft/entity/Entity;)V", p0?.theInstance) }
	@JvmName("M4_pushOutOfBlocks") fun pushOutOfBlocks(p0: Double?, p1: Double?, p2: Double?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "pushOutOfBlocks", "(DDD)Z", p0,p1,p2) as Boolean? }
	@JvmName("M1_isEntityEqual") fun isEntityEqual(p0: wrapped.net.minecraft.entity.Entity?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "isEntityEqual", "(Lnet/minecraft/entity/Entity;)Z", p0?.theInstance) as Boolean? }
	@JvmName("M1_hitByEntity") fun hitByEntity(p0: wrapped.net.minecraft.entity.Entity?): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "hitByEntity", "(Lnet/minecraft/entity/Entity;)Z", p0?.theInstance) as Boolean? }
	@JvmName("M1_hasCustomName") fun hasCustomName(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "hasCustomName", "()Z") as Boolean? }
	@JvmName("M2_resetPositionToBB") fun resetPositionToBB(){  WrapManager.call(theInstance, CNF_73706, "resetPositionToBB", "()V") }
	@JvmName("M1_copyLocationAndAnglesFrom") fun copyLocationAndAnglesFrom(p0: wrapped.net.minecraft.entity.Entity?){  WrapManager.call(theInstance, CNF_73706, "copyLocationAndAnglesFrom", "(Lnet/minecraft/entity/Entity;)V", p0?.theInstance) }
	@JvmName("M1_copyDataFromOld") fun copyDataFromOld(p0: wrapped.net.minecraft.entity.Entity?){  WrapManager.call(theInstance, CNF_73706, "copyDataFromOld", "(Lnet/minecraft/entity/Entity;)V", p0?.theInstance) }
	@JvmName("M1_setCommandStats") fun setCommandStats(p0: wrapped.net.minecraft.entity.Entity?){  WrapManager.call(theInstance, CNF_73706, "setCommandStats", "(Lnet/minecraft/entity/Entity;)V", p0?.theInstance) }
	@JvmName("M4_canTriggerWalking") fun canTriggerWalking(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "canTriggerWalking", "()Z") as Boolean? }
	@JvmName("M1_onUpdate") fun onUpdate(){  WrapManager.call(theInstance, CNF_73706, "onUpdate", "()V") }
	@JvmName("M1_sendCommandFeedback") fun sendCommandFeedback(): Boolean?{ return WrapManager.call(theInstance, CNF_73706, "sendCommandFeedback", "()Z") as Boolean? }
	companion object {
		val CNF_73706 = "net.minecraft.entity.Entity"
		val originalClass: Class<*> @JvmName("ORIGIN_35920") get() = WrapManager.origin(CNF_73706)
		var nextEntityID: Int? @JvmName("G10_nextEntityID") get() { return WrapManager.getter(null, CNF_73706, "nextEntityID") as Int? }@JvmName("S10_nextEntityID") set(value) { WrapManager.setter(null, CNF_73706, "nextEntityID", value) }
	}
}