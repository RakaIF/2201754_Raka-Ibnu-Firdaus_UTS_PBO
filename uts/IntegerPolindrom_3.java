package uts;
import java.util.Scanner;

public class IntegerPolindrom_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        int n = scanner.nextInt();
        if (isPalindrome(n)) {
            System.out.println(n + " adalah palindrom.");
        } else {
            System.out.println(n + " bukan palindrom.");
        }
        scanner.close();
    }
    
    public static int reverse(int n) {
        int reversedNumber = 0;
        while (n != 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }
        return reversedNumber;
    }

    public static boolean isPalindrome(int n) {
        return n == reverse(n);
    }
}
