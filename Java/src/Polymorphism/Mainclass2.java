package Polymorphism;

class Amazon
{
    void Buy()
    {
        System.out.println("Any Item");
    }
}

class Shoes extends Amazon
{
    void Buy()
    {
        System.out.println("Puma");
    }
}

class Dress extends Amazon
{
    void Buy()
    {
        System.out.println("Zara");
    }
}

class Mobiles extends Amazon
{
    void Buy()
    {
        System.out.println("Samsung Ultra Pro");
    }
}

class Stimulator1
{
    static void Purchase(Amazon a)
    {
        a.Buy();
    }
}

class Mainclass2
{
    public static void main(String[] args)
    {
        Shoes s1 = new Shoes();
        Dress d1 = new Dress();
        Mobiles m1 = new Mobiles();

        Stimulator1.Purchase(s1);
        Stimulator1.Purchase(d1);
        Stimulator1.Purchase(m1);
    }
}