package com.tms.lesson5;

import java.util.ArrayList;

public class Director extends Employee {

    private ArrayList<Employee> employeesForTheDirector = new ArrayList<>();

    public Director(String firstName, String lastName, int yearsOfWorkExperience) {
        super(firstName, lastName, Position.DIRECTOR, yearsOfWorkExperience);
    }

    private String prettyPrintEmployees() {
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employeesForTheDirector) {
            sb.append("\n---Employee--\n");
            sb.append(employee);
        }
        return sb.toString();
    }

    public void addWorker(Employee employee) {
        employeesForTheDirector.add(employee);
    }

    @Override
    public void calculateSalary() {
        // у меня здесь возникает ошибка, employeesForDirector равен null
        // почему ??
        // я делаю условие если employeesForDirector > 3 и на этой строке
        // NullPointerException
        // employeesForTheDirector.size(); к примеру
        super.calculateSalary();
    }

    @Override
    public void setPosition() {
        setPosition(Position.DIRECTOR);
    }

    @Override
    public String toString() {
        return super.toString() +
        this.getFullName() + "'s workers" +
        prettyPrintEmployees();
    }
}
