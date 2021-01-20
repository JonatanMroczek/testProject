import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AgeVerificationTest {



        @Test
        void shouldReturnAgeVerificationPassed() {
            //given
            int age = 18;

            //when
            String ageVerification = AgeVerification.ageVerification(age);

            //then
            Assertions.assertEquals("Age verification passed", ageVerification);
        }
    @Test
    void shouldReturnAgeVerificationfailed() {
        //given
        int age = 5;

        //when
        String ageVerification = AgeVerification.ageVerification(age);

        //then
        Assertions.assertEquals("Age verification failed", ageVerification);
    }
    }


