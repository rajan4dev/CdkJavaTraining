package assignment2_arrayManipulation;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by bhirudr on 7/28/2017.
 */
public class ArrayManipulationService {
    int[] numberArray;

    public ArrayManipulationService(int[] numberArray) {
        this.numberArray = numberArray;
    }

    void doOperation(ArrayConsumer arrayConsumer) {
        arrayConsumer.manipulate(numberArray);
    }

    public void forEach(Consumer<Integer> elementConsumer) {
        for (int arrayElement :
                numberArray) {
            elementConsumer.accept(arrayElement);
        }
    }

    public void modify(Function<Integer, Integer> mapIntToSqrt) {
        for (int arrayElement : numberArray) {
            mapIntToSqrt.apply(arrayElement);
        }
    }

    public void delete(Predicate<Integer> predicate) {
        for (int arrayIndex = 0; arrayIndex < numberArray.length; arrayIndex++) {
            if (predicate.test(numberArray[arrayIndex])) {
                numberArray[arrayIndex] = 0;
            }
        }
    }

    public void fold(BiFunction<Integer, Integer, Integer> biFunction) {
        for (int arrayIndex = 1; arrayIndex < numberArray.length; arrayIndex++) {
            numberArray[0] = numberArray[0] + numberArray[arrayIndex];
        }
    }


}
