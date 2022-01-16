package com.tms.lesson9;

import java.util.Comparator;

public class CompareService implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.compareTo(o2);
    }
}
