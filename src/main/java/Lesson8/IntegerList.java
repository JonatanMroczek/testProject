package Lesson8;


import org.apache.commons.lang3.ArrayUtils;


public class IntegerList implements OwnList {


    public static Integer[] arrayAsList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


    @Override
    public int size() {
        return arrayAsList.length;
    }

    @Override
    public boolean isEmpty() {
        if (arrayAsList.length == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void add(Integer element) {
        arrayAsList = ArrayUtils.add(arrayAsList, element);
    }


    @Override
    public Integer get(int i) {
        return arrayAsList[i];
    }

    @Override
    public void add(int index, Integer element) {
        if (index < 0 || index > arrayAsList.length) {
            throw new IllegalArgumentException("List does not contain entered index");
        }
        arrayAsList = ArrayUtils.add(arrayAsList, index, element);
    }

    @Override
    public Integer remove(int index) {
        if (index < 0 || index > arrayAsList.length) {
            throw new IllegalArgumentException("List does not contain entered index");
        }
        arrayAsList = ArrayUtils.remove(arrayAsList, index);

        return null;
    }
}
