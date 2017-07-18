package trainingDay1;

/**
 * Created by bhirudr on 7/13/2017.
 */
public class Circle {
    void paint(int noOfFingers, String color ) {
        System.out.println("Painting with : " + noOfFingers + " Fingers and " + color +" color");
    }
    void paint(String color, int size) {
        System.out.println("Painting with : " + size + " size brush");
    }
    void paint(int thickness ) {
        System.out.println("Painting with : " + thickness + " mm thick pencil");
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.paint(23);
        c1.paint("green" , 600);
        c1.paint(4, "pink");
    }

}

