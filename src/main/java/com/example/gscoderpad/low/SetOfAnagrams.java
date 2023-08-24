package com.example.gscoderpad.low;

import java.util.*;

/*
 * This program prints set of anagrams together in given string
 *
 * eg.
 * setOfAnagrams("cat dog tac sat tas god dog") should print "cat tac dog god dog sat tas"
 *
 */
public class SetOfAnagrams {

    public static void main(String[] args) {

        String input = "cat dog tac sat tas god dog";
        setOfAnagrams(input);

    }

    static void setOfAnagrams(String inputString) {
        final Map<String, ArrayList<String>> anagrams = new LinkedHashMap<>();
        final String[] words = inputString.split(" ");
        for (String word : words) {
            final char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!anagrams.containsKey(sorted))
                anagrams.put(sorted, new ArrayList<String>());

            anagrams.get(sorted).add(word);
        }
        for (String key : anagrams.keySet()) {
            if (anagrams.get(key).size() > 1)
                for (String value : anagrams.get(key)) {
                    System.out.print(value + "  ");
                }
        }

    }

    static void setOfAnagrams1(String inputString) {

        final Map<String, ArrayList<String>> anagrams = new LinkedHashMap<>();

        String[] words = inputString.split(" ");
        Arrays.stream(words).forEach(word -> {

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            anagrams.putIfAbsent(sorted, new ArrayList<String>());

            //if
            anagrams.get(sorted).add(word);
        });//for

        anagrams.forEach((k, v) -> {
            v.forEach(data ->
                    System.out.print(data + " ")
            );

        });
        //for

    }

}
