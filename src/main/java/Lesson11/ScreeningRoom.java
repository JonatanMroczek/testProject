package Lesson11;

public class ScreeningRoom {


    private String screeningRoomType;
    private String name;

    public ScreeningRoom(String name, String screeningRoomType) {
        this.name = name;
        this.screeningRoomType = screeningRoomType;
    }

    public String getScreeningRoomType() {
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

