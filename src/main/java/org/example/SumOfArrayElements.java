package org.example;

public class SumOfArrayElements {
    public static Object sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}
