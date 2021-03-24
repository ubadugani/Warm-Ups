package com.example.romannumerals;

import java.util.*;

public class RomanNumerals1to6 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String[] str= {"Hello", "Goodbye", "Computer","Science","Um","Do","What","Now"};    //Part 1
        System.out.println("The amount of Strings in array: "+str.length);                                 //part 2
        for(int i=0;i < str.length;i++){                                //part 3
            System.out.print("First letter of " +str[i]+" "+str[i].charAt(0)+" ");
        }
        System.out.println();
        int ect=0;
        for(int i =0;i < str.length;i++){                               //part 4
            String temp=str[i];
            if((str[i].charAt(temp.length()-1)) == 'e'){
                ect++;
            }
        }
        System.out.println("The amount of E's: "+ect);
        int charct=0;
        for(int i =0;i < str.length;i++){                               //part 5
            charct+=str[i].length();
        }
        System.out.println("Total amount of characters in array: "+charct);
        int l7=0;
        for(int i =0;i < str.length;i++){                               //part 6
            if((str[i].length()) == 7){
                l7++;
            }
        }
        if(l7 < 2){
            System.out.println("Under 2 length 7");
        }
        else{
            System.out.println("Two length 7!");
        }

    }
}
