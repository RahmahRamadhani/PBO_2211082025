/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan070323;

/**
 *
 * @author LABSIKOMP03
 */
public class Latihan3 {
    public static void main(String[] args){
        int a = 10;
        int b = 23;
        int c = 5;
        int max =(a>b)?((a>c)?a:c):((b>c)?b:c);
       
        System.out.println("number 1 = "+a);
        System.out.println("number 2 = "+b);
        System.out.println("number 3 = "+c);
        System.out.println("nilai tertinggi adalah "+max);
    }
}
