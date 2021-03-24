package com.example.binaryconversion;

import java.util.*;

public class BinaryConversion6to8 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] nums={2,4,5,8,6,2,3,5,9,0,9,6};
        int sixam=0;
        for(int i=0; i < nums.length;i++){          //part 6
            if(nums[i]==6){
                sixam++;
            }
        }
        if(sixam >= 2){
            System.out.println("There are 2 or more 6s in the array");
        }
        else{
            System.out.println("There are less than 2 6s in the array");
        }
        boolean tth=false;
        for(int i=0; i < nums.length-1;i++){          //part 7
            if(nums[i]== 2 && nums[i+1] == 3){
                tth=true;
            }
        }
        if(tth){
            System.out.println("Found 2/3");
        }
        else{
            System.out.println("No 2/3");
        }
        boolean inor=true;
        for(int i=0; i < nums.length-1;i++){          //part 8
            if(nums[i] > nums[i+1]){
                inor=false;
            }
        }
        if(inor){
            System.out.println("In order");
        }
        else{
            System.out.println("Not in order");
        }
    }
}
