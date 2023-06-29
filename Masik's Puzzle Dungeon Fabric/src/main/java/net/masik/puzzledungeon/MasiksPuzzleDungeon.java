package net.masik.puzzledungeon;

import net.fabricmc.api.ModInitializer;
import net.masik.puzzledungeon.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MasiksPuzzleDungeon implements ModInitializer {
	public static final String MOD_ID = "masiks_puzzle_dungeon";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModLootTableModifiers.modifyLootTables();
	}
}
