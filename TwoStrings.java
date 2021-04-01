package com.example.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        HashMap<Character,Integer> str1=new HashMap<Character,Integer>();
        boolean cont=false;
        int s1l = s1.length();
        int s2l = s2.length();
        for(int i=0;i < s1l;i++){
            str1.put(s1.charAt(i),i);
        }
        for(int i=0;i < s2l;i++){
            if(str1.containsKey(s2.charAt(i))){
                cont=true;
            }
        }
        String ans;
        if(cont){
            ans= "YES";
        }
        else {
            ans= "NO";
        }
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
