package com.example.piglatin;

import java.util.*;

public class PigLatin3 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String: ");
        int eamt=0;
        String eChk= scan.nextLine();
        for(int i=0;i < eChk.length();i++){
            if(eChk.substring(i,i+1).equals("e")){
                eamt++;
            }
        }
        System.out.println("There are "+eamt+" character e's in the String");
    }
}
