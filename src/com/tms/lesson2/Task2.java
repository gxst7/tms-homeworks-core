package com.tms.lesson2;

import java.util.Scanner;

/**
 * Пользователь вводит название месяца.
 * Вывести в консоль к какой поре года этот месяц относиться.
 * Если пользователь допустил опечатку – вывести сообщение об ошибке.
 */
public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter name of the month");
        String nameOfTheMonth = scanner.next();

        Month.printSeason(nameOfTheMonth);
    }
}
