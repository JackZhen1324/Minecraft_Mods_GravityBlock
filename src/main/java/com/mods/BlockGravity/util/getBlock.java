package com.mods.BlockGravity.util;

import java.lang.reflect.Method;

public class getBlock {
    public static Object dynamicGetValue(Object obj, String fieldName) {
        try {
            // 取属性首字母转大写
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            // get方法名
            String getMethodName = "get" + firstLetter + fieldName.substring(1);
            // 获取get方法
            Method getMethod = obj.getClass().getDeclaredMethod(getMethodName);
            // 动态取值
            return getMethod.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


}
}
