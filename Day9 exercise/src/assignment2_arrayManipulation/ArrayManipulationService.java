package assignment2_arrayManipulation;

import java.util.function.Consumer;
import java.util.function.Function;

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

    void forEach(Consumer<Integer> elementConsumer) {
        for (int arrayElement :
                numberArray) {
            elementConsumer.accept(arrayElement);
        }
    }

    void modify(Function<Integer,Integer> mapIntToInt){
        mapIntToInt.apply(Integer);
    }



}
