package assignment3_io_sorting;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by bhirudr on 7/28/2017.
 */
public class Employee implements Comparable, Serializable {
    int empId;
    String name;
    transient private int salary;
    static List<Employee> SortedCreamyLayerEmployeeList = new ArrayList();


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Employee employee = (Employee) o;
        if (this.getEmpId() == employee.getEmpId()) {
            return 0;
        } else if (this.getEmpId() > employee.getEmpId()) {
            return 1;
        } else {
            return -1;
        }
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



}
