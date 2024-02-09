package net.masik.puzzledungeon;

import com.mojang.serialization.Codec;
import net.minecraft.structure.processor.StructureProcessor;
import net.minecraft.structure.processor.StructureProcessorType;

public class WaterloggedProcessor extends StructureProcessor {

    public static final WaterloggedProcessor INSTANCE = new WaterloggedProcessor();
    public static final Codec<WaterloggedProcessor> CODEC = Codec.unit(() -> INSTANCE);

    private WaterloggedProcessor(){}

    @Override
    public StructureProcessorType<?> getType() {
        return ModStructureProcessorType.WATERLOGGED_PROCESSOR;
    }
}
