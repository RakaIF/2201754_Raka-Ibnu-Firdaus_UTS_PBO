package uts;
import java.util.Scanner;

public class Polindrom_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat tiga digit: ");
        int n = scanner.nextInt();
        
        int ratusan = n / 100;
        int satuan = n % 10;
        
        if (ratusan == satuan) {
            System.out.println(n + " adalah palindrom.");
        } else {
            System.out.println(n + " bukan palindrom.");
        }
        
        scanner.close();
    }
}
