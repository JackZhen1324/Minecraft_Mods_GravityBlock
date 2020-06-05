package com.mods.BlockGravity.util;

public class  blockConfig {
    private static boolean isGravityOn = true;
    private static int realisticLevel = 1;
    private static int gravityRange = 3;

    public static boolean getIsGravityOn(){
        return isGravityOn;
    }
    public static void setIsGravityOn(boolean isOn){
        isGravityOn =  isOn;
    }
    public static int getRealisticLevel(){
        return realisticLevel;
    }
    public static void setRealisticLevel(int level){
        realisticLevel =  level;
    }
    public static int getRange(){
        return gravityRange;
    }
    public static void setRange(int range){
        gravityRange =  range;
    }
}
