/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bmb
 */
import java.util.Scanner;

public class NILAIHURUF {
    public static void main(String[] args) {
        Scanner n1 = new Scanner (System.in);
        int nilai;
        
        System.out.println("masukkan nilai anda = ");
        nilai = n1.nextInt();
        
        System.out.println("kesimpulan : ");
        if (nilai <= 55){
            System.out.println("nilai anda adalah E");}
        else if (nilai <=65){
            System.out.println("nilai anda adalah D");}
        else if (nilai <= 75){
            System.out.println("nilai anda adalah C");}
        else if (nilai <= 85){
            System.out.println("nilai anda adalah B");}
        else if (nilai <= 100){
            System.out.println("nilai anda adalah A");}
        else if ( (nilai <= 0) ||(nilai > 100)){
            System.out.println("ERROR");}
        }
    }
