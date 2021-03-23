package com.example.palindrome;

import java.util.*;

public class Palindrome8to10 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in); //part 8
        System.out.println("Enter a String to check if it has \"bad\" at the " +
                "beginning of it: ");
        String a= scan.nextLine();
        if(a.startsWith("bad")){
            System.out.println("That string starts with \"bad\"");
        }
        else{
            System.out.println("That String does not start with \"bad\"");
        }

        System.out.println("Type in a String: ");   //part 9
        String b= scan.nextLine();
        if(b.equals("way")){
            System.out.println("This String is \"way\"");
        }
        else{
            System.out.println("No way");
        }

        System.out.println("Enter a String: "); //part 10
        String c= scan.nextLine();
        System.out.println("The String without the first and last character is: " +
                c.substring(1,(c.length()-1)));

                            //part 11
        System.out.println("Enter a String that has an odd number of characters and has " +
                "3 or more characters");
        String d= scan.nextLine();
        System.out.println("The middle 3 characters of the String are: ");
        System.out.println(d.substring((int)(Math.ceil(d.length()/2)-1),
                (int)(Math.ceil(d.length()/2)+2)));
    }
}
