package tostring;

class Mobile
{
    String brand;
    String model;
    double price;

    Mobile(String brand, String model, double price)
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String toString()
    {
        return this.brand + " " + this.model + " " + this.price;
    }
}

class MobileSimulator
{
    public static void main(String[] args)
    {
        Mobile m = new Mobile("Samsung", "S24", 75000);
        System.out.println(m);
    }
}