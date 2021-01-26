import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class SeatTest {

    @Test
    void shouldReturnSeatProperties() {
        //given
        int seatNumber = 1;
        int rowNumber = 1;
        boolean isTaken = false;

        //when
        String seatProperties = Seat.seatProperties(seatNumber, rowNumber, isTaken );

        //then
        Assertions.assertEquals("Seat number: 1 Row number: 1 Is taken: false", seatProperties);
    }}

