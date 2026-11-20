package tostring;

class Movie
{
    String movieName;
    String hero;
    double rating;

    Movie(String movieName, String hero, double rating)
    {
        this.movieName = movieName;
        this.hero = hero;
        this.rating = rating;
    }

    public String toString()
    {
        return this.movieName + " " + this.hero + " " + this.rating;
    }
}

class MovieSimulator
{
    public static void main(String[] args)
    {
        Movie m = new Movie("KGF", "Yash", 9.2);
        System.out.println(m);
    }
}