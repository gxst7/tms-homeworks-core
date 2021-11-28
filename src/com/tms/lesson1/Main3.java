package com.tms.lesson1;

import java.util.Scanner;

/**
 * Напишите программу, которая проверяет делиться ли одно число на второе
 * без остатка. В случае, если деление не целочисленное, то вывести в консоль
 * сообщение о целой части и об остатке от деления.
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        if (i % j == 0) {
            System.out.println("Division without remainder");
        } else {
            System.out.println("Division with remainder: " + (i % j));
        }
    }
}