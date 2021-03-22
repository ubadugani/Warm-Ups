package com.example.midyearreview;

import java.util.*;

public class MidYearReview12and13 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int input=1;
        int sum=0;
        int i;
        Double average=0.00;
        for(i = 0;input != 0;i++){
            System.out.println("Enter an integer, enter 0 to stop");
            input = scan.nextInt();
            sum+=input;
        }
        i--;
        average= Double.valueOf(sum)/i;
        System.out.println("The numbers added together are: "+sum);
        System.out.println("The average of the numbers is: "+average);
    }
}
