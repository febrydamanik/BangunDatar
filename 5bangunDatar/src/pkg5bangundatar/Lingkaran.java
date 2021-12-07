package pkg5bangundatar;

/**
 *
 * @author FebryDamanik
 */
public class Lingkaran extends BangunDatar{
    int r;
    
    public int hitungLuas(){
        luas = 22 / 7 * r * r;
        return luas;
    }
    
    public int hitungKliling(){
        keliling = 2 * 22 / 7 * r;
        return keliling;
    }
}
