package com.example.warmup4;
import java.util.Scanner;

public class WarmUp4 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your height in inches: ");
        double heightin = scan.nextDouble();
        System.out.println("Enter your weight in lb: ");
        double weightlb = scan.nextDouble();
        double weightkg=weightlb/2.204623;
        double heightm=heightin/39.37008;
        System.out.printf("Your height in meters is %.3f",heightm);
        System.out.printf(" and your weight in kilograms is %.3f\n",weightkg);
        double bmi = weightkg/(heightm*heightm);
        System.out.printf("Your BMI is %.3f\n",bmi);
    }
}
