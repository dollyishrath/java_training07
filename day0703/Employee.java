package com.trimindtech.training.day07.day0703;

import java.util.Objects;

public class Employee {
    public String name;
    public int yearJoined;
    public double basicSalary;
    public double allowance;

    public Employee(String name, int yearJoined, double basicSalary, double allowance) {
        this.name = name;
        this.yearJoined = yearJoined;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearJoined=" + yearJoined +
                ", basicSalary=" + basicSalary +
                ", allowance=" + allowance +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        Employee employee = (Employee) o;
        return yearJoined == employee.yearJoined &&
                Double.compare(employee.basicSalary, basicSalary) == 0 &&
                Double.compare(employee.allowance, allowance) == 0 &&
                Objects.equals(name, employee.name);
    }

    public double calculateSalary(){
        double totalSalary = this.basicSalary+this.allowance;
        System.out.println("the total salary is"+ totalSalary);
        return 0;
    }
}
