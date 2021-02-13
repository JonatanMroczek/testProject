public class DayOfTheWeek {
    Day day;

    public DayOfTheWeek(Day day) {
        this.day = day;
    }

    public void  PrintDayName() {
        switch (day) {
            case Monday:
                System.out.println("Monday");
                break;

            case Tuesday:
                System.out.println("Tuesday");
                break;

            case Wednesday:
                System.out.println("Wednesday");
                break;
            case Thursday:
                System.out.println("Thursday");
                break;

            case Friday:
                System.out.println("Friday");
                break;

            case Saturday:
                System.out.println("Saturday");
                break;

            case Sunday:
                System.out.println("Sunday");
                break;
        }

    }
}


