package com.example.gscoderpad.medium;

public class FindDuplex {
    public static void main(String[] args) {
        int[] array = {12, 3, 4, 1, 6, 7,9};
        int sum = 16;
        findDuplex(array,sum);

    }

    private static void findDuplex(int[] array, int sum) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i+1; j < array.length; j++) {
                if (array[i]+array[j]==sum)
                {
                    System.out.println(array[i]+" + "+array[j]+" == "+sum);

                }
            }
        }


    }
}

