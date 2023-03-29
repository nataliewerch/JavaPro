package homeWork7.level1.task5;

import java.util.Arrays;

public class ArrayIteratorTest {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{12, 14, 16, 18, 29, 37};
        ArrayIterator iterator = new ArrayIterator(array);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
