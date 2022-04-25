package com.ncpbails.culturaldelights.block.custom;


import com.ncpbails.culturaldelights.block.ModBlocks;
import com.ncpbails.culturaldelights.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.ForgeHooks;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import vectorwing.farmersdelight.common.block.RicePaniclesBlock;


import javax.annotation.Nullable;
import java.util.Random;

public class CornBlock extends BushBlock implements BonemealableBlock {
    public static final IntegerProperty AGE;
    public static final BooleanProperty SUPPORTING;
    private static final VoxelShape[] SHAPE_BY_AGE;

    public CornBlock(Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)((BlockState)this.defaultBlockState().setValue(AGE, 0)).setValue(SUPPORTING, false));
    }

    public void tick(BlockState state, ServerLevel worldIn, BlockPos pos, Random rand) {
        super.tick(state, worldIn, pos, rand);
        if (worldIn.isAreaLoaded(pos, 1)) {
            if (worldIn.getRawBrightness(pos.above(), 0) >= 6) {
                int age = this.getAge(state);
                if (age <= this.getMaxAge()) {
                    float chance = 10.0F;
                    if (ForgeHooks.onCropsGrowPre(worldIn, pos, state, rand.nextInt((int)(25.0F / chance) + 1) == 0)) {
                        if (age == this.getMaxAge()) {
                            CornUpperBlock cornUpper = (CornUpperBlock) ModBlocks.CORN_UPPER.get();
                            if (cornUpper.defaultBlockState().canSurvive(worldIn, pos.above()) && worldIn.isEmptyBlock(pos.above())) {
                                worldIn.setBlockAndUpdate(pos.above(), cornUpper.defaultBlockState());
                                ForgeHooks.onCropsGrowPost(worldIn, pos, state);
                            }
                        } else {
                            worldIn.setBlock(pos, this.withAge(age + 1), 2);
                            ForgeHooks.onCropsGrowPost(worldIn, pos, state);
                        }
                    }
                }
            }

        }
    }

    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        return SHAPE_BY_AGE[(Integer)state.getValue(this.getAgeProperty())];
    }

    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    protected int getAge(BlockState state) {
        return (Integer)state.getValue(this.getAgeProperty());
    }

    public int getMaxAge() {
        return 3;
    }

    public ItemStack getCloneItemStack(BlockGetter worldIn, BlockPos pos, BlockState state) {
        return new ItemStack((ItemLike) ModItems.CORN_KERNELS.get());
    }

    public BlockState withAge(int age) {
        return (BlockState)this.defaultBlockState().setValue(this.getAgeProperty(), age);
    }

    public boolean isMaxAge(BlockState state) {
        return (Integer)state.getValue(this.getAgeProperty()) >= this.getMaxAge();
    }

    protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
        builder.add(new Property[]{AGE, SUPPORTING});
    }

    public boolean isSupportingCornUpper(BlockState topState) {
        return topState.getBlock() == ModBlocks.CORN_UPPER.get();
    }


    public boolean canGrow(BlockGetter worldIn, BlockPos pos, BlockState state, boolean isClient) {
        BlockState upperState = worldIn.getBlockState(pos.above());
        if (upperState.getBlock() instanceof CornUpperBlock) {
            return !((CornUpperBlock)upperState.getBlock()).isMaxAge(upperState);
        } else {
            return true;
        }
    }

    public boolean isValidBonemealTarget(BlockGetter worldIn, BlockPos pos, BlockState state, boolean isClient) {
        BlockState upperState = worldIn.getBlockState(pos.above());
        if (upperState.getBlock() instanceof CornUpperBlock) {
            return !((CornUpperBlock)upperState.getBlock()).isMaxAge(upperState);
        } else {
            return true;
        }
    }

    public boolean isBonemealSuccess(Level worldIn, Random rand, BlockPos pos, BlockState state) {
        return true;
    }

    protected int getBonemealAgeIncrease(Level worldIn) {
        return Mth.nextInt(worldIn.random, 1, 4);
    }

    public void performBonemeal(ServerLevel worldIn, Random rand, BlockPos pos, BlockState state) {
        int ageGrowth = Math.min(this.getAge(state) + this.getBonemealAgeIncrease(worldIn), 7);
        if (ageGrowth <= this.getMaxAge()) {
            worldIn.setBlockAndUpdate(pos, (BlockState)state.setValue(AGE, ageGrowth));
        } else {
            BlockState top = worldIn.getBlockState(pos.above());
            if (top.getBlock() == ModBlocks.CORN_UPPER.get()) {
                BonemealableBlock growable = (BonemealableBlock)worldIn.getBlockState(pos.above()).getBlock();
                if (growable.isValidBonemealTarget(worldIn, pos.above(), top, false)) {
                    growable.performBonemeal(worldIn, worldIn.random, pos.above(), top);
                }
            } else {
                CornUpperBlock cornUpper = (CornUpperBlock) ModBlocks.CORN_UPPER.get();
                int remainingGrowth = ageGrowth - this.getMaxAge() - 1;
                if (cornUpper.defaultBlockState().canSurvive(worldIn, pos.above()) && worldIn.isEmptyBlock(pos.above())) {
                    worldIn.setBlockAndUpdate(pos, (BlockState)state.setValue(AGE, this.getMaxAge()));
                    worldIn.setBlock(pos.above(), (BlockState)cornUpper.defaultBlockState().setValue(CornUpperBlock.CORN_AGE, remainingGrowth), 2);
                }
            }
        }

    }

    static {
        AGE = BlockStateProperties.AGE_3;
        SUPPORTING = BooleanProperty.create("supporting");
        SHAPE_BY_AGE = new VoxelShape[]{Block.box(3.0D, 0.0D, 3.0D, 13.0D, 8.0D, 13.0D),
                Block.box(3.0D, 0.0D, 3.0D, 13.0D, 10.0D, 13.0D),
                Block.box(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D),
                Block.box(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D)};
    }
}
