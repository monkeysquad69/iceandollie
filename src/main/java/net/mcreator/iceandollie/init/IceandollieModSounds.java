
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.iceandollie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.iceandollie.IceandollieMod;

public class IceandollieModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, IceandollieMod.MODID);
	public static final RegistryObject<SoundEvent> BALLOON_POP = REGISTRY.register("balloon_pop", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("iceandollie", "balloon_pop")));
	public static final RegistryObject<SoundEvent> BALLOON_SNAP = REGISTRY.register("balloon_snap", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("iceandollie", "balloon_snap")));
	public static final RegistryObject<SoundEvent> POP_2 = REGISTRY.register("pop_2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("iceandollie", "pop_2")));
	public static final RegistryObject<SoundEvent> POP_1 = REGISTRY.register("pop_1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("iceandollie", "pop_1")));
}
