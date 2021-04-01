package com.example.hackerrank;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MarkAndToys {

    // Complete the maximumToys function below.
    int maximumToys(int[] price, int k) {
        int toyct=0;
        int amtleft=k;
        MarkAndToys qs=new MarkAndToys();
        int [] prices=qs.quickSort(price,0,price.length-1);
        for (int i=0;i < prices.length && amtleft > 0;i++){
            if(amtleft >= prices[i]){
                toyct++;
                amtleft-=prices[i];
            }
        }
        return toyct;
    }
    int[] quickSort(int[] arr, int low, int high)
    {
        if (arr == null || arr.length == 0){
            return arr;
        }

        if (low >= high){
            return arr;
        }

        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        int i = low, j = high;
        while (i <= j)
        {
            while (arr[i] < pivot)
            {
                i++;
            }
            while (arr[j] > pivot)
            {
                j--;
            }
            if (i <= j)
            {
                swap (arr, i, j);
                i++;
                j--;
            }
        }
        if (low < j){
            quickSort(arr, low, j);
        }
        if (high > i){
            quickSort(arr, i, high);
        }
        return arr;
    }

    void swap (int array[], int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }






    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        MarkAndToys mt=new MarkAndToys();
        int result = mt.maximumToys(prices, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}