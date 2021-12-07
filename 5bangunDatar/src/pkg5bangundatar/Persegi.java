package pkg5bangundatar;
/**
 *
 * @author FebryDamanik
 */
public class Persegi extends BangunDatar{
    int sisi;
    
    
    public int hitungLuas(int sisi){
        luas = sisi * sisi;
        return luas;
    }
    
    
    public int hitungKeliling(int sisi){
        keliling = 4 * sisi;
        return keliling;
    }
}
