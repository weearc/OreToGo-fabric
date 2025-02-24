package top.weearc.oretogo.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import top.weearc.oretogo.OreToGo;
import top.weearc.oretogo.block.ModBlocks;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> ORETOGO_GROUP = register("oretogo_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(OreToGo.MOD_ID,id));
    }

    public static void registerGroups() {
        Registry.register(
                Registries.ITEM_GROUP,
                ORETOGO_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 7)
                        .displayName(Text.translatable("itemGroup.oretogo_group"))
                        .icon(() -> new ItemStack(ModItems.SILVER_INGOT))
                        .entries(((displayContext, entries) -> {
                            entries.add(ModItems.SILVER_NUGGET);
                            entries.add(ModItems.SILVER_INGOT);
                            entries.add(ModItems.RAW_SILVER);
                            entries.add(ModBlocks.RAW_SILVER_BLOCK);
                            entries.add(ModBlocks.SILVER_BLOCK);
                            entries.add(ModBlocks.SILVER_ORE);
                            entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);
                        })).build()
        );
    }
}
