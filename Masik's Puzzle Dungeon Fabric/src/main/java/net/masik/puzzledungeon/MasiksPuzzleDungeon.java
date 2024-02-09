package net.masik.puzzledungeon;

import net.fabricmc.api.ModInitializer;
import net.masik.puzzledungeon.util.ModLootTableModifiers;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.structure.processor.StructureProcessorType;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MasiksPuzzleDungeon implements ModInitializer {
	public static final String MOD_ID = "masiks_puzzle_dungeon";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("[Masik's Puzzle Dungeon] Initializing...");
		ModLootTableModifiers.modifyLootTables();
		LOGGER.info(ModStructureProcessorType.WATERLOGGED_PROCESSOR.toString());
	}
}
