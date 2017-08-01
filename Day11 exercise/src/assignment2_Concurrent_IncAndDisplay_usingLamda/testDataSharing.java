package assignment2_Concurrent_IncAndDisplay_usingLamda;

import org.junit.Test;

/**
 * Created by bhirudr on 7/31/2017.
 */
public class testDataSharing {
    int i = 0;

    /*Write a program using threads, one thread will increase the value
    of variable i and other thread will diaplay this value.

            Do this exercise using 2 workers and 2 tasks namely
    ValueTask and PrintTask.

    And run the same program around 20 times and observe the result.*/
    @Test
    public void testDataSharing() {

        Thread thread1 = new Thread(() -> {
            while (this.i < 20) {
                System.out.println("incrementing to  " + this.i);
                this.i++;
            }
        });

        thread1.start();

        Thread thread2 = new Thread(() -> {
            while (this.i < 20) {
                System.out.println("printing " + this.i);
            }
        });

        thread2.start();
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finish");
    }

}

