package net.nasty289.woodvariants;

import net.fabricmc.api.ModInitializer;

import net.nasty289.woodvariants.block.ModBlocks;
import net.nasty289.woodvariants.item.ModItemGroups;
import net.nasty289.woodvariants.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WoodVariants implements ModInitializer {
	public static final String MOD_ID = "woodvariants";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}