package top.weearc.oretogo.item;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import top.weearc.oretogo.OreToGo;

public class ModItems {

    public static final Item SILVER_INGOT = register("silver_ingot", new Item(new Item.Settings()));
    public static final Item RAW_SILVER = register("raw_silver", new Item(new Item.Settings()));
    public static final Item SILVER_NUGGET = register("silver_nugget", new Item(new Item.Settings()));


    public static Item register(String id, Item item){
        return register(new Identifier(OreToGo.MOD_ID, id), item);
    }

    public static Item register(Identifier id, Item item){
        return register(RegistryKey.of(Registries.ITEM.getKey(), id), item);
    }

    public static Item register(RegistryKey<Item> key, Item item){
        if (item instanceof BlockItem){
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return Registry.register(Registries.ITEM, key, item);
    }

    public static void registerItems() {}
}
