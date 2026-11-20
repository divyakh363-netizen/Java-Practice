package tostring;

class Product
{
    String productName;
    int productId;
    double price;

    Product(String productName, int productId, double price)
    {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
    }

    public String toString()
    {
        return this.productName + " " + this.productId + " " + this.price;
    }
}

class ProductSimulator
{
    public static void main(String[] args)
    {
        Product p = new Product("Laptop", 501, 55000);
        System.out.println(p);
    }
}