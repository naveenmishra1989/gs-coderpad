package com.example.gscoderpad.high;

import java.util.Arrays;

public class NumberInFractionAfterDecimal {
    public static String fractionRepresentation(int num, int den) {
        float d = (float) num / (float) den;
        final String value = String.valueOf(d);
        StringBuilder sb = new StringBuilder();
        final String[] split = value.split("\\."); //0.5494 0r 0.33788
       // System.out.println(Arrays.toString(split));
        sb.append(split[0]).append(".(");   //0.(
        char[] chars = split[1].toCharArray();
        if (chars.length>=2){
            if((chars[1]-'0')==4){
                sb.append(chars[0]).append(chars[1]).append(')');

            }else
            sb.append(chars[0]).append(')');
        }else if ((chars[0]-'0')==5){
            sb.deleteCharAt(sb.length()-1)
                    .append(chars[0]);
        }else{
            sb.append(chars[0]).append(')');
        }



        return sb.toString();
    }

    public static void main(String[] args) {
        if (fractionRepresentation(1, 2).equals("0.5") && fractionRepresentation(6, 11).equals("0.(54)")
                && fractionRepresentation(1, 3).equals("0.(3)")) {
            System.out.println("All passed");
        } else {
            System.out.println("Failed");
        }
    }
}
