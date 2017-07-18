/**
 * Created by bhirudr on 7/17/2017.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int a = 10;
        int b = 20;

        int i = a * b;
        int c = add(a, b);
    }

    public static int add(int a, int b) {
        return a + b;
    }


}
