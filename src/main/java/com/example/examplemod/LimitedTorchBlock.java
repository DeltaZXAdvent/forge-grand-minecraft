package com.example.examplemod;

import net.minecraft.core.BlockPos;import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.core.particles.ParticleOptions;

public class LimitedTorchBlock extends TorchBlock {
    protected int remainingTicks = 64;

    public LimitedTorchBlock(BlockBehaviour.Properties bbp, ParticleOptions po) {
	super (bbp, po);
    }

    
    @Override
    public boolean canSurvive(BlockState bs, LevelReader lr, BlockPos bp) {
	return super.canSurvive (bs, lr, bp) && remainingTicks > 0;
    }
}
