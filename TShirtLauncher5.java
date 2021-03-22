package com.example.tshirtlauncher;

import java.util.*;

public class TShirtLauncher5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a variable: ");
        Double x=scan.nextDouble();
        Double ans=Math.pow(x,2)* Math.exp(x);
        System.out.println("The answer is: "+ans);
    }
}
