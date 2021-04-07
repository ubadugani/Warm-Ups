package com.example.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Candies {
    //Time out on 1 test

    // Complete the candies function below.
    long candies(int n, int[] arr) {
        long[] candies = new long[n];
        Arrays.fill(candies, 1);
        boolean valup = true;
        while (valup) {
            valup = false;
            for (int i = 0; i < n; i++) {
                if (i != n-1 && arr[i] > arr[i+1] && candies[i] <= candies[i+1]) {
                    candies[i] = candies[i+1]+1;
                    valup = true;
                }
                if (i > 0 && arr[i] > arr[i-1] && candies[i] <= candies[i-1]) {
                    candies[i] = candies[i-1]+1;
                    valup = true;
                }
            }
        }
        long tot = 0;
        for (long candy : candies) {
            tot += candy;
        }
        return tot;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        Candies c=new Candies();

        long result = c.candies(n, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
