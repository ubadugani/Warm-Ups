package com.example.approximatepi;

import java.util.Random;

public class ApproximatePI6 {
    public static int rollDice(int numFaces){
        Random random=new Random();
        return random.nextInt(numFaces+1)+1;
    }
}
