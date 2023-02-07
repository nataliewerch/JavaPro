package homework6.level2.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortProduct {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bread", "kefir", "sour cream", "squash", "cucumbers", "nuts", "buckwheat", "butter", "bread" );
        checkElement(list);
    }


    public static void checkElement(List<String> list){
        List<String> removedList = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
                if (list.get(0).equals(list.get(list.size() - 1))){
                   removedList.remove(list.get(list.size() - 1));
                }
            }
            System.out.println(list);
        System.out.println(removedList);
        }

    }

