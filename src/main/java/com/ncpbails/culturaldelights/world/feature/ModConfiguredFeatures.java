package com.ncpbails.culturaldelights.world.feature;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.ncpbails.culturaldelights.block.ModBlocks;
import com.ncpbails.culturaldelights.world.gen.treedecorator.AvocadoBundleTreeDecorator;
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class ModConfiguredFeatures {
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> AVOCADO_TREE =
            FeatureUtils.register("avocado", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.AVOCADO_LOG.get()),
                    new StraightTrunkPlacer(3, 2, 0),
                    BlockStateProvider.simple(ModBlocks.AVOCADO_LEAVES.get()),
                    new AcaciaFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0)),
                    new TwoLayersFeatureSize(1, 0, 1))
                    .decorators(ImmutableList.of(new AvocadoBundleTreeDecorator(1))).ignoreVines().build());

    public static final Holder<PlacedFeature> AVOCADO_CHECKED = PlacementUtils.register("avocado_checked", AVOCADO_TREE,
            PlacementUtils.filteredByBlockSurvival(ModBlocks.AVOCADO_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> AVOCADO_SPAWN =
            FeatureUtils.register("avocado_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(AVOCADO_CHECKED,
                            0.5F)), AVOCADO_CHECKED));


    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> AVOCADO_PIT =
            FeatureUtils.register("avocado_pit", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.AVOCADO_SAPLING.get()),
                    new StraightTrunkPlacer(3, 2, 0),
                    BlockStateProvider.simple(ModBlocks.AVOCADO_SAPLING.get()),
                    new AcaciaFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                    new TwoLayersFeatureSize(1, 0, 1)).build());
}
