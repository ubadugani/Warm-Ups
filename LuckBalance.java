package com.example.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LuckBalance {

    // Complete the luckBalance function below.
    int luckBalance(int k, int[][] contests) {
        Arrays.sort(contests, (a, b) -> Double.compare(a[0], b[0]));
        int runto=0;
        int ll=k;
        for (int i=0;i< contests.length;i++){
            System.out.println(contests[i][0]);
        }
        for (int i = contests.length-1;i >= 0;i--){
            if(ll > 0 && contests[i][1] == 1){
                runto+=contests[i][0];
                ll--;
            }
            else if(ll == 0 && contests[i][1] == 1){
                runto-=contests[i][0];
            }
            else {
                runto+=contests[i][0];
            }
        }
        return runto;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        LuckBalance lb=new LuckBalance();

        int result = lb.luckBalance(k, contests);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
