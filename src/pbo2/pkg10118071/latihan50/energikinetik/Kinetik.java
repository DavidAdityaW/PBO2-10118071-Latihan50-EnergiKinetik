/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan50.energikinetik;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menghitung
 *                     energi kinetik
 * 
 */
public class Kinetik {
    
    private double massa;
    private int kecepatan;
    
    public void set_massa(int massa) {
        this.massa = massa;
    }
    
    public double get_massa() {
        return massa;
    }
    
    public void set_kecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public int get_kecepatan() {
        return kecepatan;
    }
    
    public double energiKinetik(double massa, int kecepatan) {
        double hasil = 0.5 * (massa / 1000) * (kecepatan * kecepatan);
        return hasil;
    }
    
    public double usaha(double energiKinetik) {
        double hasil = 0.5 * (massa / 1000) * ((kecepatan * kecepatan) - 0);
        return hasil;
    }
    
}
