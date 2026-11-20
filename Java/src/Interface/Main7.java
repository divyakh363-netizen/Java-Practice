package Interface;

interface Shape6
{
    void area();
}

class Parallelogram implements Shape6
{
    int b = 10;
    int h = 10;

    public void area()
    {
        int result = b * h;
        System.out.println(result);
    }
}

class Main7
{
    public static void main(String[] args)
    {
        Parallelogram p = new Parallelogram();
        p.area();
    }
}