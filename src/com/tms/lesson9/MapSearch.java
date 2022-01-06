package com.tms.lesson9;

import java.util.HashMap;
import java.util.Map;

public class MapSearch {

    public static void main(String[] args) {

        int maxVal = 0;
        int maxKey = 0;
        int[] a = {1, 2, 3, 2, 5, 2, 5};
        Map<Integer, Integer> counter = new HashMap<>();

        for (int x : a) {
            int newValue = counter.getOrDefault(x, 0) + 1;
            counter.put(x, newValue);
        }

        System.out.println(counter);
        for (int i : counter.keySet()) {
            if (counter.get(i) > maxVal) maxVal = i;
            maxKey = i;
        }

        System.out.println("Max Key: " + maxKey + ", Max Value: " + maxVal);
    }
}
