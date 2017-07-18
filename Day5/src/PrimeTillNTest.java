import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bhirudr on 7/17/2017.
 */
public class PrimeTillNTest {
    @Test
    public void checkPrimeEg() {
        List<Integer> checkList = Arrays.asList(2,3,5,7);
        Assert.assertEquals("expected List should match test List",checkList, PrimeTillN.primeList(10));
    }
}
