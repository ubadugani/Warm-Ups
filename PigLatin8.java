package com.example.piglatin;

import java.util.*;

public class PigLatin8 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullN=scan.nextLine();
        int spl=fullN.indexOf(" ");
        System.out.println(fullN.substring(0,spl)+ fullN.toUpperCase(Locale.ROOT).substring(spl,fullN.length()));
    }
}
