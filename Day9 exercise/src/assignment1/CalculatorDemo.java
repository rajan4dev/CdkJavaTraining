package assignment1;

/**
 * Created by bhirudr on 7/28/2017.
 */
public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorService.calculate(22.00, 2.00, (Double val1, Double val2) -> {
            System.out.printf("Addition %f %n", (val1 + val2));
        });
        CalculatorService.calculate(22.00, 2.00, (Double val1, Double val2) -> {
            System.out.printf("Multiple %f %n", (val1 * val2));
        });
        CalculatorService.calculate(22.00, 2.00, (Double val1, Double val2) -> {
            System.out.printf("Division %f %n", (val1 / val2));
        });
        CalculatorService.calculate(22.00, 2.00, (Double val1, Double val2) -> {
            System.out.printf("Substraction %f %n", (val1 - val2));
        });
        CalculatorService.calculate(22.00, 2.00, (Double val1, Double val2) -> {
            System.out.printf("Mod %f %n", (val1 % val2));
        });
    }
}
