package com.example.approximatepi;

import java.util.*;

public class ApproximatePI {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int a= scan.nextInt();
        System.out.println("Enter another integer: ");
        int b= scan.nextInt();;
        System.out.println("Enter an integer for a number of dice faces: ");
        int numFaces= scan.nextInt();
        System.out.println("Enter your name not capitalized: ");
        scan.nextLine();
        String name=scan.nextLine();
        System.out.println("Enter a double value of a radius of a circle: ");
        double radius= scan.nextDouble();
        System.out.println("Enter an amount of seconds on minutes: ");
        Double time= scan.nextDouble();
        System.out.println("Enter true if the time was in minutes, false if seconds: ");
        boolean isMinutes=scan.nextBoolean();
        System.out.println();
        ApproximatePI1 p1=new ApproximatePI1();
        ApproximatePI2 p2=new ApproximatePI2();
        ApproximatePI3 p3=new ApproximatePI3();
        ApproximatePI5 p5=new ApproximatePI5();
        ApproximatePI6 p6=new ApproximatePI6();
        ApproximatePI7 p7=new ApproximatePI7();
        ApproximatePI8 p8=new ApproximatePI8();
        ApproximatePI9 p9=new ApproximatePI9();
        ApproximatePI11 p11=new ApproximatePI11();
        ApproximatePI12 p12=new ApproximatePI12();
        System.out.println("Is the first int entered positive: "+p1.isPositive(a));
        System.out.println("Is the first int entered odd: "+p2.isOdd(a));
        System.out.println("Is the first or second int enetered bigger: "+p3.getMax(a,b));
        System.out.println("Dice roll: "+p5.rollDice());
        System.out.println("Dice roll with the amount of faces entered: "+p6.rollDice(numFaces));
        System.out.println("Name with first letter capitalized: "+p7.capitalizeFirst(name));
        System.out.println("Area of circle with radius given: "+p8.circleArea(radius));
        System.out.println("Is the first int a multiple of the second int: "+p9.isMultiple(a,b));
        System.out.println("The time converted from your input is: "+p11.convertTime(time,isMinutes));
        System.out.println("Your name printed in a strange fashion is: ");
        p12.printDiagonal(name);


    }
}
