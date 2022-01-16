package com.tms.lesson8.Problem1;

import java.util.LinkedList;
import java.util.Queue;

public class Memory implements MyService {

    Queue<String> memory;

    public Memory()  {
        memory = new LinkedList<>();
    }

    @Override
    public void put(String str) throws OutOfMemoryException {
        if (memory.size() == 5) {
            throw new OutOfMemoryException("Memory is out");
        }
        memory.add(str);
    }

    @Override
    public String get() throws AccessToEmptyCollectionException {
        if (memory.isEmpty()) {
            throw new AccessToEmptyCollectionException("Memory is empty");
        }
        return memory.poll();
    }
}
