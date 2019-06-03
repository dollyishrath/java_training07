package com.trimindtech.training.day07.day0703;

import com.trimindtech.training.day07.day0703.Employee;

public class Manager extends Employee {
    public double travelClaims;

    public Manager(String name, int yearJoined, double basicSalary, double allowance) {
        super(name,yearJoined,basicSalary,allowance);
    }

    public double getTravelClaims() {
        return travelClaims;
    }

    public void setTravelClaims(double travelClaims) {
        this.travelClaims = travelClaims;
    }

    public double calculateSalary(){
        double totalSalary = this.travelClaims;
        System.out.println("the total salary is"+ totalSalary);
        return 0;
    }

}
