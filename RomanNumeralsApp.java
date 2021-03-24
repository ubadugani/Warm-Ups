package com.example.romannumerals;

import java.util.*;

public class RomanNumeralsApp {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        final int[] NUMBERS={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        final String[] LETTERS={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        System.out.println("Enter an integer number (less than 4000) to turn into a Roman Numeral: ");
        int numtoc= scan.nextInt();
        int remain=numtoc;
        String res="";
        int i=0;
        while(remain > 0){
            if(remain >= NUMBERS[i]){
                remain-=NUMBERS[i];
                res+=(LETTERS[i]);
            }
            else{
                i++;
            }
        }
        System.out.println(numtoc+" as a Roman Numeral is: "+res);
    }
}
