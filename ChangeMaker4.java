package com.example.changemaker;

public class ChangeMaker4 {
    public static void printPow2(int n){
        System.out.println("Here are thr first "+n+" powers of 2: ");
        for(int i =0; i < n;i++){
            System.out.println("2^"+i+" = "+(Math.pow(2,i)));
        }
    }
}
