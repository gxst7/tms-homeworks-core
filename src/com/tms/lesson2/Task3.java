package com.tms.lesson2;

import java.util.Scanner;

/**
 * Пользователь вводит слово в консоль,
 * если это слово “exit” – программа завершается,
 * при других - печатает ввод пользователя обратно в консоль
 * и предлагает ввести следующее слово.
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;

        do {
            System.out.println("enter word. type <exit> to stop");
            if (!(word = scanner.next()).equals("exit")) {
                System.out.println(word);
            }
        } while (!word.equals("exit"));
    }
}
