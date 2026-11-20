package collections;
import java.util.ArrayList;
public class Laptop {
	    String brand;
	    int ram;
	    double price;

	    public Laptop(String brand, int ram, double price) {
	        this.brand = brand;
	        this.ram = ram;
	        this.price = price;
	    }

	    public String toString() {
	        return "Laptop [brand=" + brand + ", ram=" + ram + "GB, price=" + price + "]";
	    }

	    public static void main(String[] args) {

	        ArrayList<Laptop> l1 = new ArrayList<Laptop>();

	        l1.add(new Laptop("Dell", 8, 45000));
	        l1.add(new Laptop("HP", 16, 55000));
	        l1.add(new Laptop("Asus", 8, 50000));
	        l1.add(new Laptop("Lenovo", 16, 60000));

	        for (int i = 0; i < l1.size(); i++) {
	            Object o1 = l1.get(i);
	            Laptop l = (Laptop)o1;
	            System.out.println(l);
	        }
	    }
	}


