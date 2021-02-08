import java.lang.Math;
public class Square extends Rectangle {

    public Square (double length) {
        super (length, length);
        this.length = length;
    }


    @Override
   public double perimeter ()
    {
        return length*4;
    }
}
