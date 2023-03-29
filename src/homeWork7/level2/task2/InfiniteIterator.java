package homeWork7.level2.task2;

import java.util.Iterator;
import java.util.List;

public class InfiniteIterator implements Iterator<String> {
    private final List<String> list;
    private int index = 0;
    private int size;

    public InfiniteIterator(List<String> list) {
        this.list = list;
        this.size = list.size();
    }

    @Override
    public boolean hasNext() {
        return true;

    }

    @Override
    public String next() {
        String element = list.get(index);
        index++;
        if (index == size){
            index = 0;
        }
        return element;
    }
    }

