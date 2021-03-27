package com.example.changemaker;

public class ChangeMaker3 {
    public static void checkerBoard(int n){
        for(int i=0;i < n;i++){
            for(int j=0;j < n;j++) {
                System.out.print("# ");
            }
            System.out.println();
            if(i%2 == 0){
                System.out.print(" ");
            }
        }
    }
}
