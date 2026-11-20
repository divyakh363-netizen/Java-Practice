package Exception;

class WithdrawalLimitException extends Exception {

    String msg;

    WithdrawalLimitException(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}

public class ATM {

    static void withdraw(int amount)
            throws WithdrawalLimitException {

        if (amount <= 20000) {
            System.out.println("Please collect your cash");
        } else {
            throw new WithdrawalLimitException(
                    "Daily withdrawal limit exceeded");
        }
    }

    public static void main(String[] args) {

        try {
            withdraw(25000);
        }
        catch (WithdrawalLimitException e) {
            System.out.println(e.getMessage());
        }
    }
}