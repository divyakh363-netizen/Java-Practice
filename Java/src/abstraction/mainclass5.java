package abstraction;

interface SocialMedia
{
    void login();
}

class Instagram implements SocialMedia
{
    public void login()
    {
        System.out.println("Instagram login");
    }
}

class Facebook implements SocialMedia
{
    public void login()
    {
        System.out.println("Facebook login");
    }
}

class Simulator4
{
    static void social(SocialMedia s)
    {
        s.login();
    }
}

public class mainclass5
{
    public static void main(String[] args)
    {
        Instagram i = new Instagram();
        Facebook f = new Facebook();

        Simulator4.social(i);
        Simulator4.social(f);
    }
}