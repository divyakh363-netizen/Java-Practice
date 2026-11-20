package tostring;

class BankAccount
{
    String holderName;
    long accountNo;
    double balance;

    BankAccount(String holderName, long accountNo, double balance)
    {
        this.holderName = holderName;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String toString()
    {
        return this.holderName + " " + this.accountNo + " " + this.balance;
    }
}

class BankSimulator
{
    public static void main(String[] args)
    {
        BankAccount b = new BankAccount("Divya", 12345678, 25000);
        System.out.println(b);
    }
}