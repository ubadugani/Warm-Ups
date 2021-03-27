package com.example.approximatepi;

public class ApproximatePI12 {
    public static void printDiagonal(String a){
        for(int i=0;i < a.length();i++){
            for(int j=0;j <=i;j++){
                System.out.print(" ");
            }
            System.out.print(a.charAt(i));
            System.out.println();
        }
    }
}
