/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rahmah300323;

/**
 *
 * @author LABP1KOMP
 */
public class TestPassByReference {
    public static void main (String[] args){
        //membuat array integer
        int []ages = {10, 11, 12};
        
        //mencetak nilai array
        for (int i=0; i<ages.length; i++){
            System.out.println(ages [i]);
        }
        
        test (ages);
        
        for (int i=0; i<ages.length; i++){
            System.out.println(ages[i]);
        }
        
    }
    public static void test( int[] arr ){
        //merubah nilai array
        for( int i=0; i<arr.length; i++ ){
        arr[i] = i + 50;  
      }
        
    }
}
