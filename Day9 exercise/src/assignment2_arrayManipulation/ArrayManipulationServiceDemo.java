package assignment2_arrayManipulation;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by bhirudr on 7/28/2017.
 */
public class ArrayManipulationServiceDemo {

    @Test
    public void testForEach() {
        int[] numberArray = {2, 4, 6, 7};
        ArrayManipulationService arrayManipulationService = new ArrayManipulationService(numberArray);
        arrayManipulationService.forEach((Integer arrayElement) -> {
            System.out.println(" " + arrayElement);
        });


        arrayManipulationService.forEach((Integer arrayElement) -> {
            System.out.println("multiplying each element by 2 , Result: "+(arrayElement*2));
        });
    }


    @Test
    public void testDoOperation() {
        int[] numberArray = {2, 4, 6, 7};
        ArrayManipulationService arrayManipulationService = new ArrayManipulationService(numberArray);


        arrayManipulationService.doOperation((int[] intArray) -> {
            System.out.println("Length Of Array is " + intArray.length);
        });

        arrayManipulationService.doOperation((int[] intArray) -> {
            int sum = 0;
            for (int number : intArray) {
                sum = sum + number;
            }
            System.out.println("Sum of Array : " + sum);
        });

        arrayManipulationService.doOperation((int[] intArray) -> {
            int average = 0;
            for (int number : intArray) {
                average = average + number;
            }
            System.out.println("Average of Array : " + average / intArray.length);
        });

        arrayManipulationService.doOperation((int[] intArray) -> {
            Arrays.sort(intArray);
            System.out.print("%n Sorted Array : ");
            for (int number : intArray) {
                System.out.print(" " + number);
            }

        });

    }


}
