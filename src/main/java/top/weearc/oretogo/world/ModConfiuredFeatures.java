package top.weearc.oretogo.world;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import top.weearc.oretogo.OreToGo;
import top.weearc.oretogo.block.ModBlocks;

import java.util.List;


public class ModConfiuredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> SILVER_ORE_KEY = of("silver_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_SILVER_ORE_KEY = of("deepslate_silver_ore");
//    public static final RegistryKey<ConfiguredFeature<?, ?>> RAW_SILVER_BLOCK_KEY = of("raw_silver_block");
//    public static final RegistryKey<ConfiguredFeature<? ,?>> DEEPSLATE_RAW_SILVER_BLOCK_KEY = of("deepslate_raw_silver_block");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {

        RuleTest oreOverworldReplacement = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest oreDeepslateReplacement = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        RuleTest oreNetherReplacement =  new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest oreEndReplacement = new BlockMatchRuleTest(Blocks.END_STONE);


        List<OreFeatureConfig.Target> overWorldTargets = List.of(
//                OreFeatureConfig.createTarget(oreOverworldReplacement, ModBlocks.RAW_SILVER_BLOCK.getDefaultState()),
                OreFeatureConfig.createTarget(oreOverworldReplacement, ModBlocks.SILVER_ORE.getDefaultState())
        );

        List<OreFeatureConfig.Target> deepslateTargets = List.of(
                OreFeatureConfig.createTarget(oreDeepslateReplacement, ModBlocks.RAW_SILVER_BLOCK.getDefaultState()),
                OreFeatureConfig.createTarget(oreDeepslateReplacement, ModBlocks.DEEPSLATE_SILVER_ORE.getDefaultState())
        );

        List<OreFeatureConfig.Target> endTargets = List.of();

        List<OreFeatureConfig.Target> netherTargets = List.of();

        register(featureRegisterable, SILVER_ORE_KEY, Feature.ORE, new OreFeatureConfig(overWorldTargets,9));
        register(featureRegisterable, DEEPSLATE_SILVER_ORE_KEY, Feature.ORE, new OreFeatureConfig(deepslateTargets,11, 0.6f));
//        register(featureRegisterable, RAW_SILVER_BLOCK_KEY, Feature.ORE, new OreFeatureConfig(overWorldTargets,3, 0.2f));
//        register(featureRegisterable, DEEPSLATE_RAW_SILVER_BLOCK_KEY, Feature.ORE, new OreFeatureConfig(deepslateTargets,2, 0.7f));


    }

    public static RegistryKey<ConfiguredFeature<?,?>> of(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(OreToGo.MOD_ID, id));
    }


    public static <FC extends FeatureConfig, F extends Feature<FC>> void register(
            Registerable<ConfiguredFeature<?, ?>> registerable, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC config
    ) {
        registerable.register(key, new ConfiguredFeature<FC, F>(feature, config));
    }
}
