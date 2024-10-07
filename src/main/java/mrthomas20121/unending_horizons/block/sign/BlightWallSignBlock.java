package mrthomas20121.unending_horizons.block.sign;

import mrthomas20121.charred_horizons.block_entity.BlightSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class BlightWallSignBlock extends WallSignBlock {

    public BlightWallSignBlock(Properties p_56990_, WoodType p_56991_) {
        super(p_56990_, p_56991_);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new BlightSignBlockEntity(pos, state);
    }
}
