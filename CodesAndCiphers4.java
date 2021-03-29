package com.example.codesandciphers;

public class CodesAndCiphers4 {


    public static char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', ' '};
    public static String[] morseCode = { ".-",   "-...", "-.-.", "-..",  ".",
            "..-.", "--.",  "....", "..",   ".---",
            "-.-",  ".-..", "--",   "-.",   "---",
            ".--.", "--.-", ".-.",  "...",  "-",
            "..-",  "...-", ".--",  "-..-", "-.--",
            "--..", "|" };

    public static StringBuilder encode(String s){
        StringBuilder shifted=new StringBuilder();

        for(int i=0;i < s.length();i++){
            for (int j=0;j < letter.length;j++){
                if(s.charAt(i) == letter[j]){
                    shifted.append(morseCode[j]+" ");
                }

            }

        }




        return shifted;
    }
    public static StringBuilder decode(String s){
        StringBuilder shifted=new StringBuilder();
        for(String retval: s.split(" ")) {
            for (int i = 0; i < letter.length; i++) {
                    if (retval.equals(morseCode[i])) {
                        shifted.append(letter[i]);
                    }
            }
        }



        return shifted;
    }

}
