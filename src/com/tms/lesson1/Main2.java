package com.tms.lesson1;

import java.util.Scanner;

/**
 * Напишите программу, которая сравнивает два числа и пишет в консоль какое из этих чисел больше или меньше
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Max value is " + Math.max(scanner.nextInt(), scanner.nextInt()));
    }
}