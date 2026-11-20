package system_design;
interface Payment {
	void makePayment();
}

class Upi implements Payment {
	public void makePayment() {
		System.out.println("UPI");
	}
}

class Creditcard implements Payment {
	public void makePayment() {
		System.out.println("Credit Card");
	}
}

class COD implements Payment {
	public void makePayment() {
		System.out.println("cod");
	}
}

class Pay {

	private static Payment option;

	public static Payment getInstance(String method) {
		if (method.equalsIgnoreCase("Upi")) {
			option = new Upi();
		} else if (method.equalsIgnoreCase("Creaditcard")) {
			option = new Creditcard();
		} else if (method.equalsIgnoreCase("COD")) {
			option = new COD();
		}
		return option;
	}

}

public class singleton {
	public static void main(String[] args) {

		Payment p1 = Pay.getInstance("Upi");
		p1.makePayment();
		Payment p2 = Pay.getInstance("COD");
		p2.makePayment();

	}
}