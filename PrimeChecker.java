package com.example.primechecker;
import java.util.*;
public class PrimeChecker {
    public static void main(String[] args){
        int choice=1;
        while(choice == 1){
            System.out.println("Enter an integer to check if prime: ");
            Scanner scan=new Scanner(System.in);
            int primecheck = scan.nextInt();
            int check=10;
            for(int i=primecheck;i > 1;i--){

                if(i == 1 || i == 2){
                    check=0;
                }
                if(primecheck%(i-1) != 0){
                    check=0;
            }
                if(primecheck%(i-1) == 0 && i !=1 && i != 2){
                    check=-25;
                    i=-50;
                }
            }
            if(check == 0){
                System.out.println(primecheck+" is a prime number");
            }
            if(check < 0){
                System.out.println(primecheck+" is not a prime number");
            }
            if(primecheck ==1){
                System.out.println(primecheck+" is a prime number");
            }

            System.out.println("Would you like to check another number? 1 for yes 2 for no: ");
            choice = scan.nextInt();
        }
    }
}
