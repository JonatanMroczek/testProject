public class BIllCalculator {

    private double totalBill;

    public double calculate(double billValue, double serviceFee){
         return totalBill = billValue + serviceFee;

    }
    public double calculate(double billValue, double serviceFee, double discount) {
        return totalBill = billValue + serviceFee - discount;
    }
    public double calculate(double billValue, double serviceFee, double discount, double packageFee)
    {
         return totalBill = billValue + serviceFee - discount + packageFee;

    }
}
