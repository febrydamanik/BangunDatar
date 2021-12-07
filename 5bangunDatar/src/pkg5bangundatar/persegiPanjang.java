package pkg5bangundatar;

/**
 *
 * @author FebryDamanik
 */
public class persegiPanjang extends BangunDatar{
    int panjang, lebar;
    
    public int hitungLuas(int panjang, int lebar){
        luas = panjang * lebar;
        return luas;
    }
    
    public int hitungKeliiling(int panjang, int lebar){
        keliling = 2*panjang + 2*lebar;
        return keliling;
    }
}
