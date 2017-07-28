package assignment2_HashSetToFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by bhirudr on 7/27/2017.
 */
public class CarToHashSetToTextFile {


    public static Set<Car> createTestCarCatalog() {
        Set<Car> carSet = new HashSet<>(Arrays.asList(new Car(1, 300000, "BMW"),
                new Car(2, 630000, "BMW"),
                new Car(3, 54000, "Audi"),
                new Car(14, 300000, "BMW"),
                new Car(5, 400000, "Audi"),
                new Car(16, 540000, "BMW"),
                new Car(7, 3450000, "Audi"),
                new Car(18, 53000, "BMW"),
                new Car(9, 234, "Bentley"),
                new Car(10, 45000, "BMW"),
                new Car(11, 300234, "BMW"),
                new Car(12, 3004124, "BMW"),
                new Car(23, 5324000, "Bentley"),
                new Car(4, 700, "Audi"),
                new Car(15, 50000, "BMW"),
                new Car(6, 800000, "Bentley"),
                new Car(17, 442000, "Audi"),
                new Car(8, 234000, "Bentley"),
                new Car(19, 2545000, "BMW"),
                new Car(20, 304300, "BMW"),
                new Car(21, 23400, "Bentley"),
                new Car(22, 123300, "Audi"),
                new Car(13, 3230023, "BMW")));


        //List<Car> carList = new ArrayList<Car>(carSet);
        return carSet;
    }

    static void addToTextFile() {
        Set<Car> testCarCatalog = CarToHashSetToTextFile.createTestCarCatalog();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("C:\\Users\\bhirudr\\IdeaProjects\\Day8 Exercise\\src\\assignment2_HashSetToFile\\carHashSet.txt");
            Iterator iterator = testCarCatalog.iterator();
            while (iterator.hasNext()) {
                fileWriter.write(iterator.next().toString()+"\n");
            }
            System.out.println("File Writing Done");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        CarToHashSetToTextFile.addToTextFile();
    }

}
