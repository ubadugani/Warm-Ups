package com.example.quadraticformula;
import java.util.*;
public class QuadraticFormula6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle: ");
        Double a=scan.nextDouble();
        System.out.println("Enter the second side of the triangle: ");
        Double b = scan.nextDouble();
        System.out.println("The Hypotenuse is "+Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
    }
}
