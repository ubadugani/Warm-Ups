package com.example.palindrome;

import java.util.*;

public class Palindrome1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scan.nextLine();
        System.out.println("The string entered is "+s.length()+" characters long"); //Part 1
        System.out.println("The string you entered without the first character is: " + //Part 2
                s.substring(1));
        System.out.println("The string you entered without the last character is: " + //Part3
                s.substring(0,(s.length()-1)));
    }
}
