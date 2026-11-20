package Interface;

interface Shape3
{
    void area();
}

class Trapezoid implements Shape3
{
    int b = 10;
    int a = 10;
    int h = 5;

    public void area()
    {
        double result = 0.5 * (a + b) * h;
        System.out.println(result);
    }
}

class Main4
{
    public static void main(String[] args)
    {
        Trapezoid t1 = new Trapezoid();
        t1.area();
    }
}