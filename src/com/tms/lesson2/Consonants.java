package com.tms.lesson2;

public enum Consonants {

    Q, W, R, T, P, S, D, F, G, H, J, K, L, Z, X, C, V, B, N, M;

    public static boolean isContains(String letter) {
        for (Consonants consonant : Consonants.values()) {
            if (letter.equalsIgnoreCase(String.valueOf(consonant))) {
                return true;
            }
        }
        return false;
    }
}
