/**
 * Created by bhirudr on 7/19/2017.
 */
public class CompareNames implements Compare {
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;

        int compResult = e1.getName().compareToIgnoreCase(e2.getName());

        if(compResult < 0){
            return -1;
        }

        return 0;
    }
}
