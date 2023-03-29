package homework6.level2.task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Broker {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Иванов","Петров", "Сидоров", "Генин", "Степняк", "Лимко", "Буряк");
        printArray(list);
        arraySort(list);
    }
    static void printArray (List<String> list){
        for (int i = 0; i < list.size(); i++) {

        }System.out.println(list);
    }

    static void arraySort(List<String> list) {
        int n = list.size();
        String temp;
            for (int i = 0; i <= n / 2; i++) {
                temp = list.get(i);
                list.set(i, list.get(n - i - 1));
                list.set(n - i - 1, temp);
            }System.out.println(list);
    }
}
