package top.weearc.oretogo.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import top.weearc.oretogo.block.ModBlocks;
import top.weearc.oretogo.item.ModItems;
import top.weearc.oretogo.tag.ModItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModItemTags.SILVER_INGOT).add(ModItems.SILVER_INGOT);
        getOrCreateTagBuilder(ModItemTags.SILVER_NUGGET).add(ModItems.SILVER_NUGGET);
        getOrCreateTagBuilder(ModItemTags.RAW_ORES).add(ModItems.RAW_SILVER);
        getOrCreateTagBuilder(ModItemTags.RAW_MATERIALS).add(ModItems.RAW_SILVER);
        getOrCreateTagBuilder(ModItemTags.RAW_SILVER).add(ModItems.RAW_SILVER);

        getOrCreateTagBuilder(ModItemTags.FORGE_RAW_ORES).add(ModItems.RAW_SILVER);
        getOrCreateTagBuilder(ModItemTags.AE2_METAL_INGOT).add(ModItems.SILVER_INGOT);
        getOrCreateTagBuilder(ModItemTags.INGOT).add(ModItems.SILVER_INGOT);
        getOrCreateTagBuilder(ModItemTags.VANILLA_BEACON_PAYMENT).add(ModItems.SILVER_INGOT);
        getOrCreateTagBuilder(ModItemTags.RAW_ORES_SILVER).add(ModItems.RAW_SILVER);

        getOrCreateTagBuilder(ModItemTags.FORGE_INGOTS_SILVER).add(ModItems.SILVER_INGOT);
        getOrCreateTagBuilder(ModItemTags.FORGE_NUGGETS_SILVER).add(ModItems.SILVER_NUGGET);
//        getOrCreateTagBuilder(ModItemTags.FORGE_ORES_SILVER).add(ModBlocks.DEEPSLATE_SILVER_ORE.getLootTableId()).add(ModBlocks.SILVER_ORE.getLootTableId());
        getOrCreateTagBuilder(ModItemTags.FORGE_RAW_MATERIAL_SILVER).add(ModItems.RAW_SILVER);
//        getOrCreateTagBuilder(ModItemTags.FORGE_ORES).add(ModBlocks.DEEPSLATE_SILVER_ORE.getLootTableId()).add(ModBlocks.SILVER_ORE.getLootTableId());
        getOrCreateTagBuilder(ModItemTags.FORGE_RAW_MATERIAL).add(ModItems.RAW_SILVER);
        getOrCreateTagBuilder(ModItemTags.FORGE_RAW_ORES_SILVER).add(ModItems.RAW_SILVER);
        getOrCreateTagBuilder(ModItemTags.FORGE_SILVER_INGOTS).add(ModItems.SILVER_INGOT);
        getOrCreateTagBuilder(ModItemTags.FORGE_SILVER_NUGGETS).add(ModItems.SILVER_NUGGET);
//        getOrCreateTagBuilder(ModItemTags.FORGE_SILVER_ORES).add(ModBlocks.DEEPSLATE_SILVER_ORE.getLootTableId()).add(ModBlocks.SILVER_ORE.getLootTableId());
    }
}
