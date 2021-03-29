package com.example.wordscramble;

public class WordScramble9 {
    public static String longestWord(String s){
        String sc="";
        for (String retval: s.split(" ")) {
            if (sc.length() < retval.length()){
                sc=retval;
            }
        }
        return sc;
    }
}
