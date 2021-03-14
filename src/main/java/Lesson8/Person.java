package Lesson8;

public class Person implements Comparable<Person> {


    private final String name;
    private final String surname;
    private final int birthYear;
    private final int height;
    private final int weight;

    public Person(String name, String surname, int birthYear, int height, int weight) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }


    @Override
    public int compareTo(Person o) {
        return -1 * Integer.compare(this.birthYear, o.birthYear);
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

