package com.example.piglatin;

import java.util.*;

public class PigLatin7 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your full e-mail address: ");
        String em= scan.nextLine();
        int atloc= em.indexOf("@")+1;
        System.out.println(em.substring(atloc,em.length()));
    }
}
