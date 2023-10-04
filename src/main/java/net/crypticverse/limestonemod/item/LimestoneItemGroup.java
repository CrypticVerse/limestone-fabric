package net.crypticverse.limestonemod.item;

import net.crypticverse.limestonemod.LimestoneMod;
import net.crypticverse.limestonemod.block.LimestoneBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class LimestoneItemGroup {
    public static final ItemGroup LIMESTONE_ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LimestoneMod.MOD_ID, "limestone"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.limestone"))
                    .icon(() -> new ItemStack(LimestoneItems.RAW_LIMESTONE)).entries((displayContext, entries) -> {
                        entries.add(LimestoneItems.LIMESTONE_PIECE);
                        entries.add(LimestoneItems.RAW_LIMESTONE);
                        entries.add(LimestoneBlocks.LIMESTONE_BLOCK);
                        entries.add(LimestoneBlocks.LIMESTONE_ORE);
                        entries.add(LimestoneBlocks.LIMESTONE_SLAB);
                        entries.add(LimestoneBlocks.LIMESTONE_STAIRS);
                        entries.add(LimestoneBlocks.DEEPSLATE_LIMESTONE_ORE);
                        entries.add(LimestoneItems.LIMESTONE_PICKAXE);
                        entries.add(LimestoneItems.LIMESTONE_HOE);
                        entries.add(LimestoneItems.LIMESTONE_SWORD);
                        entries.add(LimestoneItems.LIMESTONE_SHOVEL);
                        entries.add(LimestoneItems.LIMESTONE_AXE);
                        entries.add(LimestoneBlocks.LIMESTONE_WALL);
                        entries.add(LimestoneBlocks.RAW_LIMESTONE_BLOCK);
                        entries.add(LimestoneBlocks.LIMESTONE_PILLAR);
                        entries.add(LimestoneBlocks.POLISHED_LIMESTONE);
                        entries.add(LimestoneBlocks.POLISHED_LIMESTONE_WALL);
                        entries.add(LimestoneBlocks.POLISHED_LIMESTONE_STAIRS);
                        entries.add(LimestoneBlocks.POLISHED_LIMESTONE_SLAB);
                        entries.add(LimestoneBlocks.LIMESTONE_BRICKS);
                        entries.add(LimestoneBlocks.LIMESTONE_BRICK_WALL);
                        entries.add(LimestoneBlocks.LIMESTONE_BRICK_STAIRS);
                        entries.add(LimestoneBlocks.LIMESTONE_BRICK_SLAB);
                    }).build());
    public static void registerItemGroups() {
        LimestoneMod.LOGGER.info("Registering Groups for " + LimestoneMod.MOD_ID);
    }
}
