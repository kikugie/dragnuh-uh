package dev.kikugie.dragun.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ModifiableWorld;
import net.minecraft.world.gen.feature.EndSpikeFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(EndSpikeFeature.class)
public class EndSpikeFeatureMixin {
	@Redirect(method = "generateSpike", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/gen/feature/EndSpikeFeature;setBlockState(Lnet/minecraft/world/ModifiableWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;)V", ordinal = 1))
	private void educateEndPillarToBePoliteWithOtherBlocks(EndSpikeFeature instance, ModifiableWorld world, BlockPos pos, BlockState state) {
		// No-op to prevent it setting air
	}
}