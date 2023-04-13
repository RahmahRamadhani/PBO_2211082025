/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rahmah180323;
import java.util.Scanner;

/**
 *
 * @author LABP1KOMP
 */
public class Latihan641 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        System.out.print("Masukkan pangkat: ");
        int pangkat = input.nextInt();
        int hasil = 1;
        int counter = 1;
        while (counter <= pangkat) {
            hasil *= angka;
            counter++;
        }
        System.out.println(angka + " pangkat " + pangkat + " adalah " + hasil);
    }
}
