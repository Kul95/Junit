package org.example;

public class FindMinArrayElement {
    public int findMinArr(int arr1[]) {
        int min = 1;
        for (int i = 0; i < arr1.length; i++) {
            if (min > arr1[i]) {
                min = arr1[i];
            }
        }
     return min;
    }
}
