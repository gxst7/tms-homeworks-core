package com.tms.lesson2;

import java.util.Scanner;

/**
 * Пользователь вводит два числа.
 * Найти сумму всех чисел расположенных между ними и которые делятся на 3.
 */
public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum, secondNum;
        int sum = 0;

        System.out.println("enter two numbers: <first> <second>");
        firstNum = scanner.nextInt();
        secondNum = scanner.nextInt();

        for (int i = Math.min(firstNum, secondNum) + 1; i < Math.max(firstNum, secondNum); i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum: " + sum);
    }
}
