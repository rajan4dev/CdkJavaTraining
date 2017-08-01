package assignment1_replaced_concurrentRead;

/**
 * Created by bhirudr on 7/31/2017.
 */
public class Reader1 extends Thread {
    public Reader1(ReadTask1 readTask1) {
        readTask1.run();
    }
}
