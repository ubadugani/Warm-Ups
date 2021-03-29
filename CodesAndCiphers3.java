package com.example.codesandciphers;

public class CodesAndCiphers3 {
    public static StringBuilder encrypt(String s,int key){
        StringBuilder shifted=new StringBuilder();
        for(int i=0;i < s.length();i++){
            int temp=(int) s.charAt(i);
            if(temp > 90-key && temp < 91){
                temp=90-temp;
                temp=key+64-temp;
            }
            else if(temp > 122-key && temp < 123){
                temp=122-temp;
                temp=96+key-temp;
            }
            else if(temp < 65 || (temp >90 && temp < 97) || temp > 122){
                temp=temp;
            }
            else{
                temp+=key;
            }
            shifted.append ((char)temp);
        }
        return shifted;
    }

    public static StringBuilder decrypt(String s,int key){
        StringBuilder shifted=new StringBuilder();
        for(int i=0;i < s.length();i++){
            int temp=(int) s.charAt(i);
            if(temp < 65+key && temp > 64){
                temp=temp-65;
                temp=key+65-temp;
            }
            else if(temp < 97+key && temp > 96){
                temp=temp-97;
                temp=123-key+temp;
            }
            else if(temp < 65 || (temp >90 && temp < 97) || temp > 122){
                temp=temp;
            }
            else{
                temp-=key;
            }
            shifted.append ((char)temp);
        }
        return shifted;

    }


}
