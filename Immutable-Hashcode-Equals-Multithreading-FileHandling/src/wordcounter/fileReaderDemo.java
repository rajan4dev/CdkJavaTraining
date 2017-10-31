package wordcounter;

import java.io.*;

/**
 * Created by bhirudr on 10/31/2017.
 */
public class fileReaderDemo {
    public static void main(String[] args) throws IOException {
        // We need to provide file path as the parameter:
        // double backquote is to avoid compiler interpret words
        // like \test as \t (ie. as a escape sequence)
        File file = new File("C:\\file.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        String toBeFound="century";
        int wordCounter=0;
        while ((line = bufferedReader.readLine()) != null){
            String[] splitetdLineInArray = line.split("\\s");
            for(String s: splitetdLineInArray){
                if(s.equalsIgnoreCase(toBeFound)){
                    wordCounter++;
                }
            }
        }
            System.out.println(wordCounter);
    }
}
