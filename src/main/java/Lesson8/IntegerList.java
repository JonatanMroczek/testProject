package Lesson8;

import java.util.Arrays;


public class IntegerList implements OwnList {

    private int size = 0;

    public static Integer[] arrayAsList;

    public IntegerList() {
        arrayAsList = new Integer[10];
    }

    @Override
    public int size() {
        return size;
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
        if (arrayAsList.length - size <= 1) {
            increaseListSize();
        }
        arrayAsList[size++] = element;
    }


    @Override
    public Integer get(int i) {
        return arrayAsList[i];
    }

    @Override
    public void add(int index, Integer element) {
        if (index < 0 || index > arrayAsList.length) {
            throw new IndexOutOfBoundsException("List does not contain entered index");
        }
        if (size > arrayAsList.length - 1) {
            increaseListSize();
        }

        if (index < size) {

            for (int i = size + 1; i > index; i--) {
                arrayAsList[i] = arrayAsList[i - 1];
            }
            arrayAsList[index] = element;
            size++;
        } else {

            arrayAsList[size++] = element;
        }
    }


    @Override
    public Integer remove(int index) {
        if (index < 0 || index > arrayAsList.length) {
            throw new IndexOutOfBoundsException("List does not contain entered index");
        }

        for (int i = index; i < size - 1; i++) {
            arrayAsList[i] = arrayAsList[i + 1];
        }

        arrayAsList[size - 1] = null;
        size--;
        return null;
    }

        private void increaseListSize() {
            arrayAsList = Arrays.copyOf(arrayAsList, arrayAsList.length * 2);

    }
}
