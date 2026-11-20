package Interface;

interface Shape2
{
    void area();
}

class Sector implements Shape2
{
    final double half = 0.5;
    int r = 10;
    double theta = 1.5;

    public void area()
    {
        double result = half * r * r * theta;
        System.out.println(result);
    }
}

class Main3
{
    public static void main(String[] args)
    {
        Sector s = new Sector();
        s.area();
    }
}