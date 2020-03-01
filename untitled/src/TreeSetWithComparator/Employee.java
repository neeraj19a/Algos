package TreeSetWithComparator;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Employee {
    String name;
    int salary;

    //Creating Constructor
    public Employee(String name, int salary) {

        this.name = name;
        this.salary = salary;
    }

    /*
    The toString() method returns the string representation of the object.
    If you print any object, java compiler internally invokes the toString() method on the object.
     So overriding the toString() method, returns the desired output, it can be the state of an object
     */
    @Override
    public String toString() {
        return name + " and " + salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Neeraj", 400000);
        System.out.println(employee);
        MyComparator comparator = new MyComparator();
        TreeSet<Employee> treeSet = new TreeSet<Employee>(comparator);
        treeSet.add(new Employee("AAA", 500));
        treeSet.add(new Employee("EEE", 1000));
        treeSet.add(new Employee("BBB", 100));
        treeSet.add(new Employee("AAA", 100));
        treeSet.add(new Employee("CCC", 100));
        treeSet.add(new Employee("CCC", 100));
        treeSet.add(new Employee("AAA", 100));
        treeSet.add(new Employee("BBB", 100));
        treeSet.add(new Employee("DDD", 900));
        treeSet.add(new Employee("FFF", 1100));


        //Output will have max salary Employee on top and Duplicate Employees would be removed keeping one entry of employee only other duplicate enteries would be removed
        System.out.println(treeSet);

    }
}
