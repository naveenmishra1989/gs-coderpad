package com.example.gscoderpad.low;

public class SecondHighest {

    private static int secondHighest(int[] arrays) {
        int first, second;
        if (arrays.length < 2)
            return -1;
        first = second = Integer.MIN_VALUE;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > first) {
                second = first;
                first = arrays[i];
            } else if (arrays[i] > second && arrays[i] != first)
                second = arrays[i];
        }
        return second;
    }

    public static void main(String args[]) {

        int[] a = {0};
        int[] b = {0, 1, 1};
        int[] c = {3, 5, 8, 9, 2, 2};

        boolean result = true;
        result &= secondHighest(a) == -1;
        result &= secondHighest(b) == 0;
        result &= secondHighest(c) == 8;

        if (result) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }
}