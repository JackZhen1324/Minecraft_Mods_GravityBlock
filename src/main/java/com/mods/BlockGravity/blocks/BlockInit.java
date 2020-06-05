package com.mods.BlockGravity.blocks;

import com.mods.BlockGravity.BlockGravity;
import net.minecraft.block.*;
import net.minecraft.block.Blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

import java.util.HashMap;
import java.util.Map;

@ObjectHolder(BlockGravity.MOD_ID)
@Mod.EventBusSubscriber(modid = BlockGravity.MOD_ID,bus = Bus.MOD)
public class BlockInit {



    //Common
    public static final Block falling_dirt = null;
    public static final Block falling_stone = null;
    public static final Block falling_granite = null;
    public static final Block falling_cobblestone = null;
    public static final Block falling_gravel = null;


    //planks
    public static final Block falling_oak_planks = null;
    public static final Block falling_spruce_planks = null;
    public static final Block falling_birch_planks = null;
    public static final Block falling_jungle_planks = null;
    public static final Block falling_acacia_planks = null;
    public static final Block falling_dark_oak_planks = null;




    //ore
    public static final Block falling_iron_ore = null;
    public static final Block falling_coal_ore = null;
    public static final Block falling_gold_ore = null;

    //log
    public static final Block falling_oak_log = null;
    public static final Block falling_spruce_log = null;
    public static final Block falling_birch_log = null;
    public static final Block falling_jungle_log = null;
    public static final Block falling_acacia_log = null;
    public static final Block falling_dark_oak_log = null;
    public static final Block falling_stripped_oak_log = null;

    public static final Block falling_stripped_spruce_log = null;
    public static final Block falling_stripped_birch_log = null;
    public static final Block falling_stripped_jungle_log = null;
    public static final Block falling_stripped_acacia_log = null;
    public static final Block falling_stripped_dark_oak_log = null;


    //leaves
    public static final Block falling_oak_leaves = null;
    public static final Block falling_spruce_leaves = null;
    public static final Block falling_birch_leaves = null;
    public static final Block falling_jungle_leaves = null;
    public static final Block falling_acacia_leaves = null;
    public static final Block falling_dark_oak_leaves = null;

    //grass
    public static final Block falling_grass_block = null;

    //stairs
    public static final Block falling_stone_stairs = null;
    public static final Block falling_stone_brick_stairs = null;
    public static final Block falling_sandstone_stairs = null;
    public static final Block falling_oak_stairs = null;
    public static final Block falling_spruce_stairs = null;
    public static final Block falling_birch_stairs = null;
    public static final Block falling_jungle_stairs = null;
    public static final Block falling_acacia_stairs = null;
    public static final Block falling_cobblestone_stairs = null;
    public static final Block falling_prismarine_stairs = null;
    public static final Block falling_nether_brick_stairs = null;
    public static final Block falling_quartz_stairs = null;
    public static final Block falling_dark_oak_stairs = null;
    public static final Block falling_granite_stairs = null;
    public static final Block falling_andesite_stairs = null;

