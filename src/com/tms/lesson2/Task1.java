package com.tms.lesson2;

import java.util.Scanner;

/**
 * Пользователь вводит английскую букву.
 * Вывести в консоль – гласная эта буква или согласная.
 * Выполнить это задание при помощи операторов if, а потом при помощи switch.
 * Сравнить оба решения.
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter;
        String ltr;

        // if solution
        System.out.println("enter a letter");
        while (!(letter = scanner.nextLine()).equals("")) {
            if (!(Consonants.isContains(letter) || Vowels.isContains(letter))) {
                System.out.println("It is not a letter");
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
        loop: while (!(ltr = scanner.nextLine()).equals("")) {
            switch (ltr) {
                case "a":
                case "e":
                case "u":
                case "i":
                case "o":
                case "y":
                    System.out.println("Vowel");
                    break loop;
                case "b":
                case "c":
                case "d":
                case "f":
                    // etc
                    System.out.println("Consonant");
                    break loop;
            }
        }
        scanner.close();
    }
}
