package Exception;

class MinimumOrderException extends Exception {

    String msg;

    MinimumOrderException(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}

public class FoodOrder {

    static void placeOrder(int amount)
            throws MinimumOrderException {

        if (amount >= 199) {
            System.out.println("Order placed successfully");
        } else {
            throw new MinimumOrderException(
                    "Minimum order amount is ₹199");
        }
    }

    public static void main(String[] args) {

        try {
            placeOrder(150);
        }
        catch (MinimumOrderException e) {
            System.out.println(e.getMessage());
        }
    }
}