package com.example.gscoderpad.low;

import java.util.Arrays;

public class AddFraction {
    /**
     * Given two fractions passed in as int arrays,
     * returns the fraction which is result of adding the two input fractions.
     */



    public static void main( String[] args ) {
        int[] result = addFractions( new int[]{ 2, 3 }, new int[]{ 1, 2 } );

        if( result[ 0 ] == 7 && result[ 1 ] == 6 ) {
            System.out.println( "Test passed." );
        } else {
            System.out.println( "Test failed." );
        }

        System.out.println(Arrays.toString(addFraction(new int[]{4,2},new int[]{4,3})));
    }

    //1st ways
    private static int[] addFractions(int[] a, int[] b) {
        int[] result = new int[2];
        result[0] = a[0]*b[1]+a[1]*b[0];
        result[1] = a[1]*b[1];
        return (result);
    }

    //second ways
    private static int[] addFraction(int[] f1, int[] f2) {
        int[] res=new int[2];
        int num = f1[0] * f2[1] + f2[0] * f1[1];
        int den = f1[1] * f2[1];

        int gcd = getGcd(num, den);
        res[0]=num/gcd;
        res[1]=den/gcd;
        return res;
    }

    private static int getGcd(int num, int den) {
        int max = Math.max(num, den);
        int min = Math.min(num, den);
       //int gcd = 1;
        for (int i = min; i > 0; i--) {
            if (max % i == 0 && min % i == 0)
                return i;
        }
        return 1;
    }
}
