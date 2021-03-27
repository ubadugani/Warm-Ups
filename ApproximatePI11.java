package com.example.approximatepi;

public class ApproximatePI11 {
    public static String convertTime(double time,boolean isMinutes){
        if(isMinutes){
            return Double.toString(time*60);
        }
        return Double.toString(time/60);
    }
}
