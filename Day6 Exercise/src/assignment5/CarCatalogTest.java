package assignment5;

import org.junit.Test;

import java.util.*;

/**
 * Created by bhirudr on 7/26/2017.
 */
public class CarCatalogTest {
    public static List<Car> createTestCarCatalog(){
//        List<Car> carList = Arrays.asList(new Car(1, 300000, "BMW"),
        Set<Car> carSet = new HashSet<>(Arrays.asList(new Car(1, 300000, "BMW"),
                new Car(2, 630000, "BMW"),
                new Car(3, 54000, "Audi"),
                new Car(14, 300000, "BMW"),
                new Car(5, 400000, "Audi"),
                new Car(16, 540000, "BMW"),
                new Car(7, 3450000, "Audi"),
                new Car(18, 53000, "BMW"),
                new Car(9, 234, "Bentley"),
                new Car(10, 45000, "BMW"),
                new Car(11, 300234, "BMW"),
                new Car(12, 3004124, "BMW"),
                new Car(23, 5324000, "Bentley"),
                new Car(4, 700, "Audi"),
                new Car(15, 50000, "BMW"),
                new Car(6, 800000, "Bentley"),
                new Car(17, 442000, "Audi"),
                new Car(8, 234000, "Bentley"),
                new Car(19, 2545000, "BMW"),
                new Car(20, 304300, "BMW"),
                new Car(21, 23400, "Bentley"),
                new Car(22, 123300, "Audi"),
                new Car(13, 3230023, "BMW")));


        List<Car> carList = new ArrayList<Car>(carSet);
        return carList;
    }

    @Test
    public void testNaturalSorting() {
        System.out.println("Sorted using NaturalSorting (Price)");
        List<Car> carCatalog = CarCatalogTest.createTestCarCatalog();

        Collections.sort(carCatalog);
        Iterator itr  = carCatalog.iterator();
        while(itr.hasNext()){
            Car car = (Car)itr.next();
            System.out.println(car.toString());
        }
        System.out.println("========================================================");
    }
    @Test
    public void testPriceComparator() {
        System.out.println("Sorted Using Price");
        List<Car> carCatalog = CarCatalogTest.createTestCarCatalog();
        CarPriceComparator carPriceComparator=new CarPriceComparator();
        Collections.sort(carCatalog,carPriceComparator);

        Iterator itr  = carCatalog.iterator();
        while(itr.hasNext()){
            Car car = (Car)itr.next();
            System.out.println(car.toString());
        }
        System.out.println("========================================================");
    }
    @Test
    public void testIDComparator() {
        System.out.println("Sorted Using ID ");
        List<Car> carCatalog = CarCatalogTest.createTestCarCatalog();
       CarIDComparator carIDComparator=new CarIDComparator();
        Collections.sort(carCatalog,carIDComparator);
        Iterator itr  = carCatalog.iterator();
        while(itr.hasNext()){
            Car car = (Car)itr.next();
            System.out.println(car.toString());
        }
        System.out.println("========================================================");
    }
    @Test
    public void testBrandComparator() {
        System.out.println("Sorted using Brand");
        List<Car> carCatalog = CarCatalogTest.createTestCarCatalog();
        CarBrandComparator carBrandComparator=new CarBrandComparator();
        Collections.sort(carCatalog,carBrandComparator);
        Iterator itr  = carCatalog.iterator();
        while(itr.hasNext()){
            Car car = (Car)itr.next();
            System.out.println(car.toString());
        }
        System.out.println("========================================================");
    }





}
