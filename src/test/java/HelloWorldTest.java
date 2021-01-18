import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    @Test
    void shouldReturnWednesday() {
        String result = HelloWorld.day(3);

        Assertions.assertEquals("Wednesday", result);
    }
    @Test
    void shouldReturnThursday() {
        String result = HelloWorld.day(4);
        Assertions.assertEquals("Thursday", result);
    }
    @Test
    void shouldReturnWeekend() {
        String result = HelloWorld.day(6);
        Assertions.assertEquals("Weekend", result);
    }
    @Test
    void shouldReturnThereIsNoSuchDay() {
        String result = HelloWorld.day(9);
        Assertions.assertEquals("There is no such day", result);
    }
}