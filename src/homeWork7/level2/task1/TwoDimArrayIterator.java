package homeWork7.level2.task1;

import java.util.Iterator;

public class TwoDimArrayIterator implements Iterator<Integer> {
    private int[][] array;
    private int size;
    private int row;
    private int column;

    public TwoDimArrayIterator(int[][] array) {
        this.array = array;
        this.size = array.length;
        this.row = 0;
        this.column = 0;
    }


    @Override
    public boolean hasNext() {
        if (size > 0){
        return row <= (size - 1) && column <= (size - 1);
        }
        return false;
    }

    @Override
    public Integer next() {
        int arr = array[row][column];
        column++;
        if (column == (size)){
            column = 0;
            row++;
        }
        return arr;
    }
}
