package StringPractice.EmployeePackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by bhirudr on 7/22/2017.
 */
public class EmployeeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;

        //comparison for sorting with preference to Location, DeptName, FirstName, LastName, EmpId

        int compResult = e1.getLocation().compareToIgnoreCase(e2.getLocation());
        if (compResult != 0) {
            return compResult;
        }
        compResult = e1.getDeptName().compareToIgnoreCase(e2.getDeptName());
        if (compResult != 0) {
            return compResult;
        }
        compResult = e1.getfName().compareToIgnoreCase(e2.getfName());
        if (compResult != 0) {
            return compResult;
        }
        compResult = e1.getlName().compareToIgnoreCase(e2.getlName());
        if (compResult != 0) {
            return compResult;
        }
        return e1.getEmployeeId() - e2.getEmployeeId();

    }

}
