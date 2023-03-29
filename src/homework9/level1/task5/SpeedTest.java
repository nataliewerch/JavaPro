package homework9.level1.task5;

import java.util.*;

public class SpeedTest {
    public static void main(String[] args) {
       FillRateMeasurement fillRate = new FillRateMeasurement();
       List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        System.out.println("Тестовое время для ArrayList ");
        fillRate.fillingRate(arrayList);
        System.out.println("Тестовое время для LinkedList ");
        fillRate.fillingRate(linkedList);
        System.out.println("Тестовое время для HashSet ");
        fillRate.fillingRate(hashSet);
        System.out.println("Тестовое время для TreeSet ");
        fillRate.fillingRate(treeSet);
    }
    /*ArrayList и HashSet так как они реализованы на основе массива,
    что позволяет быстро добавлять элементы, а LinkedList и TreeSet
    на основе дерева.
     */
}
