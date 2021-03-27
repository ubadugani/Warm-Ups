package com.example.approximatepi;

import java.util.Random;

public class ApproximatePI5 {
    public static int rollDice(){
        Random random=new Random();
        return random.nextInt(7)+1;
    }
}
