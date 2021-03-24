package com.example.binaryconversion;

import java.util.*;

public class BinaryConversion9to11 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] nums={2,4,5,8,6,2,3,5,9,0,9,6};
        int evens=0;
        for(int i =0;i < nums.length;i++){              //part 9
            if(nums[i]%2 == 0){
                evens++;
            }
        }
        if(evens%2 == 0 && evens !=0){
            System.out.println("There is an even amount of even numbers");
        }
        else{
            System.out.println("There is not an even amount of even numbers");
        }
        boolean t3r=false;
        for(int i =0;i < nums.length-2;i++){              //part 10
            if(nums[i] == nums[i+1] && nums[i] == nums[i+2]){
                t3r=true;
            }
        }
        if(t3r){
            System.out.println("Three in a row");
        }
        else{
            System.out.println("No three in a row");
        }
        int lar=nums[0];
        int low=nums[0];
        for(int i =0;i < nums.length;i++){              //part 11
            low=Math.min(nums[i],low);
            lar=Math.max(nums[i],lar);
        }
        System.out.println("The difference between the largest and smallest " +
                "number is: "+(lar-low));

    }
}
