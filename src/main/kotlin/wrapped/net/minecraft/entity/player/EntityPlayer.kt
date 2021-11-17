package wrapped.net.minecraft.entity.player

import me.liuli.luminous.wrapper.WrapManager

open class EntityPlayer(theInstance: Any = originalClass.newInstance()):wrapped.net.minecraft.entity.EntityLivingBase(theInstance) {
	var sleepTimer: Int? @JvmName("G1_sleepTimer") get() { return WrapManager.getter(theInstance, CNF_43073, "sleepTimer") as Int? }@JvmName("S1_sleepTimer") set(value) { WrapManager.setter(theInstance, CNF_43073, "sleepTimer", value) }
	var experienceLevel: Int? @JvmName("G1_experienceLevel") get() { return WrapManager.getter(theInstance, CNF_43073, "experienceLevel") as Int? }@JvmName("S1_experienceLevel") set(value) { WrapManager.setter(theInstance, CNF_43073, "experienceLevel", value) }
	var experienceTotal: Int? @JvmName("G1_experienceTotal") get() { return WrapManager.getter(theInstance, CNF_43073, "experienceTotal") as Int? }@JvmName("S1_experienceTotal") set(value) { WrapManager.setter(theInstance, CNF_43073, "experienceTotal", value) }
	var experience: Float? @JvmName("G1_experience") get() { return WrapManager.getter(theInstance, CNF_43073, "experience") as Float? }@JvmName("S1_experience") set(value) { WrapManager.setter(theInstance, CNF_43073, "experience", value) }
	var speedOnGround: Float? @JvmName("G4_speedOnGround") get() { return WrapManager.getter(theInstance, CNF_43073, "speedOnGround") as Float? }@JvmName("S4_speedOnGround") set(value) { WrapManager.setter(theInstance, CNF_43073, "speedOnGround", value) }
	var speedInAir: Float? @JvmName("G1_speedInAir") get() { return WrapManager.getter(theInstance, CNF_43073, "speedInAir") as Float? }@JvmName("S1_speedInAir") set(value) { WrapManager.setter(theInstance, CNF_43073, "speedInAir", value) }
	var hasReducedDebug: Boolean? @JvmName("G2_hasReducedDebug") get() { return WrapManager.getter(theInstance, CNF_43073, "hasReducedDebug") as Boolean? }@JvmName("S2_hasReducedDebug") set(value) { WrapManager.setter(theInstance, CNF_43073, "hasReducedDebug", value) }
	var renderOffsetY: Float? @JvmName("G1_renderOffsetY") get() { return WrapManager.getter(theInstance, CNF_43073, "renderOffsetY") as Float? }@JvmName("S1_renderOffsetY") set(value) { WrapManager.setter(theInstance, CNF_43073, "renderOffsetY", value) }
	var flyToggleTimer: Int? @JvmName("G4_flyToggleTimer") get() { return WrapManager.getter(theInstance, CNF_43073, "flyToggleTimer") as Int? }@JvmName("S4_flyToggleTimer") set(value) { WrapManager.setter(theInstance, CNF_43073, "flyToggleTimer", value) }
	var prevCameraYaw: Float? @JvmName("G1_prevCameraYaw") get() { return WrapManager.getter(theInstance, CNF_43073, "prevCameraYaw") as Float? }@JvmName("S1_prevCameraYaw") set(value) { WrapManager.setter(theInstance, CNF_43073, "prevCameraYaw", value) }
	var cameraYaw: Float? @JvmName("G1_cameraYaw") get() { return WrapManager.getter(theInstance, CNF_43073, "cameraYaw") as Float? }@JvmName("S1_cameraYaw") set(value) { WrapManager.setter(theInstance, CNF_43073, "cameraYaw", value) }
	var xpCooldown: Int? @JvmName("G1_xpCooldown") get() { return WrapManager.getter(theInstance, CNF_43073, "xpCooldown") as Int? }@JvmName("S1_xpCooldown") set(value) { WrapManager.setter(theInstance, CNF_43073, "xpCooldown", value) }
	var prevChasingPosX: Double? @JvmName("G1_prevChasingPosX") get() { return WrapManager.getter(theInstance, CNF_43073, "prevChasingPosX") as Double? }@JvmName("S1_prevChasingPosX") set(value) { WrapManager.setter(theInstance, CNF_43073, "prevChasingPosX", value) }
	var prevChasingPosY: Double? @JvmName("G1_prevChasingPosY") get() { return WrapManager.getter(theInstance, CNF_43073, "prevChasingPosY") as Double? }@JvmName("S1_prevChasingPosY") set(value) { WrapManager.setter(theInstance, CNF_43073, "prevChasingPosY", value) }
	var prevChasingPosZ: Double? @JvmName("G1_prevChasingPosZ") get() { return WrapManager.getter(theInstance, CNF_43073, "prevChasingPosZ") as Double? }@JvmName("S1_prevChasingPosZ") set(value) { WrapManager.setter(theInstance, CNF_43073, "prevChasingPosZ", value) }
	var chasingPosX: Double? @JvmName("G1_chasingPosX") get() { return WrapManager.getter(theInstance, CNF_43073, "chasingPosX") as Double? }@JvmName("S1_chasingPosX") set(value) { WrapManager.setter(theInstance, CNF_43073, "chasingPosX", value) }
	var chasingPosY: Double? @JvmName("G1_chasingPosY") get() { return WrapManager.getter(theInstance, CNF_43073, "chasingPosY") as Double? }@JvmName("S1_chasingPosY") set(value) { WrapManager.setter(theInstance, CNF_43073, "chasingPosY", value) }
	var chasingPosZ: Double? @JvmName("G1_chasingPosZ") get() { return WrapManager.getter(theInstance, CNF_43073, "chasingPosZ") as Double? }@JvmName("S1_chasingPosZ") set(value) { WrapManager.setter(theInstance, CNF_43073, "chasingPosZ", value) }
	var sleeping: Boolean? @JvmName("G1_sleeping") get() { return WrapManager.getter(theInstance, CNF_43073, "sleeping") as Boolean? }@JvmName("S1_sleeping") set(value) { WrapManager.setter(theInstance, CNF_43073, "sleeping", value) }
	var renderOffsetX: Float? @JvmName("G1_renderOffsetX") get() { return WrapManager.getter(theInstance, CNF_43073, "renderOffsetX") as Float? }@JvmName("S1_renderOffsetX") set(value) { WrapManager.setter(theInstance, CNF_43073, "renderOffsetX", value) }
	var renderOffsetZ: Float? @JvmName("G1_renderOffsetZ") get() { return WrapManager.getter(theInstance, CNF_43073, "renderOffsetZ") as Float? }@JvmName("S1_renderOffsetZ") set(value) { WrapManager.setter(theInstance, CNF_43073, "renderOffsetZ", value) }
	var spawnForced: Boolean? @JvmName("G2_spawnForced") get() { return WrapManager.getter(theInstance, CNF_43073, "spawnForced") as Boolean? }@JvmName("S2_spawnForced") set(value) { WrapManager.setter(theInstance, CNF_43073, "spawnForced", value) }
	var xpSeed: Int? @JvmName("G2_xpSeed") get() { return WrapManager.getter(theInstance, CNF_43073, "xpSeed") as Int? }@JvmName("S2_xpSeed") set(value) { WrapManager.setter(theInstance, CNF_43073, "xpSeed", value) }
	var itemInUseCount: Int? @JvmName("G1_itemInUseCount") get() { return WrapManager.getter(theInstance, CNF_43073, "itemInUseCount") as Int? }@JvmName("S1_itemInUseCount") set(value) { WrapManager.setter(theInstance, CNF_43073, "itemInUseCount", value) }
	var lastXPSound: Int? @JvmName("G2_lastXPSound") get() { return WrapManager.getter(theInstance, CNF_43073, "lastXPSound") as Int? }@JvmName("S2_lastXPSound") set(value) { WrapManager.setter(theInstance, CNF_43073, "lastXPSound", value) }
	@JvmName("M1_addExhaustion") fun addExhaustion(p0: Float?){  WrapManager.call(theInstance, CNF_43073, "addExhaustion", "(F)V", p0) }
	@JvmName("M1_addExperienceLevel") fun addExperienceLevel(p0: Int?){  WrapManager.call(theInstance, CNF_43073, "addExperienceLevel", "(I)V", p0) }
	@JvmName("M1_displayVillagerTradeGui") fun displayVillagerTradeGui(p0: Any?){  WrapManager.call(theInstance, CNF_43073, "displayVillagerTradeGui", "(Lnet/minecraft/entity/IMerchant;)V", p0) }
	@JvmName("M1_openEditCommandBlock") fun openEditCommandBlock(p0: Any?){  WrapManager.call(theInstance, CNF_43073, "openEditCommandBlock", "(Lnet/minecraft/command/server/CommandBlockLogic;)V", p0) }
	@JvmName("M1_setGameType") fun setGameType(p0: Any?){  WrapManager.call(theInstance, CNF_43073, "setGameType", "(Lnet/minecraft/world/WorldSettings\$GameType;)V", p0) }
	@JvmName("M1_getToolDigEfficiency") fun getToolDigEfficiency(p0: Any?): Float?{ return WrapManager.call(theInstance, CNF_43073, "getToolDigEfficiency", "(Lnet/minecraft/block/Block;)F", p0) as Float? }
	@JvmName("M1_openEditSign") fun openEditSign(p0: Any?){  WrapManager.call(theInstance, CNF_43073, "openEditSign", "(Lnet/minecraft/tileentity/TileEntitySign;)V", p0) }
	@JvmName("M1_canPlayerEdit") fun canPlayerEdit(p0: Any?, p1: Any?, p2: Any?): Boolean?{ return WrapManager.call(theInstance, CNF_43073, "canPlayerEdit", "(Lnet/minecraft/util/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/item/ItemStack;)Z", p0,p1,p2) as Boolean? }
	@JvmName("M1_setSpawnPoint") fun setSpawnPoint(p0: Any?, p1: Boolean?){  WrapManager.call(theInstance, CNF_43073, "setSpawnPoint", "(Lnet/minecraft/util/BlockPos;Z)V", p0,p1) }
	@JvmName("M2_func_175139_a") fun func_175139_a(p0: Any?){  WrapManager.call(theInstance, CNF_43073, "func_175139_a", "(Lnet/minecraft/util/EnumFacing;)V", p0) }
	@JvmName("M1_func_175145_a") fun func_175145_a(p0: Any?){  WrapManager.call(theInstance, CNF_43073, "func_175145_a", "(Lnet/minecraft/stats/StatBase;)V", p0) }
	@JvmName("M1_addStat") fun addStat(p0: Any?, p1: Int?){  WrapManager.call(theInstance, CNF_43073, "addStat", "(Lnet/minecraft/stats/StatBase;I)V", p0,p1) }
	@JvmName("M1_displayGUIChest") fun displayGUIChest(p0: Any?){  WrapManager.call(theInstance, CNF_43073, "displayGUIChest", "(Lnet/minecraft/inventory/IInventory;)V", p0) }
	@JvmName("M1_displayGui") fun displayGui(p0: Any?){  WrapManager.call(theInstance, CNF_43073, "displayGui", "(Lnet/minecraft/world/IInteractionObject;)V", p0) }
	@JvmName("M1_canOpen") fun canOpen(p0: Any?): Boolean?{ return WrapManager.call(theInstance, CNF_43073, "canOpen", "(Lnet/minecraft/world/LockCode;)Z", p0) as Boolean? }
	@JvmName("M1_displayGUIHorse") fun displayGUIHorse(p0: Any?, p1: Any?){  WrapManager.call(theInstance, CNF_43073, "displayGUIHorse", "(Lnet/minecraft/entity/passive/EntityHorse;Lnet/minecraft/inventory/IInventory;)V", p0,p1) }
	@JvmName("M1_joinEntityItemWithWorld") fun joinEntityItemWithWorld(p0: Any?){  WrapManager.call(theInstance, CNF_43073, "joinEntityItemWithWorld", "(Lnet/minecraft/entity/item/EntityItem;)V", p0) }
	@JvmName("M1_canAttackPlayer") fun canAttackPlayer(p0: wrapped.net.minecraft.entity.player.EntityPlayer?): Boolean?{ return WrapManager.call(theInstance, CNF_43073, "canAttackPlayer", "(Lnet/minecraft/entity/player/EntityPlayer;)Z", p0?.theInstance) as Boolean? }
	@JvmName("M1_clonePlayer") fun clonePlayer(p0: wrapped.net.minecraft.entity.player.EntityPlayer?, p1: Boolean?){  WrapManager.call(theInstance, CNF_43073, "clonePlayer", "(Lnet/minecraft/entity/player/EntityPlayer;Z)V", p0?.theInstance,p1) }
	@JvmName("M1_isWearing") fun isWearing(p0: Any?): Boolean?{ return WrapManager.call(theInstance, CNF_43073, "isWearing", "(Lnet/minecraft/entity/player/EnumPlayerModelParts;)Z", p0) as Boolean? }
	@JvmName("M1_displayGUIBook") fun displayGUIBook(p0: Any?){  WrapManager.call(theInstance, CNF_43073, "displayGUIBook", "(Lnet/minecraft/item/ItemStack;)V", p0) }
	@JvmName("M1_setItemInUse") fun setItemInUse(p0: Any?, p1: Int?){  WrapManager.call(theInstance, CNF_43073, "setItemInUse", "(Lnet/minecraft/item/ItemStack;I)V", p0,p1) }
	@JvmName("M1_wakeUpPlayer") fun wakeUpPlayer(p0: Boolean?, p1: Boolean?, p2: Boolean?){  WrapManager.call(theInstance, CNF_43073, "wakeUpPlayer", "(ZZZ)V", p0,p1,p2) }
	@JvmName("M1_removeExperienceLevel") fun removeExperienceLevel(p0: Int?){  WrapManager.call(theInstance, CNF_43073, "removeExperienceLevel", "(I)V", p0) }
	@JvmName("M1_canHarvestBlock") fun canHarvestBlock(p0: Any?): Boolean?{ return WrapManager.call(theInstance, CNF_43073, "canHarvestBlock", "(Lnet/minecraft/block/Block;)Z", p0) as Boolean? }
	@JvmName("M1_addChatComponentMessage") fun addChatComponentMessage(p0: Any?){  WrapManager.call(theInstance, CNF_43073, "addChatComponentMessage", "(Lnet/minecraft/util/IChatComponent;)V", p0) }
	@JvmName("M1_triggerAchievement") fun triggerAchievement(p0: Any?){  WrapManager.call(theInstance, CNF_43073, "triggerAchievement", "(Lnet/minecraft/stats/StatBase;)V", p0) }
	@JvmName("M1_onCriticalHit") fun onCriticalHit(p0: wrapped.net.minecraft.entity.Entity?){  WrapManager.call(theInstance, CNF_43073, "onCriticalHit", "(Lnet/minecraft/entity/Entity;)V", p0?.theInstance) }
	@JvmName("M4_updateItemUse") fun updateItemUse(p0: Any?, p1: Int?){  WrapManager.call(theInstance, CNF_43073, "updateItemUse", "(Lnet/minecraft/item/ItemStack;I)V", p0,p1) }
	@JvmName("M1_getItemInUseCount") fun getItemInUseCount(): Int?{ return WrapManager.call(theInstance, CNF_43073, "getItemInUseCount", "()I") as Int? }
	@JvmName("M1_isUsingItem") fun isUsingItem(): Boolean?{ return WrapManager.call(theInstance, CNF_43073, "isUsingItem", "()Z") as Boolean? }
	@JvmName("M1_getItemInUseDuration") fun getItemInUseDuration(): Int?{ return WrapManager.call(theInstance, CNF_43073, "getItemInUseDuration", "()I") as Int? }
	@JvmName("M1_stopUsingItem") fun stopUsingItem(){  WrapManager.call(theInstance, CNF_43073, "stopUsingItem", "()V") }
	@JvmName("M1_clearItemInUse") fun clearItemInUse(){  WrapManager.call(theInstance, CNF_43073, "clearItemInUse", "()V") }
	@JvmName("M1_isBlocking") fun isBlocking(): Boolean?{ return WrapManager.call(theInstance, CNF_43073, "isBlocking", "()Z") as Boolean? }
	@JvmName("M1_getScore") fun getScore(): Int?{ return WrapManager.call(theInstance, CNF_43073, "getScore", "()I") as Int? }
	@JvmName("M1_getArmorVisibility") fun getArmorVisibility(): Float?{ return WrapManager.call(theInstance, CNF_43073, "getArmorVisibility", "()F") as Float? }
	@JvmName("M1_onEnchantmentCritical") fun onEnchantmentCritical(p0: wrapped.net.minecraft.entity.Entity?){  WrapManager.call(theInstance, CNF_43073, "onEnchantmentCritical", "(Lnet/minecraft/entity/Entity;)V", p0?.theInstance) }
	@JvmName("M1_destroyCurrentEquippedItem") fun destroyCurrentEquippedItem(){  WrapManager.call(theInstance, CNF_43073, "destroyCurrentEquippedItem", "()V") }
	@JvmName("M1_respawnPlayer") fun respawnPlayer(){  WrapManager.call(theInstance, CNF_43073, "respawnPlayer", "()V") }
	@JvmName("M1_isUser") fun isUser(): Boolean?{ return WrapManager.call(theInstance, CNF_43073, "isUser", "()Z") as Boolean? }
	@JvmName("M1_getBedOrientationInDegrees") fun getBedOrientationInDegrees(): Float?{ return WrapManager.call(theInstance, CNF_43073, "getBedOrientationInDegrees", "()F") as Float? }
	@JvmName("M1_isPlayerFullyAsleep") fun isPlayerFullyAsleep(): Boolean?{ return WrapManager.call(theInstance, CNF_43073, "isPlayerFullyAsleep", "()Z") as Boolean? }
	@JvmName("M1_getSleepTimer") fun getSleepTimer(): Int?{ return WrapManager.call(theInstance, CNF_43073, "getSleepTimer", "()I") as Int? }
	@JvmName("M1_isSpawnForced") fun isSpawnForced(): Boolean?{ return WrapManager.call(theInstance, CNF_43073, "isSpawnForced", "()Z") as Boolean? }
	@JvmName("M1_getXPSeed") fun getXPSeed(): Int?{ return WrapManager.call(theInstance, CNF_43073, "getXPSeed", "()I") as Int? }
	@JvmName("M1_xpBarCap") fun xpBarCap(): Int?{ return WrapManager.call(theInstance, CNF_43073, "xpBarCap", "()I") as Int? }
	@JvmName("M1_shouldHeal") fun shouldHeal(): Boolean?{ return WrapManager.call(theInstance, CNF_43073, "shouldHeal", "()Z") as Boolean? }
	@JvmName("M1_isAllowEdit") fun isAllowEdit(): Boolean?{ return WrapManager.call(theInstance, CNF_43073, "isAllowEdit", "()Z") as Boolean? }
	@JvmName("M1_hasReducedDebug") fun hasReducedDebug(): Boolean?{ return WrapManager.call(theInstance, CNF_43073, "hasReducedDebug", "()Z") as Boolean? }
	@JvmName("M2_collideWithPlayer") fun collideWithPlayer(p0: wrapped.net.minecraft.entity.Entity?){  WrapManager.call(theInstance, CNF_43073, "collideWithPlayer", "(Lnet/minecraft/entity/Entity;)V", p0?.theInstance) }
	@JvmName("M1_attackTargetEntityWithCurrentItem") fun attackTargetEntityWithCurrentItem(p0: wrapped.net.minecraft.entity.Entity?){  WrapManager.call(theInstance, CNF_43073, "attackTargetEntityWithCurrentItem", "(Lnet/minecraft/entity/Entity;)V", p0?.theInstance) }
	@JvmName("M1_canEat") fun canEat(p0: Boolean?): Boolean?{ return WrapManager.call(theInstance, CNF_43073, "canEat", "(Z)Z", p0) as Boolean? }
	@JvmName("M1_addMovementStat") fun addMovementStat(p0: Double?, p1: Double?, p2: Double?){  WrapManager.call(theInstance, CNF_43073, "addMovementStat", "(DDD)V", p0,p1,p2) }
	@JvmName("M1_setReducedDebug") fun setReducedDebug(p0: Boolean?){  WrapManager.call(theInstance, CNF_43073, "setReducedDebug", "(Z)V", p0) }
	@JvmName("M2_addMountedMovementStat") fun addMountedMovementStat(p0: Double?, p1: Double?, p2: Double?){  WrapManager.call(theInstance, CNF_43073, "addMountedMovementStat", "(DDD)V", p0,p1,p2) }
	@JvmName("M1_closeScreen") fun closeScreen(){  WrapManager.call(theInstance, CNF_43073, "closeScreen", "()V") }
	@JvmName("M2_isInBed") fun isInBed(): Boolean?{ return WrapManager.call(theInstance, CNF_43073, "isInBed", "()Z") as Boolean? }
	@JvmName("M1_setScore") fun setScore(p0: Int?){  WrapManager.call(theInstance, CNF_43073, "setScore", "(I)V", p0) }
	@JvmName("M4_onItemUseFinish") fun onItemUseFinish(){  WrapManager.call(theInstance, CNF_43073, "onItemUseFinish", "()V") }
	@JvmName("M1_addScore") fun addScore(p0: Int?){  WrapManager.call(theInstance, CNF_43073, "addScore", "(I)V", p0) }
	@JvmName("M1_sendPlayerAbilities") fun sendPlayerAbilities(){  WrapManager.call(theInstance, CNF_43073, "sendPlayerAbilities", "()V") }
	@JvmName("M1_addExperience") fun addExperience(p0: Int?){  WrapManager.call(theInstance, CNF_43073, "addExperience", "(I)V", p0) }
	@JvmName("M1_interactWith") fun interactWith(p0: wrapped.net.minecraft.entity.Entity?): Boolean?{ return WrapManager.call(theInstance, CNF_43073, "interactWith", "(Lnet/minecraft/entity/Entity;)Z", p0?.theInstance) as Boolean? }
	@JvmName("M1025_isSpectator") fun isSpectator(): Boolean?{ return WrapManager.call(theInstance, CNF_43073, "isSpectator", "()Z") as Boolean? }
	companion object {
		val CNF_43073 = "net.minecraft.entity.player.EntityPlayer"
		val originalClass: Class<*> @JvmName("ORIGIN_75255") get() = WrapManager.origin(CNF_43073)
		@JvmName("M9_getUUID") fun getUUID(p0: Any?): java.util.UUID?{ return WrapManager.call(null, CNF_43073, "getUUID", "(Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;", p0) as java.util.UUID? }
		@JvmName("M9_getOfflineUUID") fun getOfflineUUID(p0: String?): java.util.UUID?{ return WrapManager.call(null, CNF_43073, "getOfflineUUID", "(Ljava/lang/String;)Ljava/util/UUID;", p0) as java.util.UUID? }
	}
}