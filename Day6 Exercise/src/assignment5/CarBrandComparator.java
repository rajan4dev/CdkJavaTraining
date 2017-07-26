package assignment5;

import java.util.Comparator;

/**
 * Created by bhirudr on 7/26/2017.
 */
public class CarBrandComparator implements Comparator<Car>{

    @Override
    public int compare(Car car1, Car car2) {
        return car1.getBrand().compareToIgnoreCase(car2.getBrand());
    }
}
