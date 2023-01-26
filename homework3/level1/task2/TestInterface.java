package homework3.level1.task2;

public class TestInterface {
    public static void main(String[] args) {
        DayOfTheWeekDetectorIfVersion day = new DayOfTheWeekDetectorIfVersion();
        day.arrayMethod(1);
        day.detectDayName(1);
        day.switchMethod(1);
        System.out.println(day.detectDayName(1));
        System.out.println(day.switchMethod(1));


    }

}
