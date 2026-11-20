package numbers;

import java.util.Scanner;

public class Prime3 {

    static void checkPrime(int no) {
        boolean flag = true;

        for (int i = 2; i <= no / 2; i++) {
            if (no % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int no = sc.nextInt();

        checkPrime(no);
    }
}