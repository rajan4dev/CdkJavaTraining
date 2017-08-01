package assignment2_arrayManipulation;

import java.util.ArrayList;
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

    public void modify(Function<Integer, Integer> mapIntToInt) {
        for (int arrayElement :
                numberArray) {
            Integer integer = mapIntToInt.apply(arrayElement);
        }
    }

    public void delete(Predicate<Integer> predicate){
        for (int arrayIndex=0;arrayIndex<numberArray.length;arrayIndex++) {
            if(predicate.test(numberArray[arrayIndex])){
             numberArray[arrayIndex]=0;
            }
        }
    }

    public void fold(){

    }


}
