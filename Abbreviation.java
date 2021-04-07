package com.example.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Abbreviation {

    // Complete the abbreviation function below.
    String abbreviation(String a, String b) {
        int al = a.length();
        int bl=b.length();
        boolean[][] arr = new boolean[al+1][bl+1];
        arr[0][0] = true;
        for (int i=1;i <= al;i++) {
            arr[i][0] = arr[i-1][0] && Character.isLowerCase(a.charAt(i-1));
        }
        for (int i=1;i <= al;i++) {
            for (int j=1; j<=bl; j++) {
                arr[i][j] = (arr[i-1][j-1] && Character.toUpperCase(a.charAt(i-1)) == b.charAt(j-1)) ||
                        (arr[i-1][j] && Character.isLowerCase(a.charAt(i-1)));
            }
        }
        return arr[al][bl] ? "YES":"NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Abbreviation abr=new Abbreviation();

        for (int qItr = 0; qItr < q; qItr++) {
            String a = scanner.nextLine();

            String b = scanner.nextLine();

            String result = abr.abbreviation(a, b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
