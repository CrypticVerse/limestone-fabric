package net.crypticverse.limestonemod;

import net.crypticverse.limestonemod.block.LimestoneBlocks;
import net.crypticverse.limestonemod.item.LimestoneItemGroup;
import net.crypticverse.limestonemod.item.LimestoneItems;
import net.crypticverse.limestonemod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LimestoneMod implements ModInitializer {
	public static final String MOD_ID = "limestonemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LimestoneItems.registerModItems();
		LimestoneItemGroup.registerItemGroups();
		LimestoneBlocks.registerModBlocks();
		ModWorldGeneration.generatedModWorldGen();
	}
}