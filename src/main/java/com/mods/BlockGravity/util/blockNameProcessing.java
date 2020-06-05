package com.mods.BlockGravity.util;

public  class blockNameProcessing {
    public static String GetBlockName(String rawName){
        String tem = rawName;
        tem = tem.substring(16,tem.length()-1);
        tem = tem.replaceAll("falling_","");
        tem = tem.replaceAll("ty:","");
        System.out.print("finished replacing");

        return tem;

    }
}
