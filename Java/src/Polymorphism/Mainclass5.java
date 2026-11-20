package Polymorphism;

class Films
{
    void watch()
    {
        System.out.println("Movie");
    }
}

class Comedy extends Films
{
    void watch()
    {
        System.out.println("Panchayat");
    }
}

class Romantic extends Films
{
    void watch()
    {
        System.out.println("Sita Ramam");
    }
}

class Action extends Films
{
    void watch()
    {
        System.out.println("KGF");
    }
}

class Stimulator4
{
    static void Watch(Films f)
    {
        f.watch();
    }
}

class Mainclass5
{
    public static void main(String[] args)
    {
        Comedy c1 = new Comedy();
        Romantic r1 = new Romantic();
        Action a1 = new Action();

        Stimulator4.Watch(c1);
        Stimulator4.Watch(r1);
        Stimulator4.Watch(a1);
    }
}