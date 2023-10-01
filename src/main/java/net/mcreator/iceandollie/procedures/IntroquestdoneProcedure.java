package net.mcreator.iceandollie.procedures;

import net.minecraft.world.entity.Entity;

public class IntroquestdoneProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("introquest") == true) {
			return false;
		}
		return true;
	}
}
