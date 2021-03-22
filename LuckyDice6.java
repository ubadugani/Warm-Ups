package come.example.luckydice;

import java.util.*;

public class LuckyDice6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a perfect number: ");
        int pnumc=scan.nextInt();
        int check=0;
        int i=1;
        do{
            if(pnumc%i ==0){
                check+=i;
            }
            i++;
        }while(i < pnumc);
        if(pnumc == check){
            System.out.println(pnumc+" is a perfect number");
        }
        if(pnumc != check){
            System.out.println(pnumc+" is not a perfect number");
        }
    }
}