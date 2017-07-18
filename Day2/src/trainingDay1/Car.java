package trainingDay1;

/**
 * Created by bhirudr on 7/13/2017.
 */
public class Car extends Automobile {
    public Car(int passingNo, String make, String model, int seatingCapacity, int price, int maxSpeed, int noOfAirbags, String category, Boolean remoteKeyLessEntry, Boolean roadSideAssistance, Boolean bluetooth) {
        super(passingNo, make, model, seatingCapacity, price, maxSpeed);
        this.noOfAirbags = noOfAirbags;
        this.category = category;
        this.remoteKeyLessEntry = remoteKeyLessEntry;
        RoadSideAssistance = roadSideAssistance;
        Bluetooth = bluetooth;
    }

    int noOfAirbags;
    String category;
    Boolean remoteKeyLessEntry;
    Boolean RoadSideAssistance;
    Boolean Bluetooth;

    @Override
    void accelerate() {
        super.accelerate();
        speed = speed + 20;
    }
}
