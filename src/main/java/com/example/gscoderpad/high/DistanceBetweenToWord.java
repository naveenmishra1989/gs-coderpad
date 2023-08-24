package com.example.gscoderpad.high;

import java.util.LinkedHashMap;
import java.util.Map;

public class DistanceBetweenToWord {
    static int distance(String s, String w1, String w2) {
        Map<String, Integer> map = new LinkedHashMap<>();
        if (w1.equals(w2))
            return 0;
        final String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            map.putIfAbsent(split[i], i);
        }
        System.out.println(map);
        return   map.get(w2)-map.get(w1)-1;
    }

    static int distance1(String s, String w1, String w2) {
        int starts=0,ends =0;
        final String[] split = s.split("\\s+");
            for (int i = 0; i < split.length; i++) {
                if (split[i].equals(w1))
                    starts = i;
                if (split[i].equals(w2))
                    ends = i;
            }
            if(ends==starts)
                return 0;
        return ends - starts-1;
    }

    public static void main(String[] args) {
        String s = "for geeks contribute practice";
        String w1 = "for" ;
        String w2 = "for" ;

      //  System.out.print( distance(s, w1, w2) );
        System.out.print( distance1(s, w1, w2) );
    }
}
