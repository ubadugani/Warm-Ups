package com.example.hangman;

import java.util.*;

public class Hangman5and13 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String[] str = {"Hello", "Goodbye", "Computer", "Science", "Um", "Do", "What","Now"};
        int[] a = {5, 34, 3, -6,  7, 81, 1,  7,  5,  2,  2, 53, 4, 5, 62, 7};   //part 5
        int[] b = {1, 3,  4, 90, -4, 60, 12, 13, 4, -4, -1,  2, 4, 4,  9, 8};
        int alo=a[0];
        int blo=b[0];
        int ahi=a[0];
        int bhi=b[0];
        for(int i =0; i < a.length;i++){
            alo=Math.min(alo,a[i]);
            blo=Math.min(blo,b[i]);
            ahi=Math.max(ahi,a[i]);
            bhi=Math.max(bhi,b[i]);
        }
        System.out.println("The range of array a is: "+(ahi-alo));
        System.out.println("The range of array b is: "+(bhi-blo));
        //7 to 12 are just repeats from the Roman Numerals lab

        String[] hiBye={"byhigh","hit","byebye!","hibye","hilt"};           //part 13
        int hict=0;
        int byect=0;
        for(int i=0;i < hiBye.length;i++){
            for(int j=0;j < hiBye[i].length()-1;j++){
                if(hiBye[i].substring(j,j+2).equals("hi")){
                    hict++;
                }}
        }
        for(int i=0;i < hiBye.length;i++){
            for(int j =0; j < hiBye[i].length()-2;j++){
                if(hiBye[i].substring(j,j+3).equals("bye")){
                    byect++;
                }}
        }
        if(hict == byect){
            System.out.println("Same hi/bye");
        }
        else{
            System.out.println("Not same hi/bye");
        }

    }
}
