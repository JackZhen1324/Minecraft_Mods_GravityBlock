package com.mods.BlockGravity.util;

public class blockNeighborCal {
    public static int[] calNorth(int[] pos){
        int[] res = {pos[0],pos[1],pos[2]+1};
        return res;
        
    }
    public static int[] calSouth(int[] pos){

        int[] res = {pos[0],pos[1],pos[2]-1};
        return res;

    }
    public static int[] calEast(int[] pos){

        int[] res = {pos[0]-1,pos[1],pos[2]};
        return res;

    }
    public static int[] calWest(int[] pos){
        int[] res = {pos[0]+1,pos[1],pos[2]};


        return res;

    }
    public static int[] calUp(int[] pos){

        int[] res = {pos[0],pos[1]+1,pos[2]};
        return res;

    }
    public static int[] calDown(int[] pos){
        int[] res = {pos[0],pos[1]-1,pos[2]};

        return res;
    }
    public static int[] getNorth()
    {
     /*   String westBlock = world.getBlockState(event.getPos().add(1,0,0)).getBlock().toString();
        String eastBlock = world.getBlockState(event.getPos().add(-1,0,0)).getBlock().toString();


        String northBlock = world.getBlockState(event.getPos().add(0,0,1)).getBlock().toString();
        String southBlock = world.getBlockState(event.getPos().add(0,0,-1)).getBlock().toString();
        String downBlock = world.getBlockState(event.getPos().add(0,-1,0)).getBlock().toString();
        String upBlock = world.getBlockState(event.getPos().add(0,1,0)).getBlock().toString();*/
        int[] res = {0,0,1};
        return res;

    }
    public static int[] getSouth()
    {
        int[] res = {0,0,-1};
        return res;
    }
    public static int[] getWest()
    {
        int[] res = {1,0,0};
        return res;
    }
    public static int[] getEast()
    {
        int[] res = {-1,0,0};
        return res;
    }
    public static int[] getUp()
    {
        int[] res = {0,1,0};
        return res;
    }
    public static int[] getDown()
    {
        int[] res = {0,-1,0};
        return res;
    }


}
