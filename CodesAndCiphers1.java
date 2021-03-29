package com.example.codesandciphers;

public class CodesAndCiphers1 {
    public static StringBuilder deAndEncrypt(String s){
        StringBuilder shifted=new StringBuilder();
        for(int i=0;i < s.length();i++){
            int temp=(int) s.charAt(i);
            if((temp >= 78 && temp <= 90)||(temp >= 110 && temp <= 122)){
                temp-=13;
            }
            else{
                temp+=13;
            }
            shifted.append ((char)temp);
        }
        return shifted;
    }

}
