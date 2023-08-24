package com.example.gscoderpad.low;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(371));
    }

    private static boolean isArmstrongNumber(int input){
        //finding the length of the input
        int length = String.valueOf(input).length();
        int sum = 0;
        int num = input;
        while (num>0){

            int temp = num%10;
            sum += Math.pow(temp,length);
            num /=10;
        }
        return (sum == input);
    }

}
