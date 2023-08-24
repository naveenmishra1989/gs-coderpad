package com.example.gscoderpad.low;

public class PowerOfEachOtherInArray {
    public static void main(String[] args) {
        powerOfEachOther();
    }
    private static void  powerOfEachOther() {
        int[] x = {1,2,3,5,4};
        int[] y = {2,4,6,9,3};

        for (int i = 0; i < x.length; i++) {

            for (int j = 0; j < y.length; j++) {

                if (pow(x[i],y[j]) == pow(y[j],x[i]))
                    System.out.println(x[i]+","+y[j]+" and "+y[j]+","+x[i]);
            }

        }

    }
    public static int pow(int a,int b){
        return (int)Math.pow(a,b);
    }

}
