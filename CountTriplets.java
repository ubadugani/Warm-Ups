package com.example.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CountTriplets {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r,int n) {
        long trict=0;

        Map<Long,Long> small=new HashMap<Long,Long>();
        Map<Long,Long> big=new HashMap<Long,Long>();

        for(long i: arr ){
            //int temp= Math.toIntExact(arr.get(i));
            big.put(i,big.getOrDefault(i,0L)+1);
        }

        for(int i=0;i < arr.size();i++){
            long med=arr.get(i);
            long sm=0;
            long la=0;
            big.put(med,big.getOrDefault(med,0L)-1);
            if(small.containsKey(med/r) && med%r == 0){
                sm = small.get(med / r);
            }
            if (big.containsKey(med * r)) {
                la = big.get(med * r);
            }
            trict+=sm*la;

            small.put(med,small.getOrDefault(med,0L)+1);
        }

        return trict;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());

        long ans = countTriplets(arr, r, n);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
