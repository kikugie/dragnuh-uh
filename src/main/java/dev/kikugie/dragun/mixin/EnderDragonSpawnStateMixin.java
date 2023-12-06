package dev.kikugie.dragun.mixin;

import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Collections;

@Mixin(targets = "net/minecraft/entity/boss/dragon/EnderDragonSpawnState$3")
public class EnderDragonSpawnStateMixin {
    @Redirect(method = "run", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/BlockPos;iterate(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;)Ljava/lang/Iterable;"))
    private Iterable<BlockPos> educateEndPillarToBePoliteWithOtherBlocksHighSchoolEdition(BlockPos start, BlockPos end) {
        // Cancel the entire iteration
        return Collections.emptyList();
    }
}