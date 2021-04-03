package com.example.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//I'm confident this one works, but hackerrank isn't accepting it

public class SpecialStringAgain {

    // Complete the substrCount function below.
    long substrCount(int n, String s) {
        int count=0;
        long palct=0L;
        HashMap<Integer,String> stor=new HashMap<Integer,String>();
        for (int i=0; i < n;i++) {
            for (int j=i+1;j <= n;j++) {
                stor.put(count,s.substring(i, j));
                count++;
            }
        }
        for (int i=0;i < stor.size();i++){
            boolean ispal=false;
            int revck=0;
            int storlen=stor.get(i).length();
            System.out.println("stor at i " +i+" is "+stor.get(i));
            if(storlen == 1){
                ispal =true;
                System.out.println(stor.get(i));
            }
            for(int j=0;j < storlen/2;j++){
                ispal=true;
                if(stor.get(i).charAt(j)  != stor.get(i).charAt(storlen-1-j)){
                    ispal=false;
                    System.out.println("Not equal");
                    j=storlen;
                }
                else System.out.println(stor.get(i).charAt(j)+" "+stor.get(i).charAt(storlen-1-j));


            }
            if (ispal){
                palct++;
                System.out.println(palct);
            }
        }
        return palct;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        SpecialStringAgain sc=new SpecialStringAgain();

        long result = sc.substrCount(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

