package com.example.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LargestRectangle {

    // Complete the largestRectangle function below.
    long largestRectangle(int[] h) {
        long maxarea=0;
        for (int i=0;i < h.length;i++){
            int lfct=0;
            int rtct=0;
            if(i > 0){
                while(lfct- i < 0 && h[i-1-lfct] >= h[i]){
                    lfct++;
                }
                while(rtct+i < h.length-1 && h[i+1+rtct] >= h[i]){
                    rtct++;
                }
            }
            else if(i == 0){
                while(rtct < h.length-1 && h[i+1+rtct] >= h[i]){
                    rtct++;
                }
            }
            else{
                while(lfct < h.length-1 && h[i-1-lfct] >= h[i]){
                    lfct++;
                }
            }
            maxarea=Math.max(maxarea, (long) (rtct + lfct + 1) *h[i]);
        }
        return maxarea;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] h = new int[n];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        LargestRectangle lr=new LargestRectangle();

        long result = lr.largestRectangle(h);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
