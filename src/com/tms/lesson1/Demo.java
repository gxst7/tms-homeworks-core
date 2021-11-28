package com.tms.lesson1;

/**
 * Создайте переменную типа char и присвойте ей значение ‘a’.
 * Прибавить к переменной 1 и выведите значение переменной в консоль.
 * Попробуйте преобразовать тип переменной к int и снова вывести в консоль.
 *
 * Создайте переменную типа int и присвойте ей значение 127,
 * преобразуйте ее к типу byte и выведите в консоль.
 * Что произойдет если значение переменной будет 128?
 *
 * Создайте переменную типа int (int i = 10) и выведите в консоль значение I / 0.
 * Что произойдет? Измениться ли вывод если переменная будет типа float?
 */
public class Demo {

    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(++ch);   // 'b'
        System.out.println((int) ch);   // 98

        int num = 127;
        System.out.println((byte) num);   // 127
        System.out.println((byte) ++num); // -128 overflow

        int i = 10;

        try {
            System.out.println(i / 0);
        } catch (ArithmeticException e) {
            System.out.println("Error. Division by zero");
        }

        System.out.println((float) i / 0);  // Infinity
    }
}