package Lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerList implements OwnList {

   static private List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));



    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void add(Integer element) {
        list.add(element);
    }

    @Override
    public Integer get(int i) {
        return list.get(i);
    }

    @Override
    public void add(int index, Integer element) throws IndexOutOfBoundsException {
        list.add(index, element);
    }

    @Override
    public Integer remove(int index) {
        return list.remove(index);

    }
}
