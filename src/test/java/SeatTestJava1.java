import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SeatTestJava1 {



    @Test
    void shouldReturnTrue() {
        //given
        int seatNumber = 10;
        int rowNumber = 3;
        boolean isTaken = true;
        Seat seat = new Seat(seatNumber, rowNumber, true);

        //when
        boolean result = seat.isTaken();

        //then
        Assertions.assertEquals(true,result);
    }
    @Test
    void shouldReturnFalse() {
        //given
        int seatNumber = 10;
        int rowNumber = 3;
        boolean isTaken = true;
        Seat seat = new Seat(seatNumber, rowNumber, true);
        seat.setTaken(false);

        //when
        boolean result = seat.isTaken();

        //then
        Assertions.assertEquals(false,result);
    }

}
