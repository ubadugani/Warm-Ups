package com.example.piglatin;

import java.util.*;

public class PigLatin2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=scan.nextLine();
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.substring(0,str.length()-1)+str.substring(str.length()-2,
                str.length()).toUpperCase(Locale.ROOT));
    }
}
