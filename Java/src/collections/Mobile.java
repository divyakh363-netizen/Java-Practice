package collections;
import java.util.ArrayList;

public class Mobile {
	    String brand;
	    int modelNo;
	    double price;

	    public Mobile(String brand, int modelNo, double price) {
	        this.brand = brand;
	        this.modelNo = modelNo;
	        this.price = price;
	    }

	    public String toString() {
	        return "Mobile [brand=" + brand + ", modelNo=" + modelNo + ", price=" + price + "]";
	    }

	    public static void main(String[] args) {

	        ArrayList<Mobile> m1 = new ArrayList<Mobile>();

	        m1.add(new Mobile("Samsung", 101, 25000));
	        m1.add(new Mobile("Apple", 102, 65000));
	        m1.add(new Mobile("OnePlus", 103, 30000));
	        m1.add(new Mobile("Vivo", 104, 22000));

	        for (int i = 0; i < m1.size(); i++) {
	            Object o1 = m1.get(i);
	            Mobile m = (Mobile)o1;
	            System.out.println(m);
	        }
	    }
	}


