package wrapped.net.minecraft.client.entity

import me.liuli.luminous.wrapper.WrapManager

open class EntityPlayerSP(theInstance: Any = originalClass.newInstance()):wrapped.net.minecraft.client.entity.AbstractClientPlayer(theInstance) {
	var movementInput: wrapped.net.minecraft.util.MovementInput? @JvmName("G1_movementInput") get() { return wrapped.net.minecraft.util.MovementInput(WrapManager.getter(theInstance, CNF_18816, "movementInput")?:return null) }@JvmName("S1_movementInput") set(value) { WrapManager.setter(theInstance, CNF_18816, "movementInput", value?.theInstance) }
	var timeInPortal: Float? @JvmName("G1_timeInPortal") get() { return WrapManager.getter(theInstance, CNF_18816, "timeInPortal") as Float? }@JvmName("S1_timeInPortal") set(value) { WrapManager.setter(theInstance, CNF_18816, "timeInPortal", value) }
	var prevTimeInPortal: Float? @JvmName("G1_prevTimeInPortal") get() { return WrapManager.getter(theInstance, CNF_18816, "prevTimeInPortal") as Float? }@JvmName("S1_prevTimeInPortal") set(value) { WrapManager.setter(theInstance, CNF_18816, "prevTimeInPortal", value) }
	var lastReportedPosX: Double? @JvmName("G2_lastReportedPosX") get() { return WrapManager.getter(theInstance, CNF_18816, "lastReportedPosX") as Double? }@JvmName("S2_lastReportedPosX") set(value) { WrapManager.setter(theInstance, CNF_18816, "lastReportedPosX", value) }
	var lastReportedPosY: Double? @JvmName("G2_lastReportedPosY") get() { return WrapManager.getter(theInstance, CNF_18816, "lastReportedPosY") as Double? }@JvmName("S2_lastReportedPosY") set(value) { WrapManager.setter(theInstance, CNF_18816, "lastReportedPosY", value) }
	var lastReportedPosZ: Double? @JvmName("G2_lastReportedPosZ") get() { return WrapManager.getter(theInstance, CNF_18816, "lastReportedPosZ") as Double? }@JvmName("S2_lastReportedPosZ") set(value) { WrapManager.setter(theInstance, CNF_18816, "lastReportedPosZ", value) }
	var lastReportedYaw: Float? @JvmName("G2_lastReportedYaw") get() { return WrapManager.getter(theInstance, CNF_18816, "lastReportedYaw") as Float? }@JvmName("S2_lastReportedYaw") set(value) { WrapManager.setter(theInstance, CNF_18816, "lastReportedYaw", value) }
	var lastReportedPitch: Float? @JvmName("G2_lastReportedPitch") get() { return WrapManager.getter(theInstance, CNF_18816, "lastReportedPitch") as Float? }@JvmName("S2_lastReportedPitch") set(value) { WrapManager.setter(theInstance, CNF_18816, "lastReportedPitch", value) }
	var serverSneakState: Boolean? @JvmName("G2_serverSneakState") get() { return WrapManager.getter(theInstance, CNF_18816, "serverSneakState") as Boolean? }@JvmName("S2_serverSneakState") set(value) { WrapManager.setter(theInstance, CNF_18816, "serverSneakState", value) }
	var serverSprintState: Boolean? @JvmName("G1_serverSprintState") get() { return WrapManager.getter(theInstance, CNF_18816, "serverSprintState") as Boolean? }@JvmName("S1_serverSprintState") set(value) { WrapManager.setter(theInstance, CNF_18816, "serverSprintState", value) }
	var positionUpdateTicks: Int? @JvmName("G2_positionUpdateTicks") get() { return WrapManager.getter(theInstance, CNF_18816, "positionUpdateTicks") as Int? }@JvmName("S2_positionUpdateTicks") set(value) { WrapManager.setter(theInstance, CNF_18816, "positionUpdateTicks", value) }
	var hasValidHealth: Boolean? @JvmName("G2_hasValidHealth") get() { return WrapManager.getter(theInstance, CNF_18816, "hasValidHealth") as Boolean? }@JvmName("S2_hasValidHealth") set(value) { WrapManager.setter(theInstance, CNF_18816, "hasValidHealth", value) }
	var clientBrand: String? @JvmName("G2_clientBrand") get() { return WrapManager.getter(theInstance, CNF_18816, "clientBrand") as String? }@JvmName("S2_clientBrand") set(value) { WrapManager.setter(theInstance, CNF_18816, "clientBrand", value) }
	var horseJumpPowerCounter: Int? @JvmName("G1_horseJumpPowerCounter") get() { return WrapManager.getter(theInstance, CNF_18816, "horseJumpPowerCounter") as Int? }@JvmName("S1_horseJumpPowerCounter") set(value) { WrapManager.setter(theInstance, CNF_18816, "horseJumpPowerCounter", value) }
	var horseJumpPower: Float? @JvmName("G1_horseJumpPower") get() { return WrapManager.getter(theInstance, CNF_18816, "horseJumpPower") as Float? }@JvmName("S1_horseJumpPower") set(value) { WrapManager.setter(theInstance, CNF_18816, "horseJumpPower", value) }
	var mc: wrapped.net.minecraft.client.Minecraft? @JvmName("G4_mc") get() { return wrapped.net.minecraft.client.Minecraft(WrapManager.getter(theInstance, CNF_18816, "mc")?:return null) }@JvmName("S4_mc") set(value) { WrapManager.setter(theInstance, CNF_18816, "mc", value?.theInstance) }
	var sprintToggleTimer: Int? @JvmName("G4_sprintToggleTimer") get() { return WrapManager.getter(theInstance, CNF_18816, "sprintToggleTimer") as Int? }@JvmName("S4_sprintToggleTimer") set(value) { WrapManager.setter(theInstance, CNF_18816, "sprintToggleTimer", value) }
	var sprintingTicksLeft: Int? @JvmName("G1_sprintingTicksLeft") get() { return WrapManager.getter(theInstance, CNF_18816, "sprintingTicksLeft") as Int? }@JvmName("S1_sprintingTicksLeft") set(value) { WrapManager.setter(theInstance, CNF_18816, "sprintingTicksLeft", value) }
	var renderArmYaw: Float? @JvmName("G1_renderArmYaw") get() { return WrapManager.getter(theInstance, CNF_18816, "renderArmYaw") as Float? }@JvmName("S1_renderArmYaw") set(value) { WrapManager.setter(theInstance, CNF_18816, "renderArmYaw", value) }
	var renderArmPitch: Float? @JvmName("G1_renderArmPitch") get() { return WrapManager.getter(theInstance, CNF_18816, "renderArmPitch") as Float? }@JvmName("S1_renderArmPitch") set(value) { WrapManager.setter(theInstance, CNF_18816, "renderArmPitch", value) }
	var prevRenderArmYaw: Float? @JvmName("G1_prevRenderArmYaw") get() { return WrapManager.getter(theInstance, CNF_18816, "prevRenderArmYaw") as Float? }@JvmName("S1_prevRenderArmYaw") set(value) { WrapManager.setter(theInstance, CNF_18816, "prevRenderArmYaw", value) }
	var prevRenderArmPitch: Float? @JvmName("G1_prevRenderArmPitch") get() { return WrapManager.getter(theInstance, CNF_18816, "prevRenderArmPitch") as Float? }@JvmName("S1_prevRenderArmPitch") set(value) { WrapManager.setter(theInstance, CNF_18816, "prevRenderArmPitch", value) }
	@JvmName("M4_isCurrentViewEntity") fun isCurrentViewEntity(): Boolean?{ return WrapManager.call(theInstance, CNF_18816, "isCurrentViewEntity", "()Z") as Boolean? }
	@JvmName("M1_setXPStats") fun setXPStats(p0: Float?, p1: Int?, p2: Int?){  WrapManager.call(theInstance, CNF_18816, "setXPStats", "(FII)V", p0,p1,p2) }
	@JvmName("M2_isOpenBlockSpace") fun isOpenBlockSpace(p0: Any?): Boolean?{ return WrapManager.call(theInstance, CNF_18816, "isOpenBlockSpace", "(Lnet/minecraft/util/BlockPos;)Z", p0) as Boolean? }
	@JvmName("M1_sendChatMessage") fun sendChatMessage(p0: String?){  WrapManager.call(theInstance, CNF_18816, "sendChatMessage", "(Ljava/lang/String;)V", p0) }
	@JvmName("M1_setClientBrand") fun setClientBrand(p0: String?){  WrapManager.call(theInstance, CNF_18816, "setClientBrand", "(Ljava/lang/String;)V", p0) }
	@JvmName("M1_setPlayerSPHealth") fun setPlayerSPHealth(p0: Float?){  WrapManager.call(theInstance, CNF_18816, "setPlayerSPHealth", "(F)V", p0) }
	@JvmName("M1_onUpdateWalkingPlayer") fun onUpdateWalkingPlayer(){  WrapManager.call(theInstance, CNF_18816, "onUpdateWalkingPlayer", "()V") }
	@JvmName("M1_closeScreenAndDropStack") fun closeScreenAndDropStack(){  WrapManager.call(theInstance, CNF_18816, "closeScreenAndDropStack", "()V") }
	@JvmName("M4_sendHorseJump") fun sendHorseJump(){  WrapManager.call(theInstance, CNF_18816, "sendHorseJump", "()V") }
	@JvmName("M1_sendHorseInventory") fun sendHorseInventory(){  WrapManager.call(theInstance, CNF_18816, "sendHorseInventory", "()V") }
	@JvmName("M1_getClientBrand") fun getClientBrand(): String?{ return WrapManager.call(theInstance, CNF_18816, "getClientBrand", "()Ljava/lang/String;") as String? }
	@JvmName("M1_isRidingHorse") fun isRidingHorse(): Boolean?{ return WrapManager.call(theInstance, CNF_18816, "isRidingHorse", "()Z") as Boolean? }
	@JvmName("M1_getHorseJumpPower") fun getHorseJumpPower(): Float?{ return WrapManager.call(theInstance, CNF_18816, "getHorseJumpPower", "()F") as Float? }
	companion object {
		val CNF_18816 = "net.minecraft.client.entity.EntityPlayerSP"
		val originalClass: Class<*> @JvmName("ORIGIN_52024") get() = WrapManager.origin(CNF_18816)
	}
}