package assignment1;

import java.io.*;

/**
 * Created by bhirudr on 7/27/2017.
 */
public class MovieReader {
    public static void main(String[] args) {
        InputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;

        try {
            fileInputStream = new FileInputStream("C:\\Users\\bhirudr\\IdeaProjects\\Day8 Exercise\\src\\assignment1\\movie.txt");
            System.out.println("Read byte by byte using fileInputStream");
            int read = fileInputStream.read();
            while (read != -1) {
                System.out.print((char) read);
                read = fileInputStream.read();
            }

fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("\n======================================================================\nreading characterwise using INPUTSTREAMREADER");
        try {
        fileInputStream = new FileInputStream("C:\\Users\\bhirudr\\IdeaProjects\\Day8 Exercise\\src\\assignment1\\movie.txt");
        inputStreamReader = new InputStreamReader(fileInputStream);

            int read = inputStreamReader.read();
            while (read != -1) {
                System.out.print((char)read);
                read = inputStreamReader.read();
            }
            System.out.println("done");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
