package pkg5bangundatar;

/**
 *
 * @author FebryDamanik
 */
public class Segitiga extends BangunDatar {
    int alas, tinggi;
    
    public int hitungLuas(int alas, int tinggi, int a){
        luas = alas * tinggi / 2;
        return luas;
    }
    
    public int hituntKeliling(int alas, int tinggi, int a){
        keliling = alas * 3;
        return keliling;
    }
}
