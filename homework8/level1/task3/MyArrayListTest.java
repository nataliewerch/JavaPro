package homework8.level1.task3;

import java.util.Arrays;

public class MyArrayListTest {
    public static void main(String[] args) {
       MyArrayList arrayList = new MyArrayList(5);
       arrayList.add(0,22);
        arrayList.add(1,5);
        arrayList.add(2,16);
        arrayList.add(3,18);
        arrayList.add(4,22);
        System.out.println(arrayList);
        System.out.println("Метод get(); " + arrayList.get(3));
        arrayList.set(3, 15);
        System.out.println("Метод set(); " + arrayList);
        System.out.println("Метод size(); " + arrayList.size());
        System.out.println("Метод contains(); " + arrayList.contains(22));
        System.out.println("Метод lastIndexOf(); " + arrayList.lastIndexOf(22));
        System.out.println("Метод indexOf(); " + arrayList.indexOf(15));
        System.out.println("Метод isEmpty(); " + arrayList.isEmpty());
        arrayList.clear();
        System.out.println("Метод clear(); + isEmpty(); " +arrayList.isEmpty());
        System.out.println(arrayList);
        arrayList.add(23);
        arrayList.add(17);
        arrayList.add(2);
        arrayList.add(14);
        arrayList.add(16);
        System.out.println("Метод add(); " + arrayList);
       arrayList.remove(1);
     System.out.println(arrayList);
     arrayList.remove(Integer.valueOf(14));
     System.out.println(arrayList);
     arrayList.add(12);
     arrayList.add(15);
     arrayList.add(89);
     arrayList.add(75);
     Object[] list = arrayList.toArray();
     System.out.println(Arrays.toString(list));
    }

}
