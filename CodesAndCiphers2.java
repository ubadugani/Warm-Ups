package com.example.codesandciphers;

public class CodesAndCiphers2 {
    public static StringBuilder encrypt(String s){
        StringBuilder shifted=new StringBuilder();
        for(int i=0;i < s.length();i++){
            int temp=(int) s.charAt(i);
            if(temp > 79){
                temp=126-temp;
                temp=47+32-temp;
            }
            else{
                temp+=47;
            }
            shifted.append ((char)temp);
        }
        return shifted;
    }

    public static StringBuilder decrypt(String s){
        StringBuilder shifted=new StringBuilder();
        for(int i=0;i < s.length();i++){
            int temp=(int) s.charAt(i);
            if(temp < 80){
                temp=126+temp-32-47;
            }
            else{
                temp-=47;
            }
            shifted.append ((char)temp);
        }
        return shifted;
    }

}
