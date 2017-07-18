import java.util.ArrayList;
import java.util.List;

/**
 * Created by bhirudr on 7/17/2017.
 */
public class PrimeTillN {

    static List primeList(int number) {

        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            boolean flag = false;
            int sqRt = (int) Math.sqrt(i);
           //////// for (int divider = 2; divider <= i / 2; divider++) {
            for (int divider = 2; divider<=sqRt; divider++) {
                if (i % divider == 0) {
                    flag = true;
                }
            }
            if (flag == false) {
                result.add(i);
            }
        }

        return result;
    }


    public static void main(String[] args) {
        PrimeTillN primeTillN = new PrimeTillN();
        List resultArray = primeTillN.primeList(100);
        System.out.println(resultArray);
        System.out.println("=======================================");

    }
}
