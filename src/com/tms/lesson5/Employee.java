package com.tms.lesson5;

public abstract class Employee extends Person {

    private Position position;
    private double wageRatio;
    private int yearsOfWorkExperience;
    private double salary;

    public Employee(String firstName, String lastName, Position position, int yearsOfWorkExperience) {
        super(firstName, lastName);
        this.position = position;
        this.wageRatio = position.getWageRatio();
        this.yearsOfWorkExperience = yearsOfWorkExperience;
        setSalary(Finance.baseRate * wageRatio * yearsOfWorkExperience);
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalaryForEmployee(double salary) {
        setSalary(salary);
    }

    public void calculateSalary() {
        setSalary(Finance.baseRate * wageRatio * yearsOfWorkExperience);
    }

    public abstract void setPosition();

    @Override
    public String toString() {
        return super.getFullName() +
                "\nposition = " + position +
                "\nwageRatio = " + wageRatio +
                "\nyears Of Work Experience = " + yearsOfWorkExperience +
                "\nsalary = " + salary + "\n";
    }
}
