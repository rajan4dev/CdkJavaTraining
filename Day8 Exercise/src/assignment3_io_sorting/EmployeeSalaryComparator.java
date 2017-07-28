package assignment3_io_sorting;

import java.util.Comparator;

/**
 * Created by bhirudr on 7/28/2017.
 */
public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        if (employee1.getSalary() == employee2.getSalary()) {
            return 0;
        } else if (employee1.getSalary() > employee2.getSalary()) {
            return 1;
        } else return -1;
    }
}
