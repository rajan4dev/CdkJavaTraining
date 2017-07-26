package assignment4;

import assignment3.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by bhirudr on 7/25/2017.
 */
public class IncrementSalary {
    @Test
    public void salaryHike() {
        ArrayList<Employee> employeeArrayList = Employee.getEmployees();
        Iterator iterator = employeeArrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println("==old salary==");

            Employee employee = (Employee) iterator.next();
            System.out.println(employee.toString());
            if (employee.getSalary() < 20000.00) {
                employee.setSalary(1.2 * employee.getSalary());
            }
            System.out.println("--updated salary--");
            System.out.println(employee.toString());
            System.out.println("======================================================");
        }
    }

}
