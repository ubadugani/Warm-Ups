package com.example.warmup8;
import java.util.Scanner;
public class WarmUp8 {
    public static void main(String[] args){
        int guess;
        Scanner scan=new Scanner(System.in);
        System.out.println("How many guess would you like? ");
        int guesses=scan.nextInt();
        System.out.println("You have "+guesses+" guesses");
        int numtoguess= (int)(Math.random() * (1000 - 1 + 1)) ;
        int i;
        for(i = guesses; i > 0; i--){
            System.out.println("Guess the number between the range of 1 - 1000");
            guess=scan.nextInt();
            if(guess < numtoguess){
                System.out.println("You are incorrect, the number is higher than that");
                System.out.println("You have "+ (i-1)+ " guesses left");
            }
            if(guess > numtoguess){
                System.out.println("You are incorrect, the number is lower than that");
                System.out.println("You have "+ (i-1)+ " guesses left");
            }
            if(guess == numtoguess){
                System.out.println("You got it right, the number was "+numtoguess);
                i=-10;
            }
        }
        if (i > -10) {
            System.out.println("You ran out of guesses, the number was: " + numtoguess);
        }

    }
}
