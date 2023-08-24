package com.example.gscoderpad.low;

public class FindMax {

    private static int findMax(int[] array) {
        if (array.length < 1)
            return 0;
        int max = array[0];//initially taken 1st index value as max
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];

        }

        return max;
    }

    public static void main(String[] args) {
        boolean result = true;
        result = result && findMax(new int[]{3,4,5,6,2}) == 6;
        result = result && findMax(new int[]{2,1}) == 2;
        result = result && findMax(new int[]{1}) == 1;

        try {
            findMax(null);
            result = false;
        }
        catch(Exception e)
        {
            result = result && true;
        }

        if(result)
        {
            System.out.println("All tests pass");
        }
        else
        {
            System.out.println("There are test failures");
        }
    }


}
