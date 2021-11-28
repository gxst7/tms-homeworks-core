package com.tms.lesson2;

/**
 * В массиве чисел найти наименьшее и наибольшее.
 */
public class Task5 {

    public static void main(String[] args) {
        int min, max;
        int[] intArray = {-5, 1, 0, 5, 7, 12, -2, 42};

        min = intArray[0];
        max = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            min = Math.min(intArray[i], min);
            max = Math.max(intArray[i], max);
        }

        System.out.println("Min: " + min + ", max: " + max);
    }
}
