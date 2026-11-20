package Interface;

interface Shape1
{
    void area();
}

class Rectangle implements Shape1
{
    int w = 5;
    int h = 5;

    public void area()
    {
        int result = w * h;
        System.out.println(result);
    }
}

class Main2
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        r.area();
    }
}