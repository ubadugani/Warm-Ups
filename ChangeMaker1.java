package com.example.changemaker;

public class ChangeMaker1 {
    public static int simpleSearch(int[] nums, int value){
        int index=0;
        for(int i =0; i < nums.length;i++){
            if(nums[i]==value){
                index=i;
                break;
            }
            else{
                index=-1;
            }
        }


        return index;
    }
}
