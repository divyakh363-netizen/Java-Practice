package Interface;

interface Shape
{
    void area();
}

class Triangle implements Shape
{
    double base = 10;
    double height = 5;

    public void area()
    {
        double result = 0.5 * base * height;
        System.out.println(result);
    }
}

class Main1
{
    public static void main(String[] args)
    {
        Triangle t = new Triangle();
        t.area();
    }
}