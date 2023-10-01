
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.iceandollie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.iceandollie.IceandollieMod;

public class IceandollieModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IceandollieMod.MODID);
	public static final RegistryObject<Item> BALLOON_SPAWN_EGG = REGISTRY.register("balloon_spawn_egg", () -> new ForgeSpawnEggItem(IceandollieModEntities.BALLOON, -52429, -65536, new Item.Properties()));
}
