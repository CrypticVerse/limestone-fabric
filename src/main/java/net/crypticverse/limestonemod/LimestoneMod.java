package net.crypticverse.limestonemod;

import net.crypticverse.limestonemod.block.ModBlocks;
import net.crypticverse.limestonemod.datagen.ModWorldGenerator;
import net.crypticverse.limestonemod.item.ModItemGroups;
import net.crypticverse.limestonemod.item.ModItems;
import net.crypticverse.limestonemod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LimestoneMod implements ModInitializer {
	public static final String MOD_ID = "limestonemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generatedModWorldGen();
	}
}