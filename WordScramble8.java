package com.example.wordscramble;

import java.util.Locale;

public class WordScramble8 {
    public static StringBuilder capitalizedVowels(String s){
        WordScramble3 ws3=new WordScramble3();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i < s.length();i++){
            if (ws3.isVowel(s.charAt(i))){
                char uc= s.toUpperCase(Locale.ROOT).charAt(i);
                sb.append(uc);
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb;
    }
}
