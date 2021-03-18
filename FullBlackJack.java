package com.example.fullblackjack;
import java.util.*;
public class FullBlackJack {
    public static void main(String[] args){
        for(int i = 1; i == 1;i--) {
            System.out.println("Welcome to Black Jack");
            int total=0;
            Random randomGen = new Random();
            int cardValue = randomGen.nextInt(10) + 2;
            Scanner scan = new Scanner(System.in);
            int dealertotal=cardValue;
            cardValue = randomGen.nextInt(10) + 2;
            dealertotal+=cardValue;
            System.out.println("The dealer has their cards");
            cardValue = randomGen.nextInt(10) + 2;
            System.out.println("Your first card is >>> " + cardValue);
            total+=cardValue;
            cardValue = randomGen.nextInt(10) + 2;
            total+=cardValue;
            System.out.println("Your second card is >>> " + cardValue);
            System.out.println("Your total is >>> "+total);
            System.out.println("Enter 1 to hit or 2 to stay >>> ");
            int decision= scan.nextInt();
            while(decision < 1 || decision > 2){
                System.out.println("Not a valid input, enter 1 to hit or 2 to stay >>> ");
                decision=scan.nextInt();
            }
            while(decision == 1){
                cardValue=randomGen.nextInt(10)+2;
                total+=cardValue;
                System.out.println("Next card >>> "+cardValue);
                System.out.println("Current total is >>> "+total);
                if(dealertotal < 15){
                    cardValue = randomGen.nextInt(10) + 2;
                    dealertotal+=cardValue;
                }
                System.out.println("Enter 1 to hit or 2 to stay >>> ");
                decision= scan.nextInt();
                while(decision < 1 || decision > 2){
                    System.out.println("Not a valid input, enter 1 to hit or 2 to stay >>> ");
                    decision=scan.nextInt();
                }
                if(total > 21){
                    decision = 5;
                }
            }
            System.out.println("You have >>> "+total);
            System.out.println("Dealer shows >>> "+dealertotal);
            if(total < 22){
                if(dealertotal > 21 || total > dealertotal){
                    System.out.println("You win!");
                }
            }
            if(total > 21){
                if(dealertotal < 22){
                    System.out.println("Bust! Dealer wins!");
                }
                if(dealertotal > 21){
                    System.out.println("Both players bust!");
                }
            }
            System.out.println("Enter 1 to play again or 2 to quit >>> ");
            i= scan.nextInt();
            i++;
            }

        }
    }

