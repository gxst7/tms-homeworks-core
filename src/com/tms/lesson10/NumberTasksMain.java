package com.tms.lesson10;

import java.util.Arrays;

public class NumberTasksMain {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 0, 5, 11, 8, 9, 2, 14, 4};

        // найти максимальное (или минимальное)
        System.out.println(Arrays.stream(numbers)
                .max().getAsInt());

        System.out.println(Arrays.stream(numbers)
                .min().getAsInt());


        // вывести сумму всех четных чисел.
        System.out.println("Sum of all even numbers: " + Arrays.stream(numbers)
                .filter(num -> num % 2 == 0)
                .sum());


        // распечатать все элементы начиная с 5.
        Arrays.stream(numbers)
                .skip(4)
                .forEach(System.out::println);
    }
}
