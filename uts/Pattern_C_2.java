package uts;

public class Pattern_C_2 {
    public static void main(String[] args) {
        int baris = 6;
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= baris - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
