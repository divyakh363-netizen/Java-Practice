package Equals;

class Passport
{
    long passportNo;
    String name;

    Passport(long passportNo, String name)
    {
        this.passportNo = passportNo;
        this.name = name;
    }

    public boolean equals(Object obj)
    {
        Passport p2 = (Passport)obj;
        return this.passportNo == p2.passportNo;
    }

    public static void main(String[] args)
    {
        Passport p1 = new Passport(12345, "Ravi");
        Passport p2 = new Passport(12345, "Ravi");

        if(p1.equals(p2))
        {
            System.out.println("Same Passport");
        }
        else
        {
            System.out.println("Different Passport");
        }
    }
}