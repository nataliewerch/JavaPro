package homework6.level1.task7_8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTask7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0, 8);
        list.add(1, 3);
        list.add(2, 18);
        list.add(3, 12);
        list.add(4, 5);
        System.out.println(list);
        Double a = arithmeticMean(list);
        System.out.println("Среднее арифметическое: " + arithmeticMean(list));
        bubbleSort(list);
    }

    public static double arithmeticMean(List<Integer> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }return sum / list.size();
    }
    public static void bubbleSort (List<Integer> list) {
        int temp;
        for (int i = 0; i < list.size(); i++) {

        for (int j = 0; j < list.size() - 1; j++) {
            if (list.get(j) > list.get(j + 1)) {
                temp = list.get(j);
                list.set(j, list.get(j + 1));
                list.set(j + 1, temp);
        }
        }
        }System.out.println(list);
    }
}


