package com.company.skuska.iterator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee janko = new Employee("Jan", "Hruska", 333f);
        Employee jozko = new Employee("Jozef", "Jablko", 875f);
        Employee maja = new Employee("Maria", "Mrkvickova", 399f);
        Employee irenka = new Employee("Irena", "Jablonova", 800f);
        Employee bajza = new Employee("Jozef", "Ignac Bajza", 2200f);

        EmployeeList employeeList = new EmployeeList();
        employeeList.addAll(Arrays.asList(janko, maja, jozko, irenka, bajza));

        Iterator<Employee> iterator = employeeList.createIterator();

        for (iterator.first(); !iterator.isDone(); iterator.next()) {
            Employee employee = iterator.currentItem();
            System.out.println(String.format("Meno: %s \nPriezvisko: %s\nPlat: %.2f\n-------------", employee.getFirstname(), employee.getLastname(), employee.getSalary()));
        }

    }
}
