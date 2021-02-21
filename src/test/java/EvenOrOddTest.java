import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class EvenOrOddTest {

    @Test
    void shouldReturnUneven() {
        String result = EvenOrOdd.evenOrOdd(3);

        Assertions.assertEquals("This number is odd", result);
    }

    @Test
    void shouldReturnEven() {
        String result = EvenOrOdd.evenOrOdd(12000);

        Assertions.assertEquals("This number is even", result);
    }
}

