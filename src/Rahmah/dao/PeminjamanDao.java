/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rahmah.dao;
import Rahmah.model.*;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author LABP1KOMP
 */
public interface PeminjamanDao {
    void insert (Peminjaman peminjaman) throws Exception;
    void update (Peminjaman peminjaman)throws Exception;
    void delete (Peminjaman peminjaman) throws Exception;
    Peminjaman getPeminjaman(String kodeanggota, String kodebuku, String tglpinjam) throws Exception;
    List <Peminjaman> getAll() throws Exception;
}
