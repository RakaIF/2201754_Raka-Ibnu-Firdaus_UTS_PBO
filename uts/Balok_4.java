package uts;

public class Balok_4 {
    public static void main(String[] args) {
        int Luas, Keliling, Volume;
        ClassBalok_4 balok1 = new ClassBalok_4();
        balok1.setPanjang(1);
        balok1.setLebar(1);
        balok1.setTinggi(1);
        Luas = balok1.luas();
        Keliling = balok1.keliling();
        Volume = balok1.volume();
        System.out.println("Balok dengan Panjang : " + (balok1.panjang) + ", Lebar : " + (balok1.lebar)+ " ,dan Tinggi : " + (balok1.tinggi));
        System.out.println(". Luasnya : " + Luas + ", sedangkan kelilingnya : " + Keliling + " dan volumenya : " + Volume);
        
        ClassBalok_4 balok2 = new ClassBalok_4();
        balok2.setPanjang(30);
        balok2.setLebar(40);
        balok2.setTinggi(50);
        Luas = balok2.luas();
        Keliling = balok2.keliling();
        Volume = balok2.volume();
        System.out.println("Balok dengan Panjang : " + (balok2.panjang) + ", Lebar : " + (balok2.lebar)+ " ,dan Tinggi : " + (balok2.tinggi));
        System.out.println(". Luasnya : " + Luas + ", sedangkan kelilingnya : " + Keliling + " dan volumenya : " + Volume);
        
        ClassBalok_4 balok3 = new ClassBalok_4();
        balok3.setPanjang(25);
        balok3.setLebar(35);
        balok3.setTinggi(45);
        Luas = balok3.luas();
        Keliling = balok3.keliling();
        Volume = balok3.volume();
        System.out.println("Balok dengan Panjang : " + (balok3.panjang) + ", Lebar : " + (balok3.lebar)+ " ,dan Tinggi : " + (balok3.tinggi));
        System.out.println(". Luasnya : " + Luas + ", sedangkan kelilingnya : " + Keliling + " dan volumenya : " + Volume);
    }
}