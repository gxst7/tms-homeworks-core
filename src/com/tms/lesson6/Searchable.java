package com.tms.lesson6;

import com.tms.lesson5.Director;
import com.tms.lesson5.Employee;

public interface Searchable {

    Employee getEmployeeByName(String name);

    Employee getEmployeeByNameDeep(String name);

    void printInformationAboutEmployee(String name);

    void toFireEmployee(Employee employee);
}
