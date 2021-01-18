public class HelloWorld {

    public static void main (String[] args) {
        System.out.println(season(1));
        System.out.println(season(4));
        System.out.println(season(7));
        System.out.println(season(10));
        System.out.println(season(20));
    }
    public static String season(int dayOfTheWeek)
    {
        String result = "";
        switch (dayOfTheWeek)
        {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6: case 7:
            result = "Weekend";
            break;

            default: result ="There is no such day"; }
        return result;
    }
}
