package com.mods.BlockGravity;

import com.mods.BlockGravity.BlockGravity;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

import com.mods.BlockGravity.blocks.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.RedstoneWireBlock;
import net.minecraft.block.ShearableDoublePlantBlock;
import net.minecraft.block.StemBlock;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.state.IProperty;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.ObjectIntIdentityMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.GrassColors;
import net.minecraft.world.ILightReader;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.model.ModelLoader;

@OnlyIn(Dist.CLIENT)
class ModBlockColors  {

    public static void registerBlockColourHandlers() {
        BlockColors blockcolors = new BlockColors();
        ItemColors itemcolors = new ItemColors();

        Minecraft.getInstance().getBlockColors().register((p_228061_0_, p_228061_1_, p_228061_2_, p_228061_3_) -> {
                    return p_228061_1_ != null && p_228061_2_ != null ? BiomeColors.getFoliageColor(p_228061_1_, p_228061_2_) : FoliageColors.getDefault();
                }, BlockInit.falling_oak_leaves

        );
        Minecraft.getInstance().getBlockColors().register((p_228063_0_, p_228063_1_, p_228063_2_, p_228063_3_) -> {
                    return FoliageColors.getSpruce();
                }, BlockInit.falling_spruce_leaves

        );
        Minecraft.getInstance().getBlockColors().register((p_228063_0_, p_228063_1_, p_228063_2_, p_228063_3_) -> {
                    return FoliageColors.getBirch();
                }, BlockInit.falling_birch_leaves

        );
        Minecraft.getInstance().getBlockColors().register((p_228064_0_, p_228064_1_, p_228064_2_, p_228064_3_) -> {
                    return p_228064_1_ != null && p_228064_2_ != null ? BiomeColors.getGrassColor(p_228064_1_, p_228064_2_) : GrassColors.get(0.5D, 1.0D);
                }, BlockInit.falling_grass_block

        );


//        Minecraft.getInstance().getItemColors().register((p_210235_1_, p_210235_2_) -> {
//            BlockState blockstate = ((BlockItem)p_210235_1_.getItem()).getBlock().getDefaultState();
//            return blockcolors.getColor(blockstate, (ILightReader)null, (BlockPos)null, p_210235_2_);
//        }, BlockInit.falling_oak_leaves);
        /*ModelLoader.defaultModelGetter(Item.getItemFromBlock(BlockInit.falling_oak_leaves),);

        itemcolors.register();*/
    }
}