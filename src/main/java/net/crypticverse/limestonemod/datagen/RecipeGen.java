package net.crypticverse.limestonemod.datagen;

import net.crypticverse.limestonemod.block.LimestoneBlocks;
import net.crypticverse.limestonemod.item.LimestoneItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class RecipeGen extends FabricRecipeProvider {
    private static final List<ItemConvertible> LIMESTONE_SMELTABLES = List.of(LimestoneItems.RAW_LIMESTONE,
            LimestoneBlocks.LIMESTONE_ORE, LimestoneBlocks.DEEPSLATE_LIMESTONE_ORE);
    public RecipeGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, LIMESTONE_SMELTABLES, RecipeCategory.MISC, LimestoneItems.LIMESTONE_PIECE, 0.7f, 200, "limestone_piece");
        offerBlasting(exporter, LIMESTONE_SMELTABLES, RecipeCategory.MISC, LimestoneItems.LIMESTONE_PIECE, 0.7f, 200, "limestone_piece");

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LimestoneBlocks.LIMESTONE_PILLAR, LimestoneBlocks.LIMESTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LimestoneBlocks.LIMESTONE_SLAB, LimestoneBlocks.LIMESTONE_BLOCK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LimestoneBlocks.LIMESTONE_STAIRS, LimestoneBlocks.LIMESTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LimestoneBlocks.LIMESTONE_WALL, LimestoneBlocks.LIMESTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, LimestoneBlocks.POLISHED_LIMESTONE, LimestoneBlocks.LIMESTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, LimestoneBlocks.POLISHED_LIMESTONE_WALL, LimestoneBlocks.LIMESTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, LimestoneBlocks.POLISHED_LIMESTONE_SLAB, LimestoneBlocks.LIMESTONE_BLOCK ,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, LimestoneBlocks.POLISHED_LIMESTONE_STAIRS, LimestoneBlocks.LIMESTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, LimestoneBlocks.POLISHED_LIMESTONE_SLAB, LimestoneBlocks.POLISHED_LIMESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, LimestoneBlocks.POLISHED_LIMESTONE_STAIRS, LimestoneBlocks.POLISHED_LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, LimestoneBlocks.POLISHED_LIMESTONE_WALL, LimestoneBlocks.POLISHED_LIMESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, LimestoneBlocks.LIMESTONE_BRICKS, LimestoneBlocks.LIMESTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, LimestoneBlocks.LIMESTONE_BRICK_SLAB, LimestoneBlocks.LIMESTONE_BLOCK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, LimestoneBlocks.LIMESTONE_BRICK_STAIRS, LimestoneBlocks.LIMESTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, LimestoneBlocks.LIMESTONE_BRICK_WALL, LimestoneBlocks.LIMESTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, LimestoneBlocks.LIMESTONE_BRICK_SLAB, LimestoneBlocks.LIMESTONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, LimestoneBlocks.LIMESTONE_BRICK_STAIRS, LimestoneBlocks.LIMESTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, LimestoneBlocks.LIMESTONE_BRICK_WALL, LimestoneBlocks.LIMESTONE_BRICKS);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, LimestoneItems.LIMESTONE_PIECE, RecipeCategory.DECORATIONS, LimestoneBlocks.LIMESTONE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, LimestoneItems.RAW_LIMESTONE, RecipeCategory.BUILDING_BLOCKS, LimestoneBlocks.RAW_LIMESTONE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, LimestoneItems.LIMESTONE_PICKAXE, 1).pattern("LLL").pattern(" S ").pattern(" S ").input('L', LimestoneItems.LIMESTONE_PIECE).input('S', Items.STICK).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).criterion(hasItem(LimestoneItems.LIMESTONE_PIECE), conditionsFromItem(LimestoneItems.LIMESTONE_PIECE)).offerTo(exporter, new Identifier(getRecipeName(LimestoneItems.LIMESTONE_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, LimestoneItems.LIMESTONE_AXE, 1).pattern(" LL").pattern(" SL").pattern(" S ").input('L', LimestoneItems.LIMESTONE_PIECE).input('S', Items.STICK).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).criterion(hasItem(LimestoneItems.LIMESTONE_PIECE), conditionsFromItem(LimestoneItems.LIMESTONE_PIECE)).offerTo(exporter, new Identifier(getRecipeName(LimestoneItems.LIMESTONE_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, LimestoneItems.LIMESTONE_SHOVEL, 1).pattern(" L ").pattern(" S ").pattern(" S ").input('L', LimestoneItems.LIMESTONE_PIECE).input('S', Items.STICK).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).criterion(hasItem(LimestoneItems.LIMESTONE_PIECE), conditionsFromItem(LimestoneItems.LIMESTONE_PIECE)).offerTo(exporter, new Identifier(getRecipeName(LimestoneItems.LIMESTONE_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, LimestoneItems.LIMESTONE_SWORD, 1).pattern(" L ").pattern(" L ").pattern(" S ").input('L', LimestoneItems.LIMESTONE_PIECE).input('S', Items.STICK).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).criterion(hasItem(LimestoneItems.LIMESTONE_PIECE), conditionsFromItem(LimestoneItems.LIMESTONE_PIECE)).offerTo(exporter, new Identifier(getRecipeName(LimestoneItems.LIMESTONE_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, LimestoneItems.LIMESTONE_HOE, 1).pattern("LL ").pattern(" S ").pattern(" S ").input('L', LimestoneItems.LIMESTONE_PIECE).input('S', Items.STICK).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).criterion(hasItem(LimestoneItems.LIMESTONE_PIECE), conditionsFromItem(LimestoneItems.LIMESTONE_PIECE)).offerTo(exporter, new Identifier(getRecipeName(LimestoneItems.LIMESTONE_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, LimestoneBlocks.LIMESTONE_SLAB, 6).pattern("LLL").input('L', LimestoneBlocks.LIMESTONE_BLOCK).criterion(hasItem(LimestoneBlocks.LIMESTONE_BLOCK), conditionsFromItem(LimestoneBlocks.LIMESTONE_BLOCK)).offerTo(exporter, new Identifier(getRecipeName(LimestoneBlocks.LIMESTONE_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, LimestoneBlocks.LIMESTONE_BRICK_SLAB, 6).pattern("LLL").input('L', LimestoneBlocks.LIMESTONE_BRICKS).criterion(hasItem(LimestoneBlocks.LIMESTONE_BRICKS), conditionsFromItem(LimestoneBlocks.LIMESTONE_BRICKS)).offerTo(exporter, new Identifier(getRecipeName(LimestoneBlocks.LIMESTONE_BRICK_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, LimestoneBlocks.POLISHED_LIMESTONE_SLAB, 6).pattern("LLL").input('L', LimestoneBlocks.POLISHED_LIMESTONE).criterion(hasItem(LimestoneBlocks.POLISHED_LIMESTONE), conditionsFromItem(LimestoneBlocks.POLISHED_LIMESTONE)).offerTo(exporter, new Identifier(getRecipeName(LimestoneBlocks.POLISHED_LIMESTONE_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, LimestoneBlocks.LIMESTONE_STAIRS, 4).pattern("L  ").pattern("LL ").pattern("LLL").input('L', LimestoneBlocks.LIMESTONE_BLOCK).criterion(hasItem(LimestoneBlocks.LIMESTONE_BLOCK), conditionsFromItem(LimestoneBlocks.LIMESTONE_BLOCK)).offerTo(exporter, new Identifier(getRecipeName(LimestoneBlocks.LIMESTONE_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, LimestoneBlocks.POLISHED_LIMESTONE_STAIRS, 4).pattern("L  ").pattern("LL ").pattern("LLL").input('L', LimestoneBlocks.POLISHED_LIMESTONE).criterion(hasItem(LimestoneBlocks.POLISHED_LIMESTONE), conditionsFromItem(LimestoneBlocks.POLISHED_LIMESTONE)).offerTo(exporter, new Identifier(getRecipeName(LimestoneBlocks.POLISHED_LIMESTONE_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, LimestoneBlocks.LIMESTONE_BRICK_STAIRS, 4).pattern("L  ").pattern("LL ").pattern("LLL").input('L', LimestoneBlocks.LIMESTONE_BRICKS).criterion(hasItem(LimestoneBlocks.LIMESTONE_BRICKS), conditionsFromItem(LimestoneBlocks.LIMESTONE_BRICKS)).offerTo(exporter, new Identifier(getRecipeName(LimestoneBlocks.LIMESTONE_BRICK_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, LimestoneBlocks.LIMESTONE_WALL, 6).pattern("LLL").pattern("LLL").input('L', LimestoneBlocks.LIMESTONE_BLOCK).criterion(hasItem(LimestoneBlocks.LIMESTONE_BLOCK), conditionsFromItem(LimestoneBlocks.LIMESTONE_BLOCK)).offerTo(exporter, new Identifier(getRecipeName(LimestoneBlocks.LIMESTONE_WALL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, LimestoneBlocks.POLISHED_LIMESTONE_WALL, 6).pattern("LLL").pattern("LLL").input('L', LimestoneBlocks.POLISHED_LIMESTONE).criterion(hasItem(LimestoneBlocks.POLISHED_LIMESTONE), conditionsFromItem(LimestoneBlocks.POLISHED_LIMESTONE)).offerTo(exporter, new Identifier(getRecipeName(LimestoneBlocks.POLISHED_LIMESTONE_WALL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, LimestoneBlocks.LIMESTONE_BRICK_WALL, 6).pattern("LLL").pattern("LLL").input('L', LimestoneBlocks.LIMESTONE_BRICKS).criterion(hasItem(LimestoneBlocks.LIMESTONE_BRICKS), conditionsFromItem(LimestoneBlocks.LIMESTONE_BRICKS)).offerTo(exporter, new Identifier(getRecipeName(LimestoneBlocks.LIMESTONE_BRICK_WALL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, LimestoneBlocks.LIMESTONE_PILLAR, 2).pattern(" L ").pattern(" L ").input('L', LimestoneBlocks.LIMESTONE_BLOCK).criterion(hasItem(LimestoneBlocks.LIMESTONE_BLOCK), conditionsFromItem(LimestoneBlocks.LIMESTONE_BLOCK)).offerTo(exporter, new Identifier(getRecipeName(LimestoneBlocks.LIMESTONE_PILLAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, LimestoneBlocks.POLISHED_LIMESTONE ,9).pattern("LLL").pattern("LLL").pattern("LLL").input('L', LimestoneBlocks.LIMESTONE_BLOCK).criterion(hasItem(LimestoneBlocks.LIMESTONE_BLOCK), conditionsFromItem(LimestoneBlocks.LIMESTONE_BLOCK)).offerTo(exporter, new Identifier(getRecipeName(LimestoneBlocks.POLISHED_LIMESTONE)));
    }


}
