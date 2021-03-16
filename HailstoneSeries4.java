package com.example.hailstoneseries;

import java.util.*;

public class HailstoneSeries4 {
    public static void main(String[] args){
        int pin=1234;
        Scanner scan=new Scanner(System.in);
        int input=0000;
        int tries=3;
        while(tries >0){
            System.out.println("Please enter your pin: ");
            input=scan.nextInt();
            tries--;
            if(input == pin){
                System.out.println("Access Granted ");
                tries=-1;
            }
            if(tries == 0){
                System.out.println("Attempt limit reached. Account has been locked");
            }
            if(input != pin) {
                System.out.println("Invalid PIN, try again ");

            }

        }

    }
}
