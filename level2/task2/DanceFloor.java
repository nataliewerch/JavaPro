package homework3.level2.task2;

import homework3.level1.task4.PopSinger;

import java.lang.reflect.Array;
import java.util.Arrays;

import static homework3.level2.task2.Dancable.dancables;

public class DanceFloor {
    public static void main(String[] args) {
        Dancer dancer = new Dancer();
        Dancable firstDancer = new Dancer("Ivan");
        Dancable secondDancer = new PopDancer("Anton");
        Dancable thirdDancer = new Dancer("Anna");
        Dancable fourthDancer = new PopDancer("Olga");
        Dancable fifthDancer = new Dancer("Renat");
        Dancable sixthDancer = new PopDancer("Alla");
        Dancable[] dancables = {firstDancer, secondDancer, thirdDancer, fourthDancer, fifthDancer, sixthDancer};



        for (int i = 0; i < dancables.length; i++) {
            System.out.println(dancables[i]);
            dancer.dance();
        }

    }
}

