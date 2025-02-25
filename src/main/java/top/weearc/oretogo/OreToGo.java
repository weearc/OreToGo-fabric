package top.weearc.oretogo;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.weearc.oretogo.block.ModBlocks;
import top.weearc.oretogo.item.ModItemGroups;
import top.weearc.oretogo.item.ModItems;
import top.weearc.oretogo.world.gen.ModWorldGeneration;

public class OreToGo implements ModInitializer {
	public static final String MOD_ID = "oretogo";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Loading OreToGo mod");
		LOGGER.info("Loading OreToGo item registry");
		ModItems.registerItems();
		LOGGER.info("Loading OreToGo item group registry");
		ModItemGroups.registerGroups();
		LOGGER.info("Loading OreToGo block registry");
		ModBlocks.registerBlockItems();
		LOGGER.info("Loading OreToGo world registry");
		ModWorldGeneration.registerWorldGenerations();
	}
}