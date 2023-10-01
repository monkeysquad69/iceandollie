package net.mcreator.iceandollie.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.iceandollie.world.inventory.QuestGuiMenu;
import net.mcreator.iceandollie.procedures.IntroquestdoneProcedure;
import net.mcreator.iceandollie.network.QuestGuiButtonMessage;
import net.mcreator.iceandollie.IceandollieMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class QuestGuiScreen extends AbstractContainerScreen<QuestGuiMenu> {
	private final static HashMap<String, Object> guistate = QuestGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_intro_quest;

	public QuestGuiScreen(QuestGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("iceandollie:textures/screens/quest_gui.png"), this.leftPos + -1, this.topPos + 0, 0, 0, 256, 256, 256, 256);

		guiGraphics.blit(new ResourceLocation("iceandollie:textures/screens/intro_quest_done.png"), this.leftPos + 54, this.topPos + 8, 0, 0, 64, 64, 64, 64);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_intro_quest = new ImageButton(this.leftPos + 54, this.topPos + 8, 64, 64, 0, 0, 64, new ResourceLocation("iceandollie:textures/screens/atlas/imagebutton_intro_quest.png"), 64, 128, e -> {
			if (IntroquestdoneProcedure.execute(entity)) {
				IceandollieMod.PACKET_HANDLER.sendToServer(new QuestGuiButtonMessage(0, x, y, z));
				QuestGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (IntroquestdoneProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_intro_quest", imagebutton_intro_quest);
		this.addRenderableWidget(imagebutton_intro_quest);
	}
}
