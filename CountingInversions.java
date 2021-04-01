package com.example.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class CountingInversions {

    // Complete the countInversions function below.
    long countInversions(int[] arr) {
        int[] temp= arr.clone();

        return countInversions(arr,0,arr.length-1,temp);
    }


    long countInversions(int[] arr, int lo, int hi, int[] temp) {
        if (lo >= hi) return 0;

        int mid = lo + (hi - lo) / 2;

        long ct = 0;
        ct += countInversions(temp, lo, mid, arr);
        ct += countInversions(temp, mid + 1, hi, arr);
        ct += merge(arr, lo, mid, hi, temp);

        return ct;
    }

    long merge(int[] arr, int lo, int mid, int hi, int[] temp) {
        long ct = 0;
        int i = lo, j = mid + 1, k = lo;
        while (i <= mid || j <= hi) {
            if (i > mid) {
                arr[k++] = temp[j++];
            } else if (j > hi) {
                arr[k++] = temp[i++];
            } else if (temp[i] <= temp[j]) {
                arr[k++] = temp[i++];
            } else {
                arr[k++] = temp[j++];
                ct += mid + 1 - i;
            }
        }

        return ct;
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }
            CountingInversions ci=new CountingInversions();

            long result = ci.countInversions(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
