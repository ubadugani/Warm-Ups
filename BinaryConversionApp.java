package com.example.binaryconversion;

import java.util.*;

public class BinaryConversionApp {
    public static void main(String[] args){
        String cont="y";
        while(cont.equals("y")) {
            Scanner scan = new Scanner(System.in);
            int convnum = 0;
            System.out.println("Enter a binary number to convert: ");
            String binar = scan.nextLine();
            int[] binary = new int[binar.length()];
            int j = 0;
            String temp;
            for (int i = binar.length() - 1; i >= 0; i--) {
                temp = String.valueOf(binar.charAt(j));
                binary[i] = Integer.parseInt(temp);
                convnum += (binary[i] * Math.pow(2, i));
                j++;
            }
            System.out.println("The binary number converted is: " + convnum);
            System.out.println("Would you like to keep converting? y or n");
            cont=scan.next();
        }
    }
}
