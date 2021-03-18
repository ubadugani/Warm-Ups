package com.example.primechecker;
import java.util.*;
public class PrimeChecker11 {
    public static void main(String[] args){
        System.out.println("Enter the number you want the factorial of: ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int total=1;
        for (int i=n;i > 0;i--){
            total =total*i;
        }
        System.out.println("The factorial of "+n+" is "+total);
    }
}
