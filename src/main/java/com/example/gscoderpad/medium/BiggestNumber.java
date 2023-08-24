package com.example.gscoderpad.medium;

import java.util.ArrayList;
import java.util.Collections;

public class BiggestNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 34, 3, 98, 9, 76, 45, 4};
        System.out.println( getBiggestNumber(numbers));


    }


    private static String getBiggestNumber(int[] input) {

        ArrayList<String> list = new ArrayList<>();

        String number = "";

        for (int num : input) {

            list.add(String.valueOf(num));

        }
        Collections.sort(list,(a, b)->{
            String orignal = a+""+b;
            String reverse = b+" "+a;

            return reverse.compareToIgnoreCase(orignal);


        });
        for(String s:list){
            number +=s;
        }

        return number;
    }




}

