package homework9.level2.task2;

import java.util.ArrayList;
import java.util.List;

public class AndereVersion {
    public static void main(String[] args) {
        List<Integer> array = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> arrayCopy = new ArrayList<>();
        int k = 2;
        for (int i = 0; i < k; i++) {
          //  arrayCopy.add(i, array.get(array.size() - k + i));
            arrayCopy.add(array.get(array.size() - k + i));
        }
        for (int i = 0; i < array.size() - k; i++) {
            arrayCopy.add(array.get(i));

        }
        System.out.println(arrayCopy);

    }
}
