package com.tms.lesson1;

/**
 * 1. Установите JetBrains Idea и создайте в ней пустой java проект,
 * создайте свой класс с методом main.
 * 2. Создайте переменные для каждого примитивного типа,
 * подумайте об ограничениях по наименованию переменных.
 * 3. Создайте две переменные типа int и попробуйте поделить одно на другое,
 * результат какого типа получится в результате?
 * Что будет если делитель будет нулевым?
 * Как не потерять точность при делении (числа после запятой)?
 */
public class Main {

    public static void main(String[] args) {
        boolean bool = true;
        byte b = 100;
        char c = 'A';
        short s = 4096;
        int i = 67_000_000;
        long l = 1_158_954_248;
        float f = 3.14f;
        double d = 2.71828d;

        int first = 10;
        int second = 3;
        System.out.println(first / second); // type int, value 3

//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        second = 0;
//        System.out.println(first / second);

        System.out.println(first / 3d); // add d to literal, made type double
        // return 3.33333...
    }
}