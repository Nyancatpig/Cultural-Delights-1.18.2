package com.ncpbails.culturaldelights.world;

import com.ncpbails.culturaldelights.CulturalDelights;
import com.ncpbails.culturaldelights.world.gen.ModTreeGeneration;
import com.ncpbails.culturaldelights.world.gen.ModWildCropGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CulturalDelights.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModTreeGeneration.generateTrees(event);
        ModWildCropGeneration.generateFlowers(event);
        //ModPlantGeneration.generatePlants(event);
    }


}
