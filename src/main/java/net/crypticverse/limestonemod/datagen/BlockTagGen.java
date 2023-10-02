package net.crypticverse.limestonemod.datagen;

import net.crypticverse.limestonemod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
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
                .add(ModBlocks.LIMESTONE_BLOCK)
                .add(ModBlocks.DEEPSLATE_LIMESTONE_ORE)
                .add(ModBlocks.LIMESTONE_ORE)
                .add(ModBlocks.RAW_LIMESTONE_BLOCK)
                .add(ModBlocks.POLISHED_LIMESTONE)
                .add(ModBlocks.LIMESTONE_STAIRS)
                .add(ModBlocks.LIMESTONE_SLAB)
                .add(ModBlocks.LIMESTONE_PILLAR);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LIMESTONE_BLOCK)
                .add(ModBlocks.DEEPSLATE_LIMESTONE_ORE)
                .add(ModBlocks.LIMESTONE_ORE)
                .add(ModBlocks.RAW_LIMESTONE_BLOCK)
                .add(ModBlocks.POLISHED_LIMESTONE)
                .add(ModBlocks.LIMESTONE_STAIRS)
                .add(ModBlocks.LIMESTONE_SLAB)
                .add(ModBlocks.LIMESTONE_PILLAR);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.LIMESTONE_WALL);
    }
}