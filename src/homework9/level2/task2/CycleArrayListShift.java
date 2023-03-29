package homework9.level2.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CycleArrayListShift {

    public CycleArrayListShift() {
    }

    public ArrayList<Integer> cyclicShift(Collection<Integer> collection, int k) {
        ArrayList<Integer> list = new ArrayList<>(collection);
        k = k % list.size();
        Collections.rotate(list, k);
        return list;
    }
}
