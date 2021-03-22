package com.example.tshirtlauncher;

import java.util.*;

public class TShirtLauncher9 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a variable: ");
        int a=scan.nextInt();
        System.out.println("Enter another variable: ");
        int b= scan.nextInt();
        System.out.println("Enter the last variable: ");
        int c =scan.nextInt();
        System.out.println("The smallest value entered is "
                +(Math.min((Math.min(a,b)),c)));
    }
}
