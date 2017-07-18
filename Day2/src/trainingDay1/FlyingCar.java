package trainingDay1;

/**
 * Created by bhirudr on 7/13/2017.
 */
public class FlyingCar extends Car {
    String flyingStyle;
    int wingSpan;

    public FlyingCar(int passingNo, String make, String model, int seatingCapacity, int price, int maxSpeed, int noOfAirbags, String category, Boolean remoteKeyLessEntry, Boolean roadSideAssistance, Boolean bluetooth, String flyingStyle, int wingSpan) {
        super(passingNo, make, model, seatingCapacity, price, maxSpeed, noOfAirbags, category, remoteKeyLessEntry, roadSideAssistance, bluetooth);
        this.flyingStyle = flyingStyle;
        this.wingSpan = wingSpan;
    }

    public String getFlyingStyle() {
        return flyingStyle;
    }

    public void setFlyingStyle(String flyingStyle) {
        this.flyingStyle = flyingStyle;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }


    @Override
    void accelerate() {
        super.accelerate();
        this.speed = this.speed + 100 ;
    }
}
