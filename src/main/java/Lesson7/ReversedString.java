package Lesson7;

import java.lang.*;

public class ReversedString {

    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();

        return sb.toString();
    }
}



