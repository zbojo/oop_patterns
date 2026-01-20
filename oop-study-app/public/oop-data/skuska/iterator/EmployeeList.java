package com.company.skuska.iterator;

import java.util.ArrayList;

public class EmployeeList extends ArrayList<Employee> implements AbstractList {

    @Override
    public Iterator<Employee> createIterator() {
        return new EmployeeListIterator(this);
    }
}
