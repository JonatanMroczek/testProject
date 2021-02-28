import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LowerCaseTest {
    @Test
    void shouldReturnTextInLowerCase() {
        //given
        String textToFormat = "Text Example";
        LowerCase lowerCase = new LowerCase();

        //when
        String formattedText = lowerCase.formatText(textToFormat);

        //then
        Assertions.assertEquals("text example", formattedText);
    }

}