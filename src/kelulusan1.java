/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bmb
 */
import java.util.Scanner;
/**
 * 
 * @author affandeZone 
 */
public class kelulusan1 {
  public static void main(String[] args) { 
    // Buat Scanner 
    Scanner inp = new Scanner(System.in);
    
    // Ambil Nama
    System.out.print("Masukkan nama anda = ");
    String Nama = inp.next();
    
    // Ambil NIM
    System.out.print("Masukkan Nim = ");
    String nim = inp.next();
    
    // Ambil Nilai 
    System.out.print("Masukkan Nilai = ");
    int nilai = inp.nextInt();
    
    // Print 
    if (nilai >75){
        System.out.println("selamat anda lulus");
    }
    else {
        System.out.println("anda tidak lulus");
    }
  }
}
