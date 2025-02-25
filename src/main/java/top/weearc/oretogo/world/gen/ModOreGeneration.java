package top.weearc.oretogo.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import top.weearc.oretogo.world.ModPlacedFeatures;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SILVER_ORE_DEEPSLATE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SILVER_ORE_OVERWORLD_PLACED_KEY);
//        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
//                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.RAW_SILVER_OVERWORLD_PLACED_KEY);
//        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
//                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.RAW_SILVER_DEEPSLATE_PLACED_KEY);
    }
}
