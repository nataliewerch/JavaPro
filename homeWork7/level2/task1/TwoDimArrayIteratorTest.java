package homeWork7.level2.task1;

import java.util.Iterator;

public class TwoDimArrayIteratorTest {
    public static void main(String[] args) {

        int[][] array = {{12, 45, 76, 23}, {56, 77, 88, 93}, {45, 67, 34, 22}, {31, 56, 77, 33}};
        TwoDimArrayIterator iterator = new TwoDimArrayIterator(array);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
