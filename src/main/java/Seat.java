import org.junit.jupiter.api.Assertions;

public class Seat {
   private int seatNumber;
   private int rowNumber;


    protected boolean isTaken;

   Seat (int seatNumber, int rowNumber, boolean isTaken) {
       this.seatNumber = seatNumber;
       this.rowNumber = rowNumber;
       this.isTaken = isTaken;
   }
    public void setTaken(boolean taken) {
        isTaken = taken;
    }

    public boolean isTaken() {
        return isTaken;
    }


   //boolean isTaken()

   public String toString() {
        return seatNumber + " " + rowNumber  + " " + isTaken;
    }
}
