package com.mods.BlockGravity.events;

import com.mods.BlockGravity.BlockGravity;
import com.mods.BlockGravity.blocks.BlockInit;
import com.mods.BlockGravity.util.blockConfig;
import com.mods.BlockGravity.util.blockNameProcessing;
import com.mods.BlockGravity.util.blockNeighborCal;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.world.ExplosionEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.util.math.BlockPos;
import com.mods.Blockexplosion.util.explosionConfig;
import com.mods.BlockGravity.util.explosionCal;


@Mod.EventBusSubscriber(modid = BlockGravity.MOD_ID,bus = Mod.EventBusSubscriber.Bus.FORGE)
public class explosionEvent {

    public static  void explosionHandler(AttackEntityEvent event){
        event.getTarget().getEntity().getPosition();
    }

    @SubscribeEvent
    public static  void explosionHandler(ExplosionEvent event){
        int init = 0;
        int range = explosionConfig.getRange();

        int initOffset[] = {0,0,0};
        
        World world = event.getWorld();
                event.getExplosion().getPosition();

        BlockPos northExplosion = new BlockPos(event.getExplosion().getPosition().add(explosionCal.getNorth()[0],explosionCal.getNorth()[1],explosionCal.getNorth()[2]));
        BlockPos southExplosion = new BlockPos(event.getExplosion().getPosition().add(explosionCal.getSouth()[0],explosionCal.getSouth()[1],explosionCal.getSouth()[2]));
        BlockPos eastExplosion = new BlockPos(event.getExplosion().getPosition().add(explosionCal.getEast()[0],explosionCal.getEast()[1],explosionCal.getEast()[2]));
        BlockPos westExplosion = new BlockPos(event.getExplosion().getPosition().add(explosionCal.getWest()[0],explosionCal.getWest()[1],explosionCal.getWest()[2]));
        BlockPos upExplosion = new BlockPos(event.getExplosion().getPosition().add(explosionCal.getUp()[0],explosionCal.getUp()[1],explosionCal.getUp()[2]));
        BlockPos downExplosion = new BlockPos(event.getExplosion().getPosition().add(explosionCal.getDown()[0],explosionCal.getDown()[1],explosionCal.getDown()[2]));

        BlockPos topRightFrontExplosion = new BlockPos(event.getExplosion().getPosition().add(explosionCal.getDown()[0],explosionCal.getDown()[1],explosionCal.getDown()[2]));
        BlockPos topLeftFrontExplosion = new BlockPos(event.getExplosion().getPosition().add(explosionCal.getDown()[0],explosionCal.getDown()[1],explosionCal.getDown()[2]));
        BlockPos topRightBottomExplosion = new BlockPos(event.getExplosion().getPosition().add(explosionCal.getDown()[0],explosionCal.getDown()[1],explosionCal.getDown()[2]));
        BlockPos topLeftBottomExplosion = new BlockPos(event.getExplosion().getPosition().add(explosionCal.getDown()[0],explosionCal.getDown()[1],explosionCal.getDown()[2]));
        BlockPos BottomRightFrontExplosion = new BlockPos(event.getExplosion().getPosition().add(explosionCal.getDown()[0],explosionCal.getDown()[1],explosionCal.getDown()[2]));
        BlockPos BottomLeftFrontExplosion = new BlockPos(event.getExplosion().getPosition().add(explosionCal.getDown()[0],explosionCal.getDown()[1],explosionCal.getDown()[2]));
        BlockPos BottomRightBackExplosion = new BlockPos(event.getExplosion().getPosition().add(explosionCal.getDown()[0],explosionCal.getDown()[1],explosionCal.getDown()[2]));
        BlockPos BottomLeftBackExplosion = new BlockPos(event.getExplosion().getPosition().add(explosionCal.getDown()[0],explosionCal.getDown()[1],explosionCal.getDown()[2]));

                
        curBlcokBreak(northExplosion,world,initOffset,init,range,"origin" );
        curBlcokBreak(southExplosion,world,initOffset,init,range,"origin" );
        curBlcokBreak(eastExplosion,world,initOffset,init,range,"origin" );
        curBlcokBreak(westExplosion,world,initOffset,init,range,"origin" );
        curBlcokBreak(upExplosion,world,initOffset,init,range,"origin" );
        curBlcokBreak(downExplosion,world,initOffset,init,range,"origin" );

        curBlcokBreak(topRightFrontExplosion,world,initOffset,init,range,"origin" );
        curBlcokBreak(topLeftFrontExplosion,world,initOffset,init,range,"origin" );
        curBlcokBreak(topRightBottomExplosion,world,initOffset,init,range,"origin" );
        curBlcokBreak(topLeftBottomExplosion,world,initOffset,init,range,"origin" );
        curBlcokBreak(BottomRightFrontExplosion,world,initOffset,init,range,"origin" );
        curBlcokBreak(BottomLeftFrontExplosion,world,initOffset,init,range,"origin" );
        curBlcokBreak(BottomRightBackExplosion,world,initOffset,init,range,"origin" );
        curBlcokBreak(BottomLeftBackExplosion,world,initOffset,init,range,"origin" );



    }

