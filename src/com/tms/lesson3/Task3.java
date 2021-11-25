package com.tms.lesson3;

/**
 * Найти разницу между суммой элементов стоящих на четных и нечетных местах.
 */
public class Task3 {

    public static void main(String[] args) {
        int[] array = {5, 2, -8, 12, 11, 9, 0, -5, 4};
        int diff = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                diff += array[i];
            } else {
                diff -= array[i];
            }
        }

        System.out.println(diff);
    }
}
