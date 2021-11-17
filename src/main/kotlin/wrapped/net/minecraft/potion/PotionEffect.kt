package wrapped.net.minecraft.potion

import me.liuli.luminous.wrapper.WrapManager

open class PotionEffect(val theInstance: Any = originalClass.newInstance()) {
	var potionID: Int? @JvmName("G2_potionID") get() { return WrapManager.getter(theInstance, CNF_40603, "potionID") as Int? }@JvmName("S2_potionID") set(value) { WrapManager.setter(theInstance, CNF_40603, "potionID", value) }
	var duration: Int? @JvmName("G2_duration") get() { return WrapManager.getter(theInstance, CNF_40603, "duration") as Int? }@JvmName("S2_duration") set(value) { WrapManager.setter(theInstance, CNF_40603, "duration", value) }
	var amplifier: Int? @JvmName("G2_amplifier") get() { return WrapManager.getter(theInstance, CNF_40603, "amplifier") as Int? }@JvmName("S2_amplifier") set(value) { WrapManager.setter(theInstance, CNF_40603, "amplifier", value) }
	var isSplashPotion: Boolean? @JvmName("G2_isSplashPotion") get() { return WrapManager.getter(theInstance, CNF_40603, "isSplashPotion") as Boolean? }@JvmName("S2_isSplashPotion") set(value) { WrapManager.setter(theInstance, CNF_40603, "isSplashPotion", value) }
	var isAmbient: Boolean? @JvmName("G2_isAmbient") get() { return WrapManager.getter(theInstance, CNF_40603, "isAmbient") as Boolean? }@JvmName("S2_isAmbient") set(value) { WrapManager.setter(theInstance, CNF_40603, "isAmbient", value) }
	var isPotionDurationMax: Boolean? @JvmName("G2_isPotionDurationMax") get() { return WrapManager.getter(theInstance, CNF_40603, "isPotionDurationMax") as Boolean? }@JvmName("S2_isPotionDurationMax") set(value) { WrapManager.setter(theInstance, CNF_40603, "isPotionDurationMax", value) }
	var showParticles: Boolean? @JvmName("G2_showParticles") get() { return WrapManager.getter(theInstance, CNF_40603, "showParticles") as Boolean? }@JvmName("S2_showParticles") set(value) { WrapManager.setter(theInstance, CNF_40603, "showParticles", value) }
	@JvmName("M1_getPotionID") fun getPotionID(): Int?{ return WrapManager.call(theInstance, CNF_40603, "getPotionID", "()I") as Int? }
	@JvmName("M1_combine") fun combine(p0: wrapped.net.minecraft.potion.PotionEffect?){  WrapManager.call(theInstance, CNF_40603, "combine", "(Lnet/minecraft/potion/PotionEffect;)V", p0?.theInstance) }
	@JvmName("M1_onUpdate") fun onUpdate(p0: wrapped.net.minecraft.entity.EntityLivingBase?): Boolean?{ return WrapManager.call(theInstance, CNF_40603, "onUpdate", "(Lnet/minecraft/entity/EntityLivingBase;)Z", p0?.theInstance) as Boolean? }
	@JvmName("M1_setSplashPotion") fun setSplashPotion(p0: Boolean?){  WrapManager.call(theInstance, CNF_40603, "setSplashPotion", "(Z)V", p0) }
	@JvmName("M1_getDuration") fun getDuration(): Int?{ return WrapManager.call(theInstance, CNF_40603, "getDuration", "()I") as Int? }
	@JvmName("M1_performEffect") fun performEffect(p0: wrapped.net.minecraft.entity.EntityLivingBase?){  WrapManager.call(theInstance, CNF_40603, "performEffect", "(Lnet/minecraft/entity/EntityLivingBase;)V", p0?.theInstance) }
	@JvmName("M1_setPotionDurationMax") fun setPotionDurationMax(p0: Boolean?){  WrapManager.call(theInstance, CNF_40603, "setPotionDurationMax", "(Z)V", p0) }
	@JvmName("M1_getAmplifier") fun getAmplifier(): Int?{ return WrapManager.call(theInstance, CNF_40603, "getAmplifier", "()I") as Int? }
	@JvmName("M1_getIsAmbient") fun getIsAmbient(): Boolean?{ return WrapManager.call(theInstance, CNF_40603, "getIsAmbient", "()Z") as Boolean? }
	@JvmName("M1_equals") fun equals(p0: java.lang.Object?): Boolean?{ return WrapManager.call(theInstance, CNF_40603, "equals", "(Ljava/lang/Object;)Z", p0) as Boolean? }
	@JvmName("M1_getIsShowParticles") fun getIsShowParticles(): Boolean?{ return WrapManager.call(theInstance, CNF_40603, "getIsShowParticles", "()Z") as Boolean? }
	@JvmName("M1_getEffectName") fun getEffectName(): String?{ return WrapManager.call(theInstance, CNF_40603, "getEffectName", "()Ljava/lang/String;") as String? }
	@JvmName("M1_getIsPotionDurationMax") fun getIsPotionDurationMax(): Boolean?{ return WrapManager.call(theInstance, CNF_40603, "getIsPotionDurationMax", "()Z") as Boolean? }
	@JvmName("M2_deincrementDuration") fun deincrementDuration(): Int?{ return WrapManager.call(theInstance, CNF_40603, "deincrementDuration", "()I") as Int? }
	companion object {
		val CNF_40603 = "net.minecraft.potion.PotionEffect"
		val originalClass: Class<*> @JvmName("ORIGIN_65525") get() = WrapManager.origin(CNF_40603)
		val LOGGER: org.apache.logging.log4j.Logger? @JvmName("G26_LOGGER") get() { return WrapManager.getter(null, CNF_40603, "LOGGER") as org.apache.logging.log4j.Logger? }
		@JvmName("M9_readCustomPotionEffectFromNBT") fun readCustomPotionEffectFromNBT(p0: Any?): wrapped.net.minecraft.potion.PotionEffect?{ return wrapped.net.minecraft.potion.PotionEffect(WrapManager.call(null, CNF_40603, "readCustomPotionEffectFromNBT", "(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/potion/PotionEffect;", p0)?:return null) }
	}
}