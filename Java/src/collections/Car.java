package collections;
import java.util.ArrayList;
public class Car {
        String brand;
	    String color;
	    double price;

	    public Car(String brand, String color, double price) {
	        this.brand = brand;
	        this.color = color;
	        this.price = price;
	    }

	    public String toString() {
	        return "Car [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	    }

	    public static void main(String[] args) {

	        ArrayList<Car> c1 = new ArrayList<Car>();

	        c1.add(new Car("BMW", "Black", 8000000));
	        c1.add(new Car("Audi", "White", 7000000));
	        c1.add(new Car("Honda", "Red", 1500000));
	        c1.add(new Car("Toyota", "Blue", 2000000));

	        for (int i = 0; i < c1.size(); i++) {
	            Object o1 = c1.get(i);
	            Car c = (Car)o1;
	            System.out.println(c);
	        }
	    }
	}


