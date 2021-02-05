import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TriangleTest {

    @Test
    void shouldReturnTrue() {
        //given
        double lengthA = 3;
        double lenghtB = 4;
        double lenghtC = 5;

        //when
        boolean isRectangular = Triangle.isRectengular(lengthA,lenghtB,lenghtC);

        //then
        Assertions.assertEquals(true, isRectangular);
    }
    @Test
    void shouldReturnFalse() {
        //given
        double lenghtA = 15;
        double lenghtB = 16;
        double lenghtC = 30;

        //when
        boolean isRectangular = Triangle.isRectengular(lenghtA,lenghtB,lenghtC);

        //then
        Assertions.assertEquals(false, isRectangular);
    }
}
