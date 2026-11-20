package collections;
import java.util.ArrayList;

public class BankAccount {
	    String name;
	    int accNo;
	    double balance;

	    public BankAccount(String name, int accNo, double balance) {
	        this.name = name;
	        this.accNo = accNo;
	        this.balance = balance;
	    }

	    public String toString() {
	        return "BankAccount [name=" + name + ", accNo=" + accNo + ", balance=" + balance + "]";
	    }

	    public static void main(String[] args) {

	        ArrayList<BankAccount> b1 = new ArrayList<BankAccount>();

	        b1.add(new BankAccount("Divya", 101, 25000));
	        b1.add(new BankAccount("Anu", 102, 30000));
	        b1.add(new BankAccount("Pooja", 103, 45000));
	        b1.add(new BankAccount("Kavya", 104, 50000));

	        for (int i = 0; i < b1.size(); i++) {
	            Object o1 = b1.get(i);
	            BankAccount b = (BankAccount)o1;
	            System.out.println(b);
	        }
	    }
	}

