package collections;
import java.util.ArrayList;
public class Product {
	   String name;
	    int id;
	    double price;

	    public Product(String name, int id, double price) {
	        this.name = name;
	        this.id = id;
	        this.price = price;
	    }

	    public String toString() {
	        return "Product [name=" + name + ", id=" + id + ", price=" + price + "]";
	    }

	    public static void main(String[] args) {

	        ArrayList<Product> p1 = new ArrayList<Product>();

	        p1.add(new Product("Laptop", 101, 55000));
	        p1.add(new Product("Mobile", 102, 25000));
	        p1.add(new Product("Mouse", 103, 800));
	        p1.add(new Product("Keyboard", 104, 1500));

	        for (int i = 0; i < p1.size(); i++) {
	            Object o1 = p1.get(i);
	            Product p = (Product)o1;
	            System.out.println(p);
	        }
	    }
	}


