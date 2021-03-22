package come.example.luckydice;

import java.util.*;

public class LuckyDice1 {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("Type a number that you want the factors of: ");
        int num = scan.nextInt();
        System.out.print("Factors of "+num+" are: ");
        for(int i =1;i < (num+1) ;i++){
            if(num%i == 0){
                System.out.print(i+" ");
            }
        }

    }

}
