package net.crypticverse.limestonemod.item;

import net.crypticverse.limestonemod.LimestoneMod;
import net.crypticverse.limestonemod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup LIMESTONE_ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LimestoneMod.MOD_ID, "limestone"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.limestone"))
                    .icon(() -> new ItemStack(ModItems.RAW_LIMESTONE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.LIMESTONE_PIECE);
                        entries.add(ModItems.RAW_LIMESTONE);
                        entries.add(ModBlocks.LIMESTONE_BLOCK);
                        entries.add(ModBlocks.LIMESTONE_ORE);
                        entries.add(ModBlocks.LIMESTONE_SLAB);
                        entries.add(ModBlocks.LIMESTONE_STAIRS);
                        entries.add(ModBlocks.DEEPSLATE_LIMESTONE_ORE);
                        entries.add(ModItems.LIMESTONE_PICKAXE);
                        entries.add(ModItems.LIMESTONE_HOE);
                        entries.add(ModItems.LIMESTONE_SWORD);
                        entries.add(ModItems.LIMESTONE_SHOVEL);
                        entries.add(ModItems.LIMESTONE_AXE);
                        entries.add(ModBlocks.LIMESTONE_WALL);
                        entries.add(ModBlocks.RAW_LIMESTONE_BLOCK);
                        entries.add(ModBlocks.LIMESTONE_PILLAR);
                        entries.add(ModBlocks.POLISHED_LIMESTONE);
                    }).build());
    public static void registerItemGroups() {
        LimestoneMod.LOGGER.info("Registering Groups for " + LimestoneMod.MOD_ID);
    }
}
