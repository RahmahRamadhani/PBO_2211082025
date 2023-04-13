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
public class Latihan621 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka antara 1-10: ");
        int num = input.nextInt();

        if (num == 1) {
            System.out.println("Satu");
        } else if (num == 2) {
            System.out.println("Dua");
        } else if (num == 3) {
            System.out.println("Tiga");
        } else if (num == 4) {
            System.out.println("Empat");
        } else if (num == 5) {
            System.out.println("Lima");
        } else if (num == 6) {
            System.out.println("Enam");
        } else if (num == 7) {
            System.out.println("Tujuh");
        } else if (num == 8) {
            System.out.println("Delapan");
        } else if (num == 9) {
            System.out.println("Sembilan");
        } else if (num == 10) {
            System.out.println("Sepuluh");
        } else {
            System.out.println("Invalid number");
        }
    }
}
