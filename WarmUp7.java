package com.example.warmup7;
import java.util.Scanner;
public class WarmUp7 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int day;
        int month;
        System.out.println("Enter month: ");
        month = scan.nextInt();
        System.out.println("Enter day: ");
        day = scan.nextInt();
        if(month<=3 ||month== 12){
            if(month==12 && day<16){
                System.out.println("It is Fall");
            }
            if(month==3&&day>15){
                System.out.println("It is Spring");
            }
            /*else{
                System.out.println("It is Winter");
            }*/
        }
        if(month<=6 &&month>=3){
            if(month==3 && day<16){
                System.out.println("It is Winter");
            }
            if(month==6&&day>15){
                System.out.println("It is Summer");
            }
            /*else{
                System.out.println("It is Spring");
            }*/
        }
        if(month<=9 &&month>=6){
            if(month==6 && day<16){
                System.out.println("It is Spring");
            }
            if(month==9&&day>15){
                System.out.println("It is Fall");
            }
            /*else{
                System.out.println("It is Summer");
            }*/
        }
        if(month<=12 &&month>=9){
            if(month==9 && day<16){
                System.out.println("It is Summer");
            }
            if(month==12&&day>15){
                System.out.println("It is Winter");
            }
            /*else{
                System.out.println("It is Fall");
            }*/
        }



    }
}
