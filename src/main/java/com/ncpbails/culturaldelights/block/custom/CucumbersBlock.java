package com.ncpbails.culturaldelights.block.custom;

import com.ncpbails.culturaldelights.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;


public class CucumbersBlock extends CropBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_5;

    public CucumbersBlock(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxAge() {
        return 5;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.CUCUMBER_SEEDS.get();
    }
}
