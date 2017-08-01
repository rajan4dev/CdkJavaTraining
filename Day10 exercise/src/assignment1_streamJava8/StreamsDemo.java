package assignment1_streamJava8;

import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by bhirudr on 7/29/2017.
 */
public class StreamsDemo {
    @Test
    public void testTds() {
        List<Employee> employeeList = Employee.createTestEmployeeData();
        Optional<Integer> reduceResult = employeeList.stream().distinct()
                .filter(employee -> employee.getSalary() > 50000)
                .map(employee -> employee.getSalary() / 10)
                .reduce((accumulator, tds) -> accumulator + tds);
        //employeeStream.forEach(employee -> System.out.println("Name: " + employee.getName() + "Salary: " + employee.getSalary()));

        System.out.println("Total TDS: " + reduceResult.get());
    }

    @Test
    public void testAverage() {
        List<Employee> employeeList = Employee.createTestEmployeeData();
        Optional<Integer> totalSalary = employeeList.stream().distinct().map(employee -> employee.getSalary()).reduce((accumulator, salary) -> accumulator + salary);
        System.out.println(totalSalary.get() / employeeList.stream().count());
    }

    @Test
    public void testTotalSalary() {
        List<Employee> employeeList = Employee.createTestEmployeeData();
        Optional<Integer> totalSalary = employeeList.stream().distinct().map(employee -> employee.getSalary()).reduce((accumulator, salary) -> accumulator + salary);
        System.out.println(totalSalary.get());
    }

    @Test
    public void testMinSalary() {
        List<Employee> employeeList = Employee.createTestEmployeeData();
        employeeList.stream().map(employee -> )
    }


}
