package numbers;

import java.util.Scanner;

public class Prime2 {

    static boolean checkPrime(int no) {
        boolean flag = true;

        for (int i = 2; i <= no / 2; i++) {
            if (no % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int no = sc.nextInt();

        boolean result = checkPrime(no);

        if (result) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}