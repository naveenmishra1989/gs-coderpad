package com.example.gscoderpad.medium;

public class NewtonRaphson {
    public static void main(String[] args) {
        System.out.println(Compute(13));
    }
    public static float Compute(float Number) {
        float temp = Number / 2;

        while (true) {
            float sqrRoot = temp - (temp * temp - Number) / (2 * temp);
            float value = Math.abs(temp - sqrRoot);

            if (value < 0.0001)
                return sqrRoot;
            else
                temp = sqrRoot;
        }
    }
}
