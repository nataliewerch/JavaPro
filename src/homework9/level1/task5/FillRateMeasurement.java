package homework9.level1.task5;

import java.util.*;

public class FillRateMeasurement {
    Collection<Integer> collection;
    private int size = 10000000;


    public FillRateMeasurement() {
    }

    public void fillingRate(Collection<Integer> collection) {
        long before = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            collection.add(i);
        }
        long after = System.currentTimeMillis();
        System.out.println("Начальное время заполнения: " + before);
        System.out.println("Конечное время заполнения: " + after);
        System.out.println("Разница: " + (after - before));
    }
}
