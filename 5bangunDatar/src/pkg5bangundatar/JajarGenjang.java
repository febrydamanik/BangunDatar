/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5bangundatar;

/**
 *
 * @author FebryDamanik
 */
public class JajarGenjang extends BangunDatar {
    int alas, tinggi, sisi_miring;
    
    public int hitungLuas(int alas, int tinggi, int sisi_miring, int b){
        luas = alas * tinggi;
        return luas;
    }
    
    public int hitungKeliling(int alas, int tinggi, int sisi_miring, int b){
        keliling = 2 * (alas + sisi_miring);
        return keliling;
    }
}
