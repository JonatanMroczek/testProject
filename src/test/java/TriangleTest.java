import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class TriangleTest {
    @Test
    void shouldReturnTriangleArea() {
        //given
        double lengthA = 15;
        double lengthB = 8;
        double lengthC = 17;
        double height = 8;
        Triangle triangle = new Triangle(lengthA,lengthB,lengthC,height);

        //when
        double area = triangle.area();

        //then
        Assertions.assertEquals(60, area);
    }
    @Test
    void shouldReturnTrianglePerimeter() {
        //given
        double lengthA = 15;
        double lengthB = 8;
        double lengthC = 17;
        double height = 8;
        Triangle triangle = new Triangle(lengthA,lengthB,lengthC,height);

        //when
        double perimeter = triangle.perimeter();

        //then
        Assertions.assertEquals(40, perimeter);
    }

    
}