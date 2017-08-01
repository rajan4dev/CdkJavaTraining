package assignment2_primeNumberGenerator_multithreading;

import java.util.concurrent.*;

/**
 * Created by bhirudr on 8/2/2017.
 */
public class PrimeNumberGenerator {
    public PrimeNumberGenerator() {
        // Thread thread = new Thread();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Future<Integer> future1 = executor.submit(new sumOfPrimeNumbers(1, 100));
        Future<Integer> future2 = executor.submit(new sumOfPrimeNumbers(101, 200));
        Future<Integer> future3 = executor.submit(new sumOfPrimeNumbers(201, 300));
        Future<Integer> future4 = executor.submit(new sumOfPrimeNumbers(301, 400));
        Future<Integer> future5 = executor.submit(new sumOfPrimeNumbers(401, 500));

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Integer totalSum = 0;
        try {
            totalSum = future1.get() + future2.get() + future3.get() + future4.get() + future5.get();
            System.out.println("total sum : " + totalSum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new PrimeNumberGenerator();
    }
}

class sumOfPrimeNumbers implements Callable {
    int from, to;

    public sumOfPrimeNumbers(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            boolean flag = false;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = true;
                }
            }
            if (flag == false) {
                sum = sum + i;
            }
        }
        return (Integer) sum;
    }
}