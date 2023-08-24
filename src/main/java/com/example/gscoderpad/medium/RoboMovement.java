package com.example.gscoderpad.medium;

import java.util.Arrays;

public class RoboMovement {
    private static int[] walk(String path) {
        int x = 0, y = 0;
        for (char c : path.toCharArray()) {
            if (c == 'U')
                y++;
            else if (c == 'D')
                y--;
            else if (c == 'R')
                x++;
            else if (c == 'L')
                x--;
        }
        return new int[]{x, y};
    }

    private static int[] run(String path) {
        int x = 0, y = 0;
        for (char ch : path.toCharArray()) {
            switch (ch) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;

            }
        }

        return new int[]{x, y};
    }


    public static boolean isEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean pass() {
        boolean res = true;

        {
            String test = "UUU";
            int[] result = run(test);
            res &= isEqual(result, new int[]{0, 3});
        }

        {
            String test = "ULDR";
            int[] result = run(test);
            res &= isEqual(result, new int[]{0, 0});
        }

        {
            String test = "ULLLDUDUURLRLR";
            int[] result = run(test);
            res &= isEqual(result, new int[]{-2, 2});
        }

        {
            String test = "UP LEFT 2xDOWN DOWN RIGHT RIGHT UP UP";
            int[] result = run(test);
            res &= isEqual(result, new int[]{1, 1});
        }

        return res;
    }

    public static void main(String[] args) {
        if (pass()) {
            System.out.println("Pass");
        } else {
            System.out.println("Test failures");
        }
    }

}
