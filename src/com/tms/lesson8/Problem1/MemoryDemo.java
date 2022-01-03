package com.tms.lesson8.Problem1;

public class MemoryDemo {

    public static void main(String[] args) {
        MyService service = new Memory();

        try {
            service.get();
        } catch (AccessToEmptyCollectionException e) {
            System.out.println(e.getMessage());
        }

        try {
            service.put("hello");
            service.put("string");
            service.put("tms");
            service.put("java");
            service.put("random");
            service.put("exception");
        } catch (OutOfMemoryException e) {
            System.out.println(e.getMessage());
        }
    }
}
