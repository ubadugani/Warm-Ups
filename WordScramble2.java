package com.example.wordscramble;

public class WordScramble2 {
    public static boolean hasTwoA(String s){
        int act=0;
        WordScramble1 ws1=new WordScramble1();
        for(int i=0;i < s.length();i++){
            if(ws1.isLetterA(s.charAt(i))){
                act++;
            }
        }
        if(act > 1){
            return true;
        }
        return false;
    }
}
