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
public class Latihan61 {
    public static void main(String[] args){
        BufferedReader dataIn = 
                new BufferedReader(new InputStreamReader( System.in) );
        int nilai1;
        int nilai2;
        int nilai3;
        try{
            System.out.print("nilai A : ");
            nilai1 = Integer.parseInt(dataIn.readLine());
            System.out.print("nilai B : ");
            nilai2 = Integer.parseInt(dataIn.readLine());
            System.out.print("nilai C : ");
            nilai3 = Integer.parseInt(dataIn.readLine());
            
            int nilai4 = (nilai1 + nilai2 + nilai3 )/3;
            System.out.println("rata-rata : "+ nilai4);
            
            if(nilai4 > 60){
                System.out.println(":-)");
            }else{
                System.out.println(":-(");
            }
            
        }catch(IOException e){
           
        }
    }
}
