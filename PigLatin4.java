package com.example.piglatin;

import java.util.*;

public class PigLatin4 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int hia=0;
        System.out.println("Enter a String");
        String str= scan.nextLine();
        for(int i=0;i < str.length()-1;i++){
            if(str.substring(i,i+2).equals("hi")){
                hia++;
            }
            System.out.println(str.substring(i,i+2));
        }
        System.out.println(str);
        System.out.println("There are "+hia+" hi's in the String");

    }
}
