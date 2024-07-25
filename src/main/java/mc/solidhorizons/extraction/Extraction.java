package mc.solidhorizons.extraction;

import mc.solidhorizons.extraction.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Extraction implements ModInitializer {

	public static final String MOD_ID = "extraction";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("loading " + MOD_ID);

		ModItems.registerModItems();

	}
}