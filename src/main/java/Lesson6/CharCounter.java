package Lesson6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CharCounter {
    public static void main(String[] args) {
        try {
            String pathToFile = "C:\\Users\\Jonatan\\IdeaProjects\\data.txt\\data.txt";
            Path path = Paths.get(pathToFile);
            String fileContent = Files.readString(path);
            BufferedReader in = new BufferedReader(new FileReader(pathToFile));
            int charCount = 0;
            String text;
            while ((text = in.readLine()) != null) {
                charCount +=text.length();
            }
            System.out.println(charCount);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


