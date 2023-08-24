package com.example.gscoderpad.medium;

import java.util.*;
import java.util.stream.Collectors;

public class FindTopIpaddress {
    public static void main(String[] args) {
        String lines[] = new String[]{
                "10.0.0.1 - log entry 1 11",
                "10.0.0.1 - log entry 2 213",
                "10.0.0.2 - log entry 133132",
        " "};
        String result = findTopIpaddress(lines);

        if (result.equals("10.0.0.1")) {
            System.out.println("Test passed");

        } else {
            System.out.println("Test failed");

        }

    }

    private static String findTopIpaddress(String[] strs){
        Map<String,Integer> mapTemp = new HashMap<>();

        for(String str : strs){
            if(str !=null && !str.isBlank()) {
                String[] split = str.split(" ");
                mapTemp.merge(split[0].trim(), 1, Integer::sum);//(a,b)->(a+b)
            }
        }

      /*  String top = (String) mapTemp.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a,b)->b,LinkedHashMap::new)).keySet().toArray()[0];*/

        String top ="";
        int val = Integer.MIN_VALUE;
        for (String key:mapTemp.keySet()) {
            if (mapTemp.get(key)>val){
                val = mapTemp.get(key);
                top = key;

            }
        }

        return top;
    }
}
