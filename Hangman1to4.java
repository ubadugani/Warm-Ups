package com.example.hangman;

import java.util.*;

public class Hangman1to4 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String[] str = {"Hello", "Goodbye", "Computer", "Science", "Um", "Do", "What","Now"};
        int[] a = {5, 34, 3, -6,  7, 81, 1,  7,  5,  2,  2, 53, 4, 5, 62, 7};   //part 1
        int[] b = {1, 3,  4, 90, -4, 60, 12, 13, 4, -4, -1,  2, 4, 4,  9, 8};
        int with2=0;
        for(int i =0;i < a.length;i++){                                         //part 2
            if(Math.abs(a[i]-b[i]) <= 2){
                with2++;
            }
        }
        System.out.println("The amount of times the difference between two numbers with the same index" +
                " is 2 or less is: "+with2);
        boolean twoct=false;
        boolean fourct=false;
        for(int i=0;i < a.length-1;i++){                                          //part 3
            if(a[i] == a[i+1] && a[i] == 2){
                twoct=true;
            }
            if(a[i] == a[i+1] && a[i] == 4){
                fourct=true;
            }
        }
        if((twoct && !fourct)||(fourct && !twoct)){
            System.out.println("Two/four!");
        }
        else{
            System.out.println("Not two/four");
        }
        int[] c= new int[a.length] ;                                                    //part 4
        int j=a.length-1;
        for(int i=0; i < a.length;i++){
            c[i]=a[j];
            System.out.print(c[i]+" ");
            j--;
        }



    }
}
