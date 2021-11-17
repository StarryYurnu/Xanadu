package wrapped.net.minecraft.entity

import me.liuli.luminous.wrapper.WrapManager

open class EntityLivingBase(theInstance: Any = originalClass.newInstance()):wrapped.net.minecraft.entity.Entity(theInstance) {
	var prevLimbSwingAmount: Float? @JvmName("G1_prevLimbSwingAmount") get() { return WrapManager.getter(theInstance, CNF_27819, "prevLimbSwingAmount") as Float? }@JvmName("S1_prevLimbSwingAmount") set(value) { WrapManager.setter(theInstance, CNF_27819, "prevLimbSwingAmount", value) }
	var limbSwingAmount: Float? @JvmName("G1_limbSwingAmount") get() { return WrapManager.getter(theInstance, CNF_27819, "limbSwingAmount") as Float? }@JvmName("S1_limbSwingAmount") set(value) { WrapManager.setter(theInstance, CNF_27819, "limbSwingAmount", value) }
	var limbSwing: Float? @JvmName("G1_limbSwing") get() { return WrapManager.getter(theInstance, CNF_27819, "limbSwing") as Float? }@JvmName("S1_limbSwing") set(value) { WrapManager.setter(theInstance, CNF_27819, "limbSwing", value) }
	var maxHurtResistantTime: Int? @JvmName("G1_maxHurtResistantTime") get() { return WrapManager.getter(theInstance, CNF_27819, "maxHurtResistantTime") as Int? }@JvmName("S1_maxHurtResistantTime") set(value) { WrapManager.setter(theInstance, CNF_27819, "maxHurtResistantTime", value) }
	var prevCameraPitch: Float? @JvmName("G1_prevCameraPitch") get() { return WrapManager.getter(theInstance, CNF_27819, "prevCameraPitch") as Float? }@JvmName("S1_prevCameraPitch") set(value) { WrapManager.setter(theInstance, CNF_27819, "prevCameraPitch", value) }
	var cameraPitch: Float? @JvmName("G1_cameraPitch") get() { return WrapManager.getter(theInstance, CNF_27819, "cameraPitch") as Float? }@JvmName("S1_cameraPitch") set(value) { WrapManager.setter(theInstance, CNF_27819, "cameraPitch", value) }
	var randomUnused2: Float? @JvmName("G1_randomUnused2") get() { return WrapManager.getter(theInstance, CNF_27819, "randomUnused2") as Float? }@JvmName("S1_randomUnused2") set(value) { WrapManager.setter(theInstance, CNF_27819, "randomUnused2", value) }
	var randomUnused1: Float? @JvmName("G1_randomUnused1") get() { return WrapManager.getter(theInstance, CNF_27819, "randomUnused1") as Float? }@JvmName("S1_randomUnused1") set(value) { WrapManager.setter(theInstance, CNF_27819, "randomUnused1", value) }
	var renderYawOffset: Float? @JvmName("G1_renderYawOffset") get() { return WrapManager.getter(theInstance, CNF_27819, "renderYawOffset") as Float? }@JvmName("S1_renderYawOffset") set(value) { WrapManager.setter(theInstance, CNF_27819, "renderYawOffset", value) }
	var prevRenderYawOffset: Float? @JvmName("G1_prevRenderYawOffset") get() { return WrapManager.getter(theInstance, CNF_27819, "prevRenderYawOffset") as Float? }@JvmName("S1_prevRenderYawOffset") set(value) { WrapManager.setter(theInstance, CNF_27819, "prevRenderYawOffset", value) }
	var rotationYawHead: Float? @JvmName("G1_rotationYawHead") get() { return WrapManager.getter(theInstance, CNF_27819, "rotationYawHead") as Float? }@JvmName("S1_rotationYawHead") set(value) { WrapManager.setter(theInstance, CNF_27819, "rotationYawHead", value) }
	var prevRotationYawHead: Float? @JvmName("G1_prevRotationYawHead") get() { return WrapManager.getter(theInstance, CNF_27819, "prevRotationYawHead") as Float? }@JvmName("S1_prevRotationYawHead") set(value) { WrapManager.setter(theInstance, CNF_27819, "prevRotationYawHead", value) }
	var jumpMovementFactor: Float? @JvmName("G1_jumpMovementFactor") get() { return WrapManager.getter(theInstance, CNF_27819, "jumpMovementFactor") as Float? }@JvmName("S1_jumpMovementFactor") set(value) { WrapManager.setter(theInstance, CNF_27819, "jumpMovementFactor", value) }
	var attackingPlayer: wrapped.net.minecraft.entity.player.EntityPlayer? @JvmName("G4_attackingPlayer") get() { return wrapped.net.minecraft.entity.player.EntityPlayer(WrapManager.getter(theInstance, CNF_27819, "attackingPlayer")?:return null) }@JvmName("S4_attackingPlayer") set(value) { WrapManager.setter(theInstance, CNF_27819, "attackingPlayer", value?.theInstance) }
	var recentlyHit: Int? @JvmName("G4_recentlyHit") get() { return WrapManager.getter(theInstance, CNF_27819, "recentlyHit") as Int? }@JvmName("S4_recentlyHit") set(value) { WrapManager.setter(theInstance, CNF_27819, "recentlyHit", value) }
	var entityAge: Int? @JvmName("G4_entityAge") get() { return WrapManager.getter(theInstance, CNF_27819, "entityAge") as Int? }@JvmName("S4_entityAge") set(value) { WrapManager.setter(theInstance, CNF_27819, "entityAge", value) }
	var prevOnGroundSpeedFactor: Float? @JvmName("G4_prevOnGroundSpeedFactor") get() { return WrapManager.getter(theInstance, CNF_27819, "prevOnGroundSpeedFactor") as Float? }@JvmName("S4_prevOnGroundSpeedFactor") set(value) { WrapManager.setter(theInstance, CNF_27819, "prevOnGroundSpeedFactor", value) }
	var onGroundSpeedFactor: Float? @JvmName("G4_onGroundSpeedFactor") get() { return WrapManager.getter(theInstance, CNF_27819, "onGroundSpeedFactor") as Float? }@JvmName("S4_onGroundSpeedFactor") set(value) { WrapManager.setter(theInstance, CNF_27819, "onGroundSpeedFactor", value) }
	var movedDistance: Float? @JvmName("G4_movedDistance") get() { return WrapManager.getter(theInstance, CNF_27819, "movedDistance") as Float? }@JvmName("S4_movedDistance") set(value) { WrapManager.setter(theInstance, CNF_27819, "movedDistance", value) }
	var prevMovedDistance: Float? @JvmName("G4_prevMovedDistance") get() { return WrapManager.getter(theInstance, CNF_27819, "prevMovedDistance") as Float? }@JvmName("S4_prevMovedDistance") set(value) { WrapManager.setter(theInstance, CNF_27819, "prevMovedDistance", value) }
	var unused180: Float? @JvmName("G4_unused180") get() { return WrapManager.getter(theInstance, CNF_27819, "unused180") as Float? }@JvmName("S4_unused180") set(value) { WrapManager.setter(theInstance, CNF_27819, "unused180", value) }
	var scoreValue: Int? @JvmName("G4_scoreValue") get() { return WrapManager.getter(theInstance, CNF_27819, "scoreValue") as Int? }@JvmName("S4_scoreValue") set(value) { WrapManager.setter(theInstance, CNF_27819, "scoreValue", value) }
	var lastDamage: Float? @JvmName("G4_lastDamage") get() { return WrapManager.getter(theInstance, CNF_27819, "lastDamage") as Float? }@JvmName("S4_lastDamage") set(value) { WrapManager.setter(theInstance, CNF_27819, "lastDamage", value) }
	var isJumping: Boolean? @JvmName("G4_isJumping") get() { return WrapManager.getter(theInstance, CNF_27819, "isJumping") as Boolean? }@JvmName("S4_isJumping") set(value) { WrapManager.setter(theInstance, CNF_27819, "isJumping", value) }
	var moveStrafing: Float? @JvmName("G1_moveStrafing") get() { return WrapManager.getter(theInstance, CNF_27819, "moveStrafing") as Float? }@JvmName("S1_moveStrafing") set(value) { WrapManager.setter(theInstance, CNF_27819, "moveStrafing", value) }
	var isSwingInProgress: Boolean? @JvmName("G1_isSwingInProgress") get() { return WrapManager.getter(theInstance, CNF_27819, "isSwingInProgress") as Boolean? }@JvmName("S1_isSwingInProgress") set(value) { WrapManager.setter(theInstance, CNF_27819, "isSwingInProgress", value) }
	var swingProgressInt: Int? @JvmName("G1_swingProgressInt") get() { return WrapManager.getter(theInstance, CNF_27819, "swingProgressInt") as Int? }@JvmName("S1_swingProgressInt") set(value) { WrapManager.setter(theInstance, CNF_27819, "swingProgressInt", value) }
	var arrowHitTimer: Int? @JvmName("G1_arrowHitTimer") get() { return WrapManager.getter(theInstance, CNF_27819, "arrowHitTimer") as Int? }@JvmName("S1_arrowHitTimer") set(value) { WrapManager.setter(theInstance, CNF_27819, "arrowHitTimer", value) }
	var hurtTime: Int? @JvmName("G1_hurtTime") get() { return WrapManager.getter(theInstance, CNF_27819, "hurtTime") as Int? }@JvmName("S1_hurtTime") set(value) { WrapManager.setter(theInstance, CNF_27819, "hurtTime", value) }
	var maxHurtTime: Int? @JvmName("G1_maxHurtTime") get() { return WrapManager.getter(theInstance, CNF_27819, "maxHurtTime") as Int? }@JvmName("S1_maxHurtTime") set(value) { WrapManager.setter(theInstance, CNF_27819, "maxHurtTime", value) }
	var attackedAtYaw: Float? @JvmName("G1_attackedAtYaw") get() { return WrapManager.getter(theInstance, CNF_27819, "attackedAtYaw") as Float? }@JvmName("S1_attackedAtYaw") set(value) { WrapManager.setter(theInstance, CNF_27819, "attackedAtYaw", value) }
	var deathTime: Int? @JvmName("G1_deathTime") get() { return WrapManager.getter(theInstance, CNF_27819, "deathTime") as Int? }@JvmName("S1_deathTime") set(value) { WrapManager.setter(theInstance, CNF_27819, "deathTime", value) }
	var prevSwingProgress: Float? @JvmName("G1_prevSwingProgress") get() { return WrapManager.getter(theInstance, CNF_27819, "prevSwingProgress") as Float? }@JvmName("S1_prevSwingProgress") set(value) { WrapManager.setter(theInstance, CNF_27819, "prevSwingProgress", value) }
	var swingProgress: Float? @JvmName("G1_swingProgress") get() { return WrapManager.getter(theInstance, CNF_27819, "swingProgress") as Float? }@JvmName("S1_swingProgress") set(value) { WrapManager.setter(theInstance, CNF_27819, "swingProgress", value) }
	var moveForward: Float? @JvmName("G1_moveForward") get() { return WrapManager.getter(theInstance, CNF_27819, "moveForward") as Float? }@JvmName("S1_moveForward") set(value) { WrapManager.setter(theInstance, CNF_27819, "moveForward", value) }
	var randomYawVelocity: Float? @JvmName("G4_randomYawVelocity") get() { return WrapManager.getter(theInstance, CNF_27819, "randomYawVelocity") as Float? }@JvmName("S4_randomYawVelocity") set(value) { WrapManager.setter(theInstance, CNF_27819, "randomYawVelocity", value) }
	var newPosRotationIncrements: Int? @JvmName("G4_newPosRotationIncrements") get() { return WrapManager.getter(theInstance, CNF_27819, "newPosRotationIncrements") as Int? }@JvmName("S4_newPosRotationIncrements") set(value) { WrapManager.setter(theInstance, CNF_27819, "newPosRotationIncrements", value) }
	var newPosX: Double? @JvmName("G4_newPosX") get() { return WrapManager.getter(theInstance, CNF_27819, "newPosX") as Double? }@JvmName("S4_newPosX") set(value) { WrapManager.setter(theInstance, CNF_27819, "newPosX", value) }
	var newPosY: Double? @JvmName("G4_newPosY") get() { return WrapManager.getter(theInstance, CNF_27819, "newPosY") as Double? }@JvmName("S4_newPosY") set(value) { WrapManager.setter(theInstance, CNF_27819, "newPosY", value) }
	var newPosZ: Double? @JvmName("G4_newPosZ") get() { return WrapManager.getter(theInstance, CNF_27819, "newPosZ") as Double? }@JvmName("S4_newPosZ") set(value) { WrapManager.setter(theInstance, CNF_27819, "newPosZ", value) }
	var newRotationYaw: Double? @JvmName("G4_newRotationYaw") get() { return WrapManager.getter(theInstance, CNF_27819, "newRotationYaw") as Double? }@JvmName("S4_newRotationYaw") set(value) { WrapManager.setter(theInstance, CNF_27819, "newRotationYaw", value) }
	var newRotationPitch: Double? @JvmName("G4_newRotationPitch") get() { return WrapManager.getter(theInstance, CNF_27819, "newRotationPitch") as Double? }@JvmName("S4_newRotationPitch") set(value) { WrapManager.setter(theInstance, CNF_27819, "newRotationPitch", value) }
	var entityLivingToAttack: wrapped.net.minecraft.entity.EntityLivingBase? @JvmName("G2_entityLivingToAttack") get() { return wrapped.net.minecraft.entity.EntityLivingBase(WrapManager.getter(theInstance, CNF_27819, "entityLivingToAttack")?:return null) }@JvmName("S2_entityLivingToAttack") set(value) { WrapManager.setter(theInstance, CNF_27819, "entityLivingToAttack", value?.theInstance) }
	var revengeTimer: Int? @JvmName("G2_revengeTimer") get() { return WrapManager.getter(theInstance, CNF_27819, "revengeTimer") as Int? }@JvmName("S2_revengeTimer") set(value) { WrapManager.setter(theInstance, CNF_27819, "revengeTimer", value) }
	var lastAttacker: wrapped.net.minecraft.entity.EntityLivingBase? @JvmName("G2_lastAttacker") get() { return wrapped.net.minecraft.entity.EntityLivingBase(WrapManager.getter(theInstance, CNF_27819, "lastAttacker")?:return null) }@JvmName("S2_lastAttacker") set(value) { WrapManager.setter(theInstance, CNF_27819, "lastAttacker", value?.theInstance) }
	var lastAttackerTime: Int? @JvmName("G2_lastAttackerTime") get() { return WrapManager.getter(theInstance, CNF_27819, "lastAttackerTime") as Int? }@JvmName("S2_lastAttackerTime") set(value) { WrapManager.setter(theInstance, CNF_27819, "lastAttackerTime", value) }
	var landMovementFactor: Float? @JvmName("G2_landMovementFactor") get() { return WrapManager.getter(theInstance, CNF_27819, "landMovementFactor") as Float? }@JvmName("S2_landMovementFactor") set(value) { WrapManager.setter(theInstance, CNF_27819, "landMovementFactor", value) }
	var jumpTicks: Int? @JvmName("G2_jumpTicks") get() { return WrapManager.getter(theInstance, CNF_27819, "jumpTicks") as Int? }@JvmName("S2_jumpTicks") set(value) { WrapManager.setter(theInstance, CNF_27819, "jumpTicks", value) }
	var absorptionAmount: Float? @JvmName("G2_absorptionAmount") get() { return WrapManager.getter(theInstance, CNF_27819, "absorptionAmount") as Float? }@JvmName("S2_absorptionAmount") set(value) { WrapManager.setter(theInstance, CNF_27819, "absorptionAmount", value) }
	var potionsNeedUpdate: Boolean? @JvmName("G2_potionsNeedUpdate") get() { return WrapManager.getter(theInstance, CNF_27819, "potionsNeedUpdate") as Boolean? }@JvmName("S2_potionsNeedUpdate") set(value) { WrapManager.setter(theInstance, CNF_27819, "potionsNeedUpdate", value) }
	@JvmName("M4_updatePotionMetadata") fun updatePotionMetadata(){  WrapManager.call(theInstance, CNF_27819, "updatePotionMetadata", "()V") }
	@JvmName("M1_isOnTeam") fun isOnTeam(p0: Any?): Boolean?{ return WrapManager.call(theInstance, CNF_27819, "isOnTeam", "(Lnet/minecraft/scoreboard/Team;)Z", p0) as Boolean? }
	@JvmName("M1_onDeath") fun onDeath(p0: Any?){  WrapManager.call(theInstance, CNF_27819, "onDeath", "(Lnet/minecraft/util/DamageSource;)V", p0) }
	@JvmName("M1_isPotionActive") fun isPotionActive(p0: wrapped.net.minecraft.potion.Potion?): Boolean?{ return WrapManager.call(theInstance, CNF_27819, "isPotionActive", "(Lnet/minecraft/potion/Potion;)Z", p0?.theInstance) as Boolean? }
	@JvmName("M4_onNewPotionEffect") fun onNewPotionEffect(p0: wrapped.net.minecraft.potion.PotionEffect?){  WrapManager.call(theInstance, CNF_27819, "onNewPotionEffect", "(Lnet/minecraft/potion/PotionEffect;)V", p0?.theInstance) }
	@JvmName("M4_onChangedPotionEffect") fun onChangedPotionEffect(p0: wrapped.net.minecraft.potion.PotionEffect?, p1: Boolean?){  WrapManager.call(theInstance, CNF_27819, "onChangedPotionEffect", "(Lnet/minecraft/potion/PotionEffect;Z)V", p0?.theInstance,p1) }
	@JvmName("M1_knockBack") fun knockBack(p0: wrapped.net.minecraft.entity.Entity?, p1: Float?, p2: Double?, p3: Double?){  WrapManager.call(theInstance, CNF_27819, "knockBack", "(Lnet/minecraft/entity/Entity;FDD)V", p0?.theInstance,p1,p2,p3) }
	@JvmName("M1_onItemPickup") fun onItemPickup(p0: wrapped.net.minecraft.entity.Entity?, p1: Int?){  WrapManager.call(theInstance, CNF_27819, "onItemPickup", "(Lnet/minecraft/entity/Entity;I)V", p0?.theInstance,p1) }
	@JvmName("M4_dropEquipment") fun dropEquipment(p0: Boolean?, p1: Int?){  WrapManager.call(theInstance, CNF_27819, "dropEquipment", "(ZI)V", p0,p1) }
	@JvmName("M4_applyEntityAttributes") fun applyEntityAttributes(){  WrapManager.call(theInstance, CNF_27819, "applyEntityAttributes", "()V") }
	@JvmName("M1_canBreatheUnderwater") fun canBreatheUnderwater(): Boolean?{ return WrapManager.call(theInstance, CNF_27819, "canBreatheUnderwater", "()Z") as Boolean? }
	@JvmName("M4_onDeathUpdate") fun onDeathUpdate(){  WrapManager.call(theInstance, CNF_27819, "onDeathUpdate", "()V") }
	@JvmName("M4_applyArmorCalculations") fun applyArmorCalculations(p0: Any?, p1: Float?): Float?{ return WrapManager.call(theInstance, CNF_27819, "applyArmorCalculations", "(Lnet/minecraft/util/DamageSource;F)F", p0,p1) as Float? }
	@JvmName("M1_getActivePotionEffect") fun getActivePotionEffect(p0: wrapped.net.minecraft.potion.Potion?): wrapped.net.minecraft.potion.PotionEffect?{ return wrapped.net.minecraft.potion.PotionEffect(WrapManager.call(theInstance, CNF_27819, "getActivePotionEffect", "(Lnet/minecraft/potion/Potion;)Lnet/minecraft/potion/PotionEffect;", p0?.theInstance)?:return null) }
	@JvmName("M4_onFinishedPotionEffect") fun onFinishedPotionEffect(p0: wrapped.net.minecraft.potion.PotionEffect?){  WrapManager.call(theInstance, CNF_27819, "onFinishedPotionEffect", "(Lnet/minecraft/potion/PotionEffect;)V", p0?.theInstance) }
	@JvmName("M1_setRevengeTarget") fun setRevengeTarget(p0: wrapped.net.minecraft.entity.EntityLivingBase?){  WrapManager.call(theInstance, CNF_27819, "setRevengeTarget", "(Lnet/minecraft/entity/EntityLivingBase;)V", p0?.theInstance) }
	@JvmName("M4_getExperiencePoints") fun getExperiencePoints(p0: wrapped.net.minecraft.entity.player.EntityPlayer?): Int?{ return WrapManager.call(theInstance, CNF_27819, "getExperiencePoints", "(Lnet/minecraft/entity/player/EntityPlayer;)I", p0?.theInstance) as Int? }
	@JvmName("M1_renderBrokenItemStack") fun renderBrokenItemStack(p0: Any?){  WrapManager.call(theInstance, CNF_27819, "renderBrokenItemStack", "(Lnet/minecraft/item/ItemStack;)V", p0) }
	@JvmName("M4_dropFewItems") fun dropFewItems(p0: Boolean?, p1: Int?){  WrapManager.call(theInstance, CNF_27819, "dropFewItems", "(ZI)V", p0,p1) }
	@JvmName("M4_getSoundVolume") fun getSoundVolume(): Float?{ return WrapManager.call(theInstance, CNF_27819, "getSoundVolume", "()F") as Float? }
	@JvmName("M4_getSoundPitch") fun getSoundPitch(): Float?{ return WrapManager.call(theInstance, CNF_27819, "getSoundPitch", "()F") as Float? }
	@JvmName("M4_isMovementBlocked") fun isMovementBlocked(): Boolean?{ return WrapManager.call(theInstance, CNF_27819, "isMovementBlocked", "()Z") as Boolean? }
	@JvmName("M4_getJumpUpwardsMotion") fun getJumpUpwardsMotion(): Float?{ return WrapManager.call(theInstance, CNF_27819, "getJumpUpwardsMotion", "()F") as Float? }
	@JvmName("M4_jump") fun jump(){  WrapManager.call(theInstance, CNF_27819, "jump", "()V") }
	@JvmName("M4_updateAITick") fun updateAITick(){  WrapManager.call(theInstance, CNF_27819, "updateAITick", "()V") }
	@JvmName("M4_handleJumpLava") fun handleJumpLava(){  WrapManager.call(theInstance, CNF_27819, "handleJumpLava", "()V") }
	@JvmName("M1_getAIMoveSpeed") fun getAIMoveSpeed(): Float?{ return WrapManager.call(theInstance, CNF_27819, "getAIMoveSpeed", "()F") as Float? }
	@JvmName("M1_isPlayerSleeping") fun isPlayerSleeping(): Boolean?{ return WrapManager.call(theInstance, CNF_27819, "isPlayerSleeping", "()Z") as Boolean? }
	@JvmName("M4_updateEntityActionState") fun updateEntityActionState(){  WrapManager.call(theInstance, CNF_27819, "updateEntityActionState", "()V") }
	@JvmName("M4_collideWithNearbyEntities") fun collideWithNearbyEntities(){  WrapManager.call(theInstance, CNF_27819, "collideWithNearbyEntities", "()V") }
	@JvmName("M1_isServerWorld") fun isServerWorld(): Boolean?{ return WrapManager.call(theInstance, CNF_27819, "isServerWorld", "()Z") as Boolean? }
	@JvmName("M1_getAbsorptionAmount") fun getAbsorptionAmount(): Float?{ return WrapManager.call(theInstance, CNF_27819, "getAbsorptionAmount", "()F") as Float? }
	@JvmName("M4_markPotionsDirty") fun markPotionsDirty(){  WrapManager.call(theInstance, CNF_27819, "markPotionsDirty", "()V") }
	@JvmName("M4_canDropLoot") fun canDropLoot(): Boolean?{ return WrapManager.call(theInstance, CNF_27819, "canDropLoot", "()Z") as Boolean? }
	@JvmName("M4_isPlayer") fun isPlayer(): Boolean?{ return WrapManager.call(theInstance, CNF_27819, "isPlayer", "()Z") as Boolean? }
	@JvmName("M1_getRNG") fun getRNG(): java.util.Random?{ return WrapManager.call(theInstance, CNF_27819, "getRNG", "()Ljava/util/Random;") as java.util.Random? }
	@JvmName("M1_getAITarget") fun getAITarget(): wrapped.net.minecraft.entity.EntityLivingBase?{ return wrapped.net.minecraft.entity.EntityLivingBase(WrapManager.call(theInstance, CNF_27819, "getAITarget", "()Lnet/minecraft/entity/EntityLivingBase;")?:return null) }
	@JvmName("M1_getRevengeTimer") fun getRevengeTimer(): Int?{ return WrapManager.call(theInstance, CNF_27819, "getRevengeTimer", "()I") as Int? }
	@JvmName("M1_getLastAttacker") fun getLastAttacker(): wrapped.net.minecraft.entity.EntityLivingBase?{ return wrapped.net.minecraft.entity.EntityLivingBase(WrapManager.call(theInstance, CNF_27819, "getLastAttacker", "()Lnet/minecraft/entity/EntityLivingBase;")?:return null) }
	@JvmName("M1_getLastAttackerTime") fun getLastAttackerTime(): Int?{ return WrapManager.call(theInstance, CNF_27819, "getLastAttackerTime", "()I") as Int? }
	@JvmName("M1_getAge") fun getAge(): Int?{ return WrapManager.call(theInstance, CNF_27819, "getAge", "()I") as Int? }
	@JvmName("M4_updatePotionEffects") fun updatePotionEffects(){  WrapManager.call(theInstance, CNF_27819, "updatePotionEffects", "()V") }
	@JvmName("M4_resetPotionEffectMetadata") fun resetPotionEffectMetadata(){  WrapManager.call(theInstance, CNF_27819, "resetPotionEffectMetadata", "()V") }
	@JvmName("M1_clearActivePotions") fun clearActivePotions(){  WrapManager.call(theInstance, CNF_27819, "clearActivePotions", "()V") }
	@JvmName("M1_isEntityUndead") fun isEntityUndead(): Boolean?{ return WrapManager.call(theInstance, CNF_27819, "isEntityUndead", "()Z") as Boolean? }
	@JvmName("M17_getHealth") fun getHealth(): Float?{ return WrapManager.call(theInstance, CNF_27819, "getHealth", "()F") as Float? }
	@JvmName("M4_getHurtSound") fun getHurtSound(): String?{ return WrapManager.call(theInstance, CNF_27819, "getHurtSound", "()Ljava/lang/String;") as String? }
	@JvmName("M4_getDeathSound") fun getDeathSound(): String?{ return WrapManager.call(theInstance, CNF_27819, "getDeathSound", "()Ljava/lang/String;") as String? }
	@JvmName("M4_addRandomDrop") fun addRandomDrop(){  WrapManager.call(theInstance, CNF_27819, "addRandomDrop", "()V") }
	@JvmName("M1_getTotalArmorValue") fun getTotalArmorValue(): Int?{ return WrapManager.call(theInstance, CNF_27819, "getTotalArmorValue", "()I") as Int? }
	@JvmName("M1_getAttackingEntity") fun getAttackingEntity(): wrapped.net.minecraft.entity.EntityLivingBase?{ return wrapped.net.minecraft.entity.EntityLivingBase(WrapManager.call(theInstance, CNF_27819, "getAttackingEntity", "()Lnet/minecraft/entity/EntityLivingBase;")?:return null) }
	@JvmName("M17_getMaxHealth") fun getMaxHealth(): Float?{ return WrapManager.call(theInstance, CNF_27819, "getMaxHealth", "()F") as Float? }
	@JvmName("M17_getArrowCountInEntity") fun getArrowCountInEntity(): Int?{ return WrapManager.call(theInstance, CNF_27819, "getArrowCountInEntity", "()I") as Int? }
	@JvmName("M1_swingItem") fun swingItem(){  WrapManager.call(theInstance, CNF_27819, "swingItem", "()V") }
	@JvmName("M4_updateArmSwingProgress") fun updateArmSwingProgress(){  WrapManager.call(theInstance, CNF_27819, "updateArmSwingProgress", "()V") }
	@JvmName("M4_applyPotionDamageCalculations") fun applyPotionDamageCalculations(p0: Any?, p1: Float?): Float?{ return WrapManager.call(theInstance, CNF_27819, "applyPotionDamageCalculations", "(Lnet/minecraft/util/DamageSource;F)F", p0,p1) as Float? }
	@JvmName("M1_addPotionEffect") fun addPotionEffect(p0: wrapped.net.minecraft.potion.PotionEffect?){  WrapManager.call(theInstance, CNF_27819, "addPotionEffect", "(Lnet/minecraft/potion/PotionEffect;)V", p0?.theInstance) }
	@JvmName("M1_isOnSameTeam") fun isOnSameTeam(p0: wrapped.net.minecraft.entity.EntityLivingBase?): Boolean?{ return WrapManager.call(theInstance, CNF_27819, "isOnSameTeam", "(Lnet/minecraft/entity/EntityLivingBase;)Z", p0?.theInstance) as Boolean? }
	@JvmName("M4_damageEntity") fun damageEntity(p0: Any?, p1: Float?){  WrapManager.call(theInstance, CNF_27819, "damageEntity", "(Lnet/minecraft/util/DamageSource;F)V", p0,p1) }
	@JvmName("M1_isPotionApplicable") fun isPotionApplicable(p0: wrapped.net.minecraft.potion.PotionEffect?): Boolean?{ return WrapManager.call(theInstance, CNF_27819, "isPotionApplicable", "(Lnet/minecraft/potion/PotionEffect;)Z", p0?.theInstance) as Boolean? }
	@JvmName("M1_moveEntityWithHeading") fun moveEntityWithHeading(p0: Float?, p1: Float?){  WrapManager.call(theInstance, CNF_27819, "moveEntityWithHeading", "(FF)V", p0,p1) }
	@JvmName("M1_heal") fun heal(p0: Float?){  WrapManager.call(theInstance, CNF_27819, "heal", "(F)V", p0) }
	@JvmName("M4_updateDistance") fun updateDistance(p0: Float?, p1: Float?): Float?{ return WrapManager.call(theInstance, CNF_27819, "updateDistance", "(FF)F", p0,p1) as Float? }
	@JvmName("M1_sendEnterCombat") fun sendEnterCombat(){  WrapManager.call(theInstance, CNF_27819, "sendEnterCombat", "()V") }
	@JvmName("M1_setHealth") fun setHealth(p0: Float?){  WrapManager.call(theInstance, CNF_27819, "setHealth", "(F)V", p0) }
	@JvmName("M1_setJumping") fun setJumping(p0: Boolean?){  WrapManager.call(theInstance, CNF_27819, "setJumping", "(Z)V", p0) }
	@JvmName("M1_sendEndCombat") fun sendEndCombat(){  WrapManager.call(theInstance, CNF_27819, "sendEndCombat", "()V") }
	@JvmName("M4_damageArmor") fun damageArmor(p0: Float?){  WrapManager.call(theInstance, CNF_27819, "damageArmor", "(F)V", p0) }
	@JvmName("M4_decreaseAirSupply") fun decreaseAirSupply(p0: Int?): Int?{ return WrapManager.call(theInstance, CNF_27819, "decreaseAirSupply", "(I)I", p0) as Int? }
	@JvmName("M1_isChild") fun isChild(): Boolean?{ return WrapManager.call(theInstance, CNF_27819, "isChild", "()Z") as Boolean? }
	@JvmName("M1_setAIMoveSpeed") fun setAIMoveSpeed(p0: Float?){  WrapManager.call(theInstance, CNF_27819, "setAIMoveSpeed", "(F)V", p0) }
	@JvmName("M1_isPotionActive") fun isPotionActive(p0: Int?): Boolean?{ return WrapManager.call(theInstance, CNF_27819, "isPotionActive", "(I)Z", p0) as Boolean? }
	@JvmName("M1_isOnLadder") fun isOnLadder(): Boolean?{ return WrapManager.call(theInstance, CNF_27819, "isOnLadder", "()Z") as Boolean? }
	@JvmName("M1_getSwingProgress") fun getSwingProgress(p0: Float?): Float?{ return WrapManager.call(theInstance, CNF_27819, "getSwingProgress", "(F)F", p0) as Float? }
	@JvmName("M1_removePotionEffectClient") fun removePotionEffectClient(p0: Int?){  WrapManager.call(theInstance, CNF_27819, "removePotionEffectClient", "(I)V", p0) }
	@JvmName("M1_onLivingUpdate") fun onLivingUpdate(){  WrapManager.call(theInstance, CNF_27819, "onLivingUpdate", "()V") }
	@JvmName("M1_setAbsorptionAmount") fun setAbsorptionAmount(p0: Float?){  WrapManager.call(theInstance, CNF_27819, "setAbsorptionAmount", "(F)V", p0) }
	@JvmName("M1_removePotionEffect") fun removePotionEffect(p0: Int?){  WrapManager.call(theInstance, CNF_27819, "removePotionEffect", "(I)V", p0) }
	@JvmName("M2_getArmSwingAnimationEnd") fun getArmSwingAnimationEnd(): Int?{ return WrapManager.call(theInstance, CNF_27819, "getArmSwingAnimationEnd", "()I") as Int? }
	@JvmName("M4_getFallSoundString") fun getFallSoundString(p0: Int?): String?{ return WrapManager.call(theInstance, CNF_27819, "getFallSoundString", "(I)Ljava/lang/String;", p0) as String? }
	@JvmName("M17_setArrowCountInEntity") fun setArrowCountInEntity(p0: Int?){  WrapManager.call(theInstance, CNF_27819, "setArrowCountInEntity", "(I)V", p0) }
	@JvmName("M1_setLastAttacker") fun setLastAttacker(p0: wrapped.net.minecraft.entity.Entity?){  WrapManager.call(theInstance, CNF_27819, "setLastAttacker", "(Lnet/minecraft/entity/Entity;)V", p0?.theInstance) }
	@JvmName("M1_dismountEntity") fun dismountEntity(p0: wrapped.net.minecraft.entity.Entity?){  WrapManager.call(theInstance, CNF_27819, "dismountEntity", "(Lnet/minecraft/entity/Entity;)V", p0?.theInstance) }
	@JvmName("M1_attackEntityAsMob") fun attackEntityAsMob(p0: wrapped.net.minecraft.entity.Entity?): Boolean?{ return WrapManager.call(theInstance, CNF_27819, "attackEntityAsMob", "(Lnet/minecraft/entity/Entity;)Z", p0?.theInstance) as Boolean? }
	@JvmName("M4_collideWithEntity") fun collideWithEntity(p0: wrapped.net.minecraft.entity.Entity?){  WrapManager.call(theInstance, CNF_27819, "collideWithEntity", "(Lnet/minecraft/entity/Entity;)V", p0?.theInstance) }
	@JvmName("M1_canEntityBeSeen") fun canEntityBeSeen(p0: wrapped.net.minecraft.entity.Entity?): Boolean?{ return WrapManager.call(theInstance, CNF_27819, "canEntityBeSeen", "(Lnet/minecraft/entity/Entity;)Z", p0?.theInstance) as Boolean? }
	companion object {
		val CNF_27819 = "net.minecraft.entity.EntityLivingBase"
		val originalClass: Class<*> @JvmName("ORIGIN_67712") get() = WrapManager.origin(CNF_27819)
		val sprintingSpeedBoostModifierUUID: java.util.UUID? @JvmName("G26_sprintingSpeedBoostModifierUUID") get() { return WrapManager.getter(null, CNF_27819, "sprintingSpeedBoostModifierUUID") as java.util.UUID? }
	}
}