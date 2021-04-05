package com.example.tshirtlauncher;

import java.util.*;

public class TShirtLauncher6 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a variable: ");
        Double a=scan.nextDouble();
        System.out.println("Enter another variable: ");
        Double b = scan.nextDouble();
        Double ans=Math.sqrt((Math.pow(a,2))-(Math.pow(b,2)));
        System.out.println("The answer is: "+ans);
    }
}
