package com.example.wordscramble;

public class WordScramble7 {
    public static boolean twoInARow(String s,char a){
        for (int i=0;i < s.length()-1;i++){
            if (s.charAt(i) == s.charAt(i+1) && s.charAt(i) == a){
                return true;
            }
        }
        return false;
    }
}
