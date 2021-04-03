package com.example.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockAndTheValidString {
    //This one is wrong on 2/20 junit tests

    // Complete the isValid function below.
    String isValid(String s) {
        HashMap<Character,Integer> validck=new HashMap<Character,Integer>();
        int freqa=-100;
        int freqb=-100;
        int freqbold=-100;
        int freqact=0;
        int freqbct=0;

        char counter=0;
        for (int i=0;i < s.length();i++){
            validck.put(s.charAt(i),validck.getOrDefault(s.charAt(i),0)+1);
        }
        for(char alphabet = 'a'; alphabet <= 'z'; alphabet++ ){
            if (validck.get(alphabet) != null ){
                if(counter == 0){
                    counter=alphabet;
                    freqa=validck.get(counter);
                }
                if (validck.get(alphabet) != freqa){
                    freqb=validck.get(alphabet);
                    if(freqb != freqbold && freqbold != -100) {
                        return "NO";
                    }
                    freqbold=freqb;
                    freqbct++;
                }
                if(validck.get(alphabet) == freqa){
                    freqact++;
                }
                if(freqact > 1 && freqbct > 1){
                    return "NO";
                }
            }
            System.out.println(validck.keySet());
            System.out.println(validck.values());
            System.out.println(freqact);
            System.out.println(freqa);
            System.out.println(freqbct);
            System.out.println(freqb);
        }
        if (freqb == -100){
            return "YES";
        }

        if ((freqact==1||freqbct==1)&&Math.max(freqa,freqb)-Math.min(freqa,freqb)<=1){
            return "YES";
        }

        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        SherlockAndTheValidString iv=new SherlockAndTheValidString();

        String result = iv.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
