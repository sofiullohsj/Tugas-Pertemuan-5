/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package tugas.pertemuan.pkg5 ;
import java.util.Scanner;  

/**
 *
 * @author User
 */
public class TugasPertemuan5 {
static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
     String a;
               
     System.out.println(" Stemmer Kata Indonesia Sederhana ");
     System.out.println("---------------------");
     System.out.println("Klik Enter Untuk Stemming");
     System.out.print(" Masukkan Kata : ");
     a = input.nextLine();
     
     System.out.println("----Hasil Stemming----");
     System.out.println(a);
    }
}