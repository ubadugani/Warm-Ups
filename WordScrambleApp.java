package com.example.wordscramble;

import java.util.*;

public class WordScrambleApp {
    public static void main(String[] args){
        WordScrambleApp1 wsa1=new WordScrambleApp1();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string to scramble: ");
        String line=scan.nextLine();
        System.out.println("That String scrambled is: ");
        wsa1.wordScramble(line);



    }
}
