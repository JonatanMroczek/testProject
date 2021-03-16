package Lesson9;

import java.util.Arrays;

public class OwnQueueImplementation implements OwnQueue {

    protected static int[] queueArray;
    private final int front = 0;
    private int back = -1;
    protected int size = 0;


    public OwnQueueImplementation() {

        queueArray = new int[0];
    }

    @Override
    public boolean add(Integer e) {
        if (size > queueArray.length - 1) {
            increaseArraySize();
        }
        back++;
        queueArray[back] = e;
        size++;
        return true;
    }

    @Override
    public Integer remove() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("Can't remove element from an empty array!");
        }
        int removedElement = queueArray[front];
        for (int i = 0; i < queueArray.length - 1; i++) {
            queueArray[i] = queueArray[i + 1];
        }
        decreaseArraySize();
        size--;
        return removedElement;
    }

    @Override
    public Integer element() {
        return queueArray[front];
    }

    private void decreaseArraySize() {
        queueArray = Arrays.copyOf(queueArray, queueArray.length - 1);

    }

    private void increaseArraySize() {
        queueArray = Arrays.copyOf(queueArray, queueArray.length + 1);


    }
}
