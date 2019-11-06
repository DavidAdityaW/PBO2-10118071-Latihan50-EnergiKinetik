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
public class PBO210118071Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kinetik ek = new Kinetik();
        
        ek.set_massa(145);
        ek.set_kecepatan(25);
        
        System.out.println("Massa dari bola baseball = " + ek.get_massa() + " kg");
        System.out.println("Kecepatan bola baseball  = " + ek.get_kecepatan() + " m/s");
        System.out.println("Energi Kinetiknya adalah = " + ek.energiKinetik(ek.get_massa(), ek.get_kecepatan()) + " Joule");
        System.out.println("Usaha yang dilakukan jika keadaan bola diam = " + ek.usaha(ek.energiKinetik(ek.get_massa(), ek.get_kecepatan())) + " Joule");
        
    }
    
}
