package com.example.gscoderpad.medium;

// Takes a string str and returns the int value represented by
// the string.
//For example, atoi("42") returns 42.
public class Atio {
    public static void main(String[] args) {
        System.out.println(atoi("431"));

    }

    public static int atoi(String str) {
        int result = 0;
        for (char c : str.toCharArray()) {
            result = result * 10 + c - '0';//=(max(int,type of a,type of b))
        }
        return result;
    }
}
