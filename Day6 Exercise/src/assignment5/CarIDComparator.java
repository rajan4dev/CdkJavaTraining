package assignment5;

import java.util.Comparator;

/**
 * Created by bhirudr on 7/26/2017.
 */
public class CarIDComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        if(car1.getId() == car2.getId())
            return 0;
        else if(car1.getId() > car2.getId()){
            return 1;
        }
        return -1;
    }
}
