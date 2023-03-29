package homework9.level1.task6;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        CombiningLinkedList list = new CombiningLinkedList();
        List<Integer> linkedList1 = new LinkedList<Integer>();
        List<Integer> linkedList2 = new LinkedList<Integer>();
        linkedList1.add(18);
        linkedList1.add(23);
        linkedList1.add(44);
        linkedList1.add(65);
        linkedList1.add(77);

        linkedList2.add(32);
        linkedList2.add(44);
        linkedList2.add(73);
        linkedList2.add(82);
        linkedList2.add(111);
        System.out.println(list.combiningLinkedList(linkedList1, linkedList2));


    }
}
