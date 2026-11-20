package collections;
import java.util.ArrayList;

public class Book {
	    String title;
	    int id;
	    double price;

	    public Book(String title, int id, double price) {
	        this.title = title;
	        this.id = id;
	        this.price = price;
	    }

	    public String toString() {
	        return "Book [title=" + title + ", id=" + id + ", price=" + price + "]";
	    }

	    public static void main(String[] args) {

	        ArrayList<Book> b1 = new ArrayList<Book>();

	        b1.add(new Book("Java", 101, 500));
	        b1.add(new Book("Python", 102, 450));
	        b1.add(new Book("SQL", 103, 400));
	        b1.add(new Book("HTML", 104, 350));

	        for (int i = 0; i < b1.size(); i++) {
	            Object o1 = b1.get(i);
	            Book b = (Book)o1;
	            System.out.println(b);
	        }
	    }
	}


