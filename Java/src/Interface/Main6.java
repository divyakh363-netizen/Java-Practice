package Interface;

interface Shape5
{
    void area();
}

class Square implements Shape5
{
    int a = 10;

    public void area()
    {
        int result = a * a;
        System.out.println(result);
    }
}

class Main6
{
    public static void main(String[] args)
    {
        Square s = new Square();
        s.area();
    }
}
