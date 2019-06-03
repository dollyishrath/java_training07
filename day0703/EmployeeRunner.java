package com.trimindtech.training.day07.day0703;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeRunner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> manager = new ArrayList<Employee>();
        Manager m1 = new Manager("mahek", 2016, 10000, 0);
        Manager m2 = new Manager("tanna", 2017, 15000, 0);
        Manager m3 = new Manager("sana", 2018, 20000, 0);
        Manager m4 = new Manager("muskan", 2019, 25000, 0);

        manager.add(m1);
        manager.add(m2);
        manager.add(m3);
        manager.add(m4);

        ArrayList<Employee> clerk = new ArrayList<Employee>();
        Clerk c1 = new Clerk("mahek", 2016, 10000, 0);
        Clerk c2 = new Clerk("tanna", 2017, 15000, 0);
        Clerk c3 = new Clerk("sana", 2018, 20000, 0);
        Clerk c4 = new Clerk("muskan", 2019, 25000, 0);

        clerk.add(c1);
        clerk.add(c2);
        clerk.add(c3);
        clerk.add(c4);


        System.out.println("enter the type of employee" );
        String type = sc.nextLine();
        if (type.equals("manager")) {
            printElements(manager);
        } else {
            EmployeeRunner.printElements(clerk);
        }
        System.out.println(m1.equals(c1));
    }
    public static void printElements(ArrayList<Employee> employees){
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}