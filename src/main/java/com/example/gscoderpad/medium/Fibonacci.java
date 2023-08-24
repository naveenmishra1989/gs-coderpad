package com.example.gscoderpad.medium;

public class Fibonacci {
    public static void main(String[] args) {

        for(int i=0; i<5; i++)
            System.out.println(fibonacciUsingRecursion(i));
        System.out.println("-----------");
        for(int i=0; i<5; i++)
            System.out.println(fibonacciUsingIterative(i));

    }

    private static int fibonacciUsingRecursion(int num){

        if(num<=1){
            return num;
        }
        return fibonacciUsingRecursion(num-2)+fibonacciUsingRecursion(num-1);
    }

    private static int fibonacciUsingIterative(int num){
        int a = 0;
        int b = 1;
        int sum = 0;
        if(num<=1)
            return num;

        while(num>=2){
            sum = a + b;
            a = b;
            b = sum;
            num--;

        }

        return sum;
    }



}
