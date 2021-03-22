package com.example.quadraticformula;
import java.util.*;
public class QuadraticFormula10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        Double a=scan.nextDouble();
        Double vol=4.0/3*Math.PI*Math.pow(a,3);
        System.out.println("The volume of the sphere is "+vol);
    }
}
