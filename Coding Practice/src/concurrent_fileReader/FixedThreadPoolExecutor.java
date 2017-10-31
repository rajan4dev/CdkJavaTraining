package concurrent_fileReader;

import java.io.File;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by bhirudr on 10/31/2017.
 */
public class FixedThreadPoolExecutor {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        File dir = new File("C:\\files");
        File[] directoryListing = dir.listFiles();
        if (directoryListing != null) {
            for (File file : directoryListing) {
                RunnableReadFile task = new RunnableReadFile(file.getAbsolutePath(),"adp");
                System.out.println("A new task has been added");
                executor.execute(task);
            }
        } else {
            System.out.println("ERROR..!! not a valid directory");
        }
        /*for (int i = 0; i < 10; i++)
        {
            RunnableReadFile task = new RunnableReadFile("C:\\file.txt","tallest");
            System.out.println("A new task has been added : ");
            executor.execute(task);
        }*/
        System.out.println("Maximum threads inside pool " + executor.getMaximumPoolSize());
        executor.shutdown();
        if(executor.isTerminating()){
            Map<String, Integer> wordCountHashMap = RunnableReadFile.getWordCountHashMap();
            for(String s:wordCountHashMap.keySet()){
                System.out.println("[ Key: "+s+", Value: "+wordCountHashMap.get(s)+" ]");
            }
        }
    }


}
