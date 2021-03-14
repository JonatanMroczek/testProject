package Lesson8;

import java.util.*;

public class PersonTreeSet {
    public static void main(String[] args) {


        System.out.println("Comparison by height:");
        Set<Person> heightComparison = new TreeSet<Person>(new PersonHeightComparator());
        heightComparison.add(new Person("Anna", "Nowak", 1998, 169, 52));
        heightComparison.add(new Person("Marta", "Kowalska", 1997, 176, 55));
        heightComparison.add(new Person("Kasia", "Tobruk", 1997, 162, 47));
        heightComparison.add(new Person("Jakub", "Brzostek", 1888, 179, 68));
        heightComparison.add(new Person("Dariusz", "Mroz", 1992, 188, 62));
        heightComparison.add(new Person("Marek", "Kuchta", 1984, 179, 64));
        heightComparison.add(new Person("Marcin", "Nowacki", 1976, 190, 78));
        heightComparison.add(new Person("Andrzej", "Kostarski", 1962, 180, 72));

        for (Person person : heightComparison) {
            System.out.println(person.toString());
        }

        System.out.println("Comparison by weight:");
        Set<Person> weightComparison = new TreeSet<Person>(new PersonWeightComparator());
        weightComparison.add(new Person("Anna", "Nowak", 1998, 169, 52));
        weightComparison.add(new Person("Marta", "Kowalska", 1997, 176, 55));
        weightComparison.add(new Person("Kasia", "Tobruk", 1997, 162, 47));
        weightComparison.add(new Person("Jakub", "Brzostek", 1888, 179, 68));
        weightComparison.add(new Person("Dariusz", "Mroz", 1992, 188, 62));
        weightComparison.add(new Person("Marek", "Kuchta", 1984, 179, 64));
        weightComparison.add(new Person("Marcin", "Nowacki", 1976, 190, 78));
        weightComparison.add(new Person("Andrzej", "Kostarski", 1962, 180, 72));

        for (Person person : weightComparison) {
            System.out.println(person.toString());
        }


        System.out.println("Default comparison by age:");
        Set<Person> persons = new TreeSet<Person>();
        persons.add(new Person("Anna", "Nowak", 1998, 169, 52));
        persons.add(new Person("Marta", "Kowalska", 1997, 176, 55));
        persons.add(new Person("Kasia", "Tobruk", 1997, 162, 47));
        persons.add(new Person("Jakub", "Brzostek", 1988, 179, 68));
        persons.add(new Person("Dariusz", "Mroz", 1992, 188, 62));
        persons.add(new Person("Marek", "Kuchta", 1984, 179, 64));
        persons.add(new Person("Marcin", "Nowacki", 1976, 190, 78));
        persons.add(new Person("Andrzej", "Kostarski", 1962, 180, 72));

        for (Person person : persons) {
            System.out.println(person.toString());


        }


    }


}




