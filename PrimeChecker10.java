package com.example.primechecker;

public class PrimeChecker10 {
    public static void main(String[] args){
        for (int i=1;i<10;i++){
            if(i%3 == 0) {
                System.out.print("? ");
            }
            if(i%3 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
