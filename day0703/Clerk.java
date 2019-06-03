package com.trimindtech.training.day07.day0703;

public class Clerk extends Employee {
    public int overtimeHours;
    public double overtimeRate;

    public Clerk(String name, int yearJoined, double basicSalary, double allowance) {
        super(name, yearJoined,basicSalary,allowance);
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    public double calculateSalary(){
        double totalSalary = this.overtimeHours+this.overtimeRate;
        System.out.println("the total salary is"+ totalSalary);
        return 0;
    }
}
