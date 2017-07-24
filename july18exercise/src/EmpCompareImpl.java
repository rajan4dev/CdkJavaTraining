import java.util.Comparator;

/**
 * Created by bhirudr on 7/19/2017.
 */
public class EmpCompareImpl implements Compare {

    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        if (e1.empId == e2.empId) {
            return 0;
        } else if (e1.empId > e2.empId) {
            return 1;
        } else
            return -1;
    }
}
