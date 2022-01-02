package com.tms.lesson6;

import com.tms.lesson5.Director;
import com.tms.lesson5.Employee;
import com.tms.lesson5.Position;

import java.util.List;

public class DeepSearch implements Searchable {

    public static Employee getEmployeeByName(List<Employee> employeesForTheDirector, String name) {
        Employee myEmployee = null;
        if (employeesForTheDirector.isEmpty()) {
            return null;
        }

        for (Employee e : employeesForTheDirector) {
            if (e.getFullName().equals(name)) {
                myEmployee = e;
                break;
            }
            if (e.getPosition().equals(Position.DIRECTOR)) {
                myEmployee = SimpleSearch.getEmployeeByName(employeesForTheDirector, name);
            }
        }

        return myEmployee;
    }
}
