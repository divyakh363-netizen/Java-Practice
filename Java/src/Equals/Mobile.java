package Equals;

class Mobile
{
    long imei;
    String brand;

    Mobile(long imei, String brand)
    {
        this.imei = imei;
        this.brand = brand;
    }

    public boolean equals(Object obj)
    {
        Mobile m2 = (Mobile)obj;
        return this.imei == m2.imei;
    }

    public static void main(String[] args)
    {
        Mobile m1 = new Mobile(987654321, "Samsung");
        Mobile m2 = new Mobile(987654321, "Apple");

        System.out.println(m1.equals(m2));
    }
}