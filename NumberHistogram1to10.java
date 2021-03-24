package com.example.numberhistogram;

import java.util.*;

public class NumberHistogram1to10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sixcheck=0;
        int[] nums={2,4,5,8,16,2,3,5,9,0,9,12,6};   //part 1
        System.out.println(nums[0]);                //part 2
        System.out.println(nums[1]);                //part 3
        System.out.println(nums[3]);                //part 4
        System.out.println(nums[12]);               //part 5
        System.out.println("There are "+nums.length+" elements");  //part 6
        System.out.println(nums[nums.length-1]);    //part 7
        for(int i=0;i < nums.length;i++){           //part 9
            System.out.print(nums[i]+" ");
            if((i == 0 && nums[i] == 6)||(i == nums.length-1 && nums[i]==6)){
                sixcheck=1;
            }
        }
        if(sixcheck ==1){                           //part 10
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


    }
}
