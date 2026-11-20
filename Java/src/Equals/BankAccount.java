package Equals;

class BankAccount
{
    long accNo;
    String name;

    BankAccount(long accNo, String name)
    {
        this.accNo = accNo;
        this.name = name;
    }

    public boolean equals(Object obj)
    {
        BankAccount b2 = (BankAccount)obj;
        return this.accNo == b2.accNo;
    }

    public static void main(String[] args)
    {
        BankAccount b1 = new BankAccount(12345, "Divya");
        BankAccount b2 = new BankAccount(12345, "Anu");

        System.out.println(b1.equals(b2));
    }
}