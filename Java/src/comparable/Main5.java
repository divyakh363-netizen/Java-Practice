package comparable;
import java.util.ArrayList;
import java.util.Collections;

class City implements Comparable<City> {
    String name;
    int population;

    City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public int compareTo(City c) {
        return this.name.compareTo(c.name);
    }

    public String toString() {
        return name + " " + population;
    }
}

public class Main5{
    public static void main(String[] args) {
        ArrayList<City> l = new ArrayList<>();

        l.add(new City("Mysore", 900000));
        l.add(new City("Bangalore", 12000000));
        l.add(new City("Chennai", 7000000));
        l.add(new City("Delhi", 20000000));

        Collections.sort(l);

        for (City c : l) {
            System.out.println(c);
        }
    }
}