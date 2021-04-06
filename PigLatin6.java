package com.example.piglatin;

import java.util.*;

public class PigLatin6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=scan.next();
        System.out.println("Enter an integer that's lower than the length of the string: ");
        int n= scan.nextInt();
        for(int i=0;i < n;i++){
            System.out.print(str.substring(str.length()-n,str.length()));
        }


    }
}
