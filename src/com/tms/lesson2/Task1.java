package com.tms.lesson2;

import java.util.Scanner;

/**
 * Пользователь вводит английскую букву.
 * Вывести в консоль – гласная эта буква или согласная.
 * Выполнить это задание при помощи операторов if, а потом при помощи switch.
 * Сравнить оба решения.
 */
public class Task1 {

    private static void printLetter(String ltr) {
        switch (ltr) {
            case "a":
            case "e":
            case "u":
            case "i":
            case "o":
            case "y":
                System.out.println("Vowel");
                break;
            case "b":
            case "c":
            case "d":
            case "f":
                // etc
                System.out.println("Consonant");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter;
        String ltr;

        // if solution
        System.out.println("enter a letter");
        for (;;) {
            letter = scanner.nextLine();
            if (letter.isEmpty()) {
                break;
            }
            if (!(Consonants.isContains(letter) || Vowels.isContains(letter))) {
                System.out.println("It is not a letter\nenter a letter");
            } else {
                if (Consonants.isContains(letter)) {
                    System.out.println("It is a consonant");
                } else {
                    System.out.println("It is a vowel");
                }
                break;
            }
        }

        System.out.println("--------------");

        // while solution
        System.out.println("enter a letter");
        for (;;) {
            ltr = scanner.nextLine();
            if (ltr.isEmpty()) {
                break;
            }
            printLetter(ltr);
        }
        scanner.close();
    }
}
