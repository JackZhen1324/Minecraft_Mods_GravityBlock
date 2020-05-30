package com.mods.BlockGravity.events;
import com.mods.BlockGravity.BlockGravity;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import com.mods.BlockGravity.blocks.BlockInit;

import net.minecraft.world.World;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;

@Mod.EventBusSubscriber(modid = BlockGravity.MOD_ID,bus = Bus.FORGE)
class TestJUmpEvent{




    @SubscribeEvent

    public static void testBreak(BreakEvent event){

        System.out.println("break!!!!!!!!!!!!!");
        String x = event.getState().getBlock().toString();
        System.out.println(x);
        System.out.println(x.indexOf("snow"));
        LivingEntity liviingEntity  = event.getPlayer();
        World world = liviingEntity.getEntityWorld();
        String westBlock = world.getBlockState(event.getPos().add(1,0,0)).getBlock().toString();
        String eastBlock = world.getBlockState(event.getPos().add(0,0,1)).getBlock().toString();
        String northBlock = world.getBlockState(event.getPos().add(-1,0,0)).getBlock().toString();
        String southBlock = world.getBlockState(event.getPos().add(0,0,-1)).getBlock().toString();
        String downBlock = world.getBlockState(event.getPos().add(0,-1,0)).getBlock().toString();
        String upBlock = world.getBlockState(event.getPos().add(0,1,0)).getBlock().toString();
        if (westBlock.indexOf("air")==-1 && westBlock.indexOf("grass")==-1 && westBlock.indexOf("ice")==-1 && westBlock.indexOf("snow")==-1 && westBlock.indexOf("lava")==-1 && westBlock.indexOf("water")==-1){
            world.setBlockState( event.getPos().add(1,0,0),Blocks.SAND.getDefaultState());


        }
        if (eastBlock.indexOf("air")==-1 &&eastBlock.indexOf("grass")==-1&& eastBlock.indexOf("ice")==-1 && eastBlock.indexOf("snow")==-1 && eastBlock.indexOf("lava")==-1 && eastBlock.indexOf("water")==-1) {
            world.setBlockState( event.getPos().add(0,0,1),Blocks.SAND.getDefaultState());

        }
        if (northBlock.indexOf("air")==-1&& northBlock.indexOf("grass")==-1&& northBlock.indexOf("ice")==-1 && northBlock.indexOf("snow")==-1 && northBlock.indexOf("lava")==-1 && northBlock.indexOf("water")==-1) {
            world.setBlockState( event.getPos().add(-1,0,0),Blocks.SAND.getDefaultState());
        }
        if (southBlock.indexOf("air")==-1&& southBlock.indexOf("grass")==-1 && southBlock.indexOf("ice")==-1 && southBlock.indexOf("snow")==-1 && southBlock.indexOf("lava")==-1 && southBlock.indexOf("water")==-1 ) {
            world.setBlockState( event.getPos().add(0,0,-1),Blocks.SAND.getDefaultState());
        }
        if (downBlock.indexOf("air")==-1 && downBlock.indexOf("grass")==-1&& downBlock.indexOf("ice")==-1 && downBlock.indexOf("snow")==-1 && downBlock.indexOf("lava")==-1&& downBlock.indexOf("water")==-1) {
            world.setBlockState( event.getPos().add(0,-1,0),Blocks.SAND.getDefaultState());

        }
        if (upBlock.indexOf("air")==-1 && upBlock.indexOf("grass")==-1 && upBlock.indexOf("ice")==-1 && upBlock.indexOf("snow")==-1 && upBlock.indexOf("lava")==-1&& upBlock.indexOf("water")==-1) {
            world.setBlockState( event.getPos().add(0,1,0),Blocks.SAND.getDefaultState());
        }

    }







    }
