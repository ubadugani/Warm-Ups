package com.example.hailstoneseries;

import java.util.*;

public class HailstoneSeries5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n;
        int steps=0;
        System.out.println("Input an integer value from 1-1000: ");
        n=scan.nextInt();
        System.out.println(n);
        while(n != 1){
            if(n % 2 == 0){
                n=n/2;
                System.out.println(n);
            }
            else{
                n=n*3+1;
                System.out.println(n);
            }

            steps++;
        }
        System.out.println("Series took "+steps+" steps to reach a value of 1 ");
    }
}
