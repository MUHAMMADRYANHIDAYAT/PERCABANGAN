/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bmb
 */
import java.util.Scanner;

public class kelulusan2 {
    public static void main(String[] args) {
        String jenis_kelamin;
        int Tinggi;
        System.out.print("kelamin (Laki-Laki/perempuan) :");
        Scanner da = new Scanner (System.in);
    jenis_kelamin = da.nextLine();
        System.out.print("tinggi badan :");
    Tinggi = da.nextInt();
    if ("Laki-Laki".equals(jenis_kelamin)){
        if(Tinggi <= 170){
            System.out.println("Anda Gagal");}
        else if ((Tinggi >170) && (Tinggi <=230))
            System.out.println("Selamat Anda Lulus");}
    if ("perempuan".equals(jenis_kelamin)){
        if (Tinggi <= 160){
            System.out.println("Anda Gagal");}
        else if ((Tinggi >160) && (Tinggi <= 210))
            System.out.println("Selamat Anda Lulus");}
        }
    }