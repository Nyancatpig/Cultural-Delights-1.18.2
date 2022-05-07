package com.ncpbails.culturaldelights.block;

import com.ncpbails.culturaldelights.CulturalDelights;
import com.ncpbails.culturaldelights.block.custom.*;
import com.ncpbails.culturaldelights.item.ModItems;
import com.ncpbails.culturaldelights.world.feature.tree.AvocadoPitGrower;
import com.ncpbails.culturaldelights.world.feature.tree.AvocadoTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.block.WildCropBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CulturalDelights.MOD_ID);

    public static final RegistryObject<Block> AVOCADO_BUNDLE = registerBlock("avocado_bundle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PUMPKIN).noOcclusion()), FarmersDelight.CREATIVE_TAB, false, 0);

    public static final RegistryObject<Block> BAMBOO_MAT = registerBlock("bamboo_mat",
            () -> new BambooMatBlock(BlockBehaviour.Properties.copy(vectorwing.farmersdelight.common.registry.ModBlocks.CUTTING_BOARD.get())
                    .noOcclusion()), FarmersDelight.CREATIVE_TAB, true, 200);

     public static final RegistryObject<Block> WILD_CUCUMBERS = registerBlock("wild_cucumbers",
            () -> new WildCropBlock(MobEffects.FIRE_RESISTANCE, 6, BlockBehaviour.Properties.copy(Blocks.TALL_GRASS), false),
             FarmersDelight.CREATIVE_TAB, false, 0);

    public static final RegistryObject<Block> WILD_CORN = registerBlock("wild_corn",
            () -> new WildCropBlock(MobEffects.HUNGER, 6, BlockBehaviour.Properties.copy(Blocks.TALL_GRASS), false),
            FarmersDelight.CREATIVE_TAB, false, 0);

    public static final RegistryObject<Block> WILD_EGGPLANTS = registerBlock("wild_eggplants",
            () -> new WildCropBlock(MobEffects.DAMAGE_BOOST, 6, BlockBehaviour.Properties.copy(Blocks.TALL_GRASS), false),
            FarmersDelight.CREATIVE_TAB, false, 0);

    public static final RegistryObject<Block> AVOCADO_LOG = registerBlock("avocado_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
      @Nullable @Override public BlockState getToolModifiedState(BlockState state, Level world, BlockPos pos, Player player, ItemStack stack, ToolAction toolAction){
                    if(stack.getItem() instanceof AxeItem) { return Blocks.JUNGLE_LOG.defaultBlockState().setValue(AXIS, state.getValue(AXIS)); }
                    return super.getToolModifiedState(state, world, pos, player, stack, toolAction); }
            }, FarmersDelight.CREATIVE_TAB, true, 300);

    public static final RegistryObject<Block> AVOCADO_WOOD = registerBlock("avocado_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
      @Nullable @Override public BlockState getToolModifiedState(BlockState state, Level world, BlockPos pos, Player player, ItemStack stack, ToolAction toolAction){
                    if(stack.getItem() instanceof AxeItem) { return Blocks.JUNGLE_WOOD.defaultBlockState().setValue(AXIS, state.getValue(AXIS)); }
                    return super.getToolModifiedState(state, world, pos, player, stack, toolAction); }
                }, FarmersDelight.CREATIVE_TAB, true, 300);

    public static final RegistryObject<Block> AVOCADO_LEAVES = registerBlock("avocado_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LEAVES)) {
                        @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                        @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                        @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
                        }, FarmersDelight.CREATIVE_TAB, false, 0);

    public static final RegistryObject<Block> AVOCADO_SAPLING = registerBlock("avocado_sapling",
            () -> new SaplingBlock(new AvocadoTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)),
            FarmersDelight.CREATIVE_TAB, true, 100);

    public static final RegistryObject<Block> CUCUMBERS = registerBlockWithoutBlockItem("cucumbers",
            () -> new CucumbersBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> WHITE_EGGPLANTS = registerBlockWithoutBlockItem("white_eggplants",
            () -> new WhiteEggplantsBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> EGGPLANTS = registerBlockWithoutBlockItem("eggplants",
            () -> new EggplantsBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> CORN = registerBlockWithoutBlockItem("corn",
            () -> new CornBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> CORN_UPPER = registerBlockWithoutBlockItem("corn_upper",
            () -> new CornUpperBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> AVOCADO_PIT = registerBlock("avocado_pit",
            () -> new AvocadoPitBlock(new AvocadoPitGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), FarmersDelight.CREATIVE_TAB, false, 0);

    public static final RegistryObject<Block> AVOCADO_CRATE = registerBlock("avocado_crate",
            () -> new Block(BlockBehaviour.Properties.copy(vectorwing.farmersdelight.common.registry.ModBlocks.CARROT_CRATE.get()))
            , FarmersDelight.CREATIVE_TAB, false, 0);

    public static final RegistryObject<Block> CUCUMBER_CRATE = registerBlock("cucumber_crate",
            () -> new Block(BlockBehaviour.Properties.copy(vectorwing.farmersdelight.common.registry.ModBlocks.CARROT_CRATE.get()))
            , FarmersDelight.CREATIVE_TAB, false, 0);

    public static final RegistryObject<Block> PICKLE_CRATE = registerBlock("pickle_crate",
            () -> new Block(BlockBehaviour.Properties.copy(vectorwing.farmersdelight.common.registry.ModBlocks.CARROT_CRATE.get()))
            , FarmersDelight.CREATIVE_TAB, false, 0);

    public static final RegistryObject<Block> CORN_COB_CRATE = registerBlock("corn_cob_crate",
            () -> new Block(BlockBehaviour.Properties.copy(vectorwing.farmersdelight.common.registry.ModBlocks.CARROT_CRATE.get()))
            , FarmersDelight.CREATIVE_TAB, false, 0);

    public static final RegistryObject<Block> EGGPLANT_CRATE = registerBlock("eggplant_crate",
            () -> new Block(BlockBehaviour.Properties.copy(vectorwing.farmersdelight.common.registry.ModBlocks.CARROT_CRATE.get()))
            , FarmersDelight.CREATIVE_TAB, false, 0);

    public static final RegistryObject<Block> WHITE_EGGPLANT_CRATE = registerBlock("white_eggplant_crate",
            () -> new Block(BlockBehaviour.Properties.copy(vectorwing.farmersdelight.common.registry.ModBlocks.CARROT_CRATE.get()))
            , FarmersDelight.CREATIVE_TAB, false, 0);




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab, Boolean isFuel, Integer fuelAmount) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, isFuel, fuelAmount);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, Boolean isFuel, Integer fuelAmount) {
        if(isFuel == false) {
            return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                    new Item.Properties().tab(tab)));
        } else {
            return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                    new Item.Properties().tab(tab)){
                @Override public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {return fuelAmount;}});
        }
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}