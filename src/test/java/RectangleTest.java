import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {



    @Test
    void shouldReturnRectangleArea() {
        //given
        double length = 4;
        double width = 2;
        Rectangle rectangle = new Rectangle(width,length);

        //when
        double area = rectangle.area();

        //then
        Assertions.assertEquals(8, area);
    }
    @Test
    void shouldReturnRectanglePerimeter() {
        //given
        double length = 4;
        double width = 2;
        Rectangle rectangle = new Rectangle(length,width);

        //when
        double perimeter = rectangle.perimeter();

        //then
        Assertions.assertEquals(12, perimeter);
    }
}
