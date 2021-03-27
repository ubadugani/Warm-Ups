package com.example.approximatepi;

import java.util.Locale;

public class ApproximatePI7 {
    public static String capitalizeFirst(String name){
        return name.substring(0,1).toUpperCase(Locale.ROOT)+name.substring(1,name.length());
    }
}