    public static  void curBlcokBreak( BlockPos event, World world, int[] loc, int init, int range, String dic){



        String westBlock = world.getBlockState(event.add(blockNeighborCal.calWest(loc)[0], blockNeighborCal.calWest(loc)[1], blockNeighborCal.calWest(loc)[2])).getBlock().toString();
        String eastBlock = world.getBlockState(event.add(blockNeighborCal.calEast(loc)[0], blockNeighborCal.calEast(loc)[1], blockNeighborCal.calEast(loc)[2])).getBlock().toString();


        String northBlock = world.getBlockState(event.add(blockNeighborCal.calNorth(loc)[0], blockNeighborCal.calNorth(loc)[1], blockNeighborCal.calNorth(loc)[2])).getBlock().toString();
        String southBlock = world.getBlockState(event.add(blockNeighborCal.calSouth(loc)[0], blockNeighborCal.calSouth(loc)[1], blockNeighborCal.calSouth(loc)[2])).getBlock().toString();
        String downBlock = world.getBlockState(event.add(blockNeighborCal.calDown(loc)[0], blockNeighborCal.calDown(loc)[1], blockNeighborCal.calDown(loc)[2])).getBlock().toString();
        String upBlock = world.getBlockState(event.add(blockNeighborCal.calUp(loc)[0], blockNeighborCal.calUp(loc)[1], blockNeighborCal.calUp(loc)[2])).getBlock().toString();
        if (init < range) {
            curBlcokBreak(event, world, blockNeighborCal.calWest(loc), init + 1, range, "west");
            curBlcokBreak(event, world, blockNeighborCal.calEast(loc), init + 1, range,"east");
            curBlcokBreak(event, world, blockNeighborCal.calSouth(loc), init + 1, range,"South");
            curBlcokBreak(event, world, blockNeighborCal.calNorth(loc), init + 1, range,"North");
            curBlcokBreak(event, world, blockNeighborCal.calUp(loc), init + 1, range,"UP");
            curBlcokBreak(event, world, blockNeighborCal.calDown(loc), init + 1, range,"down");

        }

        /*System.out.println(westBlock);*/

        westBlock = blockNameProcessing.GetBlockName(westBlock);
        eastBlock = blockNameProcessing.GetBlockName(eastBlock);
        northBlock = blockNameProcessing.GetBlockName(northBlock);
        southBlock = blockNameProcessing.GetBlockName(southBlock);
        downBlock = blockNameProcessing.GetBlockName(downBlock);
        upBlock = blockNameProcessing.GetBlockName(upBlock);

           /* System.out.println(westBlock);
            System.out.println("##################");
            System.out.println("westBlock: " + westBlock);

            System.out.println(BlockInit.getblock(westBlock));*/
        if (BlockInit.getblock(westBlock) != null && westBlock != "air" && blockConfig.getIsGravityOn() == true) {
            if(blockConfig.getRealisticLevel()==1){
                world.setBlockState(event.add(blockNeighborCal.calWest(loc)[0], blockNeighborCal.calWest(loc)[1], blockNeighborCal.calWest(loc)[2]), BlockInit.getblock(westBlock).getDefaultState());
            }
            else{
                String curWestBlock = world.getBlockState(event.add(blockNeighborCal.calWest(blockNeighborCal.getWest())[0], blockNeighborCal.calWest(blockNeighborCal.getWest())[1], blockNeighborCal.calWest(blockNeighborCal.getWest())[2])).getBlock().toString();
                String curEastBlock = "air"/*world.getBlockState(event.add(blockNeighborCal.calWest(blockNeighborCal.getEast())[0],blockNeighborCal.calWest(blockNeighborCal.getEast())[1],blockNeighborCal.calWest(blockNeighborCal.getEast())[2])).getBlock().toString()*/;
                String curNorthBlock = world.getBlockState(event.add(blockNeighborCal.calWest(blockNeighborCal.getNorth())[0], blockNeighborCal.calWest(blockNeighborCal.getNorth())[1], blockNeighborCal.calWest(blockNeighborCal.getNorth())[2])).getBlock().toString();
                String curSouthBlock = world.getBlockState(event.add(blockNeighborCal.calWest(blockNeighborCal.getSouth())[0], blockNeighborCal.calWest(blockNeighborCal.getSouth())[1], blockNeighborCal.calWest(blockNeighborCal.getSouth())[2])).getBlock().toString();
                String curDownBlock = world.getBlockState(event.add(blockNeighborCal.calWest(blockNeighborCal.getDown())[0], blockNeighborCal.calWest(blockNeighborCal.getDown())[1], blockNeighborCal.calWest(blockNeighborCal.getDown())[2])).getBlock().toString();
                String curUpBlock = world.getBlockState(event.add(blockNeighborCal.calWest(blockNeighborCal.getUp())[0], blockNeighborCal.calWest(blockNeighborCal.getUp())[1], blockNeighborCal.calWest(blockNeighborCal.getUp())[2])).getBlock().toString();
                String[] supports = {curWestBlock, curEastBlock, curNorthBlock, curSouthBlock, curUpBlock};
                int supportCount = 0;

                for (int i = 0; i < supports.length; i++) {
                    if (supports[i].indexOf("air") == -1) {
                        supportCount += 1;
                    }

                }


               /* System.out.println("##################");
                System.out.println(BlockInit.getblock(westBlock));
                System.out.println("##################");
                System.out.println("westBlock curDownBlock: " + curDownBlock + " SUPPORTCOUNT: " + supportCount);*/

                if (supportCount < 2) {
                    world.setBlockState(event.add(blockNeighborCal.calWest(loc)[0], blockNeighborCal.calWest(loc)[1], blockNeighborCal.calWest(loc)[2]), BlockInit.getblock(westBlock).getDefaultState());

                }}


        }
       /* System.out.println("##################");
        System.out.println("eastBlock: "+eastBlock);
        System.out.println(BlockInit.getblock(eastBlock));
        System.out.println(eastBlock.indexOf("air"));
        System.out.println(eastBlock.indexOf("grass"));
        System.out.println(eastBlock.indexOf("ice"));
        System.out.println(eastBlock.indexOf("snow"));
        System.out.println(eastBlock.indexOf("lava"));
        System.out.println(eastBlock.indexOf("lava"));
        System.out.println(eastBlock.indexOf("water"));*/
        if (BlockInit.getblock(eastBlock) != null && eastBlock != "air" && blockConfig.getIsGravityOn() == true) {
                /*System.out.println("##################");
                System.out.println(BlockInit.getblock(eastBlock));
                System.out.println("##################");*/
        /*    String westBlock = world.getBlockState(event.add(1,0,0)).getBlock().toString();
            String eastBlock = world.getBlockState(event.add(0,0,1)).getBlock().toString();
            String northBlock = world.getBlockState(event.add(-1,0,0)).getBlock().toString();
            String southBlock = world.getBlockState(event.add(0,0,-1)).getBlock().toString();
            String downBlock = world.getBlockState(event.add(0,-1,0)).getBlock().toString();
            String upBlock = world.getBlockState(event.add(0,1,0)).getBlock().toString();*/
            if(blockConfig.getRealisticLevel()==1){
                world.setBlockState(event.add(blockNeighborCal.calEast(loc)[0], blockNeighborCal.calEast(loc)[1], blockNeighborCal.calEast(loc)[2]), BlockInit.getblock(eastBlock).getDefaultState());
            }
            else{
                String curWestBlock = "air"/*world.getBlockState(event.add(blockNeighborCal.calEast(blockNeighborCal.getWest())[0],blockNeighborCal.calEast(blockNeighborCal.getWest())[1],blockNeighborCal.calEast(blockNeighborCal.getWest())[2])).getBlock().toString()*/;
                String curEastBlock = world.getBlockState(event.add(blockNeighborCal.calEast(blockNeighborCal.getEast())[0], blockNeighborCal.calEast(blockNeighborCal.getEast())[1], blockNeighborCal.calEast(blockNeighborCal.getEast())[2])).getBlock().toString();
                String curNorthBlock = world.getBlockState(event.add(blockNeighborCal.calEast(blockNeighborCal.getNorth())[0], blockNeighborCal.calEast(blockNeighborCal.getNorth())[1], blockNeighborCal.calEast(blockNeighborCal.getNorth())[2])).getBlock().toString();
                String curSouthBlock = world.getBlockState(event.add(blockNeighborCal.calEast(blockNeighborCal.getSouth())[0], blockNeighborCal.calEast(blockNeighborCal.getSouth())[1], blockNeighborCal.calEast(blockNeighborCal.getSouth())[2])).getBlock().toString();
                String curDownBlock = world.getBlockState(event.add(blockNeighborCal.calEast(blockNeighborCal.getDown())[0], blockNeighborCal.calEast(blockNeighborCal.getDown())[1], blockNeighborCal.calEast(blockNeighborCal.getDown())[2])).getBlock().toString();
                String curUpBlock = world.getBlockState(event.add(blockNeighborCal.calEast(blockNeighborCal.getUp())[0], blockNeighborCal.calEast(blockNeighborCal.getUp())[1], blockNeighborCal.calEast(blockNeighborCal.getUp())[2])).getBlock().toString();
                String[] supports = {curWestBlock, curEastBlock, curNorthBlock, curSouthBlock, curUpBlock};
                int supportCount = 0;
                /*System.out.println("eastBlock curDownBlock: " + curDownBlock + " SUPPORTCOUNT: " + supportCount);*/
                for (int i = 0; i < supports.length; i++) {
                    if (supports[i].indexOf("air") == -1) {
                        supportCount += 1;
                    }

                }


                if (supportCount < 2) {
                    world.setBlockState(event.add(blockNeighborCal.calEast(loc)[0], blockNeighborCal.calEast(loc)[1], blockNeighborCal.calEast(loc)[2]), BlockInit.getblock(eastBlock).getDefaultState());
                }}

        }


        if (BlockInit.getblock(northBlock) != null && northBlock != "air" && blockConfig.getIsGravityOn() == true) {
               /* System.out.println("##################");
                System.out.println(BlockInit.getblock(northBlock));
                System.out.println("##################");
*/
             /*    String westBlock = world.getBlockState(event.add(1,0,0)).getBlock().toString();
            String eastBlock = world.getBlockState(event.add(0,0,1)).getBlock().toString();
            String northBlock = world.getBlockState(event.add(-1,0,0)).getBlock().toString();
            String southBlock = world.getBlockState(event.add(0,0,-1)).getBlock().toString();
            String downBlock = world.getBlockState(event.add(0,-1,0)).getBlock().toString();
            String upBlock = world.getBlockState(event.add(0,1,0)).getBlock().toString();*/
            if(blockConfig.getRealisticLevel()==1){
                world.setBlockState(event.add(blockNeighborCal.calNorth(loc)[0], blockNeighborCal.calNorth(loc)[1], blockNeighborCal.calNorth(loc)[2]), BlockInit.getblock(northBlock).getDefaultState());
            }
            else{
                String curWestBlock = world.getBlockState(event.add(blockNeighborCal.calNorth(blockNeighborCal.getWest())[0], blockNeighborCal.calNorth(blockNeighborCal.getWest())[1], blockNeighborCal.calNorth(blockNeighborCal.getWest())[2])).getBlock().toString();
                String curEastBlock = world.getBlockState(event.add(blockNeighborCal.calNorth(blockNeighborCal.getEast())[0], blockNeighborCal.calNorth(blockNeighborCal.getEast())[1], blockNeighborCal.calNorth(blockNeighborCal.getEast())[2])).getBlock().toString();
                String curNorthBlock = world.getBlockState(event.add(blockNeighborCal.calNorth(blockNeighborCal.getNorth())[0], blockNeighborCal.calNorth(blockNeighborCal.getNorth())[1], blockNeighborCal.calNorth(blockNeighborCal.getNorth())[2])).getBlock().toString();
                String curSouthBlock = "air"/*world.getBlockState(event.add(blockNeighborCal.calNorth(blockNeighborCal.getSouth())[0],blockNeighborCal.calNorth(blockNeighborCal.getSouth())[1],blockNeighborCal.calNorth(blockNeighborCal.getSouth())[2])).getBlock().toString()*/;
                String curDownBlock = world.getBlockState(event.add(blockNeighborCal.calNorth(blockNeighborCal.getDown())[0], blockNeighborCal.calNorth(blockNeighborCal.getDown())[1], blockNeighborCal.calNorth(blockNeighborCal.getDown())[2])).getBlock().toString();
                String curUpBlock = world.getBlockState(event.add(blockNeighborCal.calNorth(blockNeighborCal.getUp())[0], blockNeighborCal.calNorth(blockNeighborCal.getUp())[1], blockNeighborCal.calNorth(blockNeighborCal.getUp())[2])).getBlock().toString();

                String[] supports = {curWestBlock, curEastBlock, curNorthBlock, curSouthBlock, curUpBlock};
                int supportCount = 0;

                for (int i = 0; i < supports.length; i++) {
                    if (supports[i].indexOf("air") == -1) {
                        supportCount += 1;
                    }

                }
                /* System.out.println("northBlock curDownBlock: " + curDownBlock + " SUPPORTCOUNT: " + supportCount);*/
                if (supportCount < 2) {
                    world.setBlockState(event.add(blockNeighborCal.calNorth(loc)[0], blockNeighborCal.calNorth(loc)[1], blockNeighborCal.calNorth(loc)[2]), BlockInit.getblock(northBlock).getDefaultState());
                }}
        }

        if (BlockInit.getblock(southBlock) != null && southBlock != "air" && blockConfig.getIsGravityOn() == true) {

         /*    String westBlock = world.getBlockState(event.add(1,0,0)).getBlock().toString();
            String eastBlock = world.getBlockState(event.add(0,0,1)).getBlock().toString();
            String northBlock = world.getBlockState(event.add(-1,0,0)).getBlock().toString();
            String southBlock = world.getBlockState(event.add(0,0,-1)).getBlock().toString();
            String downBlock = world.getBlockState(event.add(0,-1,0)).getBlock().toString();
            String upBlock = world.getBlockState(event.add(0,1,0)).getBlock().toString();*/
            if(blockConfig.getRealisticLevel()==1){
                world.setBlockState(event.add(blockNeighborCal.calSouth(loc)[0], blockNeighborCal.calSouth(loc)[1], blockNeighborCal.calSouth(loc)[2]), BlockInit.getblock(southBlock).getDefaultState());
            }
            else {
                String curWestBlock = world.getBlockState(event.add(blockNeighborCal.calSouth(blockNeighborCal.getWest())[0], blockNeighborCal.calSouth(blockNeighborCal.getWest())[1], blockNeighborCal.calSouth(blockNeighborCal.getWest())[2])).getBlock().toString();
                String curEastBlock = world.getBlockState(event.add(blockNeighborCal.calSouth(blockNeighborCal.getEast())[0], blockNeighborCal.calSouth(blockNeighborCal.getEast())[1], blockNeighborCal.calSouth(blockNeighborCal.getEast())[2])).getBlock().toString();
                String curNorthBlock = "air"/*world.getBlockState(event.add(blockNeighborCal.calSouth(blockNeighborCal.getNorth())[0],blockNeighborCal.calSouth(blockNeighborCal.getNorth())[1],blockNeighborCal.calSouth(blockNeighborCal.getNorth())[2])).getBlock().toString()*/;
                String curSouthBlock = world.getBlockState(event.add(blockNeighborCal.calSouth(blockNeighborCal.getSouth())[0], blockNeighborCal.calSouth(blockNeighborCal.getSouth())[1], blockNeighborCal.calSouth(blockNeighborCal.getSouth())[2])).getBlock().toString();
                String curDownBlock = world.getBlockState(event.add(blockNeighborCal.calSouth(blockNeighborCal.getDown())[0], blockNeighborCal.calSouth(blockNeighborCal.getDown())[1], blockNeighborCal.calSouth(blockNeighborCal.getDown())[2])).getBlock().toString();
                String curUpBlock = world.getBlockState(event.add(blockNeighborCal.calSouth(blockNeighborCal.getUp())[0], blockNeighborCal.calSouth(blockNeighborCal.getUp())[1], blockNeighborCal.calSouth(blockNeighborCal.getUp())[2])).getBlock().toString();

                String[] supports = {curWestBlock, curEastBlock, curNorthBlock, curSouthBlock, curUpBlock};
                int supportCount = 0;
                for (int i = 0; i < supports.length; i++) {
                    if (supports[i].indexOf("air") == -1) {
                        supportCount += 1;
                    }

                }
                /*System.out.println("south curDownBlock: " + curDownBlock + " SUPPORTCOUNT: " + supportCount);*/
                if (supportCount < 2) {
                    world.setBlockState(event.add(blockNeighborCal.calSouth(loc)[0], blockNeighborCal.calSouth(loc)[1], blockNeighborCal.calSouth(loc)[2]), BlockInit.getblock(southBlock).getDefaultState());
                }
            }
        }

        if (BlockInit.getblock(downBlock) != null && downBlock != "air" && blockConfig.getIsGravityOn() == true) {

                /*    String westBlock = world.getBlockState(event.add(1,0,0)).getBlock().toString();
            String eastBlock = world.getBlockState(event.add(0,0,1)).getBlock().toString();
            String northBlock = world.getBlockState(event.add(-1,0,0)).getBlock().toString();
            String southBlock = world.getBlockState(event.add(0,0,-1)).getBlock().toString();
            String downBlock = world.getBlockState(event.add(0,-1,0)).getBlock().toString();
            String upBlock = world.getBlockState(event.add(0,1,0)).getBlock().toString();*/
            if(blockConfig.getRealisticLevel()==1){
                world.setBlockState(event.add(blockNeighborCal.calDown(loc)[0], blockNeighborCal.calDown(loc)[1], blockNeighborCal.calDown(loc)[2]), BlockInit.getblock(downBlock).getDefaultState());
            }
            else {
                String curWestBlock = world.getBlockState(event.add(blockNeighborCal.calDown(blockNeighborCal.getWest())[0], blockNeighborCal.calDown(blockNeighborCal.getWest())[1], blockNeighborCal.calDown(blockNeighborCal.getWest())[2])).getBlock().toString();
                String curEastBlock = world.getBlockState(event.add(blockNeighborCal.calDown(blockNeighborCal.getEast())[0], blockNeighborCal.calDown(blockNeighborCal.getEast())[1], blockNeighborCal.calDown(blockNeighborCal.getEast())[2])).getBlock().toString();
                String curNorthBlock = world.getBlockState(event.add(blockNeighborCal.calDown(blockNeighborCal.getNorth())[0], blockNeighborCal.calDown(blockNeighborCal.getNorth())[1], blockNeighborCal.calDown(blockNeighborCal.getNorth())[2])).getBlock().toString();
                String curSouthBlock = world.getBlockState(event.add(blockNeighborCal.calDown(blockNeighborCal.getSouth())[0], blockNeighborCal.calDown(blockNeighborCal.getSouth())[1], blockNeighborCal.calDown(blockNeighborCal.getSouth())[2])).getBlock().toString();
                String curDownBlock = world.getBlockState(event.add(blockNeighborCal.calDown(blockNeighborCal.getDown())[0], blockNeighborCal.calDown(blockNeighborCal.getDown())[1], blockNeighborCal.calDown(blockNeighborCal.getDown())[2])).getBlock().toString();
                String curUpBlock = "air"/*world.getBlockState(event.add(blockNeighborCal.calDown(blockNeighborCal.getUp())[0],blockNeighborCal.calDown(blockNeighborCal.getUp())[1],blockNeighborCal.calDown(blockNeighborCal.getUp())[2])).getBlock().toString()*/;

                String[] supports = {curWestBlock, curEastBlock, curNorthBlock, curSouthBlock, curUpBlock};
                int supportCount = 0;
                for (int i = 0; i < supports.length; i++) {
                    if (supports[i].indexOf("air") == -1) {
                        supportCount += 1;
                    }

                }

                /*  System.out.println("downblock curDownBlock: " + curDownBlock + " SUPPORTCOUNT: " + supportCount);*/
                if (supportCount < 2) {
                    world.setBlockState(event.add(blockNeighborCal.calDown(loc)[0], blockNeighborCal.calDown(loc)[1], blockNeighborCal.calDown(loc)[2]), BlockInit.getblock(downBlock).getDefaultState());
                }}

        }
        /*    System.out.println(upBlock);
            System.out.println("##################");
            System.out.println("westBlock: " + upBlock);*/

        if (BlockInit.getblock(upBlock) != null && upBlock != "air" && blockConfig.getIsGravityOn() == true) {

                   /*    String westBlock = world.getBlockState(event.add(1,0,0)).getBlock().toString();
            String eastBlock = world.getBlockState(event.add(0,0,1)).getBlock().toString();
            String northBlock = world.getBlockState(event.add(-1,0,0)).getBlock().toString();
            String southBlock = world.getBlockState(event.add(0,0,-1)).getBlock().toString();
            String downBlock = world.getBlockState(event.add(0,-1,0)).getBlock().toString();
            String upBlock = world.getBlockState(event.add(0,1,0)).getBlock().toString();*/
            if(blockConfig.getRealisticLevel()==1){
                world.setBlockState(event.add(blockNeighborCal.calUp(loc)[0], blockNeighborCal.calUp(loc)[1], blockNeighborCal.calUp(loc)[2]), BlockInit.getblock(upBlock).getDefaultState());
            }
            else {
                String curWestBlock = world.getBlockState(event.add(blockNeighborCal.calUp(blockNeighborCal.getWest())[0], blockNeighborCal.calUp(blockNeighborCal.getWest())[1], blockNeighborCal.calUp(blockNeighborCal.getWest())[2])).getBlock().toString();
                String curEastBlock = world.getBlockState(event.add(blockNeighborCal.calUp(blockNeighborCal.getEast())[0], blockNeighborCal.calUp(blockNeighborCal.getEast())[1], blockNeighborCal.calUp(blockNeighborCal.getEast())[2])).getBlock().toString();
                String curNorthBlock = world.getBlockState(event.add(blockNeighborCal.calUp(blockNeighborCal.getNorth())[0], blockNeighborCal.calUp(blockNeighborCal.getNorth())[1], blockNeighborCal.calUp(blockNeighborCal.getNorth())[2])).getBlock().toString();
                String curSouthBlock = world.getBlockState(event.add(blockNeighborCal.calUp(blockNeighborCal.getSouth())[0], blockNeighborCal.calUp(blockNeighborCal.getSouth())[1], blockNeighborCal.calUp(blockNeighborCal.getSouth())[2])).getBlock().toString();
                String curDownBlock = "air"/*world.getBlockState(event.add(blockNeighborCal.calUp(blockNeighborCal.getDown())[0],blockNeighborCal.calUp(blockNeighborCal.getDown())[1],blockNeighborCal.calUp(blockNeighborCal.getDown())[2])).getBlock().toString()*/;
                String curUpBlock = world.getBlockState(event.add(blockNeighborCal.calUp(blockNeighborCal.getUp())[0], blockNeighborCal.calUp(blockNeighborCal.getUp())[1], blockNeighborCal.calUp(blockNeighborCal.getUp())[2])).getBlock().toString();

                String[] supports = {curWestBlock, curEastBlock, curNorthBlock, curSouthBlock, curUpBlock};
                int supportCount = 0;
                /*System.out.println(curWestBlock);
                System.out.println(curEastBlock);
                System.out.println(curNorthBlock);
                System.out.println(curSouthBlock);
                System.out.println(curDownBlock);
                System.out.println(curUpBlock);
                System.out.println(supports);
                System.out.println("length " + supports.length);*/
                for (int i = 0; i < supports.length; i++) {
                    /* System.out.println(supports[i].indexOf("air") == -1);*/
                    if (supports[i].indexOf("air") == -1) {
                        supportCount += 1;
                    }

                }
                //System.out.println("upblock curDownBlock: " + curDownBlock + " SUPPORTCOUNT: " + supportCount);
                if (supportCount < 2) {
                    world.setBlockState(event.add(blockNeighborCal.calUp(loc)[0], blockNeighborCal.calUp(loc)[1], blockNeighborCal.calUp(loc)[2]), BlockInit.getblock(upBlock).getDefaultState());
                }
            }
        }


    }


}
