package com.example.hailstoneseries;

import java.util.*;

public class HailstoneSeries1 {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int input;
        int i=1;
        int sum=0;
        while(i != 0){
            System.out.println("Enter an integer to add (or 0 to quit): ");
            input=console.nextInt();
            if(input==0){
                i=0;
            }
            else{
                sum+=input;
            }
        }
        System.out.println("Sum of integers is: "+sum);

    }

}