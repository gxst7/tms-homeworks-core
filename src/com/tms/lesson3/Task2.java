package com.tms.lesson3;

/**
 * В произвольном массиве найти сумму минимального и максимального элементов.
 */
public class Task2 {

    public static void main(String[] args) {
        int[] array = {5, 2, -8, 12, 11, 9, 0, -5, 4};
        int min = array[0];
        int max = array[0];
        int sum;
        for (int i : array) {
            if (i < min) {
                min = i;
            } else if (i > max) {
                max = i;
            }
        }
        sum = min + max;
        System.out.println(sum);
    }
}
