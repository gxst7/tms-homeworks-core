package com.tms.lesson8.Problem2;

import com.tms.lesson8.Problem1.AccessToEmptyCollectionException;
import com.tms.lesson8.Problem1.OutOfMemoryException;

public interface InputValidateService {

    void put(String str) throws OutOfMemoryException;
    String get() throws AccessToEmptyCollectionException;
}
