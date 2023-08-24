package com.example.gscoderpad.low;

public class PascalTriangle {

    public static int pascal(int col, int row) {

       // int result = 0;
        int[][] arr = new int[row + 1][row + 1];

        for (int i = 0; i <= row; i++) {

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = (arr[i - 1][j - 1]) + (arr[i - 1][j]);

                }
              //  System.out.print(arr[i][j] + " ");
                if (col == j && row == i)
                    return arr[i][j];
            }
           // System.out.println();

        }

        return -1;
    }


    public static void main(String[] args) {
        if (pascal(0, 0) == 1 &&
                pascal(1, 2) == 2 &&
                pascal(5, 6) == 6 &&
                pascal(4, 8) == 70 &&
                pascal(6, 6) == 1) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
        }
    }

    private static String space(int sp) {
        StringBuilder sb = new StringBuilder();
        for (int i = sp; i >= 1; i--) {
            sb.append(" ");
        }
        return sb.toString();
    }






    private static void printTriangle(int num) {
        for (int line = 1; line <= num; line++) {
            int count = 1;
            System.out.print(space(num - line));
            for (int col = 1; col <= line; col++) {
                System.out.print(count + "  ");
                count = count * (line - col) / col;


            }//for

            System.out.println();

        }//for
    }
}
