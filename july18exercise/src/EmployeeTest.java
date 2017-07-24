import org.junit.Test;

import java.util.*;

/**
 * Created by bhirudr on 7/18/2017.
 */

class SortObjects implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.empId == o2.empId) {
            return 0;
        } else if (o1.empId > o2.empId) {
            return 1;
        } else {
            return -1;
        }
    }


}

public class EmployeeTest {
    static List<Employee> creatTestData() {
        Employee e1 = new Employee(1, "Rajan", new Date(1996 - 1900, 1 - 1, 14), new Date(2017, 07, 07), 4, Location.Pune);
        Employee e2 = new Employee(2, "Raja", new Date(1997 - 1900, 1 - 1, 11), new Date(2017, 07, 07), 4, Location.Pune);
        Employee e3 = new Employee(3, "Raj", new Date(2002 - 1900, 11 - 1, 19), new Date(2017, 07, 07), 4, Location.Pune);
        Employee e4 = new Employee(4, "Ra", new Date(2017 - 1900, 5 - 1, 13), new Date(2017, 07, 07), 4, Location.Pune);
        Employee e5 = new Employee(5, "R", new Date(2005 - 1900, 6 - 1, 17), new Date(2017, 07, 07), 4, Location.Pune);

        ArrayList employeeList = new ArrayList();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        return employeeList;
    }

    @Test
    public void Test2(){
        EmployeeTest employeeTest = new EmployeeTest();
        List<Employee> employeeList = employeeTest.creatTestData();
        for (Employee e : employeeList) {
            System.out.println(e.toString());
        }

        Collections.sort(employeeList, new SortObjects());
    }


    @Test
    public void testIntComparator() {
        List<Employee> testEmployeeList = Employee.createTestEmployeeList();
//        Extractor idExtractor = new IdExtractor();
        //Extractor ageExtractor = new AgeExtractor();
        Comparator<Employee> comparatorForInt = new IntComparator( new IdExtractor());

        Collections.sort(testEmployeeList, comparatorForInt);

        for (Employee employee : testEmployeeList) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {

        //Object o = new Object();

    }
}
