package com.example.approximatepi;

import java.util.*;

public class ApproximatePiApp {

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("How many iterations ddo you want to go through to approximate PI: ");
        int iterations= scan.nextInt();
        ApproximatePIApp1 pi=new ApproximatePIApp1();
        System.out.println("With that many iterations PI is approximately: "+pi.PI(iterations));

    }
}
