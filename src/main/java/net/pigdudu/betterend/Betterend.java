package net.pigdudu.betterend;

import net.fabricmc.api.ModInitializer;

import net.pigdudu.betterend.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Betterend implements ModInitializer {
	public static final String MOD_ID = "betterend";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}