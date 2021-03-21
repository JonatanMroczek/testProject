package Lesson11;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LettersInWords {
    public static void main(String[] args) {
        lettersInString("Ala ma kota");
    }

    private static void lettersInString(String stringToCheck) {

        IntStream intStream = stringToCheck.chars();
        Stream<Character> characterStream = intStream.mapToObj(c -> (char) c);
        characterStream.filter(ch -> !Character.isSpaceChar(ch)).map(Character::toUpperCase).distinct().forEach(System.out::print);
    }
}
