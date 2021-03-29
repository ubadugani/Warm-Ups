package com.example.wordscramble;

public class WordScramble10 {
    public static boolean containsPrefix(String s, int n){
        boolean doesAppear=false;
        for (int i=0;i < s.length()-n;i++){
            if(s.substring(0,n).equals(s.substring(i,i+n))){
                doesAppear=true;
            }
        }
        return doesAppear;
    }
}
