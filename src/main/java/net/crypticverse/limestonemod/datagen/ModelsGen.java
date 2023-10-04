package net.crypticverse.limestonemod.datagen;

import net.crypticverse.limestonemod.block.LimestoneBlocks;
import net.crypticverse.limestonemod.item.LimestoneItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;

public class ModelsGen extends FabricModelProvider {
    public ModelsGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool limestonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(LimestoneBlocks.LIMESTONE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool limestoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(LimestoneBlocks.LIMESTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool polsihedLimestonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(LimestoneBlocks.POLISHED_LIMESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(LimestoneBlocks.DEEPSLATE_LIMESTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(LimestoneBlocks.LIMESTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(LimestoneBlocks.RAW_LIMESTONE_BLOCK);
        blockStateModelGenerator.registerAxisRotated(LimestoneBlocks.LIMESTONE_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);

        limestonePool.stairs(LimestoneBlocks.LIMESTONE_STAIRS);
        limestonePool.slab(LimestoneBlocks.LIMESTONE_SLAB);
        limestonePool.wall(LimestoneBlocks.LIMESTONE_WALL);
        limestoneBrickPool.stairs(LimestoneBlocks.LIMESTONE_BRICK_STAIRS);
        polsihedLimestonePool.stairs(LimestoneBlocks.POLISHED_LIMESTONE_STAIRS);
        polsihedLimestonePool.slab(LimestoneBlocks.POLISHED_LIMESTONE_SLAB);
        limestoneBrickPool.slab(LimestoneBlocks.LIMESTONE_BRICK_SLAB);
        limestoneBrickPool.wall(LimestoneBlocks.LIMESTONE_BRICK_WALL);
        polsihedLimestonePool.wall(LimestoneBlocks.POLISHED_LIMESTONE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(LimestoneItems.RAW_LIMESTONE, Models.GENERATED);
        itemModelGenerator.register(LimestoneItems.LIMESTONE_PIECE, Models.GENERATED);
        itemModelGenerator.register(LimestoneItems.LIMESTONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(LimestoneItems.LIMESTONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(LimestoneItems.LIMESTONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(LimestoneItems.LIMESTONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(LimestoneItems.LIMESTONE_HOE, Models.HANDHELD);
    }
}