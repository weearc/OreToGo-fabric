package top.weearc.oretogo.tag;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import top.weearc.oretogo.OreToGo;

public class ModItemTags {

    public static final TagKey<Item> SILVER_INGOT = commonTag("silver_ingots");
    public static final TagKey<Item> SILVER_NUGGET = commonTag("silver_nuggets");
    public static final TagKey<Item> RAW_ORES = commonTag("raw_ores");
    public static final TagKey<Item> RAW_MATERIALS = commonTag("raw_materials");
    public static final TagKey<Item> RAW_SILVER = commonTag("raw_silver");
    public static final TagKey<Item> FORGE_RAW_ORES = forgeTag("raw_ores");
    public static final TagKey<Item> AE2_METAL_INGOT = ae2Tag("metal_ingots");
    public static final TagKey<Item> INGOT = commonTag("ingots");
    public static final TagKey<Item> VANILLA_BEACON_PAYMENT = vanillaTag("beacon_payment_items");
    public static final TagKey<Item> RAW_ORES_SILVER = commonTag("raw_silver_ores");


    public static final TagKey<Item> FORGE_INGOTS_SILVER = forgeTag("ingots/silver");
    public static final TagKey<Item> FORGE_NUGGETS_SILVER = forgeTag("nuggets/silver");
    public static final TagKey<Item> FORGE_ORES_SILVER = forgeTag("ores/silver");
    public static final TagKey<Item> FORGE_RAW_MATERIAL_SILVER = forgeTag("raw_materials/silver");
    public static final TagKey<Item> FORGE_ORES = forgeTag("ores");
    public static final TagKey<Item> FORGE_RAW_MATERIAL = forgeTag("raw_materials");
    public static final TagKey<Item> FORGE_RAW_ORES_SILVER = forgeTag("raw_silver_ores");
    public static final TagKey<Item> FORGE_SILVER_INGOTS = forgeTag("silver_ingots");
    public static final TagKey<Item> FORGE_SILVER_NUGGETS = forgeTag("silver_nuggets");
    public static final TagKey<Item> FORGE_SILVER_ORES = forgeTag("silver_ores");

    private static TagKey<Item> commonTag(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier("c", id));
    }

    private static TagKey<Item> forgeTag(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier("forge", id));
    }

    private static TagKey<Item> ae2Tag(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier("ae2", id));
    }


    private static TagKey<Item> vanillaTag(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier("minecraft", id));
    }
}
