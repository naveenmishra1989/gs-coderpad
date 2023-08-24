package com.example.gscoderpad.low;

/**
 *
 *  e.g.
 *      for the input: "abbbccda" the longest uniform substring is "bbb"
 *      (which starts at index 1 and is 3 characters long).
 */

import java.util.*;

public class LongestUniformString {

    private static final Map<String, int[]> testCases = new HashMap<String, int[]>();

    private static int[] longestRepeatingStr(String str){


        if(str==null||str.isEmpty() || str.isBlank()){
            return new int[]{-1,0};
        }

        int index = 0;
        int length = 0;

        for(int i=0;i<str.length();){

            int count =0;
            int ind = i;
            char c = str.charAt(i);

            while(i<str.length() && c == str.charAt(i)){
                i++;
                count++;
            }

            if(count>length){
                length = count;
                index = ind;
            }
        }//for


        return new int[]{index,length};

    }


    public static void main(String[] args) {
        testCases.put(" ", new int[]{-1, 0});
      testCases.put("10000111", new int[]{1, 4});
      testCases.put("abbbccda", new int[]{1, 3});
      testCases.put("aabbbbbCbbAA", new int[]{2, 5});
      testCases.put("acbbbbbCdAA", new int[]{2, 5});

        boolean pass = true;
        for(Map.Entry<String,int[]> testCase : testCases.entrySet()){
            int[] result = longestRepeatingStr(testCase.getKey());
            System.out.println(Arrays.toString(result));
            pass = pass && (Arrays.equals(result, testCase.getValue()));
        }
        if(pass){
            System.out.println("Pass!");
        } else {
            System.out.println("Failed! ");
        }
    }
}