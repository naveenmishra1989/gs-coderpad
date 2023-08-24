package com.example.gscoderpad.medium;

public class FindTriplet {
    private static boolean findTriplet(int[] array,int sum){

        for (int i = 0; i <array.length-2 ; i++) {

            for (int j = i+1; j <array.length-1 ; j++) {

                for (int k = j+1; k <array.length ; k++) {
                    if (array[i]+array[j]+array[k]==sum)
                    {
                        System.out.printf(array[i]+" + "+array[j]+" + "+array[k]+" == "+sum);
                        return true;
                    }

                }

            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {12, 3, 4, 1, 6, 9};
        int sum = 19;
        if (findTriplet(array,sum)){
            System.out.println(" Founded elements");
        }else {
            System.out.println("Not found elements");
        }
    }
}
