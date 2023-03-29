package homeWork7.level2.task2;

import java.util.ArrayList;
import java.util.List;

public class InfiniteIteratorTest {
    public static void main(String[] args) {
        List<String> players = new ArrayList<>();
        players.add("Игрок 1");
        players.add("Игрок 2");
        players.add("Игрок 3");
        players.add("Игрок 4");
        players.add("Игрок 5");
        players.add("Игрок 6");
        InfiniteIterator iterator = new InfiniteIterator(players);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
