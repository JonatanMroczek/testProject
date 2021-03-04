package Lesson7;

public class UpperCase {

    public static String toUpperCase(String textInput){
        if (textInput == null || textInput.length() == 0) throw new IllegalArgumentException("textInput can not be null or empty String");
        else{
            return textInput.toUpperCase();
    }
}}
