package com.example.quadraticformula;
import java.util.*;
public class QuadraticFormula9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        Double a=scan.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        Double b = scan.nextDouble();
        Double cirarea= 2*Math.pow(a,2)*Math.PI;
        Double recarea= (2*Math.PI*a)*b;
        System.out.println("The surface area of the cylinder is: " + (cirarea+recarea));
    }
}
