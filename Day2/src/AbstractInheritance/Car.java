package AbstractInheritance;

/**
 * Created by bhirudr on 7/14/2017.
 */
public class Car extends Vehicle {

    public Car(int vin, String name, int speed) {
        super(vin, name, speed);
    }

    @Override
    void drive() {
        System.out.println("Driving a Lamborghini...");
    }

    @Override
    void inspect() {
        System.out.println("Inspecting a Lamborghini...");
    }
}
