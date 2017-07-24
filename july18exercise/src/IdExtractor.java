/**
 * Created by bhirudr on 7/20/2017.
 */
public class IdExtractor implements Extractor {
    @Override
    public int extractInt(Employee employee) {
        return employee.getEmpId();
    }
}
