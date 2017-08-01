package assignment1_synchronizedCollection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by bhirudr on 8/1/2017.
 */
public class SynchronizedCollectionDemo {


    @Test
    public void testSynchronizedCollection() {

        //LinkedBlockingQueue linkedBlockingQueue=new LinkedBlockingQueue();
        // List<Integer> integerList= Collections.synchronizedList(new ArrayList<>());

        BlockingQueue<Integer> integerBlockingQueue = new LinkedBlockingQueue<>();


        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 200000000; i++) {
                try {
                    System.out.println("Putting" + i + "th Random Integer");
                    integerBlockingQueue.put((int) (Math.random()*10000));

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread thread2 = new Thread(() -> {
           while(true){
               try {
                   System.out.println("Displaying the contents " + integerBlockingQueue.take());
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        });
        thread1.start();
        thread2.start();
    }
}


