package assignment3;

import java.util.ArrayList;

/**
 * Created by bhirudr on 7/25/2017.
 */
public class Employee {
    int empId;
    String name;
    double salary;

    public Employee(int empId, String name, double salary) {

        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static ArrayList<Employee> getEmployees() {
        Employee e1 = new Employee(1, "rajan", 2000);
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
        return employeeArrayList;
    }

    public double calculateHRA() {
        return 0.3 * this.salary;

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
