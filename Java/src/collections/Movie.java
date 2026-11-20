package collections;
import java.util.ArrayList;
public class Movie {
	    String movieName;
	    int year;
	    double rating;

	    public Movie(String movieName, int year, double rating) {
	        this.movieName = movieName;
	        this.year = year;
	        this.rating = rating;
	    }

	    public String toString() {
	        return "Movie [movieName=" + movieName + ", year=" + year + ", rating=" + rating + "]";
	    }

	    public static void main(String[] args) {

	        ArrayList<Movie> m1 = new ArrayList<Movie>();

	        m1.add(new Movie("KGF", 2018, 8.5));
	        m1.add(new Movie("Kantara", 2022, 8.6));
	        m1.add(new Movie("RRR", 2022, 8.0));
	        m1.add(new Movie("Bahubali", 2015, 8.1));

	        for (int i = 0; i < m1.size(); i++) {
	            Object o1 = m1.get(i);
	            Movie m = (Movie)o1;
	            System.out.println(m);
	        }
	    }
	}


