package com.example.piglatin;

import java.util.*;

public class PigLatin1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter string with first letter lowercase: ");
        String a1= scan.nextLine();
        System.out.println(a1.substring(0,1).toUpperCase(Locale.ROOT)+a1.substring(1,
                a1.length()));
    }
}
