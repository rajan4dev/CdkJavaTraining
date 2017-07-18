package AbstractInheritance;

/**
 * Created by bhirudr on 7/14/2017.
 */
public class Mechanic {
public static void  main (String[] abc) {
    System.out.println("==============================================");
    Bike bike = new Bike(12,"harley", 200);
    bike.drive();
    bike.inspect();
    bike.details();
    System.out.println("==============================================");
    Car car = new Car(14,"lamborghini", 400);
    car.drive();
    car.inspect();
    car.details();
}
}
