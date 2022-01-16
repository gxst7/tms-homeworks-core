package com.tms.lesson5;

import com.tms.lesson6.DeepSearch;
import com.tms.lesson6.Searchable;
import com.tms.lesson6.SimpleSearch;

import java.util.ArrayList;
import java.util.List;

public class Director extends Employee implements Searchable {

    private List<Employee> employeesForTheDirector = new ArrayList<>();

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
        if (employeesForTheDirector.size() > 3) {
            super.setSalaryForEmployee(getSalary()*1.2);
        }
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

    public Employee getEmployeeByName(String name, String flag) {
        Employee e;
        switch (flag) {
            case "-s":
                e = SimpleSearch.getEmployeeByName(employeesForTheDirector, name);
                break;
            case "-d":
                e = DeepSearch.getEmployeeByName(employeesForTheDirector, name);
                break;
            default:
                e = null;
        }
        return e;
    }

    public void printInformationAboutEmployee(String name) {
        System.out.println(SimpleSearch.getEmployeeByName(employeesForTheDirector, name));
    }

    public void toFireEmployee(Employee employee) {
        employeesForTheDirector.remove(employee);
    }
}
