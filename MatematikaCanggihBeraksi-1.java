/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mariana Farlin
 */
public class MatematikaCanggihBeraksi {

    private static String hasilTambah;
    public static void main(String[] args) {
        MatematikaCanggih math = new MatematikaCanggih();
        int hasilTambah = math.Tambah(10, 5);
        System.out.println("hasil pertambahan:"  + hasilTambah);
        int hasilKali = math.Kali(10,5);
        System.out.println("hasil perkalian:" + hasilKali);
        int hasilModulus = math.modulus(15,5);
        System.out.println("hasil Modulus:" + hasilModulus);
        
    }
    
}
