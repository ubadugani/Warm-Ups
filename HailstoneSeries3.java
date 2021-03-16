package com.example.hailstoneseries;

public class HailstoneSeries3 {
    public static void main(String[] args){
        double effectloss=0.12;
        Double effectiveness=100.00;
        int month=0;
        for(int i =0;effectiveness > 50;i++){
            System.out.println("Month "+i+" potency: "+effectiveness);
            effectiveness*=0.88;
            month=i+1;
        }
        System.out.println("Month "+month+" potency: "+effectiveness+" <<< DISCARD");
    }
}
