
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.iceandollie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.iceandollie.item.BambooItem;
import net.mcreator.iceandollie.IceandollieMod;

public class IceandollieModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IceandollieMod.MODID);
	public static final RegistryObject<Item> BAMBOO = REGISTRY.register("bamboo", () -> new BambooItem());
}
