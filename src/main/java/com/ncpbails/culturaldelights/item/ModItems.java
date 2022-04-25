package com.ncpbails.culturaldelights.item;

import com.ncpbails.culturaldelights.CulturalDelights;
import com.ncpbails.culturaldelights.block.ModBlocks;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.FarmersDelight;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CulturalDelights.MOD_ID);

    //Items                                                                  item id

    public static final RegistryObject<Item> CUCUMBER_SEEDS = ITEMS.register("cucumber_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CUCUMBERS.get(),
                    new Item.Properties().tab(FarmersDelight.CREATIVE_TAB)));

    public static final RegistryObject<Item> CORN_KERNELS = ITEMS.register("corn_kernels",
            () -> new ItemNameBlockItem(ModBlocks.CORN.get(),
                    new Item.Properties().tab(FarmersDelight.CREATIVE_TAB)));

    public static final RegistryObject<Item> EGGPLANT_SEEDS = ITEMS.register("eggplant_seeds",
            () -> new ItemNameBlockItem(ModBlocks.EGGPLANTS.get(),
                    new Item.Properties().tab(FarmersDelight.CREATIVE_TAB)));

    public static final RegistryObject<Item> WHITE_EGGPLANT_SEEDS = ITEMS.register("white_eggplant_seeds",
            () -> new ItemNameBlockItem(ModBlocks.WHITE_EGGPLANTS.get(),
                    new Item.Properties().tab(FarmersDelight.CREATIVE_TAB)));


    //Foods
    public static final RegistryObject<Item> AVOCADO = ITEMS.register("avocado",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.AVOCADO)));

    public static final RegistryObject<Item> CUT_AVOCADO = ITEMS.register("cut_avocado",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.CUT_AVOCADO)));

    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.CUCUMBER)));

    public static final RegistryObject<Item> PICKLE = ITEMS.register("pickle",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.PICKLE)));

    public static final RegistryObject<Item> CUT_CUCUMBER = ITEMS.register("cut_cucumber",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.CUT_CUCUMBER)));

    public static final RegistryObject<Item> CUT_PICKLE = ITEMS.register("cut_pickle",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.CUT_PICKLE)));

    public static final RegistryObject<Item> EGGPLANT = ITEMS.register("eggplant",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.EGGPLANT)));

    public static final RegistryObject<Item> CUT_EGGPLANT = ITEMS.register("cut_eggplant",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.CUT_EGGPLANT)));

    public static final RegistryObject<Item> SMOKED_EGGPLANT = ITEMS.register("smoked_eggplant",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.SMOKED_EGGPLANT)));

    public static final RegistryObject<Item> SMOKED_TOMATO = ITEMS.register("smoked_tomato",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.SMOKED_TOMATO)));

    public static final RegistryObject<Item> SMOKED_CORN = ITEMS.register("smoked_corn",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.SMOKED_CORN)));

    public static final RegistryObject<Item> SMOKED_CUT_EGGPLANT = ITEMS.register("smoked_cut_eggplant",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.SMOKED_CUT_EGGPLANT)));

    public static final RegistryObject<Item> SMOKED_WHITE_EGGPLANT = ITEMS.register("smoked_white_eggplant",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.SMOKED_WHITE_EGGPLANT)));

    public static final RegistryObject<Item> WHITE_EGGPLANT = ITEMS.register("white_eggplant",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.WHITE_EGGPLANT)));

    public static final RegistryObject<Item> CORN_COB = ITEMS.register("corn_cob",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.CORN_COB)));

    public static final RegistryObject<Item> POPCORN = ITEMS.register("popcorn",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.POPCORN)));

    public static final RegistryObject<Item> CORN_DOUGH = ITEMS.register("corn_dough",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.CORN_DOUGH)));

    public static final RegistryObject<Item> TORTILLA = ITEMS.register("tortilla",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.TORTILLA)));

    public static final RegistryObject<Item> TORTILLA_CHIPS = ITEMS.register("tortilla_chips",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.TORTILLA_CHIPS)));

    public static final RegistryObject<Item> ELOTE = ITEMS.register("elote",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.ELOTE)));

    public static final RegistryObject<Item> HEARTY_SALAD = ITEMS.register("hearty_salad",
            () -> new BowlFoodItem(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.HEARTY_SALAD)));

    public static final RegistryObject<Item> BEEF_BURRITO = ITEMS.register("beef_burrito",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.BEEF_BURRITO)));

    public static final RegistryObject<Item> MUTTON_SANDWICH = ITEMS.register("mutton_sandwich",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.MUTTON_SANDWICH)));

    public static final RegistryObject<Item> FRIED_EGGPLANT_PASTA = ITEMS.register("fried_eggplant_pasta",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.FRIED_EGGPLANT_PASTA)));

    public static final RegistryObject<Item> EGGPLANT_BURGER = ITEMS.register("eggplant_burger",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.EGGPLANT_BURGER)));

    public static final RegistryObject<Item> AVOCADO_TOAST = ITEMS.register("avocado_toast",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.AVOCADO_TOAST)));



    public static final RegistryObject<Item> VEGETABLE_MAKI = ITEMS.register("vegetable_maki",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.VEGETABLE_MAKI)));

    public static final RegistryObject<Item> TAMAGO = ITEMS.register("tamago",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.TAMAGO)));

    public static final RegistryObject<Item> CHICKEN_MAKI = ITEMS.register("chicken_maki",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.CHICKEN_MAKI)));

    public static final RegistryObject<Item> COD_MAKI = ITEMS.register("cod_maki",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.COD_MAKI)));

    public static final RegistryObject<Item> KOI_NIGIRI = ITEMS.register("koi_nigiri",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.KOI_NIGIRI)));

    public static final RegistryObject<Item> LIONFISH_MAKI = ITEMS.register("lionfish_maki",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.LIONFISH_MAKI)));

    public static final RegistryObject<Item> PERCH_NIGIRI = ITEMS.register("perch_nigiri",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.PERCH_NIGIRI)));

    public static final RegistryObject<Item> PIKE_MAKI = ITEMS.register("pike_maki",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.PIKE_MAKI)));

    public static final RegistryObject<Item> PUFFERFISH_NIGIRI = ITEMS.register("pufferfish_nigiri",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.PUFFERFISH_NIGIRI)));

    public static final RegistryObject<Item> SALMON_NIGIRI = ITEMS.register("salmon_nigiri",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.SALMON_NIGIRI)));

    public static final RegistryObject<Item> TROPICAL_NIGIRI = ITEMS.register("tropical_nigiri",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.TROPICAL_NIGIRI)));

    public static final RegistryObject<Item> ONIGIRI = ITEMS.register("onigiri",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.ONIGIRI)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
