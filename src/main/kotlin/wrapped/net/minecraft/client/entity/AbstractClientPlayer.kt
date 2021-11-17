package wrapped.net.minecraft.client.entity

import me.liuli.luminous.wrapper.WrapManager

open class AbstractClientPlayer(theInstance: Any = originalClass.newInstance()):wrapped.net.minecraft.entity.player.EntityPlayer(theInstance) {
	@JvmName("M1_hasPlayerInfo") fun hasPlayerInfo(): Boolean?{ return WrapManager.call(theInstance, CNF_25714, "hasPlayerInfo", "()Z") as Boolean? }
	@JvmName("M1_hasSkin") fun hasSkin(): Boolean?{ return WrapManager.call(theInstance, CNF_25714, "hasSkin", "()Z") as Boolean? }
	@JvmName("M1_getSkinType") fun getSkinType(): String?{ return WrapManager.call(theInstance, CNF_25714, "getSkinType", "()Ljava/lang/String;") as String? }
	@JvmName("M1_getFovModifier") fun getFovModifier(): Float?{ return WrapManager.call(theInstance, CNF_25714, "getFovModifier", "()F") as Float? }
	companion object {
		val CNF_25714 = "net.minecraft.client.entity.AbstractClientPlayer"
		val originalClass: Class<*> @JvmName("ORIGIN_45978") get() = WrapManager.origin(CNF_25714)
	}
}