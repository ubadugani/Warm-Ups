package com.example.numberhistogram;

import java.util.*;

public class NumberHistogramApp {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] data=new int[25];
        Random gen=new Random();
        for(int i =0;i < data.length;i++) {
            data[i] = gen.nextInt(10);
        }
        int[] histogram= new int[10];
        for(int i=0;i < data.length;i++){
            histogram[data[i]]++;
        }
        System.out.println("0 occured this many times: "+histogram[0]);
        System.out.println("1 occured this many times: "+histogram[1]);
        System.out.println("2 occured this many times: "+histogram[2]);
        System.out.println("3 occured this many times: "+histogram[3]);
        System.out.println("4 occured this many times: "+histogram[4]);
        System.out.println("5 occured this many times: "+histogram[5]);
        System.out.println("6 occured this many times: "+histogram[6]);
        System.out.println("7 occured this many times: "+histogram[7]);
        System.out.println("8 occured this many times: "+histogram[8]);
        System.out.println("9 occured this many times: "+histogram[9]);




    }
}
