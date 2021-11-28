package com.tms.lesson4.test1;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age='" + name + '\'' +
                '}';
    }
}
