package com.example.wordscramble;

public class WordScramble4 {
    public static int numVowels(String s){
        int vowct=0;
        WordScramble3 ws3=new WordScramble3();
        for(int i=0;i < s.length();i++){
            if(ws3.isVowel(s.charAt(i))){
                vowct++;
            }
        }
        return vowct;
    }
}
