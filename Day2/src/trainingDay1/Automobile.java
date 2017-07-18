package trainingDay1;

/**
 * Created by bhirudr on 7/13/2017.
 */
public class Automobile {

    int passingNo;
    String Make;
    String Model;
    int seatingCapacity;
    int price;
    int maxSpeed;
    int speed;


    public Automobile(int passingNo, String make, String model, int seatingCapacity, int price, int maxSpeed) {
        this.passingNo = passingNo;
        Make = make;
        Model = model;
        this.seatingCapacity = seatingCapacity;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPassingNo() {
        return passingNo;
    }

    public void setPassingNo(int passingNo) {
        this.passingNo = passingNo;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }



    void accelerate() {
        System.out.println("Accelerating ");
    }

    void brake() {
        System.out.println("Braking ");
    }

    void steerLeft() {
        System.out.println("Turning Left ");
    }

    void steerRight() {
        System.out.println("Turning Right ");
    }
}

