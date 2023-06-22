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
    public String kodeanggota;
    public String kodebuku;
    public String tglpinjam;
    public String tglkembali;
    
    public void Peminjaman(){
        
    }

    public String getKodeanggota() {
        return kodeanggota;
    }

    public void setKodeanggota(String kodeanggota) {
        this.kodeanggota = kodeanggota;
    }

    public String getKodebuku() {
        return kodebuku;
    }

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
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
