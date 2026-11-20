package method_chaining;
class Product
{
    void display()
    {
        System.out.println("Product purchased");
    }
}

class Delivery
{
    Product deliver()
    {
        Product p = new Product();
        return p;
    }
}

class ShoppingApp
{
    Delivery order()
    {
        Delivery d = new Delivery();
        return d;
    }
}

class Customer1
{
    public static void main(String[] args)
    {
        Product p = new ShoppingApp().order().deliver();
        p.display();
    }
}