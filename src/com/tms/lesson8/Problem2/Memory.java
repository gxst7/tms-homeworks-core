package com.tms.lesson8.Problem2;

import com.tms.lesson8.Problem1.AccessToEmptyCollectionException;
import com.tms.lesson8.Problem1.OutOfMemoryException;

import java.util.LinkedList;
import java.util.Queue;

public class Memory implements InputValidateService {

    private Queue<String> memory;

    public Memory()  {
        memory = new LinkedList<>();
    }

    @Override
    public void put(String str) throws OutOfMemoryException {
        if (memory.size() == 5) {
            throw new OutOfMemoryException("Memory is out");
        }
        memory.add(str);
        System.out.println("String '" + str + "' is added to memory.");
        System.out.println("there are " + (5 - memory.size()) + " free cells in memory.");
    }

    @Override
    public String get() throws AccessToEmptyCollectionException {
        if (memory.isEmpty()) {
            throw new AccessToEmptyCollectionException("Memory is empty");
        }
        System.out.println("String '" + memory.peek() + "' returned and deleted from memory.");
        System.out.println("there are " + (5 - memory.size() + 1) + " free cells in memory.");
        return memory.poll();
    }
}
