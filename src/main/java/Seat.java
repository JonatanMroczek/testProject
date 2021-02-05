public class Seat {
    private int seatNumber;
    private int rowNumber;
    private boolean isTaken;

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


    public String toString() {
        return seatNumber + " " + rowNumber  + " " + isTaken;
    }
}
