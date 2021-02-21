import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class SquareTest {


    @Test
    void shouldReturnSquareArena() {
        //given
        double length = 10;
        Square square = new Square(10);

        //when
        double area = square.area();

        //then
        Assertions.assertEquals(100, area);
    }

    @Test
    void shouldReturnSquarePerimeter() {
        //given
        double length = 10;
        Square square = new Square(10);

        //when
        double perimeter = square.perimeter();

        //then
        Assertions.assertEquals(40, perimeter);
    }
}