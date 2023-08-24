package com.example.gscoderpad.high;

public class StairCase {

    public static Integer countSteps(Integer n) {
        int arr[] = new int[n + 1];
        if (n < 4) {
            if (n == 3) {
                return 4;
            }
            if (n == 2) {
                return 2;
            }
            return 1;
        }
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for (int i = 4; i <= n; i++) {
            arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1];
        }
        return arr[n];
    }


    public static boolean doTestsPass() {
        return countSteps(3) == 4
                && countSteps(4) == 7;
    }

    public static void main(String[] args) {
        if (doTestsPass()) {
            System.out.println("All tests pass");
        } else {
            System.out.println("Tests fail.");
        }

        for (Integer n = 1; n <= 5; n++) {
            Integer numberOfCombinations = countSteps(n);
            System.out.println(n + " steps => " + numberOfCombinations);
        }
    }
}