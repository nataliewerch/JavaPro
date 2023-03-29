package homework9.level2.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateElements {
    public static void main(String[] args) {

        ArrayList<Integer> listWithDuplicate = new ArrayList<>(Arrays.asList(12, 19, 12, 65, 12, 65, 33, 19));
        HashSet<Integer> hashSetWithoutDuplicate = new HashSet<>(listWithDuplicate);
        List<Integer> listWithoutDuplicate = new ArrayList<>(hashSetWithoutDuplicate);

        System.out.println("ArrayList с дубликатами: " + listWithDuplicate);
        System.out.println("ArrayList без дубликатов: " + listWithoutDuplicate);




    }
}
