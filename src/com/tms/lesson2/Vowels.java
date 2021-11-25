package com.tms.lesson2;

public enum Vowels {

    A, E, I, O, U, Y;

    public static boolean isContains(String letter) {
        for (Vowels vowel : Vowels.values()) {
            if (letter.equalsIgnoreCase(String.valueOf(vowel))) {
                return true;
            }
        }
        return false;
    }
}
