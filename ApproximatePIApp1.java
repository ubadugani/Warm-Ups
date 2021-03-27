package com.example.approximatepi;

public class ApproximatePIApp1 {
    public static double PI(int iterations){
        double ans=1;
        for(int i=1;i < iterations+1;i++){
            double jump= (i*2)+1;
            if(i%2 != 0){
                ans-=(1/jump);
            }
            else{
                ans+=(1/jump);
            }
        }
        ans*=4;

        return ans;
    }
}
