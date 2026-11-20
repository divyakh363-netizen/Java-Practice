package Exception;

class LeaveLimitException extends Exception {

    String msg;

    LeaveLimitException(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}

public class Employee {

    static void applyLeave(int days)
            throws LeaveLimitException {

        if (days <= 3) {
            System.out.println("Leave approved");
        } else {
            throw new LeaveLimitException(
                    "Leave limit exceeded");
        }
    }

    public static void main(String[] args) {

        try {
            applyLeave(5);
        }
        catch (LeaveLimitException e) {
            System.out.println(e.getMessage());
        }
    }
}