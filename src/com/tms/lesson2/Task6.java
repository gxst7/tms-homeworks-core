package com.tms.lesson2;

import java.util.Arrays;

/**
 * Дан массив из пяти элементов.
 * При помощи цикла получить отсортированный массив в порядке возрастания элементов.
 */
public class Task6 {

    public static void main(String[] args) {
        int[] a = {2, 5, 10, -1, 6};
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
