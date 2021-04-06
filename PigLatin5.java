package com.example.piglatin;

import java.util.*;

public class PigLatin5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String: ");
        int ye=0;
        String str= scan.next();
        System.out.println("Enter a String that's the same size or shorter than the previous one: ");
        String target= scan.next();
        for(int i=0;i < str.length()-target.length()+1;i++){
            if(str.substring(i,i+target.length()).equals(target)){
                ye++;
            }
        }
        if(ye>0) {
            System.out.println(target + " is in the String");
        }
        else{
            System.out.println(target+" is not in the String");
        }
    }
}
