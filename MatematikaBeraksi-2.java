/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih Matematika = new MatematikaCanggih();
        
        double hasiloperasiBaru = Matematika.operasiBaru(12.5,28.7, 14.2);
        System.out.println("hasil operasiBaru:" + hasiloperasiBaru);
        
        System.out.println("pertambahan (12.5, 28.7, 14.2): " + Matematika.pertambahan(12.5,28.7,14.2));
        System.out.println("pertambahan (12,28,14): " + Matematika.pertambahan(12, 28, 14));
        System.out.println("pertambahan (23,34): " + Matematika.pertambahan(23, 34));
        System.out.println("pertambahan (3.4, 4.9) " + Matematika.pertambahan(3.4,4.9));
    }
    
}
