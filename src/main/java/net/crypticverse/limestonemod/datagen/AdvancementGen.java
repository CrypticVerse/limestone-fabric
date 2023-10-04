package net.crypticverse.limestonemod.datagen;

import net.crypticverse.limestonemod.item.LimestoneItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.AdvancementRewards;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.crypticverse.limestonemod.block.LimestoneBlocks;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class AdvancementGen extends FabricAdvancementProvider {

    public AdvancementGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<AdvancementEntry> consumer) {
        AdvancementEntry rootAdvancement = Advancement.Builder.create()
                .display(LimestoneBlocks.LIMESTONE_PILLAR, Text.literal("Limestone Mod"), Text.literal("This shouldn't exist..."), new Identifier("textures/gui/advancements/backgrounds/limestone_block.png"), AdvancementFrame.TASK, false, false, false).criterion("got_limestone_piece", InventoryChangedCriterion.Conditions.items(LimestoneItems.LIMESTONE_PIECE)).build(consumer, "limestonemod"+ "/root");
        AdvancementEntry gotRawLimestoneAdvancement = Advancement.Builder.create().parent(rootAdvancement)
                .display(LimestoneItems.RAW_LIMESTONE, Text.literal("Hmm... Limey"), Text.literal("Get a piece of Raw Limestone"), null, AdvancementFrame.TASK, true, true, false).rewards(AdvancementRewards.Builder.experience(1000)).criterion("got_raw_limestone", InventoryChangedCriterion.Conditions.items(LimestoneItems.RAW_LIMESTONE)).build(consumer, "limestonemod"+ "/got_raw_limestone");
        AdvancementEntry gotLimestoneBlockAdvancement = Advancement.Builder.create().parent(gotRawLimestoneAdvancement)
                .display(LimestoneBlocks.LIMESTONE_BLOCK, Text.literal("Nice Decor"), Text.literal("Craft a Limestone Block"), null, AdvancementFrame.TASK, true, true, false).rewards(AdvancementRewards.Builder.experience(1000)).criterion("got_limestone_block", InventoryChangedCriterion.Conditions.items(LimestoneBlocks.LIMESTONE_BLOCK)).build(consumer, "limestonemod"+ "/got_limestone_block");
        AdvancementEntry gotLimestonePickaxeAdvancement = Advancement.Builder.create().parent(gotRawLimestoneAdvancement)
                .display(LimestoneBlocks.LIMESTONE_BLOCK, Text.literal("Time to Lime"), Text.literal("Craft a Limestone Pickaxe"), null, AdvancementFrame.TASK, true, true, false).rewards(AdvancementRewards.Builder.experience(1000)).criterion("got_limestone_pickaxe", InventoryChangedCriterion.Conditions.items(LimestoneItems.LIMESTONE_PICKAXE)).build(consumer, "limestonemod"+ "/got_limestone_pickaxe");
    }
}
