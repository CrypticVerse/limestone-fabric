package net.crypticverse.limestonemod.datagen;

import net.crypticverse.limestonemod.block.LimestoneBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagGen extends FabricTagProvider.BlockTagProvider {
    public BlockTagGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(LimestoneBlocks.LIMESTONE_BLOCK)
                .add(LimestoneBlocks.DEEPSLATE_LIMESTONE_ORE)
                .add(LimestoneBlocks.LIMESTONE_ORE)
                .add(LimestoneBlocks.RAW_LIMESTONE_BLOCK)
                .add(LimestoneBlocks.POLISHED_LIMESTONE)
                .add(LimestoneBlocks.POLISHED_LIMESTONE_SLAB)
                .add(LimestoneBlocks.POLISHED_LIMESTONE_STAIRS)
                .add(LimestoneBlocks.POLISHED_LIMESTONE_WALL)
                .add(LimestoneBlocks.LIMESTONE_STAIRS)
                .add(LimestoneBlocks.LIMESTONE_SLAB)
                .add(LimestoneBlocks.LIMESTONE_PILLAR)
                .add(LimestoneBlocks.LIMESTONE_BRICKS)
                .add(LimestoneBlocks.LIMESTONE_BRICK_STAIRS)
                .add(LimestoneBlocks.LIMESTONE_BRICK_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(LimestoneBlocks.LIMESTONE_BLOCK)
                .add(LimestoneBlocks.DEEPSLATE_LIMESTONE_ORE)
                .add(LimestoneBlocks.LIMESTONE_ORE)
                .add(LimestoneBlocks.RAW_LIMESTONE_BLOCK)
                .add(LimestoneBlocks.POLISHED_LIMESTONE)
                .add(LimestoneBlocks.POLISHED_LIMESTONE_SLAB)
                .add(LimestoneBlocks.POLISHED_LIMESTONE_STAIRS)
                .add(LimestoneBlocks.POLISHED_LIMESTONE_WALL)
                .add(LimestoneBlocks.LIMESTONE_STAIRS)
                .add(LimestoneBlocks.LIMESTONE_SLAB)
                .add(LimestoneBlocks.LIMESTONE_BRICKS)
                .add(LimestoneBlocks.LIMESTONE_BRICK_SLAB)
                .add(LimestoneBlocks.LIMESTONE_BRICK_STAIRS)
                .add(LimestoneBlocks.LIMESTONE_PILLAR);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(LimestoneBlocks.LIMESTONE_WALL)
                .add(LimestoneBlocks.LIMESTONE_BRICK_WALL)
                .add(LimestoneBlocks.POLISHED_LIMESTONE_WALL);
    }
}