    //slab
    public static final Block falling_oak_slab = null;
    public static final Block falling_spruce_slab = null;
    public static final Block falling_birch_slab = null;
    public static final Block falling_jungle_slab = null;
    public static final Block falling_acacia_slab = null;
    public static final Block falling_dark_oak_slab = null;
    public static final Block falling_cobblestone_slab = null;
    public static final Block falling_stone_slab = null;
    public static final Block falling_brick_slab = null;
    public static final Block falling_stone_brick_slab = null;
    public static final Block falling_sandstone_slab = null;











    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event){

        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.SAND).hardnessAndResistance(0.5f,1.0f).sound(SoundType.GROUND)).setRegistryName("falling_dirt"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f,1.0f).sound(SoundType.GROUND)).setRegistryName("falling_stone"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f,1.0f).sound(SoundType.GROUND)).setRegistryName("falling_granite"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f,1.0f).sound(SoundType.GROUND)).setRegistryName("falling_cobblestone"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.6f,1.0f).sound(SoundType.GROUND)).setRegistryName("falling_gravel"));
        //plank
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,3.0f).sound(SoundType.WOOD)).setRegistryName("falling_oak_planks"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_spruce_planks"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_birch_planks"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_jungle_planks"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_acacia_planks"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_dark_oak_planks"));

        //ore
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f,1.0f).sound(SoundType.GROUND)).setRegistryName("falling_gold_ore"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f,1.0f).sound(SoundType.GROUND)).setRegistryName("falling_iron_ore"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f,1.0f).sound(SoundType.GROUND)).setRegistryName("falling_coal_ore"));

        //log
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_oak_log"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_spruce_log"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_birch_log"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_jungle_log"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_acacia_log"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_dark_oak_log"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_stripped_oak_log"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_stripped_spruce_log"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_stripped_birch_log"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_stripped_jungle_log"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_stripped_acacia_log"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(2.0f).sound(SoundType.PLANT)).setRegistryName("falling_stripped_dark_oak_log"));



        //leaves
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.LEAVES,MaterialColor.GREEN).hardnessAndResistance(0.5f,1.0f).sound(SoundType.SAND)).setRegistryName("falling_oak_leaves"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.LEAVES,MaterialColor.GREEN).hardnessAndResistance(0.5f,1.0f).sound(SoundType.SAND)).setRegistryName("falling_spruce_leaves"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.LEAVES,MaterialColor.GREEN).hardnessAndResistance(0.5f,1.0f).sound(SoundType.SAND)).setRegistryName("falling_birch_leaves"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.LEAVES,MaterialColor.GREEN).hardnessAndResistance(0.5f,1.0f).sound(SoundType.SAND)).setRegistryName("falling_jungle_leaves"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.LEAVES,MaterialColor.GREEN).hardnessAndResistance(0.5f,1.0f).sound(SoundType.SAND)).setRegistryName("falling_acacia_leaves"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.LEAVES,MaterialColor.GREEN).hardnessAndResistance(0.5f,1.0f).sound(SoundType.SAND)).setRegistryName("falling_dark_oak_leaves"));

        //grass
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT)).setRegistryName("falling_grass_block"));


        //stairs
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_stone_stairs"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_oak_stairs"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_spruce_stairs"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_birch_stairs"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_acacia_stairs"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_jungle_stairs"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_dark_oak_stairs"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.8f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_sandstone_stairs"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_cobblestone_stairs"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_prismarine_stairs"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.5f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_nether_brick_stairs"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_quartz_stairs"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_granite_stairs"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_andesite_stairs"));

        //slab
        /*public static final Block falling_oak_slab = null;
        public static final Block falling_spruce_slab = null;
        public static final Block falling_birch_slab = null;
        public static final Block falling_jungle_slab = null;
        public static final Block falling_acacia_slab = null;
        public static final Block falling_dark_oak_slab = null;

        public static final Block falling_cobblestone_slab = null;
        public static final Block falling_stone_slab = null;
        public static final Block falling_brick_slab = null;
        public static final Block falling_stone_brick_slab = null;
        public static final Block falling_sandstone_slab = null;*/
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_oak_slab"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_spruce_slab"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_birch_slab"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_acacia_slab"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_jungle_slab"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_dark_oak_slab"));

        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_cobblestone_slab"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_brick_slab"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_sandstone_slab"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_stone_brick_slab"));
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5f,1.0f).sound(SoundType.WOOD)).setRegistryName("falling_stone_slab"));









    }





    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event){
        event.getRegistry().register(new BlockItem(falling_dirt,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_dirt"));
        event.getRegistry().register(new BlockItem(falling_stone,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_stone"));
        event.getRegistry().register(new BlockItem(falling_granite,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_granite"));
        event.getRegistry().register(new BlockItem(falling_cobblestone,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_cobblestone"));
        event.getRegistry().register(new BlockItem(falling_gravel,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_gravel"));

        //plank
        event.getRegistry().register(new BlockItem(falling_oak_planks,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_oak_planks"));
        event.getRegistry().register(new BlockItem(falling_spruce_planks,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_spruce_planks"));
        event.getRegistry().register(new BlockItem(falling_birch_planks,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_birch_planks"));
        event.getRegistry().register(new BlockItem(falling_jungle_planks,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_jungle_planks"));
        event.getRegistry().register(new BlockItem(falling_acacia_planks,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_acacia_planks"));
        event.getRegistry().register(new BlockItem(falling_dark_oak_planks,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_dark_oak_planks"));

        //ore
        event.getRegistry().register(new BlockItem(falling_gold_ore,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_gold_ore"));
        event.getRegistry().register(new BlockItem(falling_iron_ore,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_iron_ore"));
        event.getRegistry().register(new BlockItem(falling_coal_ore,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_coal_ore"));

        //log
        event.getRegistry().register(new BlockItem(falling_oak_log,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_oak_log"));
        event.getRegistry().register(new BlockItem(falling_spruce_log,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_spruce_log"));
        event.getRegistry().register(new BlockItem(falling_birch_log,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_birch_log"));
        event.getRegistry().register(new BlockItem(falling_jungle_log,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_jungle_log"));
        event.getRegistry().register(new BlockItem(falling_acacia_log,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_acacia_log"));
        event.getRegistry().register(new BlockItem(falling_dark_oak_log,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_dark_oak_log"));
        event.getRegistry().register(new BlockItem(falling_stripped_oak_log,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_stripped_oak_log"));
        event.getRegistry().register(new BlockItem(falling_stripped_spruce_log,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_stripped_spruce_log"));
        event.getRegistry().register(new BlockItem(falling_stripped_birch_log,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_stripped_birch_log"));
        event.getRegistry().register(new BlockItem(falling_stripped_jungle_log,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_stripped_jungle_log"));
        event.getRegistry().register(new BlockItem(falling_stripped_acacia_log,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_stripped_acacia_log"));
        event.getRegistry().register(new BlockItem(falling_stripped_dark_oak_log,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_stripped_dark_oak_log"));



        //leaves
        event.getRegistry().register(new BlockItem(falling_oak_leaves,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_oak_leaves"));
        event.getRegistry().register(new BlockItem(falling_spruce_leaves,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_spruce_leaves"));
        event.getRegistry().register(new BlockItem(falling_spruce_leaves,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_birch_leaves"));
        event.getRegistry().register(new BlockItem(falling_spruce_leaves,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_jungle_leaves"));
        event.getRegistry().register(new BlockItem(falling_spruce_leaves,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_acacia_leaves"));
        event.getRegistry().register(new BlockItem(falling_spruce_leaves,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_dark_oak_leaves"));

        //grass
        event.getRegistry().register(new BlockItem(falling_grass_block,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_grass_block"));

        //stairs
       /* public static final Block falling_stone_brick_stairs = null;
        public static final Block falling_sandstone_stairs = null;
        public static final Block falling_oak_stairs = null;
        public static final Block falling_spruce_stairs = null;
        public static final Block falling_birch_stairs = null;
        public static final Block falling_jungle_stairs = null;
        public static final Block falling_acacia_stairs = null;
        public static final Block falling_cobblestone_stairs = null;
        public static final Block falling_prismarine_stairs = null;
        public static final Block falling_nether_brick_stairs = null;
        public static final Block falling_quartz_stairs = null;
        public static final Block falling_dark_oak_stairs = null;
        public static final Block falling_granite_stairs = null;
        public static final Block falling_andesite_stairs = null;*/
        event.getRegistry().register(new BlockItem(falling_stone_stairs,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_stone_stairs"));
        event.getRegistry().register(new BlockItem(falling_oak_stairs,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_oak_stairs"));
        event.getRegistry().register(new BlockItem(falling_spruce_stairs,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_spruce_stairs"));
        event.getRegistry().register(new BlockItem(falling_birch_stairs,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_birch_stairs"));
        event.getRegistry().register(new BlockItem(falling_jungle_stairs,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_jungle_stairs"));
        event.getRegistry().register(new BlockItem(falling_acacia_stairs,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_acacia_stairs"));
        event.getRegistry().register(new BlockItem(falling_dark_oak_stairs,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_dark_oak_stairs"));
        event.getRegistry().register(new BlockItem(falling_cobblestone_stairs,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_cobblestone_stairs"));
        event.getRegistry().register(new BlockItem(falling_quartz_stairs,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_quartz_stairs"));
        event.getRegistry().register(new BlockItem(falling_granite_stairs,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_granite_stairs"));
        event.getRegistry().register(new BlockItem(falling_andesite_stairs,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_andesite_stairs"));
        event.getRegistry().register(new BlockItem(falling_prismarine_stairs,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_prismarine_stairs"));
         event.getRegistry().register(new BlockItem(falling_nether_brick_stairs,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_nether_brick_stairs"));
        /*event.getRegistry().register(new BlockItem(falling_stone_brick_stairs,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_stone_brick_stairs"));*/
        event.getRegistry().register(new BlockItem(falling_sandstone_stairs,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_sandstone_stairs"));


        //slab


        event.getRegistry().register(new BlockItem(falling_oak_slab,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_oak_slab"));
        event.getRegistry().register(new BlockItem(falling_spruce_slab,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_spruce_slab"));
        event.getRegistry().register(new BlockItem(falling_birch_slab,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_birch_slab"));
        event.getRegistry().register(new BlockItem(falling_jungle_slab,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_jungle_slab"));
        event.getRegistry().register(new BlockItem(falling_acacia_slab,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_acacia_slab"));
        event.getRegistry().register(new BlockItem(falling_dark_oak_slab,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_dark_oak_slab"));
        event.getRegistry().register(new BlockItem(falling_cobblestone_slab,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_cobblestone_slab"));
        event.getRegistry().register(new BlockItem(falling_stone_slab,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_stone_slab"));
        event.getRegistry().register(new BlockItem(falling_brick_slab,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_brick_slab"));
        event.getRegistry().register(new BlockItem(falling_stone_brick_slab,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_stone_brick_slab"));
        event.getRegistry().register(new BlockItem(falling_sandstone_slab,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_sandstone_slab"));







    }

    public static Block getblock(String blockName){
        Block b = null;

        if (blockName.equals("dirt") == true ){
            b = falling_dirt;
        }
        else if(blockName.equals("stone") == true){
            return falling_stone;

        }
        else if(blockName.equals("granite") == true){
            return falling_granite;

        }
        else if(blockName.equals("cobblestone") == true){
            return falling_cobblestone;

        }
        else if(blockName.equals("gravel") == true){
            return falling_gravel;
        }

        //plank
        else if(blockName.equals("oak_planks") == true){
            return falling_oak_planks;

        }else if(blockName.equals("spruce_planks") == true){
            return falling_spruce_planks;

        }
        else if(blockName.equals("birch_planks") == true){
            return falling_birch_planks;
        }
        else if(blockName.equals("birch_planks") == true){
            return falling_birch_planks;
        }
        else if(blockName.equals("jungle_planks") == true){
            return falling_jungle_planks;
        }
        else if(blockName.equals("acacia_planks") == true){
            return falling_acacia_planks;
        }
        else if(blockName.equals("dark_oak_planks") == true){
            return falling_dark_oak_planks;
        }
        //ore
        else if(blockName.equals("gold_ore") == true){
            return falling_gold_ore;
        }
        else if(blockName.equals("iron_ore") == true){
            return falling_iron_ore;
        }
        else if(blockName.equals("coal_ore") == true){
            return falling_coal_ore;
        }

        //log
        else if(blockName.equals("oak_log") == true){
            return falling_oak_log;
        }
        else if(blockName.equals("spruce_log") == true){
                return falling_spruce_log;
        }
        else if(blockName.equals("birch_log") == true){
            return falling_birch_log;
        }
        else if(blockName.equals("jungle_log") == true){
            return falling_jungle_log;
        }
        else if(blockName.equals("acacia_log") == true){
            return falling_acacia_log;
        }
        else if(blockName.equals("dark_oak_log") == true){
            return falling_dark_oak_log;
        }
        else if(blockName.equals("stripped_oak_log") == true){
            return falling_stripped_oak_log;
        }
        else if(blockName.equals("stripped_spruce_log") == true){
            return falling_stripped_spruce_log;
        }
        else if(blockName.equals("stripped_birch_log") == true){
            return falling_stripped_birch_log;
        }
        else if(blockName.equals("stripped_jungle_log") == true){
            return falling_stripped_jungle_log;
        }
        else if(blockName.equals("stripped_acacia_log") == true){
            return falling_stripped_acacia_log;
        }
        else if(blockName.equals("stripped_dark_oak_log") == true){
            return falling_stripped_dark_oak_log;
        }


        //leaves
        else if(blockName.equals("oak_leaves") == true){
            return falling_oak_leaves;
        }
        else if(blockName.equals("spruce_leaves") == true){
                return falling_spruce_leaves;
        }
        else if(blockName.equals("birch_leaves") == true){
            return falling_birch_leaves;
        }

        else if(blockName.equals("jungle_leaves") == true){
            return falling_jungle_leaves;
        }

        else if(blockName.equals("acacia_leaves") == true){
            return falling_acacia_leaves;
        }
        else if(blockName.equals("dark_oak_leaves") == true){
            return falling_dark_oak_leaves;
        }




        //grass
        else if(blockName.equals("grass_block") == true){
            return falling_grass_block;
        }

        //stairs
      /*  public static final Block falling_stone_brick_stairs = null;
        public static final Block falling_sandstone_stairs = null;
        public static final Block falling_oak_stairs = null;
        public static final Block falling_spruce_stairs = null;
        public static final Block falling_birch_stairs = null;
        public static final Block falling_jungle_stairs = null;
        public static final Block falling_acacia_stairs = null;
        public static final Block falling_cobblestone_stairs = null;
        public static final Block falling_prismarine_stairs = null;
        public static final Block falling_nether_brick_stairs = null;
        public static final Block falling_quartz_stairs = null;
        public static final Block falling_dark_oak_stairs = null;
        public static final Block falling_granite_stairs = null;
        public static final Block falling_andesite_stairs = null;*/
        else if(blockName.equals("stone_stairs") == true){
            return falling_stone_stairs;
        }


        else if(blockName.equals("oak_stairs") == true){
            return falling_oak_stairs;
        }

        else if(blockName.equals("spruce_stairs") == true){
            return falling_spruce_stairs;
        }

        else if(blockName.equals("birch_stairs") == true){
            return falling_birch_stairs;
        }

        else if(blockName.equals("jungle_stairs") == true){
            return falling_jungle_stairs;
        }

        else if(blockName.equals("acacia_stairs") == true){
            return falling_acacia_stairs;
        }

        else if(blockName.equals("dark_oak_stairs") == true){
            return falling_dark_oak_stairs;
        }



        else if(blockName.equals("cobblestone_stairs") == true){
            return falling_cobblestone_stairs;
        }
          else if(blockName.equals("quartz_stairs") == true){
            return falling_quartz_stairs;
        }

        else if(blockName.equals("granite_stairs") == true){
            return falling_granite_stairs;
        }
        else if(blockName.equals("andesite_stairs") == true){
            return falling_andesite_stairs;
        }
         /*event.getRegistry().register(new BlockItem(falling_prismarine_stairs,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_prismarine_stairs"));
         event.getRegistry().register(new BlockItem(falling_nether_brick_stairs,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_nether_brick_stairs"));
        event.getRegistry().register(new BlockItem(falling_stone_brick_stairs,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_stone_brick_stairs"));
        event.getRegistry().register(new BlockItem(falling_sandstone_stairs,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_sandstone_stairs"));*/



        else if(blockName.equals("prismarine_stairs") == true){
            return falling_prismarine_stairs;
        }
        else if(blockName.equals("nether_brick_stairs") == true){
            return falling_nether_brick_stairs;
        }


         else if(blockName.equals("stone_brick_stairs") == true) {
            return falling_stone_brick_stairs;

        }

        else if(blockName.equals("sandstone_stairs") == true){
            return falling_sandstone_stairs;


        }







        //slab
       /* public static final Block falling_oak_slab = null;
        public static final Block falling_spruce_slab = null;
        public static final Block falling_birch_slab = null;
        public static final Block falling_jungle_slab = null;
        public static final Block falling_acacia_slab = null;
        public static final Block falling_dark_oak_slab = null;
        public static final Block falling_cobblestone_slab = null;
        public static final Block falling_stone_slab = null;
        public static final Block falling_brick_slab = null;
        public static final Block falling_stone_brick_slab = null;
        public static final Block falling_sandstone_slab = null;*/
        else if(blockName.equals("oak_slab") == true){
            return falling_oak_slab;
        }
        else if(blockName.equals("birch_slab") == true){
            return falling_birch_slab;
        }
        else if(blockName.equals("spruce_slab") == true){
            return falling_spruce_slab;
        }
        else if(blockName.equals("jungle_slab") == true){
            return falling_jungle_slab;
        }
        else if(blockName.equals("acacia_slab") == true){
            return falling_acacia_slab;
        }
        else if(blockName.equals("dark_oak_slab") == true){
            return falling_dark_oak_slab;
        }
        else if(blockName.equals("cobblestone_slab") == true){
            return falling_cobblestone_slab;
        }
        else if(blockName.equals("stone_brick_slab") == true){
            return falling_stone_brick_slab;
        }
        else if(blockName.equals("stone_slab") == true){
            return falling_stone_slab;
        }

        else if(blockName.equals("sandstone_slab") == true){
            return falling_sandstone_slab;
        }


        else{
           /* System.out.println("block does not support falling!!!!");*/
            b = null;
        }
        return b;


    }


}
