package homework6.level1.task6;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 9, 6, 4, 5);
        fillList(list);
        System.out.println(list);
        System.out.println(binarySearch(list, 5));
    }
    private static void fillList(List<Integer> list) {
        long before = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {

        }
    }

    private static int binarySearch(List<Integer> list, int x) {
        int middle = (list.indexOf(0) + list.indexOf(list.size())) / 2;
        if (list.get(middle) == x) {
            return middle;
        }
        if (list.get(middle) < x) {
            middle = (list.indexOf(middle + 1) + list.indexOf(list.size())) / 2;
            return list.indexOf(x);
        } else if(list.get(middle) > x){
            middle = (list.indexOf(middle - 1) + list.indexOf(list.size())) / 2;
            return list.indexOf(x);
        }return -1;
    }

}


