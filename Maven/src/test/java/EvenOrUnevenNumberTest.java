import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class EvenOrUnevenNumberTest {

    @Test
    void shouldReturnUneven() {
        String result = EvenOrUnevenNumber.evenOrUneven(3);

        Assertions.assertEquals("This number is uneven", result);
    }

    @Test
    void shouldReturnEven() {
        String result = EvenOrUnevenNumber.evenOrUneven(12000);

        Assertions.assertEquals("This number is even", result);
    }
}
