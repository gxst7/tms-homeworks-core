package com.tms.lesson4;

import java.util.Arrays;

public class ArrayLocal {

    // return sorted array
    public static int[] sort(int[] arr) {
        int[] newArr = arr.clone();
        Arrays.sort(newArr);
        return newArr;
    }

    // return max value from array values or -1 if array is empty
    public static int getMaxValue(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                max = arr[i];
            }
        }
        return max;
    }

    // return index of element, else if in array no such element return -1
    public static int getIndex(int[] arr, int elem) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                return i;
            }
        }
        return -1;
    }
}
