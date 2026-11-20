package Exception;

class InsufficientBalanceException extends Exception {

    String msg;

    InsufficientBalanceException(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}

public class Bank {

    static void withdraw(int balance, int amount)
            throws InsufficientBalanceException {

        if (balance >= amount) {
            System.out.println("Withdrawal successful");
        } else {
            throw new InsufficientBalanceException(
                    "Insufficient balance");
        }
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 7000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}