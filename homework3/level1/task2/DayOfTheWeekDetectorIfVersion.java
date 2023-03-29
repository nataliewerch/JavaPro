package homework3.level1.task2;

public class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector{


    @Override
    public String detectDayName(int number) {
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }


    @Override
    public String switchMethod(int number) {
        switch (number){
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default: return "Please input a valid number between 1 and 7";
        }
    }

    @Override
    public String[] arrayMethod(int number) {
        String daysWeek [] = {"  ", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (number < daysWeek.length && number != 0){
            System.out.println(daysWeek[number]);
        }else {
            System.out.println("Please input a valid number between 1 and 7");
        }
        return daysWeek;
    }

}
