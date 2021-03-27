package com.example.changemaker;

public class ChangeMaker7 {
    public static boolean contains(int[] a,int[] b){
        boolean temp=false;
        for(int i=0;i < a.length;i++){
            for(int j=0;j < b.length;j++){
                if(b[j] == a[i+j]){
                    temp=true;
                }
                else {
                    temp=false;
                    j=b.length+500;
                }
            }
            if(temp){
                return true;
            }
        }
        return false;
    }

}
