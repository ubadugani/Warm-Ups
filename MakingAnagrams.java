package com.example.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MakingAnagrams {

    // Complete the makeAnagram function below.
    long makeAnagram(String a, String b) {
        HashMap<Character,Integer> stra=new HashMap<Character, Integer>();
        HashMap<Character,Integer> strb=new HashMap<Character, Integer>();
        long delct=0L;
        for (int i=0;i < a.length();i++){
            stra.put(a.charAt(i),stra.getOrDefault(a.charAt(i),0)+1);
        }
        for (int i=0;i < b.length();i++){
            strb.put(b.charAt(i),strb.getOrDefault(b.charAt(i),0)+1);
        }

        for(char alphabet = 'a'; alphabet <= 'z'; alphabet++ )
        {
            if(stra.get(alphabet) != null && strb.get(alphabet) != null){
                if(stra.get(alphabet) != strb.get(alphabet)){
                    delct+=Math.max(stra.get(alphabet),strb.get(alphabet))-Math.min(stra.get(alphabet),strb.get(alphabet));
                }
            }
            if(stra.get(alphabet) == null && strb.get(alphabet) != null){
                delct+=strb.get(alphabet);
            }
            if (strb.get(alphabet) == null && stra.get(alphabet) != null){
                delct+=stra.get(alphabet);
            }
        }



        return delct;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        MakingAnagrams ma=new MakingAnagrams();

        long res = ma.makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
