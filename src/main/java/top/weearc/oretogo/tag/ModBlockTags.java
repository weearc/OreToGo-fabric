package top.weearc.oretogo.tag;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import top.weearc.oretogo.OreToGo;

public class ModBlockTags {

    public static final TagKey<Block> STORAGE_BLOCK = commonTag("storage_blocks");
    public static final TagKey<Block> RAW_BLOCK = commonTag("raw_blocks");
    public static final TagKey<Block> RAW_SILVER_BLOCK = commonTag("raw_silver_blocks");
    public static final TagKey<Block> ORE = commonTag("ores");
    public static final TagKey<Block> SILVER_ORE = commonTag("silver_ores");

    public static final TagKey<Block> FORGE_ORE = forgeTag("ores");
    public static final TagKey<Block> FORGE_STORAGE_BLOCK_SILVER = forgeTag("storage_blocks/silver_blocks");
    public static final TagKey<Block> FORGE_ORES_IN_GROUND_DEEPSLATE_SILVER = forgeTag("ores_in_ground/deepslate");
    public static final TagKey<Block> FORGE_ORES_IN_GROUND_STONE_SILVER = forgeTag("ores_in_ground/stone");
    public static final TagKey<Block> FORGE_SILVER_BLOCKS = forgeTag("silver_blocks");

    private static TagKey<Block> commonTag(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", id));
    }

    private static TagKey<Block> forgeTag(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier("forge", id));
    }

    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(OreToGo.MOD_ID, id));
    }
}
