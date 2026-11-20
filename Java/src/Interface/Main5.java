package Interface;

interface Shape4
{
    void area();
}

class Ellipse implements Shape4
{
    final double pi = 3.142;
    int a = 5;
    int b = 10;

    public void area()
    {
        double result = pi * a * b;
        System.out.println(result);
    }
}

class Main5
{
    public static void main(String[] args)
    {
        Ellipse el = new Ellipse();
        el.area();
    }
}