package method_chaining;
class Destination
{
    void reach()
    {
        System.out.println("Reached destination");
    }
}

class Driver
{
    Destination drive()
    {
        Destination d = new Destination();
        return d;
    }
}

class CabApp
{
    Driver book()
    {
        Driver d = new Driver();
        return d;
    }
}

class Customer4
{
    public static void main(String[] args)
    {
        Destination d = new CabApp().book().drive();
        d.reach();
    }
}