package StringPractice.EmployeePackage;

import org.junit.Test;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by bhirudr on 7/22/2017.
 */
public class EmployeeTest {

    public static List<Employee> createTestEmployeeData() {


        List<Employee> employees = Arrays.asList(
                new Employee("Rajan", "Bhirud", 1, "RnD", "Pune"),
                new Employee("Suresh", "Jagtap", 2, "RnD", "Pune"),
                new Employee("Mahesh", "Jagtap", 3, "RnD", "Pune"),
                new Employee("Ritesh", "Karode", 4, "RnD", "Pune"),
                new Employee("Rajesh", "Jagtap2", 5, "RnD", "Pune"),
                new Employee("Mikesh", "Bhirud4", 6, "HR", "Pune"),
                new Employee("Shen", "Bhirud2", 7, "HR", "Pune"),
                new Employee("Neha", "Bhirud7", 8, "RnD", "Pune"),
                new Employee("Jadu", "Bhirud8", 9, "RnD", "Pune"),
                new Employee("Arshi", "Saifi", 10, "Admin", "Pune"),
                new Employee("Chhaya", "Bhirud", 11, "Finance", "Pune"),
                new Employee("Rajan", "Bhirud", 12, "Finance", "Pune"),
                new Employee("Rajan", "Bhirud2", 13, "RnD", "Pune"),
                new Employee("Rajan", "Bhirud", 14, "RnD", "Pune"),
                new Employee("Rajan", "Bhirud", 15, "RnD", "Pune"),
                new Employee("Binay", "Banda", 16, "Finance", "Pune"),
                new Employee("Arshi", "Bhirud", 17, "HR", "Pune"),
                new Employee("Binay", "Bhirud156", 18, "RnD", "Pune"),
                new Employee("Arshi", "Saifi", 19, "RnD", "Pune"),
                new Employee("Rajan", "Bhirud", 20, "RnD", "Pune"),

                new Employee("Rajan", "Bhirud", 21, "RnD", "Hyderabad"),
                new Employee("Suresh", "Jagtap", 22, "RnD", "Hyderabad"),
                new Employee("Mahesh", "Jagtap", 23, "RnD", "Hyderabad"),
                new Employee("Ritesh", "Karode", 24, "RnD", "Hyderabad"),
                new Employee("Rajesh", "Jagtap2", 25, "RnD", "Hyderabad"),
                new Employee("Mikesh", "Bhirud4", 26, "HR", "Hyderabad"),
                new Employee("Shen", "Bhirud2", 27, "HR", "Hyderabad"),
                new Employee("Neha", "Bhirud7", 28, "RnD", "Hyderabad"),
                new Employee("Jadu", "Bhirud8", 29, "RnD", "Hyderabad"),
                new Employee("Arshi", "Saifi", 30, "Admin", "Hyderabad"),
                new Employee("Chhaya", "Bhirud", 31, "Finance", "Hyderabad"),
                new Employee("Rajan", "Bhirud", 32, "Finance", "Hyderabad"),
                new Employee("Rajan", "Bhirud2", 33, "RnD", "Hyderabad"),
                new Employee("Rajan", "Bhirud", 34, "RnD", "Hyderabad"),
                new Employee("Rajan", "Bhirud", 35, "RnD", "Hyderabad"),
                new Employee("Binay", "Banda", 36, "Finance", "Hyderabad"),
                new Employee("Arshi", "Bhirud", 37, "HR", "Hyderabad"),
                new Employee("Binay", "Bhirud156", 38, "RnD", "Hyderabad"),
                new Employee("Arshi", "Saifi", 39, "RnD", "Hyderabad"),
                new Employee("Rajan", "Bhirud", 40, "RnD", "Hyderabad")
        );
        return employees;
    }


    @Test
    public void testSorting() {
        List<Employee> testEmployeeList = EmployeeTest.createTestEmployeeData();

        Comparator employeeComparator = new EmployeeComparator();
        testEmployeeList.sort(employeeComparator);//List.sort
        for (Employee employee : testEmployeeList) {
            System.out.println(employee);
        }
    }

}