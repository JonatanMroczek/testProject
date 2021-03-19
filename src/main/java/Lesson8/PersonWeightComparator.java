package Lesson8;

import java.util.Comparator;

public class PersonWeightComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return -1*Integer.compare(o1.getWeight(),o2.getWeight());
    }
}
