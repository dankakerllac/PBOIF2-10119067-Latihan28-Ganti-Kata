  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119067.latihan28.gantikata;
import java.util.Scanner;
/**
 *
 * @author Danhago
 * NAMA     : Andreas Danhago
 * KELAS    : IF2
 * NIM      : 10119067
 * Deskripsi Program :Ganti Kata
 */
public class PBOIF210119067Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String kalimat,gantiKata,menjadiKata;
        
        System.out.println("=====Program Ganti Kata=====");
        System.out.println();
        System.out.print("Masukkan kalimat : ");
        kalimat = scanner.nextLine();
        
        System.out.print("Ganti kata : ");
        gantiKata = scanner.nextLine();
        
        System.out.print("Menjadi kata : ");
        menjadiKata = scanner.nextLine();
        System.out.println();
        System.out.println("====Hasil Formatting");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + kalimat.replace(gantiKata,menjadiKata));
        System.out.println("Developed by : Danhago");
    }
    
}