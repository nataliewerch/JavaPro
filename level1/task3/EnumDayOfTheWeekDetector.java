package homework3.level1.task3;

import java.util.Arrays;

public class EnumDayOfTheWeekDetector {
    public static void main(String[] args) {
        DayOfTheWeek[] days = DayOfTheWeek.values();
        DayOfTheWeek.TUESDAY.getDays();

        for (DayOfTheWeek dayOfTheWeek : days);
        System.out.println(Arrays.toString(days));

        System.out.println(DayOfTheWeek.FRIDAY.getDays());


 }

}
