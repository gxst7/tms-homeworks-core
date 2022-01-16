package com.tms.lesson5;

public class Worker extends Employee {


    public Worker(String firstName, String lastName, int yearsOfWorkExperience) {
        super(firstName, lastName, Position.WORKER, yearsOfWorkExperience);
    }

    @Override
    public void setPosition() {
        setPosition(Position.WORKER);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
