package Lesson11;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DivisibleBy3 {


    public static void divisibleBy3(int start, int end) {

        IntStream intStream = IntStream.range(start, end).filter((n -> n % 3 == 0));
        intStream.boxed().collect(Collectors.toList()).forEach(System.out::println);


    }
}
