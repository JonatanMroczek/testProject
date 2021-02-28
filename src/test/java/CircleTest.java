import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CircleTest {



    @Test
    void shouldReturnCircleArea() {
        //given
        double radius = 10;
        Circle circle = new Circle(radius);

        //when
        double area = circle.area();

        //then
        Assertions.assertEquals(314.1592653589793, area);
    }

        @Test
        void shouldReturnCirclePerimeter () {
            //given
            double radius = 10;
            Circle circle = new Circle(radius);

            //when
            double perimeter = circle.perimeter();

            //then
            Assertions.assertEquals(62.83185307179586, perimeter);
        }
    }
