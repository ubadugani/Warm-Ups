package com.example.midyearreview;
import java.util.*;
public class MidYearReview5to7 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scan.nextInt();
        if(age < 18){
            System.out.println("You are ineligible to vote");
        }
        else{
            System.out.println("You are eligible to vote");
        }
        System.out.println("Enter an integer");
        int pmzcheck= scan.nextInt();
        if(pmzcheck<0){
            System.out.println("Number is negative");
        }
        if(pmzcheck>0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is zero");
        }
        System.out.println("Enter an integer: ");
        int a= scan.nextInt();
        System.out.println("Enter another integer: ");
        int b= scan.nextInt();
        if((a >=10 && a <= 20)||(b >=10 && b <= 20)){
            System.out.println("Within");
        }
        else{
            System.out.println("Not within");
        }
    }
}
