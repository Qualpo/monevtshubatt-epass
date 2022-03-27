package net.mcreator.battlepass.procedures;

import net.minecraft.world.entity.Entity;

public class HornyEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("hornydam", 0);
	}
}
