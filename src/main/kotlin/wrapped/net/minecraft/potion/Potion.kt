package wrapped.net.minecraft.potion

import me.liuli.luminous.wrapper.WrapManager

open class Potion(val theInstance: Any = originalClass.newInstance()) {
	var id: Int? @JvmName("G1_id") get() { return WrapManager.getter(theInstance, CNF_59947, "id") as Int? }@JvmName("S1_id") set(value) { WrapManager.setter(theInstance, CNF_59947, "id", value) }
	val isBadEffect: Boolean? @JvmName("G18_isBadEffect") get() { return WrapManager.getter(theInstance, CNF_59947, "isBadEffect") as Boolean? }
	val liquidColor: Int? @JvmName("G18_liquidColor") get() { return WrapManager.getter(theInstance, CNF_59947, "liquidColor") as Int? }
	var name: String? @JvmName("G2_name") get() { return WrapManager.getter(theInstance, CNF_59947, "name") as String? }@JvmName("S2_name") set(value) { WrapManager.setter(theInstance, CNF_59947, "name", value) }
	var statusIconIndex: Int? @JvmName("G2_statusIconIndex") get() { return WrapManager.getter(theInstance, CNF_59947, "statusIconIndex") as Int? }@JvmName("S2_statusIconIndex") set(value) { WrapManager.setter(theInstance, CNF_59947, "statusIconIndex", value) }
	var effectiveness: Double? @JvmName("G2_effectiveness") get() { return WrapManager.getter(theInstance, CNF_59947, "effectiveness") as Double? }@JvmName("S2_effectiveness") set(value) { WrapManager.setter(theInstance, CNF_59947, "effectiveness", value) }
	var usable: Boolean? @JvmName("G2_usable") get() { return WrapManager.getter(theInstance, CNF_59947, "usable") as Boolean? }@JvmName("S2_usable") set(value) { WrapManager.setter(theInstance, CNF_59947, "usable", value) }
	@JvmName("M1_getName") fun getName(): String?{ return WrapManager.call(theInstance, CNF_59947, "getName", "()Ljava/lang/String;") as String? }
	@JvmName("M4_setEffectiveness") fun setEffectiveness(p0: Double?): wrapped.net.minecraft.potion.Potion?{ return wrapped.net.minecraft.potion.Potion(WrapManager.call(theInstance, CNF_59947, "setEffectiveness", "(D)Lnet/minecraft/potion/Potion;", p0)?:return null) }
	@JvmName("M1_isReady") fun isReady(p0: Int?, p1: Int?): Boolean?{ return WrapManager.call(theInstance, CNF_59947, "isReady", "(II)Z", p0,p1) as Boolean? }
	@JvmName("M1_getAttributeModifierAmount") fun getAttributeModifierAmount(p0: Int?, p1: Any?): Double?{ return WrapManager.call(theInstance, CNF_59947, "getAttributeModifierAmount", "(ILnet/minecraft/entity/ai/attributes/AttributeModifier;)D", p0,p1) as Double? }
	@JvmName("M1_affectEntity") fun affectEntity(p0: wrapped.net.minecraft.entity.Entity?, p1: wrapped.net.minecraft.entity.Entity?, p2: wrapped.net.minecraft.entity.EntityLivingBase?, p3: Int?, p4: Double?){  WrapManager.call(theInstance, CNF_59947, "affectEntity", "(Lnet/minecraft/entity/Entity;Lnet/minecraft/entity/Entity;Lnet/minecraft/entity/EntityLivingBase;ID)V", p0?.theInstance,p1?.theInstance,p2?.theInstance,p3,p4) }
	@JvmName("M1_performEffect") fun performEffect(p0: wrapped.net.minecraft.entity.EntityLivingBase?, p1: Int?){  WrapManager.call(theInstance, CNF_59947, "performEffect", "(Lnet/minecraft/entity/EntityLivingBase;I)V", p0?.theInstance,p1) }
	@JvmName("M1_registerPotionAttributeModifier") fun registerPotionAttributeModifier(p0: Any?, p1: String?, p2: Double?, p3: Int?): wrapped.net.minecraft.potion.Potion?{ return wrapped.net.minecraft.potion.Potion(WrapManager.call(theInstance, CNF_59947, "registerPotionAttributeModifier", "(Lnet/minecraft/entity/ai/attributes/IAttribute;Ljava/lang/String;DI)Lnet/minecraft/potion/Potion;", p0,p1,p2,p3)?:return null) }
	@JvmName("M1_isInstant") fun isInstant(): Boolean?{ return WrapManager.call(theInstance, CNF_59947, "isInstant", "()Z") as Boolean? }
	@JvmName("M4_setIconIndex") fun setIconIndex(p0: Int?, p1: Int?): wrapped.net.minecraft.potion.Potion?{ return wrapped.net.minecraft.potion.Potion(WrapManager.call(theInstance, CNF_59947, "setIconIndex", "(II)Lnet/minecraft/potion/Potion;", p0,p1)?:return null) }
	@JvmName("M1_setPotionName") fun setPotionName(p0: String?): wrapped.net.minecraft.potion.Potion?{ return wrapped.net.minecraft.potion.Potion(WrapManager.call(theInstance, CNF_59947, "setPotionName", "(Ljava/lang/String;)Lnet/minecraft/potion/Potion;", p0)?:return null) }
	@JvmName("M1_getId") fun getId(): Int?{ return WrapManager.call(theInstance, CNF_59947, "getId", "()I") as Int? }
	@JvmName("M1_hasStatusIcon") fun hasStatusIcon(): Boolean?{ return WrapManager.call(theInstance, CNF_59947, "hasStatusIcon", "()Z") as Boolean? }
	@JvmName("M1_getStatusIconIndex") fun getStatusIconIndex(): Int?{ return WrapManager.call(theInstance, CNF_59947, "getStatusIconIndex", "()I") as Int? }
	@JvmName("M1_isBadEffect") fun isBadEffect(): Boolean?{ return WrapManager.call(theInstance, CNF_59947, "isBadEffect", "()Z") as Boolean? }
	@JvmName("M1_getEffectiveness") fun getEffectiveness(): Double?{ return WrapManager.call(theInstance, CNF_59947, "getEffectiveness", "()D") as Double? }
	@JvmName("M1_isUsable") fun isUsable(): Boolean?{ return WrapManager.call(theInstance, CNF_59947, "isUsable", "()Z") as Boolean? }
	@JvmName("M1_getLiquidColor") fun getLiquidColor(): Int?{ return WrapManager.call(theInstance, CNF_59947, "getLiquidColor", "()I") as Int? }
	companion object {
		val CNF_59947 = "net.minecraft.potion.Potion"
		val originalClass: Class<*> @JvmName("ORIGIN_22668") get() = WrapManager.origin(CNF_59947)
		val field_180147_A: wrapped.net.minecraft.potion.Potion? @JvmName("G25_field_180147_A") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "field_180147_A")?:return null) }
		val field_180148_B: wrapped.net.minecraft.potion.Potion? @JvmName("G25_field_180148_B") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "field_180148_B")?:return null) }
		val field_180149_C: wrapped.net.minecraft.potion.Potion? @JvmName("G25_field_180149_C") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "field_180149_C")?:return null) }
		val field_180143_D: wrapped.net.minecraft.potion.Potion? @JvmName("G25_field_180143_D") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "field_180143_D")?:return null) }
		val field_180144_E: wrapped.net.minecraft.potion.Potion? @JvmName("G25_field_180144_E") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "field_180144_E")?:return null) }
		val field_180145_F: wrapped.net.minecraft.potion.Potion? @JvmName("G25_field_180145_F") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "field_180145_F")?:return null) }
		val field_180146_G: wrapped.net.minecraft.potion.Potion? @JvmName("G25_field_180146_G") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "field_180146_G")?:return null) }
		val potionTypes: Array<wrapped.net.minecraft.potion.Potion>? @JvmName("G25_potionTypes") get() { return WrapManager.getter(null, CNF_59947, "potionTypes") as Array<wrapped.net.minecraft.potion.Potion>? }
		val field_180151_b: wrapped.net.minecraft.potion.Potion? @JvmName("G25_field_180151_b") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "field_180151_b")?:return null) }
		val moveSpeed: wrapped.net.minecraft.potion.Potion? @JvmName("G25_moveSpeed") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "moveSpeed")?:return null) }
		val moveSlowdown: wrapped.net.minecraft.potion.Potion? @JvmName("G25_moveSlowdown") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "moveSlowdown")?:return null) }
		val digSpeed: wrapped.net.minecraft.potion.Potion? @JvmName("G25_digSpeed") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "digSpeed")?:return null) }
		val digSlowdown: wrapped.net.minecraft.potion.Potion? @JvmName("G25_digSlowdown") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "digSlowdown")?:return null) }
		val damageBoost: wrapped.net.minecraft.potion.Potion? @JvmName("G25_damageBoost") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "damageBoost")?:return null) }
		val heal: wrapped.net.minecraft.potion.Potion? @JvmName("G25_heal") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "heal")?:return null) }
		val harm: wrapped.net.minecraft.potion.Potion? @JvmName("G25_harm") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "harm")?:return null) }
		val jump: wrapped.net.minecraft.potion.Potion? @JvmName("G25_jump") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "jump")?:return null) }
		val confusion: wrapped.net.minecraft.potion.Potion? @JvmName("G25_confusion") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "confusion")?:return null) }
		val regeneration: wrapped.net.minecraft.potion.Potion? @JvmName("G25_regeneration") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "regeneration")?:return null) }
		val resistance: wrapped.net.minecraft.potion.Potion? @JvmName("G25_resistance") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "resistance")?:return null) }
		val fireResistance: wrapped.net.minecraft.potion.Potion? @JvmName("G25_fireResistance") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "fireResistance")?:return null) }
		val waterBreathing: wrapped.net.minecraft.potion.Potion? @JvmName("G25_waterBreathing") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "waterBreathing")?:return null) }
		val invisibility: wrapped.net.minecraft.potion.Potion? @JvmName("G25_invisibility") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "invisibility")?:return null) }
		val blindness: wrapped.net.minecraft.potion.Potion? @JvmName("G25_blindness") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "blindness")?:return null) }
		val nightVision: wrapped.net.minecraft.potion.Potion? @JvmName("G25_nightVision") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "nightVision")?:return null) }
		val hunger: wrapped.net.minecraft.potion.Potion? @JvmName("G25_hunger") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "hunger")?:return null) }
		val weakness: wrapped.net.minecraft.potion.Potion? @JvmName("G25_weakness") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "weakness")?:return null) }
		val poison: wrapped.net.minecraft.potion.Potion? @JvmName("G25_poison") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "poison")?:return null) }
		val wither: wrapped.net.minecraft.potion.Potion? @JvmName("G25_wither") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "wither")?:return null) }
		val healthBoost: wrapped.net.minecraft.potion.Potion? @JvmName("G25_healthBoost") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "healthBoost")?:return null) }
		val absorption: wrapped.net.minecraft.potion.Potion? @JvmName("G25_absorption") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "absorption")?:return null) }
		val saturation: wrapped.net.minecraft.potion.Potion? @JvmName("G25_saturation") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "saturation")?:return null) }
		val field_180153_z: wrapped.net.minecraft.potion.Potion? @JvmName("G25_field_180153_z") get() { return wrapped.net.minecraft.potion.Potion(WrapManager.getter(null, CNF_59947, "field_180153_z")?:return null) }
		@JvmName("M9_getDurationString") fun getDurationString(p0: wrapped.net.minecraft.potion.PotionEffect?): String?{ return WrapManager.call(null, CNF_59947, "getDurationString", "(Lnet/minecraft/potion/PotionEffect;)Ljava/lang/String;", p0?.theInstance) as String? }
		@JvmName("M9_getPotionFromResourceLocation") fun getPotionFromResourceLocation(p0: String?): wrapped.net.minecraft.potion.Potion?{ return wrapped.net.minecraft.potion.Potion(WrapManager.call(null, CNF_59947, "getPotionFromResourceLocation", "(Ljava/lang/String;)Lnet/minecraft/potion/Potion;", p0)?:return null) }
	}
}