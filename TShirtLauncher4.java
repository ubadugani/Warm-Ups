package com.example.tshirtlauncher;

import java.util.*;

public class TShirtLauncher4 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a variable: ");
        Double x=scan.nextDouble();
        Double ans=Math.log(Math.abs(1+x));
        System.out.println("The answer is: "+ans);
    }
}
