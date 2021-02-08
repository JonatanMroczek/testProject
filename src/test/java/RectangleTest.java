import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RectangleTest {



    @Test
    void shouldReturnRectangleAreaIs20() {
        //given
        double length = 10;
        double width = 2;
        Rectangle rectangle = new Rectangle(width,length);

        //when
        double area = rectangle.area();

        //then
        Assertions.assertEquals(20, area);
    }
    @Test
    void shouldReturnRectanglePerimeterIs24() {
        //given
        double length = 10;
        double width = 2;
        Rectangle rectangle = new Rectangle(length,width);

        //when
        double perimeter = rectangle.perimeter();

        //then
        Assertions.assertEquals(24, perimeter);
    }
}