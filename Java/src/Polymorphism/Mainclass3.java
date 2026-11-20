package Polymorphism;

class Mobiless
{
    void Features()
    {
        System.out.println("Camera Quality");
    }
}

class Vivo extends Mobiless
{
    void Features()
    {
        System.out.println("Good");
    }
}

class Oppo extends Mobiless
{
    void Features()
    {
        System.out.println("Nice");
    }
}

class Redmi extends Mobiless
{
    void Features()
    {
        System.out.println("Excellent");
    }
}

class Stimulator2
{
    static void Buy(Mobiless m)
    {
        m.Features();
    }
}

class Mainclass3
{
    public static void main(String[] args)
    {
        Vivo v1 = new Vivo();
        Oppo o1 = new Oppo();
        Redmi r1 = new Redmi();

        Stimulator2.Buy(v1);
        Stimulator2.Buy(o1);
        Stimulator2.Buy(r1);
    }
}