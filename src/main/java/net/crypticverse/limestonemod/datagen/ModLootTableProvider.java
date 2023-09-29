package net.crypticverse.limestonemod.datagen;

import net.crypticverse.limestonemod.block.ModBlocks;
import net.crypticverse.limestonemod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.LIMESTONE_BLOCK);
        addDrop(ModBlocks.LIMESTONE_STAIRS);
        addDrop(ModBlocks.LIMESTONE_WALL);
        addDrop(ModBlocks.RAW_LIMESTONE_BLOCK);

        addDrop(ModBlocks.LIMESTONE_ORE, oreDrops(ModBlocks.LIMESTONE_ORE, ModItems.RAW_LIMESTONE));
        addDrop(ModBlocks.DEEPSLATE_LIMESTONE_ORE, oreDrops(ModBlocks.DEEPSLATE_LIMESTONE_ORE, ModItems.RAW_LIMESTONE));

        addDrop(ModBlocks.LIMESTONE_SLAB, slabDrops(ModBlocks.LIMESTONE_SLAB));
    }
}
