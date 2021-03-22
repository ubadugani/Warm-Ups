package com.example.quadraticformula;
import java.util.*;
public class QuadraticFormulaCalculatorApp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Double res1;
        Double res2;
        System.out.println("Enter value for coefficeint a: ");
        Double a=scan.nextDouble();
        System.out.println("Enter value for coefficeint b: ");
        Double b=scan.nextDouble();
        System.out.println("Enter value for coefficeint c: ");
        Double c=scan.nextDouble();
        res1=((b*-1)+Math.sqrt((Math.pow(b,2)-(4*a*c))))/(2*a);
        res2=((b*-1)-Math.sqrt((Math.pow(b,2)-(4*a*c))))/(2*a);

        System.out.println("The roots for the polynomials are: ");
        System.out.println(res1);
        System.out.println(res2);
    }
}
