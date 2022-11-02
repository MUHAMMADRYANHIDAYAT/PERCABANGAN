/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bmb
 */
import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
        Scanner dis = new Scanner(System.in);
        
        int harga;
        int jumlah;
        int diskon;
        int total;
        
        System.out.println("harga barang:");
        harga = dis.nextInt();
        System.out.println("jumlah barang");
        jumlah = dis.nextInt();
        total = harga*jumlah;
        
        if (total>=1000000){
        diskon = total*30/100;
        total=total-diskon;
            System.out.println("selamat anda mendapatkan diskon 30%");
            System.out.println("jadi totalnya :"+total);
        }
        else if (total>=500000){
            diskon=total*20/100;
            total=total-diskon;
            System.out.println("selamat anda mendapatkan diskon 20%");
            System.out.println("jadi totalnya :"+total);
        }
        else if (total>=100000){
            diskon=total*10/100;
            total=total-diskon;
            System.out.println("selamat anda mendapatkan diskon 10%");
            System.out.println("jadi totalnya :"+total);
        }
        else if (total<100000){
            diskon=total*0/100;
            total=total-diskon;
            System.out.println("anda tidak mendapatkan diskon");
            System.out.println("jadi totalnya :"+total);
        }
      }
    }