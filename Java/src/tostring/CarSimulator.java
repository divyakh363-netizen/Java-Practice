package tostring;

class Car
{
    String brand;
    String model;
    int price;

    Car(String brand, String model, int price)
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

class CarSimulator
{
    public static void main(String[] args)
    {
        Car c = new Car("Toyota", "Fortuner", 4000000);
        System.out.println(c);
    }
}