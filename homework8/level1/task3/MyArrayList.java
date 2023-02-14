package homework8.level1.task3;


import java.util.*;

public class MyArrayList implements List<Integer> {
    private Integer[] array;
    private int size;

    public MyArrayList() {
    }

    public MyArrayList(int size) {
        this.array = new Integer[size];
        this.size = 0;


    }

    // Уровень 1:

    @Override
    public int size() {
        size = array.length;
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArraysListIterator(array);
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
            return array[index];
        }


    @Override
    public Integer set(int index, Integer element) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        int prevElement = array[index];
        array[index] = element;
        return prevElement;
    }

    @Override
    public boolean contains(Object o) {
        Iterator<Integer> iterator = iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = size - 1; i >= 0; i--) {
            if (o.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public int indexOf(Object o) {
        Iterator<Integer> iterator = iterator();
        int i = 0;
        while (iterator.hasNext()){
            if (iterator.next().equals(o)){
                return i;
            }
            i++;
        }
        return -1;
    }


    @Override
    public boolean add(Integer integer) {
        if (size >= array.length) {
            int newSize = size + 1;
            Integer[] newArray = new Integer[newSize];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size++] = integer;
        return true;
    }





// Уровень 2:


    @Override
    public void add(int index, Integer element) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = element;
        size++;
    }

    @Override
    public boolean remove(Object o) {
        Integer[] temp = new Integer[size - 1];
        int i = 0;
        int j = 0;
        int index = -1;
        for (Integer element: array){
            if (element.equals(o)){
                index = i;
                break;
            }
            i++;
        }
        if (index == -1){
            return false;
        }
        for (Integer element: array){
           if (i != index){
               temp[j++] = element;
           }
           i++;
       }
        array = temp;
        size--;
       return true;
    }


    @Override
    public Integer remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        Integer[] temp = new Integer[size - 1];
       int i = 0;
       int j = 0;
       while (j < size){
           if (j != index){
               temp[i++] = array[j];
           }
           j++;
       }
       int removed = array[index];
       size--;
       array = temp;
        return removed;

    }

    @Override
    public Object[] toArray() {
        return array;
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }


















    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }





    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }


    @Override
    public String toString() {
        return "" + Arrays.toString(array);
    }
}