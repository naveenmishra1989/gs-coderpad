package com.example.gscoderpad.low;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxTest {

    @Test
    void findMin(){
  int arr[] = {2,5,8,9};
        System.out.println(findMin(arr));
    }

    private int findMin(int[] a){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length ; i++) {
                if(a[i]<min)
                    min = a[i];
        }
        return min;
    }

}