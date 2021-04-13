package com.example.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalancedBrackets {
    // 3 test cases out of 20 were wrong

    // Complete the isBalanced function below.
    String isBalanced(String s) {
        Stack<Character> cs=new Stack<>();
        boolean validilty=true;
        for(char i:s.toCharArray()){
            if(i == '{'){
                cs.push('}');
            }
            else if(i == '['){
                cs.push(']');
            }
            else if(i == '('){
                cs.push(')');
            }
            else if(cs.empty() || cs.pop() != i){
                return "NO";
            }
        }

        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            BalancedBrackets ib=new BalancedBrackets();

            String result = ib.isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
