package top.weearc.oretogo.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightmapPlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import top.weearc.oretogo.OreToGo;

import java.util.List;


public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> SILVER_ORE_OVERWORLD_PLACED_KEY = of("silver_ore_overworld_placed");

    public static final RegistryKey<PlacedFeature> SILVER_ORE_DEEPSLATE_PLACED_KEY = of("silver_ore_deepslate_placed");

//    public static final RegistryKey<PlacedFeature> RAW_SILVER_DEEPSLATE_PLACED_KEY = of("raw_silver_deepslate_placed");

//    public static final RegistryKey<PlacedFeature> RAW_SILVER_OVERWORLD_PLACED_KEY = of("raw_silver_overworld_placed");

    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(featureRegisterable, SILVER_ORE_OVERWORLD_PLACED_KEY, registryEntryLookup.getOrThrow(ModConfiuredFeatures.SILVER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-50), YOffset.fixed(50))));
//        register(featureRegisterable, RAW_SILVER_OVERWORLD_PLACED_KEY, registryEntryLookup.getOrThrow(ModConfiuredFeatures.RAW_SILVER_BLOCK_KEY),
//                ModOrePlacement.modifiersWithCount(2,
//                        HeightRangePlacementModifier.uniform(YOffset.fixed(-20), YOffset.fixed(20))));

        register(featureRegisterable, SILVER_ORE_DEEPSLATE_PLACED_KEY, registryEntryLookup.getOrThrow(ModConfiuredFeatures.DEEPSLATE_SILVER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

//        register(featureRegisterable, RAW_SILVER_DEEPSLATE_PLACED_KEY, registryEntryLookup.getOrThrow(ModConfiuredFeatures.DEEPSLATE_RAW_SILVER_BLOCK_KEY),
//                ModOrePlacement.modifiersWithCount(10,
//                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(10))));
    }

    public static RegistryKey<PlacedFeature> of(String id) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(OreToGo.MOD_ID, id));
    }

    public static void register(
            Registerable<PlacedFeature> featureRegisterable,
            RegistryKey<PlacedFeature> key,
            RegistryEntry<ConfiguredFeature<?, ?>> feature,
            List<PlacementModifier> modifiers
    ) {
        featureRegisterable.register(key, new PlacedFeature(feature, List.copyOf(modifiers)));
    }

    public static void register(
            Registerable<PlacedFeature> featureRegisterable,
            RegistryKey<PlacedFeature> key,
            RegistryEntry<ConfiguredFeature<?, ?>> feature,
            PlacementModifier... modifiers
    ) {
        register(featureRegisterable, key, feature, List.of(modifiers));
    }
}
