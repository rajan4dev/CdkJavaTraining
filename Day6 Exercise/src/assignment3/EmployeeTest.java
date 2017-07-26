package assignment3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by bhirudr on 7/25/2017.
 */
public class EmployeeTest {

    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = Employee.getEmployees();

        Iterator<Employee> itr = employeeArrayList.iterator();
        while (itr.hasNext()) {
            Employee employee = itr.next();
            System.out.println("EmployeeName: " + employee.getName() + " HRA: " + employee.calculateHRA());
        }

//        for (Employee e : employeeArrayList)
//            System.out.println("Ename: " + e.getName() + " HRA: " + Employee.calculateHRA(e.salary));
    }

}
