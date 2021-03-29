package com.example.wordscramble;

import java.util.*;

public class WordScramble {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        WordScramble1 ws1=new WordScramble1();
        WordScramble2 ws2=new WordScramble2();
        WordScramble3 ws3=new WordScramble3();
        WordScramble4 ws4=new WordScramble4();
        WordScramble5 ws5=new WordScramble5();
        WordScramble7 ws7=new WordScramble7();
        WordScramble8 ws8=new WordScramble8();
        WordScramble9 ws9=new WordScramble9();
        WordScramble10 ws10=new WordScramble10();

        System.out.println("Enter first char: ");
        char letter = scan.next().charAt(0);
        System.out.println("Enter second char: ");
        char b = scan.next().charAt(0);
        System.out.println("Enter a String: ");
        scan.nextLine();
        String s=scan.nextLine();
        System.out.println("Enter an integer to check if that amount of characters at the beginning of the string " +
                " appear later in the string: ");
        int n= scan.nextInt();
        System.out.println("Is the first char 'a': "+ws1.isLetterA(letter));                   //part 1
        System.out.println("Does the string entered have at least 2 a's: "+ws2.hasTwoA(s));    //part 2
        System.out.println("Is the first char a vowel: "+ws3.isVowel(letter));                 //part 3
        System.out.println("There are this many vowels in the String: "+ws4.numVowels(s));     //part 4
        System.out.println("Is there an even amount of the first and second chars in the " +   //part 5
                "String: "+ws5.evenChars(s,letter,b));
        System.out.println("Does the first char occur in the String twice in a row: "+         //part 7
                ws7.twoInARow(s,letter));
        System.out.println("The string with all vowels capitalized: "+ws8.capitalizedVowels(s));  //part 8
        System.out.println("The longest word in the string is: "+ws9.longestWord(s));          //part 9
        System.out.println("Does the prefix amount of n appears in the string: "+ws10.containsPrefix(s,n));


    }


}
