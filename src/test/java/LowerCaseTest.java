import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LowerCaseTest {
    @Test
    void shouldReturnCircleArea() {
        //given
        String textToFormat = "Text Example";
        LowerCase lowerCase = new LowerCase();

        //when
        String formatedText = lowerCase.formatText(textToFormat);

        //then
        Assertions.assertEquals("text example", formatedText);
    }

}