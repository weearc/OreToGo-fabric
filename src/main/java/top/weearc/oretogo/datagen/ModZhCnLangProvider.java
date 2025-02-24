package top.weearc.oretogo.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import top.weearc.oretogo.block.ModBlocks;
import top.weearc.oretogo.item.ModItemGroups;
import top.weearc.oretogo.item.ModItems;

public class ModZhCnLangProvider extends FabricLanguageProvider {

    public ModZhCnLangProvider(FabricDataOutput output) {
        super(output, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.RAW_SILVER, "粗银矿");
        translationBuilder.add(ModItems.SILVER_INGOT, "银锭");
        translationBuilder.add(ModItems.SILVER_NUGGET, "银粒");

        translationBuilder.add(ModBlocks.SILVER_BLOCK, "银块");
        translationBuilder.add(ModBlocks.SILVER_ORE, "银矿石");
        translationBuilder.add(ModBlocks.DEEPSLATE_SILVER_ORE, "深层银矿石");
        translationBuilder.add(ModBlocks.RAW_SILVER_BLOCK, "粗银块");

        translationBuilder.add(ModItemGroups.ORETOGO_GROUP, "矿石快取");
    }
}
