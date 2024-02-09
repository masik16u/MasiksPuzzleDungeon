package net.masik.puzzledungeon;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.structure.processor.StructureProcessorType;
import net.minecraft.util.Identifier;

public class ModStructureProcessorType {
    public static StructureProcessorType<WaterloggedProcessor> WATERLOGGED_PROCESSOR = Registry.register(Registries.STRUCTURE_PROCESSOR,
            "masiks_puzzle_dungeon:waterlogged", () -> WaterloggedProcessor.CODEC);
}
