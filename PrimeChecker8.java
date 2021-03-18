package com.example.primechecker;
import java.util.*;
public class PrimeChecker8 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the amount of asterisks you want printed: ");
        int num=scan.nextInt();
        for (int i=0;i<num;i++){
            System.out.print("* ");
        }
    }
}
