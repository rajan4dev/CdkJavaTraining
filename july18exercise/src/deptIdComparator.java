import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class deptIdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getDeptId() - o2.getDeptId();
    }

    @Test
    public void testSort() {
        List<Employee> testEmployeeList = Employee.createTestEmployeeList();
        // Comparator comparatorIDreference = new IDComparator();
        Comparator comparatorDeptIdReference = new deptIdComparator();

        // Collections.sort(testEmployeeList, comparatorIDreference);
        Collections.sort(testEmployeeList, comparatorDeptIdReference);
        for (Employee employee : testEmployeeList) {
            System.out.println(employee);
        }
    }
}
