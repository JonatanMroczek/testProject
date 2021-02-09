import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UpperCaseTest {



    @Test
    void shouldReturnTextInUpperCase() {
        //given
        String textToFormat = "Text Example";
        UpperCase upperCase = new UpperCase();


        //when
        String formattedText = upperCase.formatText(textToFormat);


        //then
        Assertions.assertEquals("TEXT EXAMPLE", formattedText);
    }



}