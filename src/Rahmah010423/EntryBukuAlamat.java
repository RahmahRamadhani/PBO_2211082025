/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rahmah010423;

/**
 *
 * @author LABP1KOMP
 */
public class EntryBukuAlamat {
     private String[] name = new String[100];
    private String[] address = new String[100];
    private String[] notelp = new String[100];
    private String[] alamatemail = new String[100];
    
    private static int studentCount;
    private static int indek;
    
    public EntryBukuAlamat(){
        studentCount = 0;
    }
    
    public String getName(int indek){
        return name[indek];
    }
    
    public String getAddress(int indek){
        return address[indek];
    }
    
    public String getNotelp(int indek){
        return notelp[indek];
    }
    
    public String getAlamatemail(int indek){
        return alamatemail[indek];
    }
    
    public void setName(String name,String address,String notelp, String alamatemail ){
       this.name[indek] = name;
       this.address [indek]= address;
       this.notelp[indek] = notelp;
       this.alamatemail[indek] = alamatemail;
       
    }
    
    public static int getStudentCount(){
        return studentCount;
    }
}
