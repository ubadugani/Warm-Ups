package com.example.midyearreview;

import java.util.*;

public class MidYearReview8to11 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        boolean isLoud;
        int time;
        System.out.println("Enter a boolean: ");
        isLoud=scan.nextBoolean();
        System.out.println("Enter an integer: ");
        time= scan.nextInt();
        if(isLoud == true && (time < 6 || time > 18)){
            System.out.println("You're in trouble");
        }
        else{
            System.out.println("You're not in trouble");
        }
        int count=1;
        while(count <= 1000){
            if(count%3 ==0){
                System.out.println(count);
            }
            count++;
        }
        for(int j=1;j<=1000;j++){
            if(j%9 == 0 && j%2 ==0){
                System.out.println(j);
            }
        }

    }
}
