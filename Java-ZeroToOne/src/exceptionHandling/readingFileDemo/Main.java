package exceptionHandling.readingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        int total = 0;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\asame\\IdeaProjects\\Java-ZeroToOne\\src\\exceptionHandling\\readingFileDemo\\sayilar.txt"));
            String line = null;

            while((line = reader.readLine()) != null){
                total +=Integer.valueOf(line);
            }
            System.out.println(total);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
