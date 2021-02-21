package Lesson6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesReader {
    public static void main(String[] args) {
        try {
            String pathToFile = "C:\\Users\\Jonatan\\IdeaProjects\\data.txt\\data.txt";
            Path path = Paths.get(pathToFile);
            String fileContent = Files.readString(path);
            System.out.println(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

