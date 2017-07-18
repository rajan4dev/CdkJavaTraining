package AbstractInheritance;

/**
 * Created by bhirudr on 7/14/2017.
 */
public abstract class Vehicle {

    int vin;
    String name;
    int speed;

    public  Vehicle (){
        System.out.println("In default constructor of Vehicle ");
    }

    public Vehicle(int vin, String name, int speed) {
        this.vin = vin;
        this.name = name;
        this.speed = speed;
    }

    void details() {
        System.out.println("The Vehicle ID " + vin);
        System.out.println("The Vehicle Name " + name);
        System.out.println("The Vehicle Speed " + speed);
    }
    abstract void drive();
    abstract void inspect();
}
