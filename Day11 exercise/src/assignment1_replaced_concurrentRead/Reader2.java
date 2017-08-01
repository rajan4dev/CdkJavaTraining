package assignment1_replaced_concurrentRead;

/**
 * Created by bhirudr on 7/31/2017.
 */
public class Reader2 extends Thread {
    public Reader2(ReadTask2 readTask1) {
        readTask1.run();
    }
}
