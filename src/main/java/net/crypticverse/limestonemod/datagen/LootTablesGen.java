package net.crypticverse.limestonemod.datagen;

import net.crypticverse.limestonemod.block.LimestoneBlocks;
import net.crypticverse.limestonemod.item.LimestoneItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class LootTablesGen extends FabricBlockLootTableProvider {
    public LootTablesGen(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(LimestoneBlocks.LIMESTONE_BLOCK);
        addDrop(LimestoneBlocks.LIMESTONE_STAIRS);
        addDrop(LimestoneBlocks.LIMESTONE_WALL);
        addDrop(LimestoneBlocks.RAW_LIMESTONE_BLOCK);
        addDrop(LimestoneBlocks.LIMESTONE_PILLAR);
        addDrop(LimestoneBlocks.POLISHED_LIMESTONE);
        addDrop(LimestoneBlocks.POLISHED_LIMESTONE_STAIRS);
        addDrop(LimestoneBlocks.POLISHED_LIMESTONE_WALL);
        addDrop(LimestoneBlocks.LIMESTONE_BRICKS);
        addDrop(LimestoneBlocks.LIMESTONE_BRICK_WALL);
        addDrop(LimestoneBlocks.LIMESTONE_BRICK_STAIRS);

        addDrop(LimestoneBlocks.LIMESTONE_ORE, oreDrops(LimestoneBlocks.LIMESTONE_ORE, LimestoneItems.RAW_LIMESTONE));
        addDrop(LimestoneBlocks.DEEPSLATE_LIMESTONE_ORE, oreDrops(LimestoneBlocks.DEEPSLATE_LIMESTONE_ORE, LimestoneItems.RAW_LIMESTONE));

        addDrop(LimestoneBlocks.LIMESTONE_SLAB, slabDrops(LimestoneBlocks.LIMESTONE_SLAB));
        addDrop(LimestoneBlocks.LIMESTONE_BRICK_SLAB, slabDrops(LimestoneBlocks.LIMESTONE_BRICK_SLAB));
        addDrop(LimestoneBlocks.POLISHED_LIMESTONE_SLAB, slabDrops(LimestoneBlocks.POLISHED_LIMESTONE_SLAB));
    }
}