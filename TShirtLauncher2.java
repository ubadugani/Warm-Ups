package com.example.tshirtlauncher;

import java.util.*;

public class TShirtLauncher2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Give the radius of a sphere to find its volume: ");
        Double rad=scan.nextDouble();
        Double vol=(4*Math.PI*Math.pow(rad,3))/3;
        System.out.println("The volume of a sphere with the radius of "+rad+
                " is "+vol);
    }
}
