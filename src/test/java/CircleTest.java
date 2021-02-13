import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CircleTest {



    @Test
    void shouldReturnCircleArea() {
        //given
        double radius = 8;
        Circle circle = new Circle(radius);

        //when
        double area = circle.area();

        //then
        Assertions.assertEquals(200.96, area);
    }

    @Test
    void shouldReturnCirclePerimeter () {
        //given
        double radius = 8;
        Circle circle = new Circle(radius);

        //when
        double perimeter = circle.perimeter();

        //then
        Assertions.assertEquals(50.24, perimeter);
    }
}
