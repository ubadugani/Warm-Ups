package com.example.warmup6;
import java.util.Scanner;
public class WarmUp6 {
    public static void main(String[] args){
        int hand1;
        int hand2;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter player 1 hand: ");
        hand1 = scan.nextInt();
        System.out.println("Enter player 2 hand: ");
        hand2 = scan.nextInt();
        if(hand1>hand2){
            if(hand1<22){
                System.out.println("Player 1 wins!");
            }
            if(hand1>21){
                if(hand2<22){
                    System.out.println("Player 2 wins!");
                }
                else{
                    System.out.println("Both players bust!");
                }
            }

        }
        if(hand2>hand1){
            if(hand2<22){
                System.out.println("Player 2 wins!");
            }
            if(hand2>21){
                if(hand1<22){
                    System.out.println("Player 1 wins!");
                }
                else{
                    System.out.println("Both players bust!");
                }
            }

        }
        if(hand1==hand2){
            if(hand1<22){
            System.out.println("Tie!");
        }
            else{
                System.out.println("Both players bust!");
            }
        }


    }
}
