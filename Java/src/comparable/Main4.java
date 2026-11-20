package comparable;
import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie> {
    String name;
    double rating;

    Movie(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public int compareTo(Movie m) {
        return Double.compare(m.rating, this.rating);
    }

    public String toString() {
        return name + " " + rating;
    }
}

public class Main4 {
    public static void main(String[] args) {
        ArrayList<Movie> l = new ArrayList<>();

        l.add(new Movie("Movie A", 8.2));
        l.add(new Movie("Movie B", 9.1));
        l.add(new Movie("Movie C", 7.5));
        l.add(new Movie("Movie D", 8.8));

        Collections.sort(l);

        for (Movie m : l) {
            System.out.println(m);
        }
    }
}