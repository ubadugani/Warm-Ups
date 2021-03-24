package com.example.romannumerals;

import java.util.*;

public class RomanNumerals8to10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {"Hello", "Goodbye", "Computer", "Science", "Um", "Do", "What", "Now"};
        int ect = 0;
        for (int i = 0; i < str.length; i++) {                       //part 8
            boolean hase = false;
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == 'e') {
                    hase = true;
                }

            }
            if (hase) {
                ect++;
            }
        }
        System.out.println("The number of strings that have 'e' in them are: " + ect);
        boolean haso = false;
        for (int i = 0; i < str.length; i++) {                       //part 9
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == 'o') {
                    haso = true;
                }

            }
        }
        if(haso){
            System.out.println("At least one o");
        }
        else{
            System.out.println("No o's!");
        }

        String[] mag8={"No","Yes","Maybe","Ask again", "Cannot Predict Now"};      //part 10
        boolean ask=true;
        Random rand=new Random();
        while(ask){
            System.out.println("Ask the magic 8 ball a question: ");
            String que= scan.nextLine();
            System.out.println(mag8[rand.nextInt(mag8.length)]);
            System.out.println("Would you like to ask another question? y or n");
            que= scan.nextLine();
            if(que.equals("n")){
                ask=false;
            }
        }


    }
}
