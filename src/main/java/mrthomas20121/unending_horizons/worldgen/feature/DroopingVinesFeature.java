package mrthomas20121.charred_horizons.worldgen.feature;

import com.mojang.serialization.Codec;
import mrthomas20121.charred_horizons.init.CharredBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class DroopingVinesFeature extends Feature<NoneFeatureConfiguration> {
    private static final Direction[] DIRECTIONS = Direction.values();

    public DroopingVinesFeature(Codec<NoneFeatureConfiguration> p_67375_) {
        super(p_67375_);
    }

    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> p_160661_) {
        WorldGenLevel worldgenlevel = p_160661_.level();
        BlockPos blockpos = p_160661_.origin();
        RandomSource randomsource = p_160661_.random();
        if (!worldgenlevel.isEmptyBlock(blockpos)) {
            return false;
        } else {
            BlockState blockstate = worldgenlevel.getBlockState(blockpos.above());
            if (!blockstate.is(Blocks.NETHERRACK) && !blockstate.is(CharredBlocks.BLIGHT_NETHER_WART_BLOCK.get())) {
                return false;
            } else {
                this.placeRoofNetherWart(worldgenlevel, randomsource, blockpos);
                this.placeRoofWeepingVines(worldgenlevel, randomsource, blockpos);
                return true;
            }
        }
    }

    private void placeRoofNetherWart(LevelAccessor p_225360_, RandomSource p_225361_, BlockPos p_225362_) {
        p_225360_.setBlock(p_225362_, CharredBlocks.BLIGHT_NETHER_WART_BLOCK.get().defaultBlockState(), 2);
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
        BlockPos.MutableBlockPos blockpos$mutableblockpos1 = new BlockPos.MutableBlockPos();

        for (int i = 0; i < 200; ++i) {
            blockpos$mutableblockpos.setWithOffset(p_225362_, p_225361_.nextInt(6) - p_225361_.nextInt(6), p_225361_.nextInt(2) - p_225361_.nextInt(5), p_225361_.nextInt(6) - p_225361_.nextInt(6));
            if (p_225360_.isEmptyBlock(blockpos$mutableblockpos)) {
                int j = 0;

                for (Direction direction : DIRECTIONS) {
                    BlockState blockstate = p_225360_.getBlockState(blockpos$mutableblockpos1.setWithOffset(blockpos$mutableblockpos, direction));
                    if (blockstate.is(Blocks.NETHERRACK) || blockstate.is(CharredBlocks.BLIGHT_NETHER_WART_BLOCK.get())) {
                        ++j;
                    }

                    if (j > 1) {
                        break;
                    }
                }

                if (j == 1) {
                    p_225360_.setBlock(blockpos$mutableblockpos, CharredBlocks.BLIGHT_NETHER_WART_BLOCK.get().defaultBlockState(), 2);
                }
            }
        }

    }

    private void placeRoofWeepingVines(LevelAccessor p_225364_, RandomSource p_225365_, BlockPos p_225366_) {
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

        for (int i = 0; i < 100; ++i) {
            blockpos$mutableblockpos.setWithOffset(p_225366_, p_225365_.nextInt(8) - p_225365_.nextInt(8), p_225365_.nextInt(2) - p_225365_.nextInt(7), p_225365_.nextInt(8) - p_225365_.nextInt(8));
            if (p_225364_.isEmptyBlock(blockpos$mutableblockpos)) {
                BlockState blockstate = p_225364_.getBlockState(blockpos$mutableblockpos.above());
                if (blockstate.is(Blocks.NETHERRACK) || blockstate.is(CharredBlocks.BLIGHT_NETHER_WART_BLOCK.get())) {
                    int j = Mth.nextInt(p_225365_, 1, 8);
                    if (p_225365_.nextInt(6) == 0) {
                        j *= 2;
                    }

                    if (p_225365_.nextInt(5) == 0) {
                        j = 1;
                    }

                    int k = 17;
                    int l = 25;
                    placeDroopingVinesColumn(p_225364_, p_225365_, blockpos$mutableblockpos, j, 17, 25);
                }
            }
        }

    }

    public static void placeDroopingVinesColumn(LevelAccessor p_225353_, RandomSource p_225354_, BlockPos.MutableBlockPos p_225355_, int p_225356_, int p_225357_, int p_225358_) {
        for (int i = 0; i <= p_225356_; ++i) {
            if (p_225353_.isEmptyBlock(p_225355_)) {
                if (i == p_225356_ || !p_225353_.isEmptyBlock(p_225355_.below())) {
                    p_225353_.setBlock(p_225355_, CharredBlocks.DROOPING_VINES.get().defaultBlockState().setValue(GrowingPlantHeadBlock.AGE, Integer.valueOf(Mth.nextInt(p_225354_, p_225357_, p_225358_))), 2);
                    break;
                }

                p_225353_.setBlock(p_225355_, CharredBlocks.DROOPING_VINES_PLANT.get().defaultBlockState(), 2);
            }

            p_225355_.move(Direction.DOWN);
        }

    }
}
