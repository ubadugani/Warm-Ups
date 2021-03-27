package com.example.changemaker;

import java.util.Scanner;

public class ChangeMaker {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        ChangeMaker1 cm1=new ChangeMaker1();
        ChangeMaker2 cm2=new ChangeMaker2();
        ChangeMaker3 cm3=new ChangeMaker3();
        ChangeMaker4 cm4=new ChangeMaker4();
        ChangeMaker5 cm5=new ChangeMaker5();
        ChangeMaker6 cm6=new ChangeMaker6();
        ChangeMaker7 cm7=new ChangeMaker7();

        System.out.println("Enter how big you want integer array 1: ");                         //part 1
        int a1s= scan.nextInt();
        int[] nums=new int[a1s];
        for(int i=0;i < a1s;i++){
            System.out.println("Enter value for index ["+i+"] of integer array 1: ");
            nums[i]= scan.nextInt();
        }
        System.out.println("Enter number you want to find the index of in integer array 1: ");
        int value= scan.nextInt();
        System.out.println("The index of "+value+" is ["+cm1.simpleSearch(nums,value)+"]");
        System.out.println("Enter an integer to make a n by n board and checker board of #'s: "); //part 2 and 3
        int n= scan.nextInt();
        cm2.squareBoard(n);
        cm3.checkerBoard(n);
        System.out.println("Enter integer amount of power of 2 you want to see: ");            //part 4
        n= scan.nextInt();
        cm4.printPow2(n);
        System.out.println("Enter double temperature value in C or F: ");                      //part 5
        Double temp= scan.nextDouble();
        System.out.println("Type true if it is F or false if it is C: ");
        boolean isF=scan.nextBoolean();
        System.out.println("The converted temperature is "+cm5.convertTemp(temp,isF));
        System.out.println("Enter an integer to check if it is an armstrong number: ");         //part 6
        int num= scan.nextInt();
        System.out.println("The number entered is "+cm6.isArmstrong(num)+" in terms of being an armstrong number");
        System.out.println("Enter how big you want integer array 2: ");                         //part 7
        int a2s= scan.nextInt();
        int[] b=new int[a2s];
        for(int i=0;i < a2s;i++){
            System.out.println("Enter value for index ["+i+"] of integer array 2: ");
            nums[i]= scan.nextInt();
        }
        System.out.println("It is "+cm7.contains(nums,b)+" that array 2 is in array 1");




    }
}
