package com.example.tshirtlauncher;

import java.util.*;

public class TShirtLauncher8 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the bearing in degrees: ");
        Double z=scan.nextDouble();
        System.out.println("The answer is: "+Math.round(z/10));
    }
}
