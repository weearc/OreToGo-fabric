package top.weearc.oretogo.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import top.weearc.oretogo.block.ModBlocks;
import top.weearc.oretogo.item.ModItemGroups;
import top.weearc.oretogo.item.ModItems;

public class ModEnUsLangProvider extends FabricLanguageProvider {

    public ModEnUsLangProvider(FabricDataOutput output) {
        super(output, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.RAW_SILVER, "Raw Silver");
        translationBuilder.add(ModItems.SILVER_INGOT, "Silver Ingot");
        translationBuilder.add(ModItems.SILVER_NUGGET, "Silver Nugget");

        translationBuilder.add(ModBlocks.SILVER_BLOCK, "Silver Block");
        translationBuilder.add(ModBlocks.SILVER_ORE, "Silver Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_SILVER_ORE, "Deepslate Silver Ore");
        translationBuilder.add(ModBlocks.RAW_SILVER_BLOCK, "Raw Silver Block");

        translationBuilder.add(ModItemGroups.ORETOGO_GROUP, "Ore To Go");
    }
}
