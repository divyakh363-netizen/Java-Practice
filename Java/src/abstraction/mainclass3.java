package abstraction;

interface ATM
{
    void withdraw();
}

class SBI implements ATM
{
    public void withdraw()
    {
        System.out.println("SBI ATM withdrawal");
    }
}

class HDFC implements ATM
{
    public void withdraw()
    {
        System.out.println("HDFC ATM withdrawal");
    }
}

class Simulator2
{
    static void atm(ATM a)
    {
        a.withdraw();
    }
}

public class mainclass3
{
    public static void main(String[] args)
    {
        SBI s = new SBI();
        HDFC h = new HDFC();

        Simulator2.atm(s);
        Simulator2.atm(h);
    }
}