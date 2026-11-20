package Interface;

interface Shape7
{
    void area();
}

class Circle implements Shape7
{
    final double pi = 3.142;
    int r = 10;

    public void area()
    {
        double result = pi * r * r;
        System.out.println(result);
    }
}

class Main8
{
    public static void main(String[] args)
    {
        Circle c = new Circle();
        c.area();
    }
}