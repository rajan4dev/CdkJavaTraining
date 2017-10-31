package concurrent_fileReader;

import java.io.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by bhirudr on 10/31/2017.
 */
public class RunnableReadFile implements Runnable {
    private final String filePath;
    private final String toBeFound;
    private static Map<String, Integer> wordCountHashMap = new ConcurrentHashMap<String, Integer>();

    public static Map<String, Integer> getWordCountHashMap() {
        return wordCountHashMap;
    }

    public RunnableReadFile(String filePath, String toBeFound) {
        this.filePath = filePath;
        this.toBeFound = toBeFound;
    }

    @Override
    public void run() {
        File file = new File(filePath);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line;
        int wordCounter = 0;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitetdLineInArray = line.split("\\s");
                for (String s : splitetdLineInArray) {

                    if (!wordCountHashMap.containsKey(s)) {
                        wordCountHashMap.put(s, 1);
                    } else {
                        wordCountHashMap.put(s, (Integer) wordCountHashMap.get(s) + 1);
                    }
//                    if (s.equalsIgnoreCase(toBeFound)) {
//                        wordCounter++;
//                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
       // System.out.println("Thread Name: " + Thread.currentThread().getName() + "\nwordCount of " + toBeFound + " : " + wordCounter + " in  file " + filePath);
        System.out.println("---------------------------------------------------------------------------------");
    }
}
