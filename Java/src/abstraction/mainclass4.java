package abstraction;

interface FoodDelivery
{
    void order();
}

class Swiggy implements FoodDelivery
{
    public void order()
    {
        System.out.println("Food ordered through Swiggy");
    }
}

class Zomato implements FoodDelivery
{
    public void order()
    {
        System.out.println("Food ordered through Zomato");
    }
}

class Simulator3
{
    static void food(FoodDelivery f)
    {
        f.order();
    }
}

public class mainclass4
{
    public static void main(String[] args)
    {
        Swiggy s = new Swiggy();
        Zomato z = new Zomato();

        Simulator3.food(s);
        Simulator3.food(z);
    }
}