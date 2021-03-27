package com.example.changemaker;

import java.util.*;

public class ChangeMakerApp {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        ChangeMakerApp1 cma1=new ChangeMakerApp1();
        System.out.println("Enter the double type amount owed: ");
        double owed= scan.nextDouble();
        System.out.println("Enter the double type amount given: ");
        double paid= scan.nextDouble();
        double temp = (paid-owed)*100;
        temp=Math.round(temp);
        temp/=100;
        System.out.println("Your change is "+temp);
        System.out.println(cma1.change(paid,owed));




    }
}
