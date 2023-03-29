package homeWork7.level1.task4;

import java.util.*;

public class IteratorSpeed {
    final static Random RANDOM = new Random();
    final static int SIZE = 1000000;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(SIZE);
       fillList(list);
        iterFor(list);
        System.out.println("______________");
        iterForReverse(list);
        System.out.println("________________");
        iterForEach(list);
        System.out.println("________________");
        iterIterator(list);
        System.out.println("________________");
        iterListIterator(list);

    }


    private static void fillList (List<Integer> list) {
        for (int i = 0; i < SIZE; i++) {
            list.add(RANDOM.nextInt());
        }

    }
    public static void iterFor (List<Integer> list){
        long before = System.currentTimeMillis();
        int tempVal = 0;
        for (int i = 0; i < SIZE; i++) {
            tempVal = list.get(i);
        }System.out.println(tempVal);
        long after = System.currentTimeMillis();
        System.out.println("Начальное время цикла for: " + before);
        System.out.println("Конечное время цикла for: " + after);
        System.out.println( "Разница цикла for: " + (after - before));
    }

    public static void iterForReverse (List<Integer> list){
        int tempVal = 0;
        long before = System.currentTimeMillis();
        for (int i = SIZE - 1; i >= 0; i--) {
            tempVal = list.get(i);
        }System.out.println(tempVal);
        long after = System.currentTimeMillis();
        System.out.println("Начальное время цикла forReverse: " + before);
        System.out.println("Конечное время цикла forReverse: " + after);
        System.out.println( "Разница цикла forReverse: " + (after - before));
    }


    public static void iterForEach(List<Integer> list){
        int tempVal = 0;
        long before = System.currentTimeMillis();

        for (Integer integer: list) {
            tempVal = integer;
        }  System.out.println(tempVal);
        long after = System.currentTimeMillis();
        System.out.println("Начальное время цикла foreach: " + before);
        System.out.println("Конечное время цикла foreach: " + after);
        System.out.println( "Разница цикла foreach: " + (after - before));

    }

    public static void iterIterator(List<Integer> list){
        long before = System.currentTimeMillis();
        int tempVal = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            tempVal = iterator.next();
        } System.out.println(tempVal);
        long after = System.currentTimeMillis();
        System.out.println("Начальное время цикла iterIterator: " + before);
        System.out.println("Конечное время цикла iterIterator: " + after);
        System.out.println( "Разница цикла iterIterator: " + (after - before));


    }
    public static void iterListIterator(List<Integer> list){
        long before = System.currentTimeMillis();
        int tempVal = 0;
       ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()){
             tempVal = listIterator.next();
        } System.out.println(tempVal);
        long after = System.currentTimeMillis();
        System.out.println("Начальное время цикла iterListIterator: " + before);
        System.out.println("Конечное время цикла iterListIterator: " + after);
        System.out.println( "Разница цикла iterListIterator: " + (after - before));

    }
}
