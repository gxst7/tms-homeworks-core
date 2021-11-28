package com.tms.lesson4;

import java.util.Random;

public class User {

    private String name;
    private String surname;
    private int age;
    private Sex sex;
    private Adress adress;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.adress = new Adress("unknown", "unknown");
    }

    public User(String name, String surname, int age, Sex sex) {
        this(name, surname);
        this.age = age;
        this.sex = sex;
        this.adress = new Adress("unknown", "unknown");
    }

    public User(String name, String surname, int age, Sex sex, String country, String city) {
        this(name, surname);
        this.age = age;
        this.sex = sex;
        this.adress = new Adress(country, city);
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return surname + " " + name;
    }

    public void increaseAge() {
        age++;
    }

    public void increaseAge(int years) {
        age += years;
    }

//    the program does not know which method to choose
//
//    public String increaseAge() {
//        return "";
//    }

    @Override
    public String toString() {
        return "User: " + getFullName() +
                "\nSex: " + sex + ", Age: " + age +
                "\nAdress: " + adress.getAdress();
    }

    @Deprecated
    public void printRandomNumber() {
        Random random = new Random();
        System.out.println(random.nextInt());
    }

    class Adress {

        String country;
        String city;

        public Adress(String country, String city) {
            this.country = country;
            this.city = city;
        }

        public String getAdress() {
            return country + ", " + city;
        }
    }
}
