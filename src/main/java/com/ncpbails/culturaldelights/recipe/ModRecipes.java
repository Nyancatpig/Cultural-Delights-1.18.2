package com.ncpbails.culturaldelights.recipe;

import com.ncpbails.culturaldelights.CulturalDelights;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {

    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, CulturalDelights.MOD_ID);


    public static final RegistryObject<RecipeSerializer<BambooMatRecipe>> MAT_ROLLING_SERIALIZER =
            SERIALIZERS.register("mat_rolling", () -> BambooMatRecipe.Serializer.INSTANCE);


    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
