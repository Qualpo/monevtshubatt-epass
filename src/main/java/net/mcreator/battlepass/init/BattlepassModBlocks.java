
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.battlepass.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.battlepass.block.PoopDimentionPortalBlock;
import net.mcreator.battlepass.block.PoopBlockBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BattlepassModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block POOP_BLOCK = register(new PoopBlockBlock());
	public static final Block POOP_DIMENTION_PORTAL = register(new PoopDimentionPortalBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
