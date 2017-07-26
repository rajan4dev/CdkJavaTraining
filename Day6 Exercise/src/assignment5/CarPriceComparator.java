package assignment5;

import java.util.Comparator;

/**
 * Created by bhirudr on 7/26/2017.
 */
public class CarPriceComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        if(car1.getPrice() == car2.getPrice())
            return 0;
        else if(car1.getPrice() > car2.getPrice()){
            return -1;
        }
        return 1;
    }
}
