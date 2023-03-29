package homework3.level1.task3;

import java.util.Arrays;

public enum DayOfTheWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private String days;

    DayOfTheWeek(String days) {
        this.days = days;
    }

    public String getDays() {
        return days;
    }

    @Override
    public String toString() {
        return
                 days + " - " +
                " " + super.toString();
    }
}

