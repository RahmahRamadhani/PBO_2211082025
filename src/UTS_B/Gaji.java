/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_B;

/**
 *
 * @author LABP1KOMP
 */
public class Gaji {
    private String golongan;
    private String tanggal;
    private String gapok;
    private String tunj_anak;
    private String tunj_istri;
    
    public Gaji(){
        
    }
    
    public Pegawai(String golongan, String tanggal,String gapok,String tunj_anak, String tunj_istri){
        this.golongan = golongan;
        this.tanggal = tanggal;
        this.gapok = gapok;
        this.tunj_anak = tunj_anak;
        this.tunj_istri = tunj_istri;
    }
    
    public String getGol(){
        return gol;
    }
    
    public void setGol(String gol){
        this.gol = gol;
    }
    
    public String getTgl(){
        return tanggal;
    }
    
    public void setTgl(String tanggal){
        this.tanggal = tanggal;
    }
    
    public String getGapok(){
        return gapok;
    }
   
    public void setgapok(String gapok){
        this.gapok = gapok;
    }
}
