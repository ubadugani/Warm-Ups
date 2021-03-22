package com.example.quadraticformula;
import java.util.*;
public class QuadraticFormula1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first variable: ");
        Double a=scan.nextDouble();
        System.out.println("Enter the second variable: ");
        Double b = scan.nextDouble();
        System.out.println("Maximum value is "+Math.max(a,b));
    }
}
