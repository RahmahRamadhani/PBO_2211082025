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
public class Latihan111 extends StudentRecord{
    
    public Latihan111(){
        super( "Rahma", "Padang" ); 
    }
    
    public static void main( String[] args ){  
        Latihan111 Rahma = new Latihan111();
        System.out.println("Nama    :" + Rahma.name);
        System.out.println("Alamat  :" + Rahma.address);
        
        System.out.println("Count = "+StudentRecord.getStudentCount());
    }
    
    @Override
    public String getName(){
        System.out.println("Rahma adalah student");
        return name;
    }
}
