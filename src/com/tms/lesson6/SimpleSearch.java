package com.tms.lesson6;

import com.tms.lesson5.Employee;

import java.util.List;

public class SimpleSearch implements Searchable {


    public static Employee getEmployeeByName(List<Employee> employeesForTheDirector, String name) {
        if (employeesForTheDirector.isEmpty()) {
            return null;
        }

        for (Employee e : employeesForTheDirector) {
            if (e.getFullName().equals(name)) {
                return e;
            }
        }

        return null;
    }
}
