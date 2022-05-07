package com.ncpbails.culturaldelights.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> AVOCADO_PLACED = PlacementUtils.register("avocado_placed",
            ModConfiguredFeatures.AVOCADO_SPAWN, VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1)));

    public static final Holder<PlacedFeature> WILD_CORN_PLACED = PlacementUtils.register("wild_corn_placed",
            ModConfiguredFeatures.WILD_CORN, RarityFilter.onAverageOnceEvery(25),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> WILD_EGGPLANTS_PLACED = PlacementUtils.register("wild_eggplants_placed",
            ModConfiguredFeatures.WILD_EGGPLANTS, RarityFilter.onAverageOnceEvery(25),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> WILD_CUCUMBERS_PLACED = PlacementUtils.register("wild_cucumbers_placed",
            ModConfiguredFeatures.WILD_CUCUMBERS, RarityFilter.onAverageOnceEvery(25),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
}