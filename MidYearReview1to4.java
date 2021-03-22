package com.example.midyearreview;

import java.util.*;

public class MidYearReview1to4 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String someString;
        int someInt;
        Double someDouble;
        boolean someBool;
        System.out.println("Enter a String: ");
        someString=scan.nextLine();
        System.out.println("Enter an integer: ");
        someInt=scan.nextInt();
        System.out.println("Enter a double: ");
        someDouble=scan.nextDouble();
        System.out.println("Enter a boolean: ");
        someBool=scan.nextBoolean();
        System.out.println("You have typed in: "+someString+" "+someInt+" "+someDouble+
                " "+someBool);
        System.out.println("Enter your weight in pounds");
        Double weight=scan.nextDouble();
        weight= weight/2.20462;
        System.out.println("Your weight in kg is: "+weight);
    }
}
