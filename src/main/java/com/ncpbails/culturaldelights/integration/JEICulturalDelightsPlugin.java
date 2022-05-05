package com.ncpbails.culturaldelights.integration;

import com.ncpbails.culturaldelights.CulturalDelights;
import com.ncpbails.culturaldelights.recipe.BambooMatRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEICulturalDelightsPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(CulturalDelights.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new
                BambooMatRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        List<BambooMatRecipe> recipes = rm.getAllRecipesFor(BambooMatRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(BambooMatRecipeCategory.UID, BambooMatRecipe.class), recipes);
    }
}
