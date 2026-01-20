package com.company.skuska.iterator;

public class EmployeeListIterator implements Iterator<Employee> {

    private EmployeeList employees;
    private int index;

    public EmployeeListIterator(EmployeeList employeeList) {
        this.employees = employeeList;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (!isDone())
            index++;
    }

    @Override
    public boolean isDone() {
        return index >= employees.size();
    }

    @Override
    public Employee currentItem() {
        if (isDone())
            return null;
        return employees.get(index);
    }
}
