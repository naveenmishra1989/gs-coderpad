package com.example.gscoderpad.low;

/*
 * Implement a run length encoding function.
 * For a string input the function returns output encoded as follows:
 *
 * "a"     -> "a1"
 * "aa"    -> "a2"
 * "aabbb" -> "a2b3"
 */
public class LengthEncoding {
    private static String rle(String input) {
        StringBuilder sb = new StringBuilder();
        if(input.length() == 0) {return "";} // if empty then return ""
        char prev = input.charAt(0);
        int count = 0;
        for (char ch:input.toCharArray()) {
            if(prev == ch){
                count++;
            }else {
                sb.append(prev);
                sb.append(count);
                prev = ch;
                count = 1; //count reset to 1
            }
        }
        sb.append(prev);
        sb.append(count);
        return sb.toString();
    }
    public static void main(String[] args) {
        if("".equals(rle("")) &&
                "a1".equals(rle("a")) &&
                "a3".equals(rle("aaa"))){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }

    }
}
