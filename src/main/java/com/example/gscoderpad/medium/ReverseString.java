package com.example.gscoderpad.medium;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("naveen"));
    }
    private static String reverseString(String str){
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
