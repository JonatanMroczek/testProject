public class Seat {
   private int seatNumber;
   private int rowNumber;
   private boolean isTaken;

   Seat (int seatNumber, int rowNumber) {
       this.seatNumber = seatNumber;
       this.rowNumber = rowNumber;
   }

    void isSeatTaken (boolean IsTaken){
       this.isTaken = IsTaken;
   }


    public String toString() {
        return seatNumber + " " + rowNumber  + " " + isTaken;
    }
}
