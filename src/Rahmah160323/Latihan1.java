/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rahmah160323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author LABP1KOMP
 */
public class Latihan1 {
    public static void main(String[] args){
        BufferedReader dataIn = 
                new BufferedReader(new InputStreamReader( System.in) );
        int nilai1;
        int nilai2;
        boolean d;
        try{
            System.out.print("Entri nilai A : ");
            nilai1 = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri nilai B : ");
            nilai2 = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri nilai D : ");
            d = Boolean.parseBoolean(dataIn.readLine());
            
            int nilai3 = nilai1 + nilai2;
            System.out.println("Hasil nilai C : "+ nilai3);
            System.out.println("Hasil nilai D : "+ d);
            
        }catch(IOException e){
           
        }
    }
}
