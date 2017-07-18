package trainingDay1;

/**
 * Created by bhirudr on 7/13/2017.
 */
public class Bus extends Automobile {

    String[] visitingCities;
    int averageFare;
    int luggageCapacity;
    int noOfReservedSeatsForDisabled;

    public Bus(int passingNo, String make, String model, int seatingCapacity, int price, int maxSpeed, String[] visitingCities, int averageFare, int luggageCapacity, int noOfReservedSeatsForDisabled) {
        super(passingNo, make, model, seatingCapacity, price, maxSpeed);
        this.visitingCities = visitingCities;
        this.averageFare = averageFare;
        this.luggageCapacity = luggageCapacity;
        this.noOfReservedSeatsForDisabled = noOfReservedSeatsForDisabled;
    }

    public String[] getVisitingCities() {
        return visitingCities;
    }

    public void setVisitingCities(String[] visitingCities) {
        this.visitingCities = visitingCities;
    }

    public int getAverageFare() {
        return averageFare;
    }

    public void setAverageFare(int averageFare) {
        this.averageFare = averageFare;
    }

    public int getLuggageCapacity() {
        return luggageCapacity;
    }

    public void setLuggageCapacity(int luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }

    public int getNoOfReservedSeatsForDisabled() {
        return noOfReservedSeatsForDisabled;
    }

    public void setNoOfReservedSeatsForDisabled(int noOfReservedSeatsForDisabled) {
        this.noOfReservedSeatsForDisabled = noOfReservedSeatsForDisabled;
    }

    @Override
    void accelerate() {
        super.accelerate();
        this.speed = this.speed + 10;
    }
}
