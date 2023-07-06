/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rahmah.dao;
import Rahmah.model.*;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author LAB-JARINGAN01
 */
public interface PengembalianDao {
    void insert(Pengembalian pengembalian) throws Exception;
    void update(Pengembalian pengembalian) throws Exception;
    void delete(Pengembalian pengembalian) throws Exception;
    Pengembalian getPengembalian(String kodeAnggota, String Kodebuku, String Tglpinjam)throws Exception;
    List<Pengembalian> getAll()throws SQLException;
    int selisihtgl(String tgl1, String tgl2) throws Exception;
    List<Pengembalian> cari(String kode, String cari) throws Exception;
}
