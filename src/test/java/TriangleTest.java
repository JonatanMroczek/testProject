import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TriangleTest {

    @Test
    void shouldReturnTriangleIsRectangular() {
        //given
        double lengthA = 15;
        double lenghtB = 17;
        double lenghtC = 8;

        //when
        String checkIfTirangleIsRectangular = Triangle.checkIfTirangleIsRectangular(lengthA,lenghtB,lenghtC);

        //then
        Assertions.assertEquals("This Triangle is not Rectangual", checkIfTirangleIsRectangular);
    }
    @Test
    void shouldReturnTriangleIsNotRectangular() {
        //given
        double lenghtA = 15;
        double lenghtB = 16;
        double lenghtC = 30;

        //when
        String checkIfTirangleIsRectangular = Triangle.checkIfTirangleIsRectangular(lenghtA,lenghtB,lenghtC);

        //then
        Assertions.assertEquals("This Triangle is not Rectangual", checkIfTirangleIsRectangular);
    }
}
