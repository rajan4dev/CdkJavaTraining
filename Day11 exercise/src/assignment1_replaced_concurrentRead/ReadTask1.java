package assignment1_replaced_concurrentRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by bhirudr on 7/31/2017.
 */
public class ReadTask1 implements Runnable {
    @Override
    public void run() {
        File file = new File("C:\\Users\\bhirudr\\IdeaProjects\\Day11 exercise\\src\\assignment1_replaced_concurrentRead\\file1.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int read = fileReader.read();
            System.out.println("Reader 111 started reading ");
            while (read != -1) {
                try {
                    Thread.currentThread().sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print((char) read);
                read = fileReader.read();
            }

        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                try {
                    Thread.currentThread().sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
