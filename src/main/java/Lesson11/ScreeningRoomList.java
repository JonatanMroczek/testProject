package Lesson11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ScreeningRoomList {
    public static void main(String[] args) {
        List<ScreeningRoom> screeningRooms = makeList();
        Map<Object, List<ScreeningRoom>> groupByType = screeningRooms.stream().collect(Collectors.groupingBy((ScreeningRoom::getScreeningRoomType)));
        System.out.println("Screening rooms grouped by type:");
        System.out.println(groupByType.toString());

        System.out.println("Screening rooms types counted:");
        Map<String, Long> groupByTypeAndCount = screeningRooms.stream().collect(Collectors.groupingBy((ScreeningRoom::getScreeningRoomType), Collectors.counting()));
        groupByTypeAndCount.forEach((screeningRoomsType, count) -> System.out.println(screeningRoomsType + "=" + count));


    }

    static List<ScreeningRoom> makeList() {
        ScreeningRoom blueHall = new ScreeningRoom("Blue Hall", "2D");
        ScreeningRoom redHall = new ScreeningRoom("Red Hall", "4D");
        ScreeningRoom blackHall = new ScreeningRoom("black Hall", "2D");
        ScreeningRoom yellowHall = new ScreeningRoom("Yellow Hall", "3D");
        ScreeningRoom pinkHall = new ScreeningRoom("Pink Hall", "2D");
        ScreeningRoom whiteHall = new ScreeningRoom("White Hall", "2D");
        ScreeningRoom purpleHall = new ScreeningRoom("purple Hall", "4D");
        ScreeningRoom greenHall = new ScreeningRoom("Green Hall", "4D");
        ScreeningRoom brownHall = new ScreeningRoom("Brown Hall", "3D");
        ScreeningRoom silverHall = new ScreeningRoom("Silver Hall", "2D");


        return Arrays.asList(blueHall, redHall, blackHall, yellowHall, pinkHall, whiteHall, purpleHall, greenHall, brownHall, silverHall);

    }
}
