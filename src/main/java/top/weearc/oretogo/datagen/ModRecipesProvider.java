package top.weearc.oretogo.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.weearc.oretogo.block.ModBlocks;
import top.weearc.oretogo.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

import static top.weearc.oretogo.OreToGo.MOD_ID;

public class ModRecipesProvider extends FabricRecipeProvider {

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }

    public static final List<ItemConvertible> RAW_SILVER_LIST = List.of(ModItems.RAW_SILVER, ModBlocks.SILVER_ORE , ModBlocks.DEEPSLATE_SILVER_ORE);

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(
                exporter,
                RecipeCategory.MISC,
                ModItems.RAW_SILVER,
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.RAW_SILVER_BLOCK
        );

        offerReversibleCompactingRecipesWithReverseRecipeGroup(
                exporter,
                RecipeCategory.MISC,
                ModItems.SILVER_INGOT,
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.SILVER_BLOCK,
                "silver_ingot_from_silver_block",
                "silver_ingot"
        );
        offerReversibleCompactingRecipesWithCompactingRecipeGroup(
                exporter,
                RecipeCategory.MISC,
                ModItems.SILVER_NUGGET,
                RecipeCategory.MISC,
                ModItems.SILVER_INGOT,
                "silver_ingot_from_nuggets",
                "silver_ingot"
        );

        offerSmelting(exporter, RAW_SILVER_LIST, RecipeCategory.MISC, ModItems.SILVER_INGOT, 0.7f, 200, "silver_ingot");

        offerBlasting(exporter, RAW_SILVER_LIST, RecipeCategory.MISC, ModItems.SILVER_INGOT, 0.7f, 100, "silver_ingot");

    }
}
