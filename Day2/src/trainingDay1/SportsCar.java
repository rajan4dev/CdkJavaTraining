package trainingDay1;

/**
 * Created by bhirudr on 7/13/2017.
 */
public class SportsCar extends Car {
    long MinPrice;

    public SportsCar(int passingNo, String make, String model, int seatingCapacity, int price, int maxSpeed, int noOfAirbags, String category, Boolean remoteKeyLessEntry, Boolean roadSideAssistance, Boolean bluetooth) {
        super(passingNo, make, model, seatingCapacity, price, maxSpeed, noOfAirbags, category, remoteKeyLessEntry, roadSideAssistance, bluetooth);
    }

    @Override
    void accelerate() {
        super.accelerate();
        this.speed = this.speed + 40;
    }
}
