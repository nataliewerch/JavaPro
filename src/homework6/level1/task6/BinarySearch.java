package homework6.level1.task6;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 9, 6, 4, 5, 12);
        fillList(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Отсортированный список ");
        System.out.println(list);
        System.out.println(binarySearch(list, 9, 0, list.size()));
    }
    private static void fillList(List<Integer> list) {
        long before = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {

        }
    }

    private static int binarySearch(List<Integer> list, int x, int min, int max) {
        while ( min <= max){
            int middle = min + (max - min) / 2;

        if (list.get(middle) == x) {
            return middle;
        }
        if (list.get(middle) < x) {
            min = middle + 1;
            return list.indexOf(x);
        } else if(list.get(middle) > x) {
            max = (min - 1) / 2;
            return list.indexOf(x);
        }
        }return -1;
    }

}


