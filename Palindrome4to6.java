package com.example.palindrome;

import java.util.*;

public class Palindrome4to6 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String: ");         //Part 4
        String a=scan.nextLine();
        System.out.println("Enter another String: ");
        String b= scan.nextLine();
        if(a.length() < b.length() || a.length() == b.length()){
            System.out.println(a+b+a);
        }
        if(a.length() > b.length()){
            System.out.println(b+a+b);
        }

        System.out.println("Enter a String with an even amount of characters: "); //Part 5
        String evenString= scan.nextLine();
        System.out.println("Half of that string is: "+evenString.substring(0,(evenString.length()/2)));

        System.out.println("Enter a String: ");         //Part6
        String c= scan.nextLine();
        System.out.println("Enter another String: ");
        String d =scan.nextLine();
        System.out.println("The strings put together while removing the first character" +
                " from them is: "+c.substring(1)+d.substring(1));
    }
}
