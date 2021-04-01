package com.example.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HashTablesRansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note, int m, int n) {
        boolean wrong=false;
        HashMap<String,Integer> magCheck=new HashMap<String,Integer>();
        for(int i=0;i < m;i++){
            if(magCheck.containsKey(magazine[i])){
                magCheck.put(magazine[i],magCheck.get(magazine[i])+1);
            }
            else{
                magCheck.put(magazine[i],1);
            }
        }
        for(int i=0;i < n;i++){
            if(!magCheck.containsKey(note[i])){
                wrong=true;
            }
            else{
                if(magCheck.get(note[i]) > 1){
                    magCheck.put(note[i],magCheck.get(note[i])-1);
                }
                else {
                    magCheck.remove(note[i]);
                }
            }
        }
        if(wrong){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note, m, n);

        scanner.close();
    }
}
