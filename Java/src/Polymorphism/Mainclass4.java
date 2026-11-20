package Polymorphism;

class Train
{
    void travel()
    {
        System.out.println("Place");
    }
}

class FirstClass extends Train
{
    void travel()
    {
        System.out.println("Maharashtra");
    }
}

class Sleeper extends Train
{
    void travel()
    {
        System.out.println("Kashmir");
    }
}

class SecondClass extends Train
{
    void travel()
    {
        System.out.println("Delhi");
    }
}

class Stimulator3
{
    static void Travel(Train t)
    {
        t.travel();
    }
}

class Mainclass4
{
    public static void main(String[] args)
    {
        FirstClass f1 = new FirstClass();
        Sleeper s1 = new Sleeper();
        SecondClass s2 = new SecondClass();

        Stimulator3.Travel(f1);
        Stimulator3.Travel(s1);
        Stimulator3.Travel(s2);
    }
}