package com.tms.lesson4;

import com.tms.lesson2.Month;

/**
 * Пользователь вводит название месяца.
 * Вывести в консоль к какой поре года этот месяц относиться.
 * Если пользователь допустил опечатку – вывести сообщение об ошибке.
 *
 * Switch Solution
 */
public class SeasonTask {

    public static void main(String[] args) {

        System.out.println(getSeason(Month.MARCH));
    }

    public static String getSeason(Month nameMonth) {
        switch (nameMonth) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return "Winter";
            case MARCH:
            case APRIL:
            case MAY:
                return "Spring";
            case JUNE:
            case JULY:
            case AUGUST:
                return "Summer";
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return "Fall";
            default:
                return "It is not a month";
        }
    }
}
