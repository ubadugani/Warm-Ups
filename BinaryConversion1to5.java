package com.example.binaryconversion;

import java.util.*;

public class BinaryConversion1to5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] nums={2,4,5,8,6,2,3,5,9,0,9,6};           //part 1
        int sum=0;
        for(int i=0; i < nums.length;i++){              //part 2
            sum+=nums[i];
        }
        System.out.println("The sum of all integers in the array is: "+sum);
        boolean isodd=false;
        for(int i =0;i < nums.length;i++){              //part 3
            if(nums[i]%2 != 0){
                isodd=true;
            }
        }
        if(isodd){
            System.out.println("There is an odd");
        }
        else{
            System.out.println("There is not an odd");
        }
        boolean has0=false;
        for(int i =0;i < nums.length;i++){              //part 4
            if(nums[i] == 0){
                has0=true;
            }
        }
        if(has0){
            System.out.println("A zero was found");
        }
        else{
            System.out.println("No zeros");
        }

    }
}
