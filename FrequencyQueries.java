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

public class FrequencyQueries {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        HashMap<Integer,Integer> numfrq= new HashMap<>(queries.size());
        HashMap<Integer,Integer> frqfrq= new HashMap<>(queries.size());
        int quesize= queries.size();
        int decide=0;
        int storval;
        int count;
        List<Integer> storage;
        ArrayList<Integer> resquerie=new ArrayList<>();
        for (int i=0;i < quesize;i++){
            storage=queries.get(i);
            decide=storage.get(0);
            storval=storage.get(1);
            switch (decide){
                case 1:{

                    frqfrq.put(numfrq.get(storval),frqfrq.getOrDefault(numfrq.get(storval),0)-1);
                    numfrq.put(storval,numfrq.getOrDefault(storval,0)+1);
                    frqfrq.put(numfrq.get(storval),frqfrq.getOrDefault(numfrq.get(storval),0)+1);

                    break;
                }
                case 2:{

                    if(numfrq.get(storval) == null || numfrq.get(storval) > 0) {
                        numfrq.put(storval, numfrq.getOrDefault(storval, 1) - 1);

                        frqfrq.put(numfrq.get(storval), frqfrq.getOrDefault(numfrq.get(storval), 1) - 1);

                    }
                    break;
                }
                case 3:{
                    if(frqfrq.get(storval) == null || frqfrq.get(storval) < 1){
                        resquerie.add(0);
                    }
                    else {
                        resquerie.add(1);
                    }
                    break;
                }
            }
        }
        return resquerie;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = freqQuery(queries);

        bufferedWriter.write(
                ans.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}