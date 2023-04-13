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
public class Latihan51 {
    public static void main(String [] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader( System.in) );
        
        System.out.print("Enter word 1 : ");
        String word1 = reader.readLine();
        
        System.out.print("Enter word 2 : ");
        String word2 = reader.readLine();
        
        System.out.print("Enter word 3 : ");
        String word3 = reader.readLine();
        
        System.out.println(word1 + " " + word2 + " " + word3);

    }
}
