package Equals;

class Product
{
    int productId;
    String productName;

    Product(int productId, String productName)
    {
        this.productId = productId;
        this.productName = productName;
    }

    public boolean equals(Object obj)
    {
        Product p2 = (Product)obj;
        return this.productId == p2.productId;
    }

    public static void main(String[] args)
    {
        Product p1 = new Product(501, "Laptop");
        Product p2 = new Product(501, "Mobile");

        System.out.println(p1.equals(p2));
    }
}