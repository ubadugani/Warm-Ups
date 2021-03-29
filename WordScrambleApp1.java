package com.example.wordscramble;

public class WordScrambleApp1 {
    public static void wordScramble(String line){
        String tempS="";
        int retvallastpos;
        for (String retval: line.split(" ")) {
            retvallastpos=retval.length()-1;
            char[] car=retval.toCharArray();
            char tempc=' ';
            if(car.length > 1) {
                tempc = car[1];
            }

            for(int i=1; i < retvallastpos;i++){
                if(i == retvallastpos-1){
                    car[i]=tempc;
                }
                else {
                    car[i] = car[i+1];
                }
                tempS=car.toString();
            }
            System.out.print(car);
            System.out.print(" ");

        }
        }
    }

