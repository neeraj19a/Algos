package EmployeeWithLowestSalaryUsingPriorityQueue;

import java.util.PriorityQueue;

public class Employee {
    String name;
    int salary;

    //Creating Constructor
    public Employee(String name,int salary){

        this.name=name;
        this.salary=salary;
    }

    /*
    The toString() method returns the string representation of the object.
    If you print any object, java compiler internally invokes the toString() method on the object.
     So overriding the toString() method, returns the desired output, it can be the state of an object
     */
    @Override
    public String toString(){
        return name+" and "+salary;
    }
    public static void main(String[] args) {
        Employee employee=new Employee("Neeraj",400000);
        System.out.println(employee);
        MyComparator comparator=new MyComparator();
        PriorityQueue<Employee> employeePriorityQueue=new PriorityQueue<Employee>(7,comparator);
        employeePriorityQueue.offer(new Employee("AAA",600));
        employeePriorityQueue.offer(new Employee("BBB",100));// lowest salary
        employeePriorityQueue.offer(new Employee("CCC",500));
        employeePriorityQueue.offer(new Employee("CCC",100));

        System.out.println(employeePriorityQueue.poll());

    }
}
