
package net.mcreator.iceandollie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.iceandollie.entity.BalloonEntity;
import net.mcreator.iceandollie.client.model.Modelballoon;

public class BalloonRenderer extends MobRenderer<BalloonEntity, Modelballoon<BalloonEntity>> {
	public BalloonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelballoon(context.bakeLayer(Modelballoon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BalloonEntity entity) {
		return new ResourceLocation("iceandollie:textures/entities/balloon.png");
	}
}
