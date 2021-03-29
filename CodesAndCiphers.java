package com.example.codesandciphers;

import java.util.*;

public class CodesAndCiphers {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        CodesAndCiphers1 cac1=new CodesAndCiphers1();
        CodesAndCiphers2 cac2=new CodesAndCiphers2();
        CodesAndCiphers3 cac3=new CodesAndCiphers3();
        CodesAndCiphers4 cac4=new CodesAndCiphers4();
        System.out.println("Enter a String to use a rot-13 cipher on either to encode or decode: "); //part 1
        String s= scan.nextLine();
        System.out.println(cac1.deAndEncrypt(s));
        System.out.println("That string encrypted and decrypted using rot-47 is: ");                 //part 2
        System.out.println(cac2.encrypt(s));
        System.out.println(cac2.decrypt(s));
        System.out.println("Enter an integer to encode and decode by a shift of that number: ");    //part 3
        int key= scan.nextInt();
        System.out.println(cac3.encrypt(s,key));
        System.out.println(cac3.decrypt(s,key));
        System.out.println("The string turned into morse code is: ");                               //part 4
        System.out.println(cac4.encode(s));
        System.out.println("Enter a morse code string to turn into normal: ");
        scan.nextLine();
        String mc= scan.nextLine();
        System.out.println(cac4.decode(mc));


    }
}
