package Equals;

class Customer
{
    int custId;
    String name;

    Customer(int custId, String name)
    {
        this.custId = custId;
        this.name = name;
    }

    public boolean equals(Object obj)
    {
        Customer c2 = (Customer)obj;
        return this.custId == c2.custId;
    }

    public static void main(String[] args)
    {
        Customer c1 = new Customer(101, "Ravi");
        Customer c2 = new Customer(102, "Kiran");

        if(c1.equals(c2))
        {
            System.out.println("Same Customer");
        }
        else
        {
            System.out.println("Different Customer");
        }
    }
}
