package com.example.gscoderpad.medium;

public class SubArrayExceedingTarget {
    public static void main(String[] args) {
        boolean result = true;
        int[] arr = {1, 2, 3, 4};
        result = result && minimumSubArrayLengthSorted(arr, 6) == 2;
        result = result && minimumSubArrayLengthSorted(arr, 12) == -1;

        if (result) {
            System.out.println("All tests pass\n");
        } else {
            System.out.println("There are test failures\n");
        }
    }

    private static int minimumSubArrayLengthSorted(int[] arr, int sumToCheck) {
        // Arrays.sort(arr);
        int count = 0;
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) { //reverse order
            sum += arr[i];
            count++;
            if (sum > sumToCheck) {
                System.out.println(sum);
                return count;
            }
        }

        return -1;
    }

    public static int subArrayExceedsSum(int arr[], int target) {
        int count = 0;
        int sum = 0;
        int n = arr.length;
        //ask if only +ve int
        if (arr.length == 0) {
            return -1;
        }
        int p = 0;
        int q = 1;
        sum = arr[p];
        while (q <= arr.length) {
            if (sum > target) {
                count = count + n - q + 1;
                if (p == 0) {
                    count--;
                }
                sum -= arr[p];
                p++;
            } else {
                if (q < arr.length) {
                    sum += arr[q];
                }
                q++;
            }
        }
        if (count == 0) {
            return -1;
        }
        return count;

    }

}
