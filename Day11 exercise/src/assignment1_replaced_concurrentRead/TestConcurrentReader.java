package assignment1_replaced_concurrentRead;

import org.junit.Test;

/**
 * Created by bhirudr on 7/31/2017.
 */
public class TestConcurrentReader {
    @Test
    public void testConcurrentRead() {
        ReadTask1 readTask1 = new ReadTask1();
        ReadTask2 readTask2 = new ReadTask2();
        Reader2 reader2 = new Reader2(readTask2);
        reader2.start();
        Reader1 reader1 = new Reader1(readTask1);
        reader1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Done");
        }
    }

}
