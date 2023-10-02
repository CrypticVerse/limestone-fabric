package net.crypticverse.limestonemod.datagen.recipe;

import net.crypticverse.limestonemod.block.ModBlocks;
import net.crypticverse.limestonemod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.recipe.book.RecipeCategory;

public class StoneCuttingRecipes extends FabricRecipeProvider {
    public StoneCuttingRecipes(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_PILLAR, ModBlocks.LIMESTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_SLAB, ModBlocks.LIMESTONE_BLOCK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_PILLAR, ModBlocks.LIMESTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_STAIRS, ModBlocks.LIMESTONE_BLOCK);
    }
}
