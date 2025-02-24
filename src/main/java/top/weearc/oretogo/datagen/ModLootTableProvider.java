package top.weearc.oretogo.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import top.weearc.oretogo.block.ModBlocks;
import top.weearc.oretogo.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SILVER_BLOCK);
        addDrop(ModBlocks.RAW_SILVER_BLOCK);
        addDrop(ModBlocks.SILVER_ORE, customOreDrops(ModBlocks.SILVER_ORE, ModItems.RAW_SILVER, 1.0f, 3.0f));
        addDrop(ModBlocks.DEEPSLATE_SILVER_ORE, customOreDrops(ModBlocks.DEEPSLATE_SILVER_ORE, ModItems.RAW_SILVER, 1.0f, 3.0f));
    }

    /*
    *  Block drop -> silk touch
    *  Item item -> without silk touch
    *  min, max -> with luck
    * */
    public LootTable.Builder customOreDrops(Block drop, Item item, float min, float max) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                )
        );
    }

}
