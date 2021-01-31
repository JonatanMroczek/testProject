import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class SecondsTest {


    @Test
    void shouldChangeMinutesToSeconds() {
        //given
        int minutes = 10;

        //when
        String changeMinutesToSeconds = Seconds.changeMinutesToSeconds(10);

        //then
        Assertions.assertEquals(600 + " seconds", changeMinutesToSeconds);
    }
    @Test
    void shouldThrowIllegalAccesExpception() {
        //given
        int minutes = -10;

        //when
        String changeMinutesToSeconds = Seconds.changeMinutesToSeconds(600);

        //then
        Assertions.assertEquals(36000 + " seconds", changeMinutesToSeconds);
    }

}