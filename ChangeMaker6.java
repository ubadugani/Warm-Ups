package com.example.changemaker;

import java.util.*;

public class ChangeMaker6 {
    public static boolean isArmstrong(int num){
        Double numLength =Math.ceil(Math.log10(num));
        int numtemp=0;
        int temp=0;
        for(int i=0;i <= numLength;i++){
            temp= (int) ( num%Math.pow(10,i+1)/Math.pow(10,i));
            numtemp+=Math.pow(temp,3);
        }
        if(numtemp == num){
            return true;
        }

        return false;
    }
}
