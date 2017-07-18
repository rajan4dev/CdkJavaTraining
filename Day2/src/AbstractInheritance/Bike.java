package AbstractInheritance;

/**
 * Created by bhirudr on 7/14/2017.
 */
public class Bike extends Vehicle {
    public Bike(int vin, String name, int speed) {
        super(vin, name, speed);
    }

    @Override
    void drive() {
        System.out.println("Driving a Harley ...");
    }

    @Override
    void inspect() {
        System.out.println("Inspecting a Harley ...");
    }
}
