/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bmb
 */
import java.util.Scanner;

public class BobotNilaiHuruf {
    public static void main(String[] args) {
        String huruf;
        Scanner h1 = new Scanner (System.in).useDelimiter("\n");
        System.out.println("masukkan huruf yang mau di konversi = ");
        huruf = h1.nextLine();
        
        switch (huruf){
            case "a" :
                System.out.println( huruf + "adalah 4");
                break;
            case "b" :
                System.out.println( huruf + "adalah 3");
                break;
            case "c" :
                System.out.println( huruf + "adalah 2");
                break;
            case "d" :
                System.out.println( huruf + "adalah 1");
                break;
            case "e" :
                System.out.println( huruf + "adalah 0");
                break;
        }
    }
}
