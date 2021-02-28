package Lesson6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class ReverseFileReader {
    public static void main(String[] args) {

        String path = "..\\data.txt\\data.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            Stack<String> lines = new Stack<String>();
            String line = br.readLine();
            while (line != null) {
                lines.push(line);
                line = br.readLine();
            }

            while (!lines.empty()) {
                System.out.println(lines.pop());
            }

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}




