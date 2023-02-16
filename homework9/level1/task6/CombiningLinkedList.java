package homework9.level1.task6;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CombiningLinkedList {

    public CombiningLinkedList() {
    }

    public LinkedList<Integer> combiningLinkedList(List<Integer> linkedList1, List<Integer> linkedList2) {
        LinkedList<Integer> combinedLinkedList = new LinkedList<>();
        ListIterator<Integer> listIterator1 = linkedList1.listIterator();
        ListIterator<Integer> listIterator2 = linkedList2.listIterator();


        while (listIterator1.hasNext() && listIterator2.hasNext()){
           Integer value1 = listIterator1.next();
            Integer value2 = listIterator2.next();

            if (value1 <= value2) {
                combinedLinkedList.add(value1);
                listIterator2.previous();

            }else {
                combinedLinkedList.add(value2);
                listIterator1.previous();
            }
        }
        while (listIterator1.hasNext()) {
            combinedLinkedList.add(listIterator1.next());
        }
        while (listIterator2.hasNext()) {
            combinedLinkedList.add(listIterator2.next());
        }
        return combinedLinkedList;
    }

}
