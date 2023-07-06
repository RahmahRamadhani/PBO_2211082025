/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rahmah.model;

/**
 *
 * @author LABP1KOMP
 */
public class Peminjaman {
    private Anggota agt;
    private Buku bk;
    private String tglpinjam;
    private String tglkembali;
    
    public  Peminjaman(){
        
    }
    public Peminjaman(Anggota a,Buku b,String tglpinjam, String tglkembali){
        this.agt = agt;
        this.bk = bk;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }

    public Anggota getAnggota() {
        return agt;
    }

    public void setAnggota(Anggota agt) {
        this.agt = agt;
    }

    public Buku getBuku() {
        return bk;
    }

    public void setBuku(Buku bk) {
        this.bk = bk;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public String getTglkembali() {
        return tglkembali;
    }

    public void setTglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }
    
    
}
