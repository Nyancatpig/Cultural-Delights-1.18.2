package com.ncpbails.culturaldelights.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class ModFoods {
    
    //INGREDIENTS
    public static final FoodProperties AVOCADO = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.6F).build();
    public static final FoodProperties CUCUMBER = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.5F).build();
    public static final FoodProperties PICKLE = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.7F).build();
    public static final FoodProperties EGGPLANT = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.2F).build();
    public static final FoodProperties SMOKED_EGGPLANT = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.6F).build();
    public static final FoodProperties SMOKED_TOMATO = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.6F).build();
    public static final FoodProperties SMOKED_CORN = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.7F).build();
    public static final FoodProperties SMOKED_WHITE_EGGPLANT = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.5F).build();
    public static final FoodProperties WHITE_EGGPLANT = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).build();
    public static final FoodProperties CORN_COB = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.4F).build();
    public static final FoodProperties SQUID = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).build();
    public static final FoodProperties COOKED_SQUID = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.8F).build();
    public static final FoodProperties GLOW_SQUID = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 40, 1), 1.0F).fast().build();
    public static final FoodProperties RAW_CALAMARI = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).build();
    public static final FoodProperties COOKED_CALAMARI = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.5F).build();

    public static final FoodProperties CUT_AVOCADO = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).fast().build();
    public static final FoodProperties CUT_CUCUMBER = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.3F).fast().build();
    public static final FoodProperties CUT_PICKLE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.5F).fast().build();
    public static final FoodProperties CUT_EGGPLANT = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).fast().build();
    public static final FoodProperties SMOKED_CUT_EGGPLANT = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).fast().build();

    //SUSHI
    public static final FoodProperties MIDORI_ROLL = (new FoodProperties.Builder()).nutrition(14).saturationMod(0.7F).build();
    public static final FoodProperties MIDORI_ROLL_SLICE = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.4F).fast().build();
    public static final FoodProperties EGG_ROLL = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.5F).fast().build();
    public static final FoodProperties CHICKEN_ROLL = (new FoodProperties.Builder()).nutrition(16).saturationMod(0.8F).build();
    public static final FoodProperties CHICKEN_ROLL_SLICE = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.6F).fast().build();
    public static final FoodProperties PUFFERFISH_ROLL = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.6F)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 200, 1), 1.0F).fast().build();
    public static final FoodProperties TROPICAL_ROLL = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.6F).fast().build();
    public static final FoodProperties RICE_BALL = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.5F).fast().build();
    public static final FoodProperties CALAMARI_ROLL = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.6F).fast().build();

    //MEALS
    public static final FoodProperties CORN_DOUGH = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).build();
    public static final FoodProperties TORTILLA = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.6F).build();
    public static final FoodProperties POPCORN = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).fast().build();
    public static final FoodProperties TORTILLA_CHIPS = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).fast().build();
    public static final FoodProperties ELOTE = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.8F).build();
    public static final FoodProperties BEEF_BURRITO = (new FoodProperties.Builder()).nutrition(14).saturationMod(0.7F).build();
    public static final FoodProperties MUTTON_SANDWICH = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.8F).build();
    public static final FoodProperties AVOCADO_TOAST = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.5F).build();
    public static final FoodProperties CREAMED_CORN = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.8F).build();
    public static final FoodProperties CHICKEN_TACO = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.8F).build();
    public static final FoodProperties PORK_WRAP = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.8F).build();
    public static final FoodProperties FISH_TACO = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.8F).build();
    public static final FoodProperties HEARTY_SALAD = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.7F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), FoodValues.LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties FRIED_EGGPLANT_PASTA = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.9F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), FoodValues.LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties EGGPLANT_BURGER = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.7F).build();
    public static final FoodProperties SPICY_CURRY = (new FoodProperties.Builder()).nutrition(12).saturationMod(1.3F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), FoodValues.LONG_DURATION, 0), 1.0F).build();

}