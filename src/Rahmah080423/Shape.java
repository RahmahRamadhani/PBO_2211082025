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
public abstract class Shape {
    private String nm;
 
        
    public Shape(String nama) {
        nm = nama; 
    }
    
    public String getName() {
        return nm;
    }

    public abstract float getArea(); 
}
