package com.tms.lesson10;

import java.util.List;

public class Family {

    private String surname;
    private int salary;
    private List<Member> members;

    public Family(String surname, int salary, List<Member> members) {
        this.surname = surname;
        this.salary = salary;
        this.members = members;
    }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
    }

    public List<Member> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "Family{" +
                "surname='" + surname + '\'' +
                ", salary=" + salary +
                ", members=" + members +
                '}';
    }
}
