package assignment3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by bhirudr on 7/25/2017.
 */
public class EmployeeTest {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "rajan", 20000);
        Employee e2 = new Employee(2, "raja", 20000);
        Employee e3 = new Employee(3, "ran", 40000);
        Employee e4 = new Employee(4, "rjan", 70000);
        Employee e5 = new Employee(5, "erajan", 750000);
        Employee e6 = new Employee(6, "ajan", 230);
        Employee e7 = new Employee(7, "raj1an", 4000);
        Employee e8 = new Employee(8, "raja2n", 200);
        Employee e9 = new Employee(9, "rajan5", 2430);
        Employee e10 = new Employee(10, "raja23n", 23400);

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(e1);
        employeeArrayList.add(e2);
        employeeArrayList.add(e3);
        employeeArrayList.add(e4);
        employeeArrayList.add(e5);
        employeeArrayList.add(e6);
        employeeArrayList.add(e7);
        employeeArrayList.add(e8);
        employeeArrayList.add(e9);
        employeeArrayList.add(e10);

        Iterator<Employee> itr = employeeArrayList.iterator();
        while (itr.hasNext()) {
            Employee employee = itr.next();
            System.out.println("EmployeeName: " + employee.getName() + " HRA: " + employee.calculateHRA());
        }

//        for (Employee e : employeeArrayList)
//            System.out.println("Ename: " + e.getName() + " HRA: " + Employee.calculateHRA(e.salary));
    }
}
