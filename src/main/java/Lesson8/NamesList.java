package Lesson8;

import java.util.*;

public class NamesList {
    public static void main(String[] args) {


        List<String> names = Arrays.asList("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr");


        ListIterator<String> listIterator = names.listIterator();
        System.out.println("List in normal order:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\n" + "List in reverse order: ");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("\n" + "Anna changed to Joanna:");
        names.set(0, "Joanna");
        while (listIterator.hasNext()) {
            listIterator.next();
        }
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }

}




