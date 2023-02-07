package homework6.level1.task5;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayList{
    final static int SIZE = 1000000;
    final static int ELEMENT = 100000;
    final static Random RANDOM = new Random();

    public static void main(String[] args) {
        List<Integer> arrayList = new java.util.ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("Заполнение ArrayList");
        fillList(arrayList);
        System.out.println("Заполнение LinkedList");
        fillList(linkedList);
        System.out.println("________________");
        System.out.println("Выбор элементов из ArrayList");
        selectElement(arrayList);
        System.out.println("Выбор элементов из LinkedList");
        selectElement(linkedList);

    }

     private static void fillList (List<Integer> list) {
         long before = System.currentTimeMillis();
         for (int i = 0; i < SIZE; i++) {
             list.add(RANDOM.nextInt());
         }
         long after = System.currentTimeMillis();
         System.out.println("Начальное время заполнения: " + before);
         System.out.println("Конечное время заполнения: " + after);
         System.out.println( "Разница заполнения: " + (after - before));

     }


     private static void selectElement (List<Integer> list){
        long before = System.currentTimeMillis();
        for (int i = 0; i < ELEMENT; i++) {
            list.get((int)(Math.random() * (SIZE - 1)));
        }
        long after = System.currentTimeMillis();
        System.out.println("Начальное время: " + before);
        System.out.println("Конечное время: " + after);
        System.out.println( "Разница: " + (after - before));

    }

    /* Я предполагаю что ArrayList быстрее, так как имеет прямые ссылки
    на каждый элеменнт в спписке*/

    }







