package homework8.level1.task3;

import java.util.Iterator;

public class MyArraysListIterator implements Iterator<Integer> {

    private Integer[] array;
    private int currentIndex = 0;

    public MyArraysListIterator(Integer[] array) {
        this.array = array;

    }

    @Override
    public boolean hasNext() {
        if (currentIndex < 0){
            return false;
        }
        return currentIndex < array.length;
    }

    @Override
    public Integer next() {
        return array[currentIndex++];
    }


}
