package EmployeeWithLowestSalaryUsingPriorityQueue;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {

    //compares the salary of two Employees.
    @Override
    public int compare(Employee e1, Employee e2) {

        return e1.salary-e2.salary;
    }
}
