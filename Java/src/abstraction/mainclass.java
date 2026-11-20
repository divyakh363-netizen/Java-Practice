package abstraction;

interface Payment
{
    void pay();
}

class GooglePay implements Payment
{
    public void pay()
    {
        System.out.println("Payment through Google Pay");
    }
}

class PhonePe implements Payment
{
    public void pay()
    {
        System.out.println("Payment through PhonePe");
    }
}

class Simulator
{
    static void payment(Payment p)
    {
        p.pay();
    }
}

public class mainclass
{
    public static void main(String[] args)
    {
        GooglePay g = new GooglePay();
        PhonePe p = new PhonePe();

        Simulator.payment(g);
        Simulator.payment(p);
    }
}