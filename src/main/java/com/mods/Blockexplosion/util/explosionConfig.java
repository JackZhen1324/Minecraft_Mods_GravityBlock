package com.mods.Blockexplosion.util;

public class explosionConfig {
    private static boolean isexplosionOn = true;
    private static int realisticLevel = 1;
    private static int explosionRange = 2;

    public static boolean getIsexplosionOn(){
        return isexplosionOn;
    }
    public static void setIsexplosionOn(boolean isOn){
        isexplosionOn =  isOn;
    }
    public static int getRealisticLevel(){
        return realisticLevel;
    }
    public static void setRealisticLevel(int level){
        realisticLevel =  level;
    }
    public static int getRange(){
        return explosionRange;
    }
    public static void setRange(int range){
        explosionRange =  range;
    }
}
