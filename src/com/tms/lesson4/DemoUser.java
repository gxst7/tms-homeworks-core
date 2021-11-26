package com.tms.lesson4;

import static com.tms.lesson4.Sex.FEMALE;
import static com.tms.lesson4.Sex.MALE;

public class DemoUser {

    public static void main(String[] args) {
        User ann = new User("Ann", "Perkins", 23, FEMALE);
        User john = new User("John", "Wick", 49, MALE, "Belarus", "unknown");

        ann.printRandomNumber();    // cross out if method is deprecated
        System.out.println(john);

        john.increaseAge(); // increase by one
        System.out.println(john.getAge());

        john.increaseAge(5);    // increase by 5
        System.out.println(john.getAge());

        com.tms.lesson4.test1.Person sasha = new com.tms.lesson4.test1.Person("Olga");
        com.tms.lesson4.test2.Person olga = new com.tms.lesson4.test2.Person(41);

        System.out.println(sasha);
        System.out.println(olga);
    }
}
