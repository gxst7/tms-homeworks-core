package com.tms.lesson9;

import java.util.Objects;

public class User implements Comparable {

    private String name;
    private Sex sex;
    private int age;

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public User(String name, Sex sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(sex, user.sex);
    }

    @Override
    public int hashCode() {
        int res = name != null ? name.hashCode() : 0;
        res = sex != null ? (17 * res + sex.hashCode()) : 17 * res;
        res = 17 * res + age;
        return res;
    }

    @Override
    public int compareTo(Object o) {
        User out = (User) o;
        if (age == out.age) {
            return name.compareTo(out.name);
        }
        return (age < out.age) ? -1 : 1;
    }

    @Override
    public String toString() {
        return  "name: '" + name + '\'' +
                ", sex: '" + sex + '\'' +
                ", age: " + age;
    }
}
