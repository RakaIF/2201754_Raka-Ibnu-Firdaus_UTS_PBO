package uts;

public class Pattern_A_2 {
    public static void main(String[] args) {
        int baris = 6; 
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
