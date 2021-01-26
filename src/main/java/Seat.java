public class Seat {
    int seatNumber;
    int rowNumber;
    boolean isTaken;



  static String seatProperties(int seatNumber, int rowNumber, boolean isTaken) {
        return ("Seat number: " + seatNumber + " Row number: "+ rowNumber + " Is taken: " + isTaken);
    }



    void setSeatAndRowNumber (int seatNumber, int rowNumber) {
        this.seatNumber=seatNumber;
        this.rowNumber=rowNumber;}

        void isSeatTaken (boolean isTaken){
        this.isTaken=isTaken;










}}
