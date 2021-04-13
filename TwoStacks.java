package com.example.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;




public class TwoStacks {
    public static class MyQueue<Q>{
        Stack<Q> stackNewTop=new Stack<Q>();
        Stack<Q> stackOldTop=new Stack<Q>();

        public void enqueue(Q val){
            stackNewTop.push(val);
        }

        public Q peek(){
            if (stackOldTop.isEmpty()){
                while(!stackNewTop.isEmpty()){
                    stackOldTop.push(stackNewTop.pop());
                }
            }
            return stackOldTop.peek();
        }

        public Q dequeue(){
            if (stackOldTop.isEmpty()){
                while (!stackNewTop.isEmpty()){
                    stackOldTop.push(stackNewTop.pop());
                }
            }
            return stackOldTop.pop();
        }

    }
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}