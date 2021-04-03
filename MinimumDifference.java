package com.example.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumDifference {

    // Complete the minimumAbsoluteDifference function below.
    int minimumAbsoluteDifference(int[] arr) {
        int oldval=Math.abs(arr[0]-arr[1]);
        Arrays.sort(arr);
        for (int i=0;i < arr.length-1;i++){
                oldval = Math.min(oldval, Math.abs(arr[i] - arr[i+1]));
                oldval = Math.min(oldval, Math.abs(arr[i+1] - arr[i]));
                if (oldval == 0){
                    return 0;
                }
        }
        return oldval;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        MinimumDifference mad=new MinimumDifference();

        int result = mad.minimumAbsoluteDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
