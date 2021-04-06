package com.example.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IceCreamParlor {
    // Complete the whatFlavors function below.
    void whatFlavors(int[] cost, int money) {
        HashMap<Integer,Integer> storval=new HashMap<>();

        for (int i=0;i < cost.length;i++){
            int remain=money-cost[i];
            if (storval.containsKey(remain)){
                System.out.println((storval.get(remain)+1)+" "+(i+1));
                return;
            }
            storval.put(cost[i],i);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            IceCreamParlor wf=new IceCreamParlor();

            wf.whatFlavors(cost, money);
        }

        scanner.close();
    }
}


