package com.tms.lesson1;

import java.util.Scanner;

/**
 * Задать число (от 0 до 9999) и вывести в консоль количество тысяч, сотен, десятков и единиц.
 */
public class Main4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int thousand;
        int hundred;
        int dozen;
        int unit;

        System.out.println("enter a number");
        num = scanner.nextInt();

        unit = num % 10;
        dozen = (num / 10) % 10;
        hundred = (num / 100) % 10;
        thousand = (num / 1000) % 10;

        System.out.println("Units " + unit);
        System.out.println("Dozens " + dozen);
        System.out.println("Hundreds " + hundred);
        System.out.println("Thousands " + thousand);
    }
}