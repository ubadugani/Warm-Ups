package come.example.luckydice;

import java.util.*;

public class LuckyDiceApp {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner scan = new Scanner(System.in);
        int total=0;
        int j;
        int i;
        Double average=0.00;
        System.out.println("Type the amount of faces you want on both the die: ");
        int dieface=scan.nextInt();
        System.out.println("How many times would you like to run the simulation? ");
        int simul=scan.nextInt();
        for(i =0;i <= simul;i++){
            total=0;
            j=0;
            while(total < 1000){

                total+=rand.nextInt(20)+2;
                total+=rand.nextInt(20)+2;
                j++;
            }
            System.out.println("Simulation "+i+" - number of rolls to reach 1000 >>> "+j);
            average+=j;
        }
        average/=i;
        System.out.println("Average number of rolls, for all simulations >>> "+average);


    }
}