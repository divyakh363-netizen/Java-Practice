package comparable;
import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car> {
    String name;
    int mileage;

    Car(String name, int mileage) {
        this.name = name;
        this.mileage = mileage;
    }

    public int compareTo(Car c) {
        return Integer.compare(c.mileage, this.mileage);
    }

    public String toString() {
        return name + " " + mileage;
    }
}

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Car> l = new ArrayList<>();

        l.add(new Car("Swift", 22));
        l.add(new Car("Baleno", 20));
        l.add(new Car("WagonR", 25));
        l.add(new Car("i20", 18));

        Collections.sort(l);

        for (Car c : l) {
            System.out.println(c);
        }
    }
}