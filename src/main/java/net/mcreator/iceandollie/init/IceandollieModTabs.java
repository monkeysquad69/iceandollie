
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.iceandollie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.iceandollie.IceandollieMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IceandollieModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IceandollieMod.MODID);
	public static final RegistryObject<CreativeModeTab> QUESTS = REGISTRY.register("quests",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.iceandollie.quests")).icon(() -> new ItemStack(Items.WRITABLE_BOOK)).displayItems((parameters, tabData) -> {
				tabData.accept(IceandollieModItems.BAMBOO.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(IceandollieModItems.BALLOON_SPAWN_EGG.get());
		}
	}
}
