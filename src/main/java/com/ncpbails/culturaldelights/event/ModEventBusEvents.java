package com.ncpbails.culturaldelights.event;

import com.ncpbails.culturaldelights.CulturalDelights;
import com.ncpbails.culturaldelights.recipe.BambooMatRecipe;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CulturalDelights.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
        Registry.register(Registry.RECIPE_TYPE, BambooMatRecipe.Type.ID, BambooMatRecipe.Type.INSTANCE);
    }
}
