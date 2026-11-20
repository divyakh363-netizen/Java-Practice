package tostring;

class Order
{
    int orderId;
    String productName;
    int quantity;

    Order(int orderId, String productName, int quantity)
    {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
    }

    public String toString()
    {
        return this.orderId + " " + this.productName + " " + this.quantity;
    }
}

class OrderSimulator
{
    public static void main(String[] args)
    {
        Order o = new Order(1001, "Shoes", 2);
        System.out.println(o);
    }
}