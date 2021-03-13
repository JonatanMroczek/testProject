package Lesson8;

import java.util.*;

public class NamesList {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>(Arrays.asList("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr"));
        List<String> uniqueNamesList = new ArrayList<>();

        Set<String> uniqueNames = new LinkedHashSet<>();
        uniqueNames.addAll(names);

        uniqueNamesList.addAll(uniqueNames);

        ListIterator<String> uniqueNamesListIterator = uniqueNamesList.listIterator();
        System.out.println("List in normal order:");
        while (uniqueNamesListIterator.hasNext()) {
            System.out.println(uniqueNamesListIterator.next());
        }

        ListIterator<String> listIterator = names.listIterator();
        System.out.println("\n" + "List in reverse order: ");
        while (listIterator.hasNext()) {
            listIterator.next();
        }
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("\n" + "Anna changed to Joanna:");
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            if (next.equals("Anna")) {
                //Replace element
                listIterator.set("Joanna");
            }

        }
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }

}




