package abstraction;

interface Vehicle
{
    void start();
}

class Car implements Vehicle
{
    public void start()
    {
        System.out.println("Car starts");
    }
}

class Bike implements Vehicle
{
    public void start()
    {
        System.out.println("Bike starts");
    }
}

class Simulator1
{
    static void vehicle(Vehicle v)
    {
        v.start();
    }
}

public class mainclass2
{
    public static void main(String[] args)
    {
        Car c = new Car();
        Bike b = new Bike();

        Simulator1.vehicle(c);
        Simulator1.vehicle(b);
    }
}