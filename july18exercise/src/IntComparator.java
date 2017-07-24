import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by bhirudr on 7/20/2017.
 */
public class IntComparator implements Comparator<Employee> {
    Extractor extractor;

    public IntComparator(Extractor ext) {
        this.extractor = ext;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return extractor.extractInt(o1) - extractor.extractInt(o2);
    }
}
