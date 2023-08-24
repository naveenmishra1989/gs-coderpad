package com.example.gscoderpad.medium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueTuples {

    public static Set<String> findUniqueTuple(String str,int length) {
        Set<String> set = new LinkedHashSet<>();
         String temp = str+str;
        for (int i = 0; i < str.length() ; i++) {
            set.add(temp.substring(i, i + length));
        }
        System.out.println(set);
        return set;
    }

    public static void main(String[] args) {
        String input = "aaab";
        Set<String> result = findUniqueTuple(input, 2);
        if (result.contains("aa") && result.contains("ab")) {
            System.out.println("Test passed.");

        } else {
            System.out.println("Test failed.");

        }
    }
}