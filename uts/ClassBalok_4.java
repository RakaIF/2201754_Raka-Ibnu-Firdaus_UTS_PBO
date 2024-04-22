package uts;

public class ClassBalok_4 {
    int panjang;
    int lebar;
    int tinggi;
    
    public ClassBalok_4 (){
        panjang = 0;
        lebar = 0;
        tinggi = 0;
    }
    public ClassBalok_4 (int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    int luas(){
        int hasil = 2 * ((panjang * lebar)+(panjang * tinggi)+(lebar * tinggi));
        return hasil;
    }
    int keliling(){
        int hasil = 4 * (panjang + lebar + tinggi);
        return hasil;
    }
    int volume(){
        int hasil = panjang * lebar * tinggi;
        return hasil;
    }
    
    void setPanjang(int p){
        panjang = p;
    }
    void setLebar(int l){
        lebar = l;
    }
    void setTinggi(int t){
        tinggi = t;
    }
    
}
