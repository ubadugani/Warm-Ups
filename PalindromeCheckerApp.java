package com.example.palindrome;

import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        boolean cont=true;
        String compStr = "";
        while(cont){
            System.out.println("Enter a String to see if it is a palindrome: ");
            String pCheck= scan.next();

            for(int i=pCheck.length()-1;i >= 0;i--){
                compStr+= pCheck.charAt(i);
            }
            System.out.println(compStr);
                if(pCheck.equals(compStr)){
                    System.out.println(pCheck+" is a palindrome");
                }
                else{
                    System.out.println(pCheck+" is not a palindrome");
                }


            System.out.println("Enter \"true\" if you want to continue or \"false\" to quit");
            cont=scan.nextBoolean();
        }
    }
}
