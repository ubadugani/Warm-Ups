package com.example.quadraticformula;
import java.util.*;
public class QuadraticFormula3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base variable: ");
        Double base=scan.nextDouble();
        System.out.println("Enter the exponent variable: ");
        Double exponent = scan.nextDouble();
        System.out.println(base+" to the power of "+exponent+" is "+Math.pow(base,exponent));
    }
}
