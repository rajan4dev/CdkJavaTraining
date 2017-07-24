import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by bhirudr on 7/20/2017.
 */
public class IDComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpId()-o2.getEmpId();
    }

    @Test
    public void testSort() {
        List<Employee> testEmployeeList = Employee.createTestEmployeeList();
        Comparator comparatorIDreference = new IDComparator();

        Collections.sort(testEmployeeList, comparatorIDreference);
        for (Employee employee:testEmployeeList
                ) {
            System.out.println(employee);
        }
    }
}


