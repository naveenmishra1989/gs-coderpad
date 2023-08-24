package com.example.gscoderpad.low;

public class RotatedArray {
        public static void main(String[] args) {
            int[] str  = {5,6,1,2,3,4};

            System.out.println(getSecondSmallest(str));
        }

        private static int getSecondSmallest(int[] input){
            if(input==null || input.length==0)
                return -1;
            int index = 0;
            for(int i=0;i<input.length-1;i++){
                if(input[i]<input[i+1])
                    continue;
                index = i+2;

            }

            return  input[index];
        }

}
