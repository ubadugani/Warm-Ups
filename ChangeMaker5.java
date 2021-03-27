package com.example.changemaker;

public class ChangeMaker5 {
    public static double convertTemp(double temp, boolean isF){
        double convNum;
        if(isF){
            convNum=temp-32;
            convNum=convNum*5/9;
        }
        else{
            convNum=temp*9/5;
            convNum+=32;
        }

        return convNum;
    }
}
