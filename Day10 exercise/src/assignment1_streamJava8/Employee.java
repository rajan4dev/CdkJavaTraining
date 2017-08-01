package assignment1_streamJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bhirudr on 7/29/2017.
 */
public class Employee {
    int empId;
    String name;
    private int salary;
    static List<Employee> SortedCreamyLayerEmployeeList = new ArrayList();


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public Employee(int empId, String name, int salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }


    public static List<Employee> createTestEmployeeData() {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rajan", 20000),
                new Employee(2, "Rajan1", 40000),
                new Employee(3, "R43ajan1", 40000),
                new Employee(4, "mahesh", 40000),
                new Employee(5, "ramesh", 50000),
                new Employee(6, "sushant", 70000),
                new Employee(16, "Rajyan1", 70000),
                new Employee(156, "Rajtyan1", 70000),
                new Employee(1166, "arshi", 70000),
                new Employee(136, "Ratran1", 40000),
                new Employee(164, "mukta", 40000),
                new Employee(16412, "R5tyajan1", 40000),
                new Employee(1136, "Reqwajan1", 40000),
                new Employee(26, "Rqweajan1", 40000),
                new Employee(36, "Rajqwean1", 40000),
                new Employee(8, "Rajan1", 40000),
                new Employee(76, "ritesh", 90000),
                new Employee(796, "sameer", 90000),
                new Employee(736, "Rajjhan1", 90000),
                new Employee(376, "binay", 55000),
                new Employee(746, "Raja2n1", 55000),
                new Employee(7657, "nitesh", 90000),
                new Employee(769, "Rajan81", 90000),
                new Employee(768, "suresh", 20111),
                new Employee(212, "ishan", 20111),
                new Employee(1, "Rajan", 20000),
                new Employee(12, "Rajan1", 40000),
                new Employee(113, "R43ajan1", 40000),
                new Employee(114, "mahesh", 40000),
                new Employee(115, "ramesh", 50000),
                new Employee(611, "sushant", 70000),
                new Employee(1116, "Rajyan1", 70000),
                new Employee(11156, "Rajtyan1", 70000),
                new Employee(111166, "arshi", 70000),
                new Employee(1136, "Ratran1", 40000),
                new Employee(11164, "mukta", 40000),
                new Employee(161412, "R5tyajan1", 40000),
                new Employee(11316, "Reqwajan1", 40000),
                new Employee(216, "Rqweajan1", 40000),
                new Employee(316, "Rajqwean1", 40000),
                new Employee(118, "Rajan1", 40000),
                new Employee(76, "ritesh", 90000),
                new Employee(7196, "sameer", 90000),
                new Employee(7136, "Rajjhan1", 90000),
                new Employee(3176, "binay", 55000),
                new Employee(746, "Raja2n1", 55000),
                new Employee(7657, "nitesh", 90000),
                new Employee(76119, "Rajan81", 90000),
                new Employee(768, "suresh", 20111),
                new Employee(2112, "ishan", 20111),
                new Employee(4441, "Rajan", 20000),
                new Employee(23, "Rajan1", 40000),
                new Employee(333, "R43ajan1", 40000),
                new Employee(34, "mahesh", 40000),
                new Employee(534, "ramesh", 50000),
                new Employee(65, "sushant", 70000),
                new Employee(1516, "Rajyan1", 70000),
                new Employee(1556, "Rajtyan1", 70000),
                new Employee(51166, "arshi", 70000),
                new Employee(5136, "Ratran1", 40000),
                new Employee(1564, "mukta", 40000),
                new Employee(16412, "R5tyajan1", 40000),
                new Employee(1136, "Reqwajan1", 40000),
                new Employee(256, "Rqweajan1", 40000),
                new Employee(356, "Rajqwean1", 40000),
                new Employee(8, "Rajan1", 40000),
                new Employee(76, "ritesh", 90000),
                new Employee(7596, "sameer", 90000),
                new Employee(7536, "Rajjhan1", 90000),
                new Employee(37556, "binay", 55000),
                new Employee(746, "Raja2n1", 55000),
                new Employee(76557, "nitesh", 90000),
                new Employee(7659, "Rajan81", 90000),
                new Employee(7658, "suresh", 20111),
                new Employee(2152, "ishan", 20111)
        );
        return employees;
    }

}
