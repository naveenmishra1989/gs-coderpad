package com.example.gscoderpad.low;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNotRepeatingCharTest {

    @Test
    void firstNotRepeatingChar(){
        String[] inputs = {"apple", "racecars", "ababdc"};
        for (String input: inputs ) {
            System.out.println(firstNotRepeatingChar(input));
        }

    }

    private char firstNotRepeatingChar(String str){
        final char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            int count =0;
            for (int j = 0; j < chars.length; j++) {
                  if (chars[i] ==chars [j])
                      count++;
            }
            if (count==1)
                return chars[i];
        }
        return  '0';
    }

}