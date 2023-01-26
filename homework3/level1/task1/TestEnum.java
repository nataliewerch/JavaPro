package homework3.level1.task1;

public class TestEnum {
    public static void main(String[] args) {
        PartsOfTheWorld partsOfTheWorld = PartsOfTheWorld.SOUTH;
        PartsOfTheWorld [] partsOfTheWorldArray = PartsOfTheWorld.values();
        System.out.println(partsOfTheWorld);
        System.out.println(PartsOfTheWorld.valueOf("EAST"));

        for (PartsOfTheWorld i : partsOfTheWorldArray)
        {
            System.out.println("Возвращаем массив всех констант ");
            System.out.println(i);
        }

        System.out.println("Возвращаем порядковый номер NORTHEAST " + PartsOfTheWorld.NORTHEAST.ordinal());

        for (PartsOfTheWorld partsOfTheWorld1 : PartsOfTheWorld.values()) {
            System.out.println(partsOfTheWorld1);
        }


    }
}
