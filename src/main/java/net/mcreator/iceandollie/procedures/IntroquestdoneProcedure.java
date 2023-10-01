package net.mcreator.iceandollie.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
