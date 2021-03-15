package com.exaple.warmup5;
import java.util.Scanner;
public class WarmUp5 {

    public static void main(String[] args){
        System.out.println("This is a text based calculator, which operation would you like to do: ");
        System.out.println("1 - addition(+)");
        System.out.println("2 - subtraction(-)");
        System.out.println("3 - multiplication(*)");
        System.out.println("4 - division(/)");
        System.out.println("5 - modulus(%)");
        Scanner scan = new Scanner(System.in);
        double result;
        int operation = scan.nextInt();
        System.out.println("Enter your first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter your second number: ");
        double num2 = scan.nextDouble();

        if (operation ==1){
            result = num1+ num2;
            System.out.println(num1+" + "+num2+" is: "+result);
        }
        if (operation ==2){
            result = num1-num2;
            System.out.println(num1+" - "+num2+" is: "+result);
        }
        if (operation ==3){
            result = num1*num2;
            System.out.println(num1+" * "+num2+" is: "+result);
        }
        if (operation ==4){
            result = num1/num2;
            System.out.println(num1+" / "+num2+" is: "+result);

        }
        if (operation ==5){
            result = num1%num2;
            System.out.println(num1+" % "+num2+" is: "+result);
        }




    }

}
