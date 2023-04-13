/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rahmah080423;

/**
 *
 * @author LABP1KOMP
 */
public class Square extends Shape{
   private int sisi;
    
    public Square(String nama) {
        super(nama);
        sisi = 3;
    }

    public float getArea() {
        float luas;
        luas = sisi * sisi;
        return luas;
    } 
}
