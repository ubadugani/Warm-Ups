package com.example.changemaker;

import java.math.BigDecimal;

public class ChangeMakerApp1 {
    public static String change(double paid, double owed){

        double[] amt={20,10,5,1,.25,.10,.05,.01};
        int[] amtcng= {0,0,0,0,0,0,0,0};

        double change=  (paid-owed)*100;
        change=Math.round(change);
        change/=100;
        for(int i=0;change > 0; i++){
            while(change >= amt[i]){
                change = (change - amt[i])*100;
                change=Math.round(change);
                change/=100;
                amtcng[i]++;
            }
        }
        String totalChange="Your change consists of: \n"
                +amtcng[0]+" 20 dollar bills\n"
                +amtcng[1]+" 10 dollar bills\n"
                +amtcng[2]+" 5 dollar bills\n"
                +amtcng[3]+" 1 dollar bills\n"
                +amtcng[4]+" 25 cents coins\n"
                +amtcng[5]+" 10 cents coins\n"
                +amtcng[6]+" 5 cents coins\n"
                +amtcng[7]+" 1 cents coins\n";




        return totalChange;
    }

}
