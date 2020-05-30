package com.mods.BlockGravity.blocks;

import com.mods.BlockGravity.BlockGravity;
import net.minecraft.block.Block;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(BlockGravity.MOD_ID)
@Mod.EventBusSubscriber(modid = BlockGravity.MOD_ID,bus = Bus.MOD)
public class BlockInit {
    public static final Block falling_dirt = null;
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event){
        event.getRegistry().register(new FallingBlock(Block.Properties.create(Material.SAND).hardnessAndResistance(0.5f,15.0f).sound(SoundType.SAND)).setRegistryName("falling_dirt"));

    }





    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event){
        event.getRegistry().register(new BlockItem(falling_dirt,new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(16)).setRegistryName("falling_dirt"));

    }
}
