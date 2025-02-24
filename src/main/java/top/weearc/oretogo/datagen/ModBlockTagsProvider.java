package top.weearc.oretogo.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import top.weearc.oretogo.tag.ModBlockTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import top.weearc.oretogo.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.DEEPSLATE_SILVER_ORE)
                .add(ModBlocks.SILVER_ORE)
                .add(ModBlocks.SILVER_BLOCK)
                .add(ModBlocks.RAW_SILVER_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.DEEPSLATE_SILVER_ORE)
                .add(ModBlocks.SILVER_ORE)
                .add(ModBlocks.SILVER_BLOCK)
                .add(ModBlocks.RAW_SILVER_BLOCK);

        getOrCreateTagBuilder(ModBlockTags.STORAGE_BLOCK).add(ModBlocks.SILVER_BLOCK);
        getOrCreateTagBuilder(ModBlockTags.ORE).add(ModBlocks.SILVER_ORE).add(ModBlocks.DEEPSLATE_SILVER_ORE);
        getOrCreateTagBuilder(ModBlockTags.RAW_BLOCK).add(ModBlocks.RAW_SILVER_BLOCK);
        getOrCreateTagBuilder(ModBlockTags.RAW_SILVER_BLOCK).add(ModBlocks.RAW_SILVER_BLOCK);
        getOrCreateTagBuilder(ModBlockTags.SILVER_ORE).add(ModBlocks.DEEPSLATE_SILVER_ORE).add(ModBlocks.SILVER_ORE).add(ModBlocks.SILVER_ORE);

        getOrCreateTagBuilder(ModBlockTags.FORGE_ORE).add(ModBlocks.SILVER_ORE).add(ModBlocks.DEEPSLATE_SILVER_ORE);
        getOrCreateTagBuilder(ModBlockTags.FORGE_STORAGE_BLOCK_SILVER).add(ModBlocks.SILVER_BLOCK);
        getOrCreateTagBuilder(ModBlockTags.FORGE_ORES_IN_GROUND_DEEPSLATE_SILVER).add(ModBlocks.DEEPSLATE_SILVER_ORE);
        getOrCreateTagBuilder(ModBlockTags.FORGE_ORES_IN_GROUND_STONE_SILVER).add(ModBlocks.SILVER_ORE);
        getOrCreateTagBuilder(ModBlockTags.FORGE_SILVER_BLOCKS).add(ModBlocks.SILVER_BLOCK);


    }
}
