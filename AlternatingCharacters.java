package com.example.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AlternatingCharacters {

    // Complete the alternatingCharacters function below.
    int alternatingCharacters(String s) {
        int altct=0;
        boolean twoinarow;
        StringBuilder sck=new StringBuilder(s);
        for (int i=0;i < sck.length()-1;i++){


            twoinarow=false;
            if(sck.charAt(i) == sck.charAt(i+1)){
                sck.deleteCharAt(i+1);
                altct++;
                twoinarow=true;
            }
            if(twoinarow){
                i--;
            }
        }
        return altct;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            AlternatingCharacters ac=new AlternatingCharacters();

            int result = ac.alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
