public class Commission extends Hourly{
    protected double totalsales;
    protected double commissionrate;

    public Commission (String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionrate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionrate = totalsales * rate;
    }

    public void addsales(double totalsales){
        totalsales += totalsales;
    }

    @Override
    public double pay(){
        double payment = super.pay() + commissionrate;
        totalsales = 0;
        return payment;
    }

    @Override
    public String toString(){
        String result = super.toString();
        result += "\nCurrent totalsales: " + totalsales;
        return result;
    }
}
