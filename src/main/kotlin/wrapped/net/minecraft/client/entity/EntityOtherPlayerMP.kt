package wrapped.net.minecraft.client.entity

import me.liuli.luminous.wrapper.WrapManager

open class EntityOtherPlayerMP(theInstance: Any = originalClass.newInstance()):wrapped.net.minecraft.client.entity.AbstractClientPlayer(theInstance) {
	var isItemInUse: Boolean? @JvmName("G2_isItemInUse") get() { return WrapManager.getter(theInstance, CNF_50817, "isItemInUse") as Boolean? }@JvmName("S2_isItemInUse") set(value) { WrapManager.setter(theInstance, CNF_50817, "isItemInUse", value) }
	var otherPlayerMPPosRotationIncrements: Int? @JvmName("G2_otherPlayerMPPosRotationIncrements") get() { return WrapManager.getter(theInstance, CNF_50817, "otherPlayerMPPosRotationIncrements") as Int? }@JvmName("S2_otherPlayerMPPosRotationIncrements") set(value) { WrapManager.setter(theInstance, CNF_50817, "otherPlayerMPPosRotationIncrements", value) }
	var otherPlayerMPX: Double? @JvmName("G2_otherPlayerMPX") get() { return WrapManager.getter(theInstance, CNF_50817, "otherPlayerMPX") as Double? }@JvmName("S2_otherPlayerMPX") set(value) { WrapManager.setter(theInstance, CNF_50817, "otherPlayerMPX", value) }
	var otherPlayerMPY: Double? @JvmName("G2_otherPlayerMPY") get() { return WrapManager.getter(theInstance, CNF_50817, "otherPlayerMPY") as Double? }@JvmName("S2_otherPlayerMPY") set(value) { WrapManager.setter(theInstance, CNF_50817, "otherPlayerMPY", value) }
	var otherPlayerMPZ: Double? @JvmName("G2_otherPlayerMPZ") get() { return WrapManager.getter(theInstance, CNF_50817, "otherPlayerMPZ") as Double? }@JvmName("S2_otherPlayerMPZ") set(value) { WrapManager.setter(theInstance, CNF_50817, "otherPlayerMPZ", value) }
	var otherPlayerMPYaw: Double? @JvmName("G2_otherPlayerMPYaw") get() { return WrapManager.getter(theInstance, CNF_50817, "otherPlayerMPYaw") as Double? }@JvmName("S2_otherPlayerMPYaw") set(value) { WrapManager.setter(theInstance, CNF_50817, "otherPlayerMPYaw", value) }
	var otherPlayerMPPitch: Double? @JvmName("G2_otherPlayerMPPitch") get() { return WrapManager.getter(theInstance, CNF_50817, "otherPlayerMPPitch") as Double? }@JvmName("S2_otherPlayerMPPitch") set(value) { WrapManager.setter(theInstance, CNF_50817, "otherPlayerMPPitch", value) }
	companion object {
		val CNF_50817 = "net.minecraft.client.entity.EntityOtherPlayerMP"
		val originalClass: Class<*> @JvmName("ORIGIN_57512") get() = WrapManager.origin(CNF_50817)
	}
}