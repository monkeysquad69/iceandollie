
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.iceandollie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.iceandollie.world.inventory.TrMenu;
import net.mcreator.iceandollie.world.inventory.QuestGuiMenu;
import net.mcreator.iceandollie.IceandollieMod;

public class IceandollieModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, IceandollieMod.MODID);
	public static final RegistryObject<MenuType<TrMenu>> TR = REGISTRY.register("tr", () -> IForgeMenuType.create(TrMenu::new));
	public static final RegistryObject<MenuType<QuestGuiMenu>> QUEST_GUI = REGISTRY.register("quest_gui", () -> IForgeMenuType.create(QuestGuiMenu::new));
}
