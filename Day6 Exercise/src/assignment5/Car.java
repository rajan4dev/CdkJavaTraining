package assignment5;

/**
 * Created by bhirudr on 7/26/2017.
 */
public class Car implements Comparable<Car>{
    private int id;
    private int price;
    private String brand;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car(int id, int price, String brand) {

        this.id = id;
        this.price = price;
        this.brand = brand;
    }

    @Override
    public int compareTo(Car car) {
        if(this.getPrice() == car.getPrice())
            return 0;
        else if(this.getPrice() > car.getPrice()){
            return -1;
        }
        return 1;
    }
}
