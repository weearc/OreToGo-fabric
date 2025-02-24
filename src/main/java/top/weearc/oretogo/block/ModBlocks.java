package top.weearc.oretogo.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import top.weearc.oretogo.OreToGo;

public class ModBlocks {

    public static final Block RAW_SILVER_BLOCK = register("raw_silver_block", new Block(AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK)));
    public static final Block SILVER_BLOCK = register("silver_block", new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block SILVER_ORE = register("silver_ore", new Block(AbstractBlock.Settings.copy(Blocks.COPPER_ORE)));
    public static final Block DEEPSLATE_SILVER_ORE = register("deepslate_silver_ore", new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE)));

    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(OreToGo.MOD_ID, id), block);
    }

    public static void registerBlockItems(String id, Block block) {
        Registry.register(Registries.ITEM, new Identifier(OreToGo.MOD_ID, id),
        new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlockItems() {}
}
