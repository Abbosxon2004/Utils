package org.example;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            return Double.valueOf(str)>0;
        }catch (Exception e){
            return false;
        }
    }
}