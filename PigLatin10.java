package com.example.piglatin;

import java.util.*;

public class PigLatin10 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string preferably with '*'s in it: ");
        String str=scan.nextLine();
        str=str.replace("*","");
        System.out.println("Your String without '*'s is: "+str);
    }
}
