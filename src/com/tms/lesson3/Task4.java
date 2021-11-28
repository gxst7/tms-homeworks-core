package com.tms.lesson3;

import java.util.Arrays;

/**
 * В произвольном числовом массиве найти число, которое встречается чаще всего.
 * Вывести это число и количество раз, сколько число встречается (если несколько
 * чисел встречаются одинаковое количество раз – вывести любое из них).
 */
public class Task4 {

    public static void main(String[] args) {
        int[] array = {2, 11, 2, 0, -5, 11, 2};
        int prev;
        int popular;
        int count;
        int maxCount;

        if (array.equals(null) || array.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        prev = array[0];
        popular = array[0];
        count = 1;
        maxCount = 1;

        Arrays.sort(array);

        for (int i = 1; i < array.length; i++) {
            if (array[i] == prev) {
                count++;
            } else {
                if (count > maxCount) {
                    popular = array[i - 1];
                    maxCount = count;
                }
                prev = array[i];
                count = 1;
            }
        }

        System.out.println((count > maxCount ? array[array.length - 1] : popular));
    }
}
