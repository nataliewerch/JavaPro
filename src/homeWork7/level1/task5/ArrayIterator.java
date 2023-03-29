package homeWork7.level1.task5;

import java.sql.Array;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayIterator implements Iterator {
   private Integer[] array;
   private int currentIndex = 0;

    public ArrayIterator(Integer[] array) {
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
    public Object next() {
        Integer current = array[currentIndex];
        currentIndex++;
        return current;
    }


}
