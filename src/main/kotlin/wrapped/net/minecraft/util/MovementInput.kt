package wrapped.net.minecraft.util

import me.liuli.luminous.wrapper.WrapManager

open class MovementInput(val theInstance: Any = originalClass.newInstance()) {
	var moveStrafe: Float? @JvmName("G1_moveStrafe") get() { return WrapManager.getter(theInstance, CNF_82245, "moveStrafe") as Float? }@JvmName("S1_moveStrafe") set(value) { WrapManager.setter(theInstance, CNF_82245, "moveStrafe", value) }
	var moveForward: Float? @JvmName("G1_moveForward") get() { return WrapManager.getter(theInstance, CNF_82245, "moveForward") as Float? }@JvmName("S1_moveForward") set(value) { WrapManager.setter(theInstance, CNF_82245, "moveForward", value) }
	var jump: Boolean? @JvmName("G1_jump") get() { return WrapManager.getter(theInstance, CNF_82245, "jump") as Boolean? }@JvmName("S1_jump") set(value) { WrapManager.setter(theInstance, CNF_82245, "jump", value) }
	var sneak: Boolean? @JvmName("G1_sneak") get() { return WrapManager.getter(theInstance, CNF_82245, "sneak") as Boolean? }@JvmName("S1_sneak") set(value) { WrapManager.setter(theInstance, CNF_82245, "sneak", value) }
	@JvmName("M1_updatePlayerMoveState") fun updatePlayerMoveState(){  WrapManager.call(theInstance, CNF_82245, "updatePlayerMoveState", "()V") }
	companion object {
		val CNF_82245 = "net.minecraft.util.MovementInput"
		val originalClass: Class<*> @JvmName("ORIGIN_21221") get() = WrapManager.origin(CNF_82245)
	}
}