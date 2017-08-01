package assignment3_dynamicThreadPool_java5;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by bhirudr on 8/1/2017.
 */
public class DynamicSizeThreadPoolExercise {
    /*Write a program using java 5 concurrent  APIs to run tasks and it
     is not known the size of tasks in advance so they may increase
     or decrease also in future, accordingly you have to pick right
     thread pool to use.

     Every task has to do the sum of 1-500 numbers and print. */


    @Test
    public void testCachedThreadPool() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        // LinkedBlockingQueue<TaskSum> taskSumLinkedBlockingQueue = new LinkedBlockingQueue<>();
        TaskSum taskSum = new TaskSum();
        for (int i = 0; i < 1000; i++) {
            /*try {
                taskSumLinkedBlockingQueue.put(taskSum);
            } catch (InterruptedException e) {
                e.printStackTrace();*/
            executorService.execute(taskSum);
        }

    }
}



/* Unbounded queues.
 Using an unbounded queue (for example a LinkedBlockingQueue without a predefined capacity)
  will cause new tasks to wait in the queue when all corePoolSize threads are busy. Thus, no
  more than corePoolSize threads will ever be created. (And the value of the maximumPoolSize
  therefore doesn't have any effect.) This may be appropriate when each task is completely
  independent of others, so tasks cannot affect each others execution; for example, in a
  web page server. While this style of queuing can be useful in smoothing out transient bursts
  of requests, it admits the possibility of unbounded work queue growth when commands continue
  to arrive on average faster than they can be processed. */

/*Core and maximum pool sizes
    A ThreadPoolExecutor will automatically adjust the pool size (see getPoolSize()) according to the bounds set by corePoolSize (see getCorePoolSize()) and maximumPoolSize (see getMaximumPoolSize()). When a new task is submitted in method execute(java.lang.Runnable), and fewer than corePoolSize threads are running, a new thread is created to handle the request, even if other worker threads are idle. If there are more than corePoolSize but less than maximumPoolSize threads running, a new thread will be created only if the queue is full. By setting corePoolSize and maximumPoolSize the same, you create a fixed-size thread pool. By setting maximumPoolSize to an essentially unbounded value such as Integer.MAX_VALUE, you allow the pool to accommodate an arbitrary number of concurrent tasks. Most typically, core and maximum pool sizes are set only upon construction, but they may also be changed dynamically using setCorePoolSize(int) and setMaximumPoolSize(int).*/


class TaskSum implements Runnable {

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 500; i++) {
            sum = sum + i;
        }
        System.out.println("SUM = " + sum);
    }
}

