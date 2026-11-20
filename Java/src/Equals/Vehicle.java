package Equals;

class Vehicle
{
    String regNo;
    String brand;

    Vehicle(String regNo, String brand)
    {
        this.regNo = regNo;
        this.brand = brand;
    }

    public boolean equals(Object obj)
    {
        Vehicle v2 = (Vehicle)obj;
        return this.regNo.equals(v2.regNo);
    }

    public static void main(String[] args)
    {
        Vehicle v1 = new Vehicle("KA01AB1234", "Honda");
        Vehicle v2 = new Vehicle("KA01AB1234", "Toyota");

        System.out.println(v1.equals(v2));
    }
}