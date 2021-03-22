package com.example.tshirtlauncher;

import java.util.*;

public class TShirtLauncher1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first variable: ");
        Double var1= scan.nextDouble();
        System.out.println("Enter the second variable: ");
        Double var2=scan.nextDouble();
        Double ans=Math.PI*(Math.pow(var1,6)-Math.pow(var2,6));
        System.out.println("The variables plugged into the formula of " +
                "pi(x^6-y^6) make the answer: "+ans);
    }
}
