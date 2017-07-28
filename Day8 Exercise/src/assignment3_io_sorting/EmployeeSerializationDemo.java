package assignment3_io_sorting;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by bhirudr on 7/28/2017.
 */
public class EmployeeSerializationDemo {
    public static List<Employee> getCreamyLayerEmployees(List<Employee> employeeList) {
        List<Employee> creamyLayerEmployeeList = new ArrayList();
        System.out.println("Sorted Employees with salary gt 40k");

        for (Employee e : employeeList) {
            if (e.getSalary() > 40000) {
                creamyLayerEmployeeList.add(e);
            }
        }
        return creamyLayerEmployeeList;
    }

    public static List<Employee> sortEmployees(List<Employee> creamyLayerEmployeeList) {
        //sorting Employees
        EmployeeSalaryComparator employeeSalaryComparator = new EmployeeSalaryComparator();
        Collections.sort(creamyLayerEmployeeList, employeeSalaryComparator);
        System.out.println(creamyLayerEmployeeList.toString());
        Employee.SortedCreamyLayerEmployeeList=creamyLayerEmployeeList;
        return creamyLayerEmployeeList;
    }

    public static void serializeSortedEmployees(List<Employee> employeeList) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            File employeeFile = new File("C:\\Users\\bhirudr\\IdeaProjects\\Day8 Exercise\\src\\assignment3_io_sorting\\EmployeeBackup.txt");
            fileOutputStream = new FileOutputStream(employeeFile);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            for (Employee e : employeeList) {
                objectOutputStream.writeObject(e);
            }
            System.out.println("Serialiazation Done");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    public static void deSerializeSortedEmployees(List<Employee> testEmployeeList ) {
        FileOutputStream fileInputStream = null;
        ObjectOutputStream objectInputStream = null;

        try {
            File employeeFile = new File("C:\\Users\\bhirudr\\IdeaProjects\\Day8 Exercise\\src\\assignment3_io_sorting\\EmployeeBackup.txt");
            fileInputStream = new FileInputStream(employeeFile);
            objectInputStream = new ObjectOutputStream(fileInputStream);


                objectInputStream.

            System.out.println("Serialiazation Done");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    public static List<Employee> createTestEmployeeData() {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rajan", 20000),
                new Employee(2, "Rajan1", 40000),
                new Employee(3, "R43ajan1", 40000),
                new Employee(4, "mahesh", 40000),
                new Employee(5, "ramesh", 50000),
                new Employee(6, "sushant", 30000),
                new Employee(16, "Rajyan1", 30000),
                new Employee(156, "Rajtyan1", 30000),
                new Employee(1166, "arshi", 30000),
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
                new Employee(212, "ishan", 20111)
        );
        return employees;
    }

    public static void main(String[] args) {
        List<Employee> testEmployeeList = EmployeeSerializationDemo.createTestEmployeeData();
        List<Employee> creamyLayerEmployees = EmployeeSerializationDemo.getCreamyLayerEmployees(testEmployeeList);
        List<Employee> sortedEmployeeList = EmployeeSerializationDemo.sortEmployees(creamyLayerEmployees);
        for (Employee e : sortedEmployeeList) {
            System.out.println(e.toString());
        }

        EmployeeSerializationDemo.serializeSortedEmployees(sortedEmployeeList);


    }


}
