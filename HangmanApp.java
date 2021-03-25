package com.example.hangman;

import java.util.*;

public class HangmanApp {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String[] secretWord={"c","o","m","p","u","t","e","r"};
        int guesses= secretWord.length;
        String[] masked=new String[secretWord.length];
        for(int i=0;i <secretWord.length;i++){
            masked[i]="_";
        }
        for(int i=guesses;i > 0;i--) {
            System.out.println("You have "+i+" guesses left");
            System.out.println("Enter a single character as a guess: ");
            String gue = scan.next();
            for(int j=0;j < secretWord.length;j++){
                if(gue.equals(secretWord[j])){
                    masked[j]=gue;
                }
            }
            System.out.print("{");
            for(int k=0;k < secretWord.length;k++){
                if(k == secretWord.length-1){
                    System.out.print(masked[k]);
                }
                else {
                    System.out.print(masked[k] + ", ");
                }
            }
            System.out.println("}");
        }
        boolean comp=true;
        for(int i=0; i <secretWord.length;i++){
            if(!secretWord[i].equals(masked[i])){
                comp =false;
            }
        }
        if(comp){
            System.out.println("You win");
        }
        else{
            System.out.println("You lose");
        }

    }
}
