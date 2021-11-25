package com.tms.lesson2;

public enum Month {
    JANUARY(1, "январь"), FEBRUARY(2, "февраль"),
    MARCH(3, "март"), APRIL(4, "апрель"), MAY(5, "май"),
    JUNE(6, "июнь"), JULY(7, "июль"), AUGUST(8, "август"),
    SEPTEMBER(9, "сентябрь"), OCTOBER(10, "октябрь"),
    NOVEMBER(11, "ноябрь"), DECEMBER(12, "декабрь");

    private final Integer number;
    private final String name;

    Month(int number, String name) {
        this.number = number;
        this.name = name;
    }

    private static String nameByNumber(int number) {
        for (Month m : Month.values()) {
            if (number == m.number) {
                return m.name;
            }
        }
        return null;
    }

    private static int numberByName(String name) {
        for (Month m : Month.values()) {
            if (name.equalsIgnoreCase(m.name) || name.equalsIgnoreCase(m.toString())) {
                return m.number;
            }
        }
        return 0;
    }

    public static void printSeason(String month) {
        int num = numberByName(month);
        if (num == 0) {
            System.out.println("typo in the name of the month");
            return;
        }

        switch (num) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
        }
    }
}
