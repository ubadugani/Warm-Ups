package com.exaple.warmup5;

import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        System.out.println("This is a text based calculator, which operation would you like to do: ");
        System.out.println("1 - addition(+)");
        System.out.println("2 - subtraction(-)");
        System.out.println("3 - multiplication(*)");
        System.out.println("4 - division(/)");
        System.out.println("5 - modulus(%)");
        Scanner scan = new Scanner(System.in);
        int operation = scan.nextInt();
        while(operation<1||operation>5){
            System.out.println("That is not a valid number, please try again.");
            operation = scan.nextInt();
        }
        System.out.println("Enter your first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter your second number: ");
        double num2 = scan.nextDouble();
        switch (operation) {
            case 1:
                addition add=new addition();
                add.adding(num1,num2);
                break;
            case 2:
                subtraction minus=new subtraction();
                minus.subtracting(num1,num2);
                break;
            case 3:
                multiplication times=new multiplication();
                times.multiplying(num1,num2);
                break;
            case 4:
                division div=new division();
                div.dividing(num1,num2);
                break;
            case 5:
                modulus mod=new modulus();
                mod.modulo(num1,num2);
                break;
            default:
        }
    }
}
    class addition extends operator {
    public void adding(Double num1,Double num2) {
        System.out.println("Your answer is "+(num1+num2));
    }

}
    class subtraction extends operator{
    public void subtracting(Double num1, Double num2) {
        System.out.println("Your answer is "+(num1-num2));
    }
    }
    class multiplication extends operator{
    public void multiplying(Double num1, Double num2) {
        System.out.println("Your answer is "+(num1*num2));
    }
    }
    class division extends operator {
        public void dividing(Double num1, Double num2) {
            System.out.println("Your answer is "+(num1/num2));
        }
    }
    class modulus extends operator {
        public void modulo(Double num1, Double num2) {
            System.out.println("Your answer is "+(num1%num2));
        }
    }

