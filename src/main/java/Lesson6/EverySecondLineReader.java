package Lesson6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EverySecondLineReader {
    public static void main(String[] args) {
        try {
            String pathToFile = "C:\\Users\\Jonatan\\IdeaProjects\\data.txt\\data.txt";
            Path path = Paths.get(pathToFile);
            String fileContent = Files.readString(path);
            BufferedReader in = new BufferedReader(new FileReader(pathToFile));
            int count = 0;
            String line;
            while ((line = in.readLine()) != null) {
                if (count % 2 == 0) {
                    System.out.println(line);
                }
                ++count;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


