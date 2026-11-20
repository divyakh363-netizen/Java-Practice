package Polymorphism;

class LG
{
    void select()
    {
        System.out.println("Select Color");
    }
}

class Mobile extends LG
{
    void select()
    {
        System.out.println("Red");
    }
}

class Refrigerator extends LG
{
    void select()
    {
        System.out.println("Grey");
    }
}

class Television extends LG
{
    void select()
    {
        System.out.println("Black");
    }
}

class Stimulator
{
    static void Buy(LG l)
    {
        l.select();
    }
}

class Mainclass1
{
    public static void main(String[] args)
    {
        Mobile m1 = new Mobile();
        Refrigerator r1 = new Refrigerator();
        Television t1 = new Television();

        Stimulator.Buy(m1);
        Stimulator.Buy(r1);
        Stimulator.Buy(t1);
    }
}