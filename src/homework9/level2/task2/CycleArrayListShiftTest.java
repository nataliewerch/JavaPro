package homework9.level2.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CycleArrayListShiftTest {
    public static void main(String[] args) {
        CycleArrayListShift listShift = new CycleArrayListShift();
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(listShift.cyclicShift(arrayList, 2));
    }
}
