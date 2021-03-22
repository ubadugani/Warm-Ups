package com.example.quadraticformula;
import java.util.*;
public class QuadraticFormula8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first variable: ");
        Double a=scan.nextDouble();
        System.out.println("Enter the second variable: ");
        Double b = scan.nextDouble();
        Double result =Math.min(Math.abs(a),Math.abs(b));
        if(result == Math.abs(a)){
        System.out.println("The variable closer to 0 is "+a);
        }
        if(result == Math.abs(b)){
            System.out.println("The variable closer to 0 is "+b);
        }
    }
}
