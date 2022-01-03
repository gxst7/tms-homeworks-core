package com.tms.lesson8.Problem1;

public interface MyService {

    void put(String str) throws OutOfMemoryException;
    String get() throws AccessToEmptyCollectionException;
}
