package Lesson6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordFinder {
    public static void main(String[] args) {
        String word = "Kurs";
        try (BufferedReader br = new BufferedReader(new FileReader("..\\data.txt\\data.txt"))) {
            String in;
            while ((in = br.readLine()) != null) {
                if (in.contains(word)) {
                    System.out.println("Word found");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}


