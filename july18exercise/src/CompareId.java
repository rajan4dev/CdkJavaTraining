/**
 * Created by bhirudr on 7/19/2017.
 */
public class CompareId implements Compare {
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee)o1;
        Employee e2 = (Employee)o2;
        if(e1.empId > e2.empId)
            return 1;
        return e1.empId < e2.empId ? -1 : 0;

    }
}
