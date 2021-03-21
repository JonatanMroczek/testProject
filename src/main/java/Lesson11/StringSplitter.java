package Lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringSplitter {
    public static void main(String[] args) {


        List<String> stringList = new ArrayList<>();
        stringList.add("Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra");
        stringList.add("Przychodnia:Pediatra");
        stringList.add("Przychodnia:Internista:Laryngolog:Pediatra");

        String str = stringList.stream().map(Object::toString).collect(Collectors.joining(":"));
        List list = split(str).stream().distinct().filter(line -> !"Przychodnia".equals(line) && !"Szpital".equals(line)).collect(Collectors.toList());
        System.out.println(list);


    }

    public static List<String> split(String str) {
        return Stream.of(str.split(":"))
                .map(String::new)
                .collect(Collectors.toList());
    }
}
