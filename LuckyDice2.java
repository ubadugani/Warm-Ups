package come.example.luckydice;

import java.util.*;

public class LuckyDice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to see how many cool numbers exist between 1 and it: ");
        int limit=scan.nextInt();
        int coolnums=0;
        for(int i=0;i < (limit+1);i++){
            if(i%3 == 1 && i%4 == 1 && i%5 == 1 && i%6 == 1){
                coolnums++;
            }

        }
        System.out.println("There are "+coolnums+" cool numbers between 1 and "+limit);
    }
}
