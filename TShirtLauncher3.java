package com.example.tshirtlauncher;

import java.util.*;

public class TShirtLauncher3 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a variable: ");
        Double z=scan.nextDouble();
        Double ans=Math.abs(Math.pow(z,4)-1);
        System.out.println("The answer is: "+ans);
    }
}
