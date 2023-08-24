package com.example.gscoderpad.medium;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

public class CountChars {
    public static void main(String[] args) {
        System.out.println(countCharacter("SSSSSTTPPQ").equals("5S2T2P1Q"));
        System.out.println(countCharacter(null).equals("-1"));
        System.out.println(countCharacter("").equals("-1"));
        System.out.println(countChars("SSSSSTTPPQ"));
    }

    //use this
    private static String countChars(String s) {
        if (s == null || s.length() == 0) {
            return "-1";
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); ) {
            int len = 0;
            char c = s.charAt(i);
            while (i < s.length() && c == s.charAt(i)) {
                i++;
                len++;
            }
            sb.append(len).append(c);
        }
        return sb.toString();
    }

    private static String countCharacter(String inputString) {
        if (inputString == null || inputString.length() == 0) {
            return "-1";
        }
        inputString = inputString.toUpperCase();

        StringBuffer sb = new StringBuffer();
        Map<Character, Integer> map = new LinkedHashMap<>();

        inputString.chars().forEach(data -> {
            map.merge((char) data, 1, Integer::sum);
        });

        map.forEach((k, v) -> {
            sb.append(v).append(k);
        });

        return sb.toString();

    }


}




























/*    private static void countChars1(String s) {
        s = s.toUpperCase();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length() ;) {
            int len =0;
            char c = s.charAt(i);
            while (i<s.length() && s.charAt(i)==c){
                    i++;
                    len++;
            }
            if (String.valueOf(c).matches("\\w")) {// [a-zA-Z0-9]
                sb.append(len);
                sb.append(c);
            }
            else
                sb.append(c);
        }
        System.out.println(sb.toString());
    }*/