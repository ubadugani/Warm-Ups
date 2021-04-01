package com.example.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockAndAnagrams {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        ArrayList<String> als1=new ArrayList<>();
        int sL=s.length();
        int pairct=0;
        for(int i=0;i < sL;i++){
            for(int j=0; j < sL-i;j++){
                String temp=s.substring(j,j+i+1);
                als1.add(temp);
            }
        }
        for (int i=0;i < als1.size();i++){
            for (int j=i+1;j < als1.size();j++){
                String string1= als1.get(i);
                String string2= als1.get(j);
                if((als1.get(i).equals(als1.get(j)) || isAnagram(string1,string2))
                        && !als1.get(i).equals("Null")){
                    pairct++;
                }
            }
        }
        return pairct;
    }
    public static boolean isAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        int[] lettermap = new int[26];
        for(int j=0; j<a.length(); j++){
            char ch = a.charAt(j);
            lettermap[ch - 'a']++;
            ch = b.charAt(j);
            lettermap[ch - 'a']--;
        }

        for(int j=0; j<lettermap.length; j++){
            if(lettermap[j] != 0){
                return false;
            }
        }
        return true;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
