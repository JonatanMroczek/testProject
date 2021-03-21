package Lesson11;

public class ScreeningRoom {


    private final ScreeningRoomType screeningRoomType;
    private final String name;

    public ScreeningRoom(String name, ScreeningRoomType screeningRoomType) {
        this.name = name;
        this.screeningRoomType = screeningRoomType;

    }

    public ScreeningRoomType getScreeningRoomType() {
        return screeningRoomType;
    }

    @Override
    public String toString() {
        return "ScreeningRoom{" +
                "screeningRoomType='" + screeningRoomType + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

