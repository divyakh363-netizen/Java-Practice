package Exception;

class AttendanceException extends Exception {

    String msg;

    AttendanceException(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}

public class College {

    static void checkAttendance(int attendance)
            throws AttendanceException {

        if (attendance >= 75) {
            System.out.println("Student is eligible for exam");
        } else {
            throw new AttendanceException(
                    "Attendance is below 75%");
        }
    }

    public static void main(String[] args) {

        try {
            checkAttendance(65);
        }
        catch (AttendanceException e) {
            System.out.println(e.getMessage());
        }
    }
}