package com.example.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

// this one times out

public class FradulentActivityNotifications {

    // Complete the activityNotifications function below.
    int activityNotifications(int[] expenditure, int d) {
        int noticect=0;
        int counter=0;
        double b=d;
        double median = 0;
        int med;
        for(int i =d;i < expenditure.length;i++){
            int[] dayscheck=Arrays.copyOfRange(expenditure,counter,counter+d);
            quickSort(dayscheck,0,d-1);
            med=d/2;
            if(d%2 != 0){
                median=dayscheck[med];
            }
            if(d%2 == 0){
                median=(double)dayscheck[med-1] + (double)dayscheck[med]/2;
            }
            if(expenditure[i] >= median*2){
                noticect++;
            }
            counter++;
        }
        return noticect;
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

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }
        FradulentActivityNotifications an=new FradulentActivityNotifications();

        int result = an.activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}