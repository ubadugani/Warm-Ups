package com.example.timestable;

import java.util.*;

public class TimesTableApp {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to get its times table: ");
        int num=scan.nextInt();
        for(int i=1;i <= num;i++){
            for(int j=1;j <= num;j++){
                System.out.print((i*j)+"\t");
            }
            System.out.println();
        }
    }
}