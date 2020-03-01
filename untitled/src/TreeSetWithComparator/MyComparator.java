package TreeSetWithComparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {

        if(e1.name == e2.name)
        {
            return 0;
        }
        else
        return e2.salary-e1.salary; // here e2-e1 not e1-e2
    }

}
