package net.masik.puzzledungeon.mixin;

import net.masik.puzzledungeon.ModStructureProcessorType;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.StructureTemplate;
import net.minecraft.structure.processor.StructureProcessor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.ServerWorldAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(StructureTemplate.class)
public class StructureTemplateMixin {

    @Inject(method = "place", at = @At("HEAD"))
    private void place(ServerWorldAccess world, BlockPos pos, BlockPos pivot, StructurePlacementData placementData, Random random, int flags, CallbackInfoReturnable<Boolean> cir) {

        if (placementData.getProcessors() == null) return;

        for (StructureProcessor processor : placementData.getProcessors()) {
            if (processor.getType() == ModStructureProcessorType.WATERLOGGED_PROCESSOR) {
                placementData.setPlaceFluids(false);
                break;
            }
        }
    }

}
