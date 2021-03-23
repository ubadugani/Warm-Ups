package com.example.piglatin;

import java.util.*;

public class PigLatinApp {
    public static void main(String[] args){
        for(int j=2;j > 1;j++){
            Scanner scan = new Scanner(System.in);
            int fvow = 0;
            System.out.println("Enter a String to turn into pig-latin: ");
            String str = scan.next();
            if (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' ||
                    str.charAt(0) == 'o' || str.charAt(0) == 'u') {
                System.out.println(str + "hay");
            } else {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                            str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                        fvow = i;
                        i = str.length() + 500;
                    }
                }
                System.out.println(str.substring(fvow, str.length()) + str.substring(0, fvow)
                        + "ay");
            }
            System.out.println("Would you like to continue converting, y or n?: ");
            String res=scan.next();
            if(res.equals("n")){
                j=-500;
            }
        }
    }
}
