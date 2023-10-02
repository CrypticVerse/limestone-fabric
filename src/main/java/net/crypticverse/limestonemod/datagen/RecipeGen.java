package net.crypticverse.limestonemod.datagen;

import net.crypticverse.limestonemod.block.ModBlocks;
import net.crypticverse.limestonemod.item.ModItems;
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
    private static final List<ItemConvertible> LIMESTONE_SMELTABLES = List.of(ModItems.RAW_LIMESTONE,
            ModBlocks.LIMESTONE_ORE, ModBlocks.DEEPSLATE_LIMESTONE_ORE);
    public RecipeGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, LIMESTONE_SMELTABLES, RecipeCategory.MISC, ModItems.LIMESTONE_PIECE,
                0.7f, 200, "limestone_piece");
        offerBlasting(exporter, LIMESTONE_SMELTABLES, RecipeCategory.MISC, ModItems.LIMESTONE_PIECE,
                0.7f, 200, "limestone_piece");
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_PILLAR, ModBlocks.LIMESTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_SLAB, ModBlocks.LIMESTONE_BLOCK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_STAIRS, ModBlocks.LIMESTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_WALL, ModBlocks.LIMESTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_LIMESTONE, ModBlocks.LIMESTONE_BLOCK );

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.LIMESTONE_PIECE, RecipeCategory.DECORATIONS,
                ModBlocks.LIMESTONE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_LIMESTONE, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.RAW_LIMESTONE_BLOCK);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LIMESTONE_PICKAXE, 1)
                .pattern("LLL")
                .pattern(" S ")
                .pattern(" S ")
                .input('L', ModItems.LIMESTONE_PIECE)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.LIMESTONE_PIECE), conditionsFromItem(ModItems.LIMESTONE_PIECE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIMESTONE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LIMESTONE_AXE, 1)
                .pattern(" LL")
                .pattern(" SL")
                .pattern(" S ")
                .input('L', ModItems.LIMESTONE_PIECE)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.LIMESTONE_PIECE), conditionsFromItem(ModItems.LIMESTONE_PIECE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIMESTONE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LIMESTONE_SHOVEL, 1)
                .pattern(" L ")
                .pattern(" S ")
                .pattern(" S ")
                .input('L', ModItems.LIMESTONE_PIECE)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.LIMESTONE_PIECE), conditionsFromItem(ModItems.LIMESTONE_PIECE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIMESTONE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LIMESTONE_SWORD, 1)
                .pattern(" L ")
                .pattern(" L ")
                .pattern(" S ")
                .input('L', ModItems.LIMESTONE_PIECE)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.LIMESTONE_PIECE), conditionsFromItem(ModItems.LIMESTONE_PIECE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIMESTONE_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LIMESTONE_HOE, 1)
                .pattern("LL ")
                .pattern(" S ")
                .pattern(" S ")
                .input('L', ModItems.LIMESTONE_PIECE)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.LIMESTONE_PIECE), conditionsFromItem(ModItems.LIMESTONE_PIECE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIMESTONE_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.LIMESTONE_SLAB, 6)
                .pattern("LLL")
                .input('L', ModBlocks.LIMESTONE_BLOCK)
                .criterion(hasItem(ModBlocks.LIMESTONE_BLOCK), conditionsFromItem(ModBlocks.LIMESTONE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIMESTONE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.LIMESTONE_STAIRS, 4)
                .pattern("L  ")
                .pattern("LL ")
                .pattern("LLL")
                .input('L', ModBlocks.LIMESTONE_BLOCK)
                .criterion(hasItem(ModBlocks.LIMESTONE_BLOCK), conditionsFromItem(ModBlocks.LIMESTONE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIMESTONE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.LIMESTONE_WALL, 6)
                .pattern("LLL")
                .pattern("LLL")
                .input('L', ModBlocks.LIMESTONE_BLOCK)
                .criterion(hasItem(ModBlocks.LIMESTONE_BLOCK), conditionsFromItem(ModBlocks.LIMESTONE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIMESTONE_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.LIMESTONE_PILLAR, 2)
                .pattern(" L ")
                .pattern(" L ")
                .input('L', ModBlocks.LIMESTONE_BLOCK)
                .criterion(hasItem(ModBlocks.LIMESTONE_BLOCK), conditionsFromItem(ModBlocks.LIMESTONE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIMESTONE_PILLAR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_LIMESTONE ,4)
                .pattern("LL ")
                .pattern("LL ")
                .input('L', ModBlocks.LIMESTONE_BLOCK)
                .criterion(hasItem(ModBlocks.LIMESTONE_BLOCK), conditionsFromItem(ModBlocks.LIMESTONE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.POLISHED_LIMESTONE)));
    }


}
