package com.example.quadraticformula;
import java.util.*;
public class QuadraticFormula4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to round to the nearest whole number: ");
        Double a=scan.nextDouble();
        System.out.println("The nearest whole number to "+a+" is "+Math.round(a));

    }
}
