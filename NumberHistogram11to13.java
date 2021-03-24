package com.example.numberhistogram;

import java.util.*;

public class NumberHistogram11to13 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] nums={2,4,5,8,16,2,3,5,9,0,9,12,6};
        boolean aboveten=false;
        for(int i=0;i < nums.length;i++){               //part 11
            if(nums[i] > 10){
                aboveten=true;
            }
        }
        if(aboveten){
            System.out.println("Above 10");
        }
        else{
            System.out.println("At/below 10");
        }
        boolean asix=false;
        for(int i=0;i < nums.length;i++){               //part 12
            if(nums[i] == 6){
                asix=true;
            }
        }
        if(asix){
            System.out.println("Found a six");
        }
        else{
            System.out.println("No 6");
        }
        boolean t28=true;
        for(int i=0; i < nums.length;i++){              // part 13
            if(nums[i] < 2 || nums[i] > 8){
                t28=false;
            }
        }
        if(t28){
            System.out.println("Within 2 to 8");
        }
        else{
            System.out.println("Not within 2 to 8");
        }
    }
}
