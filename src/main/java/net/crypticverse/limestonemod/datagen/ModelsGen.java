package net.crypticverse.limestonemod.datagen;

import net.crypticverse.limestonemod.block.ModBlocks;
import net.crypticverse.limestonemod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModelsGen extends FabricModelProvider {
    public ModelsGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool limestonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIMESTONE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_LIMESTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIMESTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_LIMESTONE_BLOCK);

        limestonePool.stairs(ModBlocks.LIMESTONE_STAIRS);
        limestonePool.slab(ModBlocks.LIMESTONE_SLAB);
        limestonePool.wall(ModBlocks.LIMESTONE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_LIMESTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIMESTONE_PIECE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIMESTONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LIMESTONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LIMESTONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LIMESTONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LIMESTONE_HOE, Models.HANDHELD);
    }
}