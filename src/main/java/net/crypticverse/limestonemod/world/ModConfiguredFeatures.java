package net.crypticverse.limestonemod.world;

import net.crypticverse.limestonemod.LimestoneMod;
import net.crypticverse.limestonemod.block.LimestoneBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> LIMESTONE_ORE_KEY = registerKey("limestone");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateStoneReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldLimestoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, LimestoneBlocks.LIMESTONE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateStoneReplaceables, LimestoneBlocks.DEEPSLATE_LIMESTONE_ORE.getDefaultState()));

        register(context, LIMESTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldLimestoneOres, 10));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(LimestoneMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}