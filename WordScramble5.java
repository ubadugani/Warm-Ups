package com.example.wordscramble;

public class WordScramble5 {
    public static boolean evenChars(String s, char a, char b){
        int cact=0;
        int cbct=0;
        for (int i=0;i < s.length();i++){
            if (s.charAt(i) ==a){
                cact++;
            }
            if (s.charAt(i) ==b){
                cbct++;
            }
        }
        if (cact == cbct){
            return true;
        }
        return false;
    }
}
