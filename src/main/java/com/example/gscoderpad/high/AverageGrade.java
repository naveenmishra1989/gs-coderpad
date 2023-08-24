package com.example.gscoderpad.high;

import java.util.*;

public class AverageGrade {
    public static boolean pass() {
        String[][] s1 = {{"Rohan", "84"}, {"Sachin", "102"}, {"Ishan", "55"}, {"Sachin", "18"}};

        return bestAvgGrade(s1) == 84;
    }

    public static void main(String[] args) {
        if (pass()) {
            System.out.println("Pass");
        } else {
            System.out.println("Some Fail");
        }
    }

    public static Double bestAvgGrade(String[][] scores) {

        Map<String, List<String>> map = new LinkedHashMap<>();

        List<String> list;
        for (String[] str : scores) {
            map.putIfAbsent(str[0], new ArrayList<>());
            list = map.get(str[0]);
            list.add(str[1]);
        }//for

        double bestAvg = 0;
        for (String name : map.keySet()) {
            // int sum =0
            double avg = map.get(name).stream().mapToInt(Integer::parseInt).average().getAsDouble();
            if (avg > bestAvg)
                bestAvg = avg;

        }//for
        return bestAvg;
    }
}

