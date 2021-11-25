package com.tms.lesson3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Создать массив на n-элементов и заполнить его числами Фиббоначи.
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] fib;

        System.out.println("Enter number of fib elements");
        fib = new int[scanner.nextInt()];
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println(Arrays.toString(fib));
    }
}